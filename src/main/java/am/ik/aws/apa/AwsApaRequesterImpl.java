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
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;

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
    private String associateTag;
    private Lock lock = new ReentrantLock();
    private volatile AWSECommerceServicePortType port;
    private static final Logger LOG = LoggerFactory
            .getLogger(AwsApaRequesterImpl.class);

    public AwsApaRequesterImpl() {
        this.endpoint = AwsConfig.getValue("aws.endpoint");
        this.accessKeyId = AwsConfig.getValue("asw.accesskey.id");
        this.secretAccessKey = AwsConfig.getValue("aws.secret.accesskey");
        this.associateTag = AwsConfig.getValue("aws.associate.tag");
    }

    public AwsApaRequesterImpl(String endpoint, String accessKeyId,
            String secretAccessKey) {
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
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
        if (associateTag != null && !associateTag.equals("")) {
            itemSearch.setAssociateTag(associateTag);
        }
        itemSearch.setAWSAccessKeyId(accessKeyId);
        itemSearch.getRequest().add(request);

        LOG.debug("end prepareItemSearch(ItemSearchRequest) : {}", itemSearch);
        return itemSearch;
    }

    protected ItemLookup prepareItemLookup(ItemLookupRequest request) {
        LOG.debug("start prepareItemLookup(ItemLookupRequest) : {}", request);
        ItemLookup itemLookup = new ItemLookup();
        if (associateTag != null && !associateTag.equals("")) {
            itemLookup.setAssociateTag(associateTag);
        }
        itemLookup.setAWSAccessKeyId(accessKeyId);
        itemLookup.getRequest().add(request);

        LOG.debug("end prepareItemLookup(ItemLookupRequest) : {}", itemLookup);
        return itemLookup;

    }

    @Override
    public ItemSearchResponse itemSearch(ItemSearchRequest request) {
        LOG.debug("start itemSearch(ItemSearchRequest) : {}", request);
        AWSECommerceServicePortType port = preparePort();
        ItemSearch itemSearch = prepareItemSearch(request);
        ItemSearchResponse response = port.itemSearch(itemSearch);
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

    @Override
    public ItemLookupResponse itemLookup(ItemLookupRequest request) {
        LOG.debug("start itemLookup(ItemLookupRequest) : {}", request);
        AWSECommerceServicePortType port = preparePort();
        ItemLookup itemLookup = prepareItemLookup(request);
        ItemLookupResponse response = port.itemLookup(itemLookup);
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

    public String getAssociateTag() {
        return associateTag;
    }

    public void setAssociateTag(String associateTag) {
        this.associateTag = associateTag;
    }

}
