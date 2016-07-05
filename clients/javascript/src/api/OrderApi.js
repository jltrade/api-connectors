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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Order', 'model/Error'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Order'), require('../model/Error'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.OrderApi = factory(root.BitMexApi.ApiClient, root.BitMexApi.Order, root.BitMexApi.Error);
  }
}(this, function(ApiClient, Order, Error) {
  'use strict';

  /**
   * Order service.
   * @module api/OrderApi
   * @version 1.2.0
   */

  /**
   * Constructs a new OrderApi. 
   * @alias module:api/OrderApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the orderAmend operation.
     * @callback module:api/OrderApi~orderAmendCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Amend the quantity or price of an open order.
     * &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt; &lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has already filled.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.&lt;/p&gt; &lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with a JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt; 
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderID Order ID
     * @param {String} opts.clOrdID Client Order ID. See POST /order.
     * @param {Number} opts.simpleOrderQty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
     * @param {Number} opts.orderQty Optional order quantity in units of the instrument (i.e. contracts).
     * @param {Number} opts.simpleLeavesQty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
     * @param {Number} opts.leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
     * @param {Number} opts.price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
     * @param {Number} opts.stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
     * @param {Number} opts.pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
     * @param {String} opts.text Optional amend annotation. e.g. &#39;Adjust skew&#39;.
     * @param {module:api/OrderApi~orderAmendCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/Order}
     */
    this.orderAmend = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'orderID': opts['orderID'],
        'clOrdID': opts['clOrdID'],
        'simpleOrderQty': opts['simpleOrderQty'],
        'orderQty': opts['orderQty'],
        'simpleLeavesQty': opts['simpleLeavesQty'],
        'leavesQty': opts['leavesQty'],
        'price': opts['price'],
        'stopPx': opts['stopPx'],
        'pegOffsetValue': opts['pegOffsetValue'],
        'text': opts['text']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderAmendBulk operation.
     * @callback module:api/OrderApi~orderAmendBulkCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Amend multiple orders.
     * Similar to POST /amend, but with multiple orders. &#x60;application/json&#x60; only. Ratelimited at 50%.
     * @param {Object} opts Optional parameters
     * @param {String} opts.orders An array of orders.
     * @param {module:api/OrderApi~orderAmendBulkCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<module:model/Order>}
     */
    this.orderAmendBulk = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'orders': opts['orders']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order/bulk', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancel operation.
     * @callback module:api/OrderApi~orderCancelCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel order(s). Send multiple order IDs to cancel in bulk.
     * Either an orderID or a clOrdID must be provided.
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderID Order ID(s).
     * @param {String} opts.clOrdID Client Order ID(s). See POST /order.
     * @param {String} opts.text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.
     * @param {module:api/OrderApi~orderCancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<module:model/Order>}
     */
    this.orderCancel = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'orderID': opts['orderID'],
        'clOrdID': opts['clOrdID'],
        'text': opts['text']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancelAll operation.
     * @callback module:api/OrderApi~orderCancelAllCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels all of your orders.
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Optional symbol. If provided, only cancels orders for that symbol.
     * @param {String} opts.filter Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;.
     * @param {String} opts.text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
     * @param {module:api/OrderApi~orderCancelAllCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Object}
     */
    this.orderCancelAll = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'symbol': opts['symbol'],
        'filter': opts['filter'],
        'text': opts['text']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/order/all', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancelAllAfter operation.
     * @callback module:api/OrderApi~orderCancelAllAfterCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Automatically cancel all your orders after a specified timeout.
     * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 
     * @param {Number} timeout Timeout in ms. Set to 0 to cancel this timer. 
     * @param {module:api/OrderApi~orderCancelAllAfterCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Object}
     */
    this.orderCancelAllAfter = function(timeout, callback) {
      var postBody = null;

      // verify the required parameter 'timeout' is set
      if (timeout == undefined || timeout == null) {
        throw "Missing the required parameter 'timeout' when calling orderCancelAllAfter";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'timeout': timeout
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/order/cancelAllAfter', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderClosePosition operation.
     * @callback module:api/OrderApi~orderClosePositionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
     * If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
     * @param {String} symbol Symbol of position to close.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.price Optional limit price.
     * @param {module:api/OrderApi~orderClosePositionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/Order}
     */
    this.orderClosePosition = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol == undefined || symbol == null) {
        throw "Missing the required parameter 'symbol' when calling orderClosePosition";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'symbol': symbol,
        'price': opts['price']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order/closePosition', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderGetOrders operation.
     * @callback module:api/OrderApi~orderGetOrdersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get your orders.
     * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
     * @param {String} opts.filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
     * @param {String} opts.columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
     * @param {Number} opts.count Number of results to fetch. (default to 100)
     * @param {Number} opts.start Starting point for results. (default to 0)
     * @param {Boolean} opts.reverse If true, will sort results newest first. (default to false)
     * @param {Date} opts.startTime Starting date filter for results.
     * @param {Date} opts.endTime Ending date filter for results.
     * @param {module:api/OrderApi~orderGetOrdersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<module:model/Order>}
     */
    this.orderGetOrders = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'symbol': opts['symbol'],
        'filter': opts['filter'],
        'columns': opts['columns'],
        'count': opts['count'],
        'start': opts['start'],
        'reverse': opts['reverse'],
        'startTime': opts['startTime'],
        'endTime': opts['endTime']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderNew operation.
     * @callback module:api/OrderApi~orderNewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new order.
     * This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume &#39;Limit&#39;. Be very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to &#x60;/api/v1/order/bulk&#x60;. Send a JSON payload with the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#x60;&#39;bmex_mm_&#39;&#x60; and the UUID &#x60;&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;&#x60; creates &#x60;&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;&#x60;.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 
     * @param {String} symbol Instrument symbol. e.g. &#39;XBT24H&#39;.
     * @param {Object} opts Optional parameters
     * @param {String} opts.side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative.
     * @param {Number} opts.simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).
     * @param {Number} opts.quantity Deprecated: use &#x60;orderQty&#x60;.
     * @param {Number} opts.orderQty Order quantity in units of the instrument (i.e. contracts).
     * @param {Number} opts.price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
     * @param {Number} opts.displayQty Optional quantity to display in the book. Use 0 for a hidden order.
     * @param {Number} opts.stopPrice Deprecated: use &#x60;stopPx&#x60;.
     * @param {Number} opts.stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.
     * @param {String} opts.clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
     * @param {String} opts.clOrdLinkID Optional Client Order Link ID for contingent orders.
     * @param {Number} opts.pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
     * @param {String} opts.pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
     * @param {String} opts.type Deprecated: use &#x60;ordType&#x60;.
     * @param {String} opts.ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. (default to Limit)
     * @param {String} opts.timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.
     * @param {String} opts.execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.
     * @param {String} opts.contingencyType Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
     * @param {String} opts.text Optional order annotation. e.g. &#39;Take profit&#39;.
     * @param {module:api/OrderApi~orderNewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/Order}
     */
    this.orderNew = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol == undefined || symbol == null) {
        throw "Missing the required parameter 'symbol' when calling orderNew";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'symbol': symbol,
        'side': opts['side'],
        'simpleOrderQty': opts['simpleOrderQty'],
        'quantity': opts['quantity'],
        'orderQty': opts['orderQty'],
        'price': opts['price'],
        'displayQty': opts['displayQty'],
        'stopPrice': opts['stopPrice'],
        'stopPx': opts['stopPx'],
        'clOrdID': opts['clOrdID'],
        'clOrdLinkID': opts['clOrdLinkID'],
        'pegOffsetValue': opts['pegOffsetValue'],
        'pegPriceType': opts['pegPriceType'],
        'type': opts['type'],
        'ordType': opts['ordType'],
        'timeInForce': opts['timeInForce'],
        'execInst': opts['execInst'],
        'contingencyType': opts['contingencyType'],
        'text': opts['text']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderNewBulk operation.
     * @callback module:api/OrderApi~orderNewBulkCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create multiple new orders.
     * This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at &#x60;ceil(0.5 * orders)&#x60;. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only &#x60;application/json&#x60; is supported on this endpoint. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.orders An array of orders.
     * @param {module:api/OrderApi~orderNewBulkCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<module:model/Order>}
     */
    this.orderNewBulk = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'orders': opts['orders']
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order/bulk', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
