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

package am.ik.aws.apa.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketplaceDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AWSAccessKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLEscaping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartAddRequest" minOccurs="0"/>
 *         &lt;element name="Request" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartAddRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "marketplaceDomain", "awsAccessKeyId",
        "subscriptionId", "associateTag", "validate", "xmlEscaping", "shared",
        "request" })
@XmlRootElement(name = "CartAdd")
public class CartAdd {

    @XmlElement(name = "MarketplaceDomain")
    protected String marketplaceDomain;
    @XmlElement(name = "AWSAccessKeyId")
    protected String awsAccessKeyId;
    @XmlElement(name = "SubscriptionId")
    protected String subscriptionId;
    @XmlElement(name = "AssociateTag")
    protected String associateTag;
    @XmlElement(name = "Validate")
    protected String validate;
    @XmlElement(name = "XMLEscaping")
    protected String xmlEscaping;
    @XmlElement(name = "Shared")
    protected CartAddRequest shared;
    @XmlElement(name = "Request")
    protected List<CartAddRequest> request;

    /**
     * Gets the value of the marketplaceDomain property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMarketplaceDomain() {
        return marketplaceDomain;
    }

    /**
     * Sets the value of the marketplaceDomain property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMarketplaceDomain(String value) {
        this.marketplaceDomain = value;
    }

    /**
     * Gets the value of the awsAccessKeyId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAWSAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * Sets the value of the awsAccessKeyId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAWSAccessKeyId(String value) {
        this.awsAccessKeyId = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the associateTag property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAssociateTag() {
        return associateTag;
    }

    /**
     * Sets the value of the associateTag property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAssociateTag(String value) {
        this.associateTag = value;
    }

    /**
     * Gets the value of the validate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValidate(String value) {
        this.validate = value;
    }

    /**
     * Gets the value of the xmlEscaping property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getXMLEscaping() {
        return xmlEscaping;
    }

    /**
     * Sets the value of the xmlEscaping property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setXMLEscaping(String value) {
        this.xmlEscaping = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     * @return possible object is {@link CartAddRequest }
     * 
     */
    public CartAddRequest getShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     * @param value
     *            allowed object is {@link CartAddRequest }
     * 
     */
    public void setShared(CartAddRequest value) {
        this.shared = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartAddRequest }
     * 
     * 
     */
    public List<CartAddRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<CartAddRequest>();
        }
        return this.request;
    }

}
