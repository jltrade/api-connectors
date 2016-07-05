/* 
 * BitMEX API
 *
 * REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swagger

import (
	"strings"
	"fmt"
	"errors"
	"net/url"
	"time"
"encoding/json"
)

type OrderApi struct {
	Configuration Configuration
}

func NewOrderApi() *OrderApi {
	configuration := NewConfiguration()
	return &OrderApi{
		Configuration: *configuration,
	}
}

func NewOrderApiWithBasePath(basePath string) *OrderApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &OrderApi{
		Configuration: *configuration,
	}
}

/**
 * Amend the quantity or price of an open order.
 * &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt; &lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has already filled.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.&lt;/p&gt; &lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with a JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt; 
 *
 * @param orderID Order ID
 * @param clOrdID Client Order ID. See POST /order.
 * @param simpleOrderQty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
 * @param orderQty Optional order quantity in units of the instrument (i.e. contracts).
 * @param simpleLeavesQty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
 * @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
 * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
 * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
 * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
 * @param text Optional amend annotation. e.g. &#39;Adjust skew&#39;.
 * @return *Order
 */
func (a OrderApi) OrderAmend(orderID string, clOrdID string, simpleOrderQty float64, orderQty float32, simpleLeavesQty float64, leavesQty float32, price float64, stopPx float64, pegOffsetValue float64, text string) (*Order, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/order"


	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["orderID"] = orderID
	formParams["clOrdID"] = clOrdID
	formParams["simpleOrderQty"] = simpleOrderQty
	formParams["orderQty"] = orderQty
	formParams["simpleLeavesQty"] = simpleLeavesQty
	formParams["leavesQty"] = leavesQty
	formParams["price"] = price
	formParams["stopPx"] = stopPx
	formParams["pegOffsetValue"] = pegOffsetValue
	formParams["text"] = text
	var successPayload = new(Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Amend multiple orders.
 * Similar to POST /amend, but with multiple orders. &#x60;application/json&#x60; only. Ratelimited at 50%.
 *
 * @param orders An array of orders.
 * @return []Order
 */
func (a OrderApi) OrderAmendBulk(orders string) ([]Order, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/order/bulk"


	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["orders"] = orders
	var successPayload = new([]Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancel order(s). Send multiple order IDs to cancel in bulk.
 * Either an orderID or a clOrdID must be provided.
 *
 * @param orderID Order ID(s).
 * @param clOrdID Client Order ID(s). See POST /order.
 * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.
 * @return []Order
 */
func (a OrderApi) OrderCancel(orderID string, clOrdID string, text string) ([]Order, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/order"


	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["orderID"] = orderID
	formParams["clOrdID"] = clOrdID
	formParams["text"] = text
	var successPayload = new([]Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancels all of your orders.
 *
 * @param symbol Optional symbol. If provided, only cancels orders for that symbol.
 * @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;.
 * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
 * @return *Object
 */
func (a OrderApi) OrderCancelAll(symbol string, filter string, text string) (*Object, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/order/all"


	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["symbol"] = symbol
	formParams["filter"] = filter
	formParams["text"] = text
	var successPayload = new(Object)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Automatically cancel all your orders after a specified timeout.
 * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 
 *
 * @param timeout Timeout in ms. Set to 0 to cancel this timer. 
 * @return *Object
 */
func (a OrderApi) OrderCancelAllAfter(timeout float64) (*Object, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/order/cancelAllAfter"

	// verify the required parameter 'timeout' is set
	if &timeout == nil {
		return new(Object), nil, errors.New("Missing required parameter 'timeout' when calling OrderApi->OrderCancelAllAfter")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["timeout"] = timeout
	var successPayload = new(Object)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
 * If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
 *
 * @param symbol Symbol of position to close.
 * @param price Optional limit price.
 * @return *Order
 */
func (a OrderApi) OrderClosePosition(symbol string, price float64) (*Order, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/order/closePosition"

	// verify the required parameter 'symbol' is set
	if &symbol == nil {
		return new(Order), nil, errors.New("Missing required parameter 'symbol' when calling OrderApi->OrderClosePosition")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["symbol"] = symbol
	formParams["price"] = price
	var successPayload = new(Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Get your orders.
 * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
 *
 * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
 * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
 * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
 * @param count Number of results to fetch.
 * @param start Starting point for results.
 * @param reverse If true, will sort results newest first.
 * @param startTime Starting date filter for results.
 * @param endTime Ending date filter for results.
 * @return []Order
 */
func (a OrderApi) OrderGetOrders(symbol string, filter string, columns string, count float32, start float32, reverse bool, startTime time.Time, endTime time.Time) ([]Order, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/order"


	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}
		queryParams.Add("symbol", a.Configuration.APIClient.ParameterToString(symbol, ""))
			queryParams.Add("filter", a.Configuration.APIClient.ParameterToString(filter, ""))
			queryParams.Add("columns", a.Configuration.APIClient.ParameterToString(columns, ""))
			queryParams.Add("count", a.Configuration.APIClient.ParameterToString(count, ""))
			queryParams.Add("start", a.Configuration.APIClient.ParameterToString(start, ""))
			queryParams.Add("reverse", a.Configuration.APIClient.ParameterToString(reverse, ""))
			queryParams.Add("startTime", a.Configuration.APIClient.ParameterToString(startTime, ""))
			queryParams.Add("endTime", a.Configuration.APIClient.ParameterToString(endTime, ""))
	

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}
	var successPayload = new([]Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Create a new order.
 * This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume &#39;Limit&#39;. Be very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to &#x60;/api/v1/order/bulk&#x60;. Send a JSON payload with the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#x60;&#39;bmex_mm_&#39;&#x60; and the UUID &#x60;&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;&#x60; creates &#x60;&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;&#x60;.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 
 *
 * @param symbol Instrument symbol. e.g. &#39;XBT24H&#39;.
 * @param side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative.
 * @param simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).
 * @param quantity Deprecated: use &#x60;orderQty&#x60;.
 * @param orderQty Order quantity in units of the instrument (i.e. contracts).
 * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
 * @param displayQty Optional quantity to display in the book. Use 0 for a hidden order.
 * @param stopPrice Deprecated: use &#x60;stopPx&#x60;.
 * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.
 * @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
 * @param clOrdLinkID Optional Client Order Link ID for contingent orders.
 * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
 * @param pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
 * @param type_ Deprecated: use &#x60;ordType&#x60;.
 * @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified.
 * @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.
 * @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.
 * @param contingencyType Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
 * @param text Optional order annotation. e.g. &#39;Take profit&#39;.
 * @return *Order
 */
func (a OrderApi) OrderNew(symbol string, side string, simpleOrderQty float64, quantity float32, orderQty float32, price float64, displayQty float32, stopPrice float64, stopPx float64, clOrdID string, clOrdLinkID string, pegOffsetValue float64, pegPriceType string, type_ string, ordType string, timeInForce string, execInst string, contingencyType string, text string) (*Order, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/order"

	// verify the required parameter 'symbol' is set
	if &symbol == nil {
		return new(Order), nil, errors.New("Missing required parameter 'symbol' when calling OrderApi->OrderNew")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["symbol"] = symbol
	formParams["side"] = side
	formParams["simpleOrderQty"] = simpleOrderQty
	formParams["quantity"] = quantity
	formParams["orderQty"] = orderQty
	formParams["price"] = price
	formParams["displayQty"] = displayQty
	formParams["stopPrice"] = stopPrice
	formParams["stopPx"] = stopPx
	formParams["clOrdID"] = clOrdID
	formParams["clOrdLinkID"] = clOrdLinkID
	formParams["pegOffsetValue"] = pegOffsetValue
	formParams["pegPriceType"] = pegPriceType
	formParams["type_"] = type_
	formParams["ordType"] = ordType
	formParams["timeInForce"] = timeInForce
	formParams["execInst"] = execInst
	formParams["contingencyType"] = contingencyType
	formParams["text"] = text
	var successPayload = new(Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Create multiple new orders.
 * This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at &#x60;ceil(0.5 * orders)&#x60;. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only &#x60;application/json&#x60; is supported on this endpoint. 
 *
 * @param orders An array of orders.
 * @return []Order
 */
func (a OrderApi) OrderNewBulk(orders string) ([]Order, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/order/bulk"


	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"text/xml",
"application/javascript",
"text/javascript",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	formParams["orders"] = orders
	var successPayload = new([]Order)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return *successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

