# BitMexApi.OrderApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAmend**](OrderApi.md#orderAmend) | **PUT** /order | Amend the quantity or price of an open order.
[**orderAmendBulk**](OrderApi.md#orderAmendBulk) | **PUT** /order/bulk | Amend multiple orders.
[**orderCancel**](OrderApi.md#orderCancel) | **DELETE** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
[**orderCancelAll**](OrderApi.md#orderCancelAll) | **DELETE** /order/all | Cancels all of your orders.
[**orderCancelAllAfter**](OrderApi.md#orderCancelAllAfter) | **POST** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
[**orderClosePosition**](OrderApi.md#orderClosePosition) | **POST** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
[**orderGetOrders**](OrderApi.md#orderGetOrders) | **GET** /order | Get your orders.
[**orderNew**](OrderApi.md#orderNew) | **POST** /order | Create a new order.
[**orderNewBulk**](OrderApi.md#orderNewBulk) | **POST** /order/bulk | Create multiple new orders.


<a name="orderAmend"></a>
# **orderAmend**
> Order orderAmend(opts)

Amend the quantity or price of an open order.

&lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt; &lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has already filled.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.&lt;/p&gt; &lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with a JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt; 

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var opts = { 
  'orderID': "orderID_example", // String | Order ID
  'clOrdID': "clOrdID_example", // String | Client Order ID. See POST /order.
  'simpleOrderQty': 1.2, // Number | Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
  'orderQty': 3.4, // Number | Optional order quantity in units of the instrument (i.e. contracts).
  'simpleLeavesQty': 1.2, // Number | Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
  'leavesQty': 3.4, // Number | Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
  'price': 1.2, // Number | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
  'stopPx': 1.2, // Number | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
  'pegOffsetValue': 1.2, // Number | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
  'text': "text_example" // String | Optional amend annotation. e.g. 'Adjust skew'.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderAmend(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**| Order ID | [optional] 
 **clOrdID** | **String**| Client Order ID. See POST /order. | [optional] 
 **simpleOrderQty** | **Number**| Optional order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional] 
 **orderQty** | **Number**| Optional order quantity in units of the instrument (i.e. contracts). | [optional] 
 **simpleLeavesQty** | **Number**| Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders. | [optional] 
 **leavesQty** | **Number**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | [optional] 
 **price** | **Number**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **stopPx** | **Number**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | [optional] 
 **pegOffsetValue** | **Number**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional] 
 **text** | **String**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderAmendBulk"></a>
# **orderAmendBulk**
> [Order] orderAmendBulk(opts)

Amend multiple orders.

Similar to POST /amend, but with multiple orders. &#x60;application/json&#x60; only. Ratelimited at 50%.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var opts = { 
  'orders': "orders_example" // String | An array of orders.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderAmendBulk(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **String**| An array of orders. | [optional] 

### Return type

[**[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderCancel"></a>
# **orderCancel**
> [Order] orderCancel(opts)

Cancel order(s). Send multiple order IDs to cancel in bulk.

Either an orderID or a clOrdID must be provided.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var opts = { 
  'orderID': "orderID_example", // String | Order ID(s).
  'clOrdID': "clOrdID_example", // String | Client Order ID(s). See POST /order.
  'text': "text_example" // String | Optional cancellation annotation. e.g. 'Spread Exceeded'.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderCancel(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**| Order ID(s). | [optional] 
 **clOrdID** | **String**| Client Order ID(s). See POST /order. | [optional] 
 **text** | **String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. | [optional] 

### Return type

[**[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderCancelAll"></a>
# **orderCancelAll**
> Object orderCancelAll(opts)

Cancels all of your orders.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var opts = { 
  'symbol': "symbol_example", // String | Optional symbol. If provided, only cancels orders for that symbol.
  'filter': "filter_example", // String | Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
  'text': "text_example" // String | Optional cancellation annotation. e.g. 'Spread Exceeded'
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderCancelAll(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Optional symbol. If provided, only cancels orders for that symbol. | [optional] 
 **filter** | **String**| Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. | [optional] 
 **text** | **String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderCancelAllAfter"></a>
# **orderCancelAllAfter**
> Object orderCancelAllAfter(timeout)

Automatically cancel all your orders after a specified timeout.

Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var timeout = 1.2; // Number | Timeout in ms. Set to 0 to cancel this timer. 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderCancelAllAfter(timeout, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **Number**| Timeout in ms. Set to 0 to cancel this timer.  | 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderClosePosition"></a>
# **orderClosePosition**
> Order orderClosePosition(symbol, opts)

Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]

If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var symbol = "symbol_example"; // String | Symbol of position to close.

var opts = { 
  'price': 1.2 // Number | Optional limit price.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderClosePosition(symbol, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to close. | 
 **price** | **Number**| Optional limit price. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderGetOrders"></a>
# **orderGetOrders**
> [Order] orderGetOrders(opts)

Get your orders.

To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var opts = { 
  'symbol': "symbol_example", // String | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
  'filter': "filter_example", // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
  'columns': "columns_example", // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  'count': 100, // Number | Number of results to fetch.
  'start': 0, // Number | Starting point for results.
  'reverse': false, // Boolean | If true, will sort results newest first.
  'startTime': new Date("2013-10-20"), // Date | Starting date filter for results.
  'endTime': new Date("2013-10-20") // Date | Ending date filter for results.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderGetOrders(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Number**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Number**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional] 
 **endTime** | **Date**| Ending date filter for results. | [optional] 

### Return type

[**[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderNew"></a>
# **orderNew**
> Order orderNew(symbol, opts)

Create a new order.

This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume &#39;Limit&#39;. Be very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to &#x60;/api/v1/order/bulk&#x60;. Send a JSON payload with the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#x60;&#39;bmex_mm_&#39;&#x60; and the UUID &#x60;&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;&#x60; creates &#x60;&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;&#x60;.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var symbol = "symbol_example"; // String | Instrument symbol. e.g. 'XBT24H'.

var opts = { 
  'side': "side_example", // String | Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative.
  'simpleOrderQty': 1.2, // Number | Order quantity in units of the underlying instrument (i.e. Bitcoin).
  'quantity': 3.4, // Number | Deprecated: use `orderQty`.
  'orderQty': 3.4, // Number | Order quantity in units of the instrument (i.e. contracts).
  'price': 1.2, // Number | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
  'displayQty': 3.4, // Number | Optional quantity to display in the book. Use 0 for a hidden order.
  'stopPrice': 1.2, // Number | Deprecated: use `stopPx`.
  'stopPx': 1.2, // Number | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
  'clOrdID': "clOrdID_example", // String | Optional Client Order ID. This clOrdID will come back on the order and any related executions.
  'clOrdLinkID': "clOrdLinkID_example", // String | Optional Client Order Link ID for contingent orders.
  'pegOffsetValue': 1.2, // Number | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
  'pegPriceType': "pegPriceType_example", // String | Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
  'type': "type_example", // String | Deprecated: use `ordType`.
  'ordType': "Limit", // String | Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.
  'timeInForce': "timeInForce_example", // String | Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders.
  'execInst': "execInst_example", // String | Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders.
  'contingencyType': "contingencyType_example", // String | Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
  'text': "text_example" // String | Optional order annotation. e.g. 'Take profit'.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderNew(symbol, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. e.g. &#39;XBT24H&#39;. | 
 **side** | **String**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative. | [optional] 
 **simpleOrderQty** | **Number**| Order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional] 
 **quantity** | **Number**| Deprecated: use &#x60;orderQty&#x60;. | [optional] 
 **orderQty** | **Number**| Order quantity in units of the instrument (i.e. contracts). | [optional] 
 **price** | **Number**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **displayQty** | **Number**| Optional quantity to display in the book. Use 0 for a hidden order. | [optional] 
 **stopPrice** | **Number**| Deprecated: use &#x60;stopPx&#x60;. | [optional] 
 **stopPx** | **Number**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | [optional] 
 **clOrdID** | **String**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | [optional] 
 **clOrdLinkID** | **String**| Optional Client Order Link ID for contingent orders. | [optional] 
 **pegOffsetValue** | **Number**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional] 
 **pegPriceType** | **String**| Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg. | [optional] 
 **type** | **String**| Deprecated: use &#x60;ordType&#x60;. | [optional] 
 **ordType** | **String**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [optional] [default to Limit]
 **timeInForce** | **String**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders. | [optional] 
 **execInst** | **String**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **contingencyType** | **String**| Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional. | [optional] 
 **text** | **String**| Optional order annotation. e.g. &#39;Take profit&#39;. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderNewBulk"></a>
# **orderNewBulk**
> [Order] orderNewBulk(opts)

Create multiple new orders.

This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at &#x60;ceil(0.5 * orders)&#x60;. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only &#x60;application/json&#x60; is supported on this endpoint. 

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderApi();

var opts = { 
  'orders': "orders_example" // String | An array of orders.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderNewBulk(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **String**| An array of orders. | [optional] 

### Return type

[**[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

