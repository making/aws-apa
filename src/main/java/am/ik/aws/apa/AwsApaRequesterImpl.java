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

package am.ik.aws.apa;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;
import javax.xml.ws.WebServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import am.ik.aws.apa.handler.AwsHandlerResolver;
import am.ik.aws.apa.jaxws.AWSECommerceService;
import am.ik.aws.apa.jaxws.AWSECommerceServicePortType;
import am.ik.aws.apa.jaxws.ItemLookup;
import am.ik.aws.apa.jaxws.ItemLookupRequest;
import am.ik.aws.apa.jaxws.ItemLookupResponse;
import am.ik.aws.apa.jaxws.ItemSearch;
import am.ik.aws.apa.jaxws.ItemSearchRequest;
import am.ik.aws.apa.jaxws.ItemSearchResponse;
import am.ik.aws.config.AwsConfig;

public class AwsApaRequesterImpl implements AwsApaRequester {
    private final String endpoint;
    private final String accessKeyId;
    private final String secretAccessKey;
    private final String associateTag;
    private final Lock lock = new ReentrantLock();
    private volatile AWSECommerceServicePortType port;
    private static final Logger LOG = LoggerFactory
            .getLogger(AwsApaRequesterImpl.class);
    private int retryCount = 3;
    private long retryInterval = 1000; // [msec]

    public AwsApaRequesterImpl() throws IllegalArgumentException {
        this.endpoint = AwsConfig.getValue("aws.endpoint");
        this.accessKeyId = AwsConfig.getValue("aws.accesskey.id");
        this.secretAccessKey = AwsConfig.getValue("aws.secret.accesskey");
        this.associateTag = AwsConfig.getValue("aws.associate.tag");
        checkArgs(endpoint, accessKeyId, secretAccessKey, associateTag);
    }

    public AwsApaRequesterImpl(String endpoint, String accessKeyId,
            String secretAccessKey, String associateTag)
            throws IllegalArgumentException {
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.associateTag = associateTag;
        checkArgs(endpoint, accessKeyId, secretAccessKey, associateTag);
    }

    private static void checkArgs(String endpoint, String accessKeyId,
            String secretAccessKey, String associateTag)
            throws IllegalArgumentException {
        checkIfNulOrEmpty(endpoint, "endpoint");
        checkIfNulOrEmpty(accessKeyId, "accessKeyId");
        checkIfNulOrEmpty(secretAccessKey, "secretAccessKey");
        checkIfNulOrEmpty(associateTag, "associateTag");
    }

    private static void checkIfNulOrEmpty(String str, String name)
            throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException(name + " is null.");
        }
        if ("".equals(str)) {
            throw new IllegalArgumentException(name + " is empty.");
        }
    }

    protected AWSECommerceServicePortType preparePort() {
        LOG.debug("start preparePort()");
        try {
            lock.lock();
            if (port == null) {
                LOG.debug("preparing...");
                AWSECommerceService service = new AWSECommerceService();
                service.setHandlerResolver(new AwsHandlerResolver(
                        secretAccessKey));
                AWSECommerceServicePortType port = service
                        .getAWSECommerceServicePort();
                ((BindingProvider) port).getRequestContext().put(
                        BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        endpoint + "/onca/soap?Service=AWSECommerceService");
                this.port = port;
            }
        } finally {
            lock.unlock();
        }
        LOG.debug("end preparePort() : {}", port);
        return port;
    }

    protected ItemSearch prepareItemSearch(ItemSearchRequest request) {
        LOG.debug("start prepareItemSearch(ItemSearchRequest) : {}", request);
        ItemSearch itemSearch = new ItemSearch();
        itemSearch.setAssociateTag(associateTag);
        itemSearch.setAWSAccessKeyId(accessKeyId);
        itemSearch.getRequest().add(request);

        LOG.debug("end prepareItemSearch(ItemSearchRequest) : {}", itemSearch);
        return itemSearch;
    }

    protected ItemLookup prepareItemLookup(ItemLookupRequest request) {
        LOG.debug("start prepareItemLookup(ItemLookupRequest) : {}", request);
        ItemLookup itemLookup = new ItemLookup();
        itemLookup.setAssociateTag(associateTag);
        itemLookup.setAWSAccessKeyId(accessKeyId);
        itemLookup.getRequest().add(request);
        LOG.debug("end prepareItemLookup(ItemLookupRequest) : {}", itemLookup);
        return itemLookup;

    }

    @Override
    public ItemSearchResponse itemSearch(ItemSearchRequest request) {
        LOG.debug("start itemSearch(ItemSearchRequest) : {}", request);
        final AWSECommerceServicePortType port = preparePort();
        final ItemSearch itemSearch = prepareItemSearch(request);
        ItemSearchResponse response = invokeWithRetry(new WebServiceInvoker<ItemSearchResponse>() {
            @Override
            public ItemSearchResponse invoke() throws WebServiceException {
                return port.itemSearch(itemSearch);
            }
        });
        LOG.debug("end itemSearch(ItemSearchRequest) : {}", response);
        return response;
    }

    @Override
    public Response<ItemSearchResponse> itemSearchAsync(
            ItemSearchRequest request) throws ExecutionException,
            InterruptedException {
        LOG.debug("start itemSearchAsync(ItemSearchRequest) : {}", request);
        AWSECommerceServicePortType port = preparePort();
        ItemSearch itemSearch = prepareItemSearch(request);
        Response<ItemSearchResponse> response = port
                .itemSearchAsync(itemSearch);
        LOG.debug("end itemSearchAsync(ItemLookupRequest) : {}", response);
        return response;
    }

    public <T> T invokeWithRetry(WebServiceInvoker<T> invoker)
            throws WebServiceException {
        int retry = 0;
        T result = null;
        while (true) {
            try {
                result = invoker.invoke();
                break;
            } catch (WebServiceException e) {
                LOG.warn("web service exception occurred", e);
                if (retry < retryCount && retryInterval > 0) {
                    retry++;
                    try {
                        LOG.debug("retry {}/{}", retry, retryCount);
                        TimeUnit.MILLISECONDS.sleep(retryInterval * retry);
                    } catch (InterruptedException ignored) {
                    }
                    continue;
                } else {
                    throw e;
                }
            }
        }
        return result;
    }

    @Override
    public ItemLookupResponse itemLookup(ItemLookupRequest request) {
        LOG.debug("start itemLookup(ItemLookupRequest) : {}", request);
        final AWSECommerceServicePortType port = preparePort();
        final ItemLookup itemLookup = prepareItemLookup(request);
        ItemLookupResponse response = invokeWithRetry(new WebServiceInvoker<ItemLookupResponse>() {
            @Override
            public ItemLookupResponse invoke() throws WebServiceException {
                return port.itemLookup(itemLookup);
            }
        });
        LOG.debug("end itemLookup(ItemLookupRequest) : {}", response);
        return response;
    }

    @Override
    public Response<ItemLookupResponse> itemLookupAsync(
            ItemLookupRequest request) throws ExecutionException,
            InterruptedException {
        LOG.debug("start itemLookupAsync(ItemLookupRequest) : {}", request);
        AWSECommerceServicePortType port = preparePort();
        ItemLookup itemLookup = prepareItemLookup(request);
        Response<ItemLookupResponse> response = port
                .itemLookupAsync(itemLookup);
        LOG.debug("end itemLookupAsync(ItemLookupRequest) : {}", response);
        return response;
    }

    public <T> T getResponseWithRetry(final Response<T> res) {
        return invokeWithRetry(new WebServiceInvoker<T>() {
            @Override
            public T invoke() throws WebServiceException {
                try {
                    return res.get();
                } catch (InterruptedException e) {
                    throw new WebServiceException(e);
                } catch (ExecutionException e) {
                    throw new WebServiceException(e);
                }
            }
        });
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public long getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(long retryInterval) {
        this.retryInterval = retryInterval;
    }
}
