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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
    public void testConstructor01() throws Exception {
        try {
            new AwsApaRequesterImpl("", "", "", "");
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor02() throws Exception {
        try {
            new AwsApaRequesterImpl("a", "", "", "");
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor03() throws Exception {
        try {
            new AwsApaRequesterImpl("a", "a", "", "");
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor04() throws Exception {
        try {
            new AwsApaRequesterImpl("a", "a", "a", "");
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor05() throws Exception {
        try {
            new AwsApaRequesterImpl(null, null, null, null);
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor06() throws Exception {
        try {
            new AwsApaRequesterImpl("a", null, null, null);
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor07() throws Exception {
        try {
            new AwsApaRequesterImpl("a", "a", null, null);
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor08() throws Exception {
        try {
            new AwsApaRequesterImpl("a", "a", "a", null);
            fail();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testConstructor09() throws Exception {
        assertNotNull(new AwsApaRequesterImpl("a", "a", "a", "a"));
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
    public void testItemLookup01() throws Exception {
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

    public static class Result {
        public Future<ItemLookupResponse> res;
        public String expectedId;
    }

    @Test
    public void testItemLookup02() throws Exception {
        // test in multithread
        int threadNum = 50;
        ExecutorService exec = Executors.newFixedThreadPool(5);

        List<Result> results = new ArrayList<Result>();
        String[] ids = { "489471499X", "489471499X", "4798024031" };
        for (int i = 0; i < threadNum; i++) {
            final String id = ids[i % ids.length];
            Future<ItemLookupResponse> res = exec
                    .submit(new Callable<ItemLookupResponse>() {
                        @Override
                        public ItemLookupResponse call() throws Exception {
                            ItemLookupRequest request = new ItemLookupRequest();
                            request.getItemId().add(id);
                            request.getResponseGroup().add("Small");
                            return requester.itemLookup(request);
                        }
                    });
            Result result = new Result();
            result.res = res;
            result.expectedId = id;
            results.add(result);
        }

        for (Result r : results) {
            ItemLookupResponse response = r.res.get();
            assertNotNull(response);
            assertNotNull(response.getItems());
            assertTrue(response.getItems().size() == 1);
            assertNotNull(response.getItems().get(0).getItem());
            assertTrue(response.getItems().get(0).getItem().size() == 1);
            Item item = response.getItems().get(0).getItem().get(0);
            assertEquals(r.expectedId, item.getASIN());
            assertNotNull(item.getItemAttributes());
        }

        exec.shutdown();
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
