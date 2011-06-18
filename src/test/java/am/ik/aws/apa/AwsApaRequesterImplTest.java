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

import static org.junit.Assert.*;

import javax.xml.ws.Response;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import am.ik.aws.apa.jaxws.Item;
import am.ik.aws.apa.jaxws.ItemLookupRequest;
import am.ik.aws.apa.jaxws.ItemLookupResponse;
import am.ik.aws.apa.jaxws.ItemSearchRequest;
import am.ik.aws.apa.jaxws.ItemSearchResponse;

public class AwsApaRequesterImplTest {
    protected AwsApaRequester requester = new AwsApaRequesterImpl();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testItemSearch() throws Exception {
        ItemSearchRequest request = new ItemSearchRequest();
        request.setSearchIndex("Books");
        request.setKeywords("Java");
        ItemSearchResponse response = requester.itemSearch(request);
        assertNotNull(response);
        assertNotNull(response.getItems());
        assertTrue(response.getItems().size() > 0);
    }

    @Test
    public void testItemSearchAsync() throws Exception {
        ItemSearchRequest request = new ItemSearchRequest();
        request.setSearchIndex("Books");
        request.setKeywords("Java");
        Response<ItemSearchResponse> res = requester.itemSearchAsync(request);
        assertNotNull(res);
        ItemSearchResponse response = res.get();
        assertNotNull(response);
        assertNotNull(response.getItems());
        assertTrue(response.getItems().size() > 0);
    }

    @Test
    public void testItemLookup() throws Exception {
        String asin = "489471499X";
        ItemLookupRequest request = new ItemLookupRequest();
        request.getItemId().add(asin);
        request.getResponseGroup().add("Small");
        ItemLookupResponse response = requester.itemLookup(request);
        assertNotNull(response);
        assertNotNull(response.getItems());
        assertTrue(response.getItems().size() == 1);
        assertNotNull(response.getItems().get(0).getItem());
        assertTrue(response.getItems().get(0).getItem().size() == 1);
        Item item = response.getItems().get(0).getItem().get(0);
        assertEquals(asin, item.getASIN());
        assertNotNull(item.getItemAttributes());
    }

    @Test
    public void testItemLookupAsync01() throws Exception {
        String asin = "489471499X";
        ItemLookupRequest request = new ItemLookupRequest();
        request.getItemId().add(asin);
        request.getResponseGroup().add("Small");
        Response<ItemLookupResponse> res = requester.itemLookupAsync(request);
        ItemLookupResponse response = res.get();
        assertNotNull(response);
        assertNotNull(response.getItems());
        assertTrue(response.getItems().size() == 1);
        assertNotNull(response.getItems().get(0).getItem());
        assertTrue(response.getItems().get(0).getItem().size() == 1);
        Item item = response.getItems().get(0).getItem().get(0);
        assertEquals(asin, item.getASIN());
        assertNotNull(item.getItemAttributes());
    }

    @Test
    public void testItemLookupAsync02() throws Exception {
        Response<ItemLookupResponse> res = null;
        {
            ItemLookupRequest request = new ItemLookupRequest();
            request.getItemId().add("489471499X");
            request.getResponseGroup().add("Small");
            res = requester.itemLookupAsync(request);
        }
        Response<ItemLookupResponse> res1 = res;

        {
            ItemLookupRequest request = new ItemLookupRequest();
            request.getItemId().add("4798024031");
            request.getResponseGroup().add("Small");
            res = requester.itemLookupAsync(request);
        }
        Response<ItemLookupResponse> res2 = res;

        {
            ItemLookupRequest request = new ItemLookupRequest();
            request.getItemId().add("4797339535");
            request.getResponseGroup().add("Small");
            res = requester.itemLookupAsync(request);
        }
        Response<ItemLookupResponse> res3 = res;

        {
            ItemLookupResponse response = res1.get();
            assertNotNull(response);
            assertNotNull(response.getItems());
            assertTrue(response.getItems().size() == 1);
            assertNotNull(response.getItems().get(0).getItem());
            assertTrue(response.getItems().get(0).getItem().size() == 1);
            Item item = response.getItems().get(0).getItem().get(0);
            assertEquals("489471499X", item.getASIN());
            assertNotNull(item.getItemAttributes());
        }

        {
            ItemLookupResponse response = res2.get();
            assertNotNull(response);
            assertNotNull(response.getItems());
            assertTrue(response.getItems().size() == 1);
            assertNotNull(response.getItems().get(0).getItem());
            assertTrue(response.getItems().get(0).getItem().size() == 1);
            Item item = response.getItems().get(0).getItem().get(0);
            assertEquals("4798024031", item.getASIN());
            assertNotNull(item.getItemAttributes());
        }

        {
            ItemLookupResponse response = res3.get();
            assertNotNull(response);
            assertNotNull(response.getItems());
            assertTrue(response.getItems().size() == 1);
            assertNotNull(response.getItems().get(0).getItem());
            assertTrue(response.getItems().get(0).getItem().size() == 1);
            Item item = response.getItems().get(0).getItem().get(0);
            assertEquals("4797339535", item.getASIN());
            assertNotNull(item.getItemAttributes());
        }
    }
}
