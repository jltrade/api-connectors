/**
 * BitMEX API
 * REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Instrument;
import io.swagger.client.model.Error;
import org.joda.time.LocalDate;
import java.math.BigDecimal;
import io.swagger.client.model.InstrumentInterval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstrumentApi
 */
public class InstrumentApiTest {

    private final InstrumentApi api = new InstrumentApi();

    
    /**
     * Get instruments.
     *
     * This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use &#x60;/instrument/active&#x60; to return active instruments, or use a filter like &#x60;{\&quot;state\&quot;: \&quot;Open\&quot;}&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetTest() throws ApiException {
        String symbol = null;
        String filter = null;
        String columns = null;
        BigDecimal count = null;
        BigDecimal start = null;
        Boolean reverse = null;
        LocalDate startTime = null;
        LocalDate endTime = null;
        // List<Instrument> response = api.instrumentGet(symbol, filter, columns, count, start, reverse, startTime, endTime);

        // TODO: test validations
    }
    
    /**
     * Get all active instruments and instruments that have expired in &lt;24hrs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetActiveTest() throws ApiException {
        // List<Instrument> response = api.instrumentGetActive();

        // TODO: test validations
    }
    
    /**
     * Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetActiveAndIndicesTest() throws ApiException {
        // List<Instrument> response = api.instrumentGetActiveAndIndices();

        // TODO: test validations
    }
    
    /**
     * Return all active contract series and interval pairs.
     *
     * This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as &#x60;[\&quot;BVOL:daily\&quot;, \&quot;BVOL:weekly\&quot;, \&quot;XBU:daily\&quot;, \&quot;XBU:monthly\&quot;, ...]&#x60;. These identifiers are usable in any query&#39;s &#x60;symbol&#x60; param. The second array is the current resolution of these intervals. Results are mapped at the same index.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetActiveIntervalsTest() throws ApiException {
        // InstrumentInterval response = api.instrumentGetActiveIntervals();

        // TODO: test validations
    }
    
    /**
     * Get all price indices.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentGetIndicesTest() throws ApiException {
        // List<Instrument> response = api.instrumentGetIndices();

        // TODO: test validations
    }
    
}
