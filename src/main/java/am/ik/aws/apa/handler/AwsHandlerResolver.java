/*
 * Copyright (C) 2011 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package am.ik.aws.apa.handler;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class AwsHandlerResolver implements HandlerResolver {
    private String awsSecretKey;

    public AwsHandlerResolver(String awsSecretKey) {
        this.awsSecretKey = awsSecretKey;
    }

    @SuppressWarnings("rawtypes")
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<Handler>();

        QName serviceQName = portInfo.getServiceName();
        if (serviceQName.getLocalPart().equals("AWSECommerceService")) {
            handlerChain.add(new AwsHandler(awsSecretKey));
        }

        return handlerChain;
    }

    private static class AwsHandler implements SOAPHandler<SOAPMessageContext> {
        private byte[] secretBytes;

        public AwsHandler(String awsSecretKey) {
            secretBytes = stringToUtf8(awsSecretKey);
        }

        public void close(MessageContext messagecontext) {
        }

        public Set<QName> getHeaders() {
            return null;
        }

        public boolean handleFault(SOAPMessageContext messagecontext) {
            return true;
        }

        public boolean handleMessage(SOAPMessageContext messagecontext) {
            Boolean outbound = (Boolean) messagecontext
                    .get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            if (outbound) {
                try {
                    SOAPMessage soapMessage = messagecontext.getMessage();
                    SOAPBody soapBody = soapMessage.getSOAPBody();
                    Node firstChild = soapBody.getFirstChild();

                    String timeStamp = getTimestamp();
                    String signature = getSignature(firstChild.getLocalName(),
                            timeStamp, secretBytes);

                    appendTextElement(firstChild, "Signature", signature);
                    appendTextElement(firstChild, "Timestamp", timeStamp);
                } catch (SOAPException se) {
                    throw new RuntimeException("SOAPException was thrown.", se);
                }
            }
            return true;
        }

        private String getSignature(String operation, String timeStamp,
                byte[] secretBytes) {
            try {
                String toSign = operation + timeStamp;
                byte[] toSignBytes = stringToUtf8(toSign);

                Mac signer = Mac.getInstance("HmacSHA256");
                SecretKeySpec keySpec = new SecretKeySpec(secretBytes,
                        "HmacSHA256");

                signer.init(keySpec);
                signer.update(toSignBytes);
                byte[] signBytes = signer.doFinal();

                String signature = new String(Base64.encodeBase64(signBytes));
                return signature;
            } catch (NoSuchAlgorithmException nsae) {
                throw new RuntimeException(
                        "NoSuchAlgorithmException was thrown.", nsae);
            } catch (InvalidKeyException ike) {
                throw new RuntimeException("InvalidKeyException was thrown.",
                        ike);
            }
        }

        private String getTimestamp() {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd'T'HH:mm:ss'Z'");
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return dateFormat.format(calendar.getTime());
        }

        private byte[] stringToUtf8(String source) {
            try {
                return source.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                // This will never happen. UTF-8 is always available.
                throw new RuntimeException(
                        "getBytes threw an UnsupportedEncodingException", e);
            }
        }

        private void appendTextElement(Node node, String elementName,
                String elementText) {
            Element element = node.getOwnerDocument()
                    .createElement(elementName);
            element.setTextContent(elementText);
            node.appendChild(element);
        }
    }
}
