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
    define(['ApiClient', 'model/OrderBook', 'model/Error', 'model/OrderBookL2'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/OrderBook'), require('../model/Error'), require('../model/OrderBookL2'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.OrderBookApi = factory(root.BitMexApi.ApiClient, root.BitMexApi.OrderBook, root.BitMexApi.Error, root.BitMexApi.OrderBookL2);
  }
}(this, function(ApiClient, OrderBook, Error, OrderBookL2) {
  'use strict';

  /**
   * OrderBook service.
   * @module api/OrderBookApi
   * @version 1.2.0
   */

  /**
   * Constructs a new OrderBookApi. 
   * @alias module:api/OrderBookApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the orderBookGet operation.
     * @callback module:api/OrderBookApi~orderBookGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/OrderBook>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get current orderbook [deprecated, use /orderBook/L2].
     * @param {String} symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.depth Orderbook depth. (default to 25)
     * @param {module:api/OrderBookApi~orderBookGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<module:model/OrderBook>}
     */
    this.orderBookGet = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol == undefined || symbol == null) {
        throw "Missing the required parameter 'symbol' when calling orderBookGet";
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
        'depth': opts['depth']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [OrderBook];

      return this.apiClient.callApi(
        '/orderBook', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderBookGetL2 operation.
     * @callback module:api/OrderBookApi~orderBookGetL2Callback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/OrderBookL2>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get current orderbook in vertical format.
     * @param {String} symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.depth Orderbook depth per side. Send 0 for full depth. (default to 25)
     * @param {module:api/OrderBookApi~orderBookGetL2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<module:model/OrderBookL2>}
     */
    this.orderBookGetL2 = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol == undefined || symbol == null) {
        throw "Missing the required parameter 'symbol' when calling orderBookGetL2";
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
        'depth': opts['depth']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [OrderBookL2];

      return this.apiClient.callApi(
        '/orderBook/L2', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
