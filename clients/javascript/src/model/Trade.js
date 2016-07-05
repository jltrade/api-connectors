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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.Trade = factory(root.BitMexApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Trade model module.
   * @module model/Trade
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>Trade</code>.
   * @alias module:model/Trade
   * @class
   */
  var exports = function() {
    var _this = this;












  };

  /**
   * Constructs a <code>Trade</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Trade} obj Optional instance to populate.
   * @return {module:model/Trade} The populated <code>Trade</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('timestamp')) {
        obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Date');
      }
      if (data.hasOwnProperty('symbol')) {
        obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
      }
      if (data.hasOwnProperty('side')) {
        obj['side'] = ApiClient.convertToType(data['side'], 'String');
      }
      if (data.hasOwnProperty('size')) {
        obj['size'] = ApiClient.convertToType(data['size'], 'Number');
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'Number');
      }
      if (data.hasOwnProperty('tickDirection')) {
        obj['tickDirection'] = ApiClient.convertToType(data['tickDirection'], 'String');
      }
      if (data.hasOwnProperty('trdMatchID')) {
        obj['trdMatchID'] = ApiClient.convertToType(data['trdMatchID'], 'String');
      }
      if (data.hasOwnProperty('grossValue')) {
        obj['grossValue'] = ApiClient.convertToType(data['grossValue'], 'Number');
      }
      if (data.hasOwnProperty('homeNotional')) {
        obj['homeNotional'] = ApiClient.convertToType(data['homeNotional'], 'Number');
      }
      if (data.hasOwnProperty('foreignNotional')) {
        obj['foreignNotional'] = ApiClient.convertToType(data['foreignNotional'], 'Number');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Date} timestamp
   */
  exports.prototype['timestamp'] = undefined;
  /**
   * @member {String} symbol
   */
  exports.prototype['symbol'] = undefined;
  /**
   * @member {String} side
   */
  exports.prototype['side'] = undefined;
  /**
   * @member {Number} size
   */
  exports.prototype['size'] = undefined;
  /**
   * @member {Number} price
   */
  exports.prototype['price'] = undefined;
  /**
   * @member {String} tickDirection
   */
  exports.prototype['tickDirection'] = undefined;
  /**
   * @member {String} trdMatchID
   */
  exports.prototype['trdMatchID'] = undefined;
  /**
   * @member {Number} grossValue
   */
  exports.prototype['grossValue'] = undefined;
  /**
   * @member {Number} homeNotional
   */
  exports.prototype['homeNotional'] = undefined;
  /**
   * @member {Number} foreignNotional
   */
  exports.prototype['foreignNotional'] = undefined;
  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;



  return exports;
}));


