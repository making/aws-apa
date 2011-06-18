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

import javax.xml.ws.Response;

import am.ik.aws.apa.jaxws.ItemLookupRequest;
import am.ik.aws.apa.jaxws.ItemLookupResponse;
import am.ik.aws.apa.jaxws.ItemSearchRequest;
import am.ik.aws.apa.jaxws.ItemSearchResponse;

public interface AwsApaRequester {
    ItemSearchResponse itemSearch(ItemSearchRequest request);

    Response<ItemSearchResponse> itemSearchAsync(ItemSearchRequest request)
            throws ExecutionException, InterruptedException;

    ItemLookupResponse itemLookup(ItemLookupRequest request);

    Response<ItemLookupResponse> itemLookupAsync(ItemLookupRequest request)
            throws ExecutionException, InterruptedException;
}
