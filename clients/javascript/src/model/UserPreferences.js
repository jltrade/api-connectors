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
    root.BitMexApi.UserPreferences = factory(root.BitMexApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The UserPreferences model module.
   * @module model/UserPreferences
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>UserPreferences</code>.
   * @alias module:model/UserPreferences
   * @class
   */
  var exports = function() {
    var _this = this;























  };

  /**
   * Constructs a <code>UserPreferences</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UserPreferences} obj Optional instance to populate.
   * @return {module:model/UserPreferences} The populated <code>UserPreferences</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('announcementsLastSeen')) {
        obj['announcementsLastSeen'] = ApiClient.convertToType(data['announcementsLastSeen'], 'Date');
      }
      if (data.hasOwnProperty('colorTheme')) {
        obj['colorTheme'] = ApiClient.convertToType(data['colorTheme'], 'String');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
      }
      if (data.hasOwnProperty('debug')) {
        obj['debug'] = ApiClient.convertToType(data['debug'], 'Boolean');
      }
      if (data.hasOwnProperty('disableEmails')) {
        obj['disableEmails'] = ApiClient.convertToType(data['disableEmails'], ['String']);
      }
      if (data.hasOwnProperty('hideConfirmDialogs')) {
        obj['hideConfirmDialogs'] = ApiClient.convertToType(data['hideConfirmDialogs'], ['String']);
      }
      if (data.hasOwnProperty('hideConnectionModal')) {
        obj['hideConnectionModal'] = ApiClient.convertToType(data['hideConnectionModal'], 'Boolean');
      }
      if (data.hasOwnProperty('hideFromLeaderboard')) {
        obj['hideFromLeaderboard'] = ApiClient.convertToType(data['hideFromLeaderboard'], 'Boolean');
      }
      if (data.hasOwnProperty('hideNameFromLeaderboard')) {
        obj['hideNameFromLeaderboard'] = ApiClient.convertToType(data['hideNameFromLeaderboard'], 'Boolean');
      }
      if (data.hasOwnProperty('hideNotifications')) {
        obj['hideNotifications'] = ApiClient.convertToType(data['hideNotifications'], ['String']);
      }
      if (data.hasOwnProperty('hidePhoneConfirm')) {
        obj['hidePhoneConfirm'] = ApiClient.convertToType(data['hidePhoneConfirm'], 'Boolean');
      }
      if (data.hasOwnProperty('locale')) {
        obj['locale'] = ApiClient.convertToType(data['locale'], 'String');
      }
      if (data.hasOwnProperty('msgsSeen')) {
        obj['msgsSeen'] = ApiClient.convertToType(data['msgsSeen'], ['String']);
      }
      if (data.hasOwnProperty('orderBookBinning')) {
        obj['orderBookBinning'] = ApiClient.convertToType(data['orderBookBinning'], 'Number');
      }
      if (data.hasOwnProperty('orderBookType')) {
        obj['orderBookType'] = ApiClient.convertToType(data['orderBookType'], 'String');
      }
      if (data.hasOwnProperty('orderControlsPlusMinus')) {
        obj['orderControlsPlusMinus'] = ApiClient.convertToType(data['orderControlsPlusMinus'], 'Boolean');
      }
      if (data.hasOwnProperty('sounds')) {
        obj['sounds'] = ApiClient.convertToType(data['sounds'], ['String']);
      }
      if (data.hasOwnProperty('strictIPCheck')) {
        obj['strictIPCheck'] = ApiClient.convertToType(data['strictIPCheck'], 'Boolean');
      }
      if (data.hasOwnProperty('strictTimeout')) {
        obj['strictTimeout'] = ApiClient.convertToType(data['strictTimeout'], 'Boolean');
      }
      if (data.hasOwnProperty('tickerGroup')) {
        obj['tickerGroup'] = ApiClient.convertToType(data['tickerGroup'], 'String');
      }
      if (data.hasOwnProperty('tickerPinned')) {
        obj['tickerPinned'] = ApiClient.convertToType(data['tickerPinned'], 'Boolean');
      }
      if (data.hasOwnProperty('tradeLayout')) {
        obj['tradeLayout'] = ApiClient.convertToType(data['tradeLayout'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Date} announcementsLastSeen
   */
  exports.prototype['announcementsLastSeen'] = undefined;
  /**
   * @member {String} colorTheme
   */
  exports.prototype['colorTheme'] = undefined;
  /**
   * @member {String} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * @member {Boolean} debug
   */
  exports.prototype['debug'] = undefined;
  /**
   * @member {Array.<String>} disableEmails
   */
  exports.prototype['disableEmails'] = undefined;
  /**
   * @member {Array.<String>} hideConfirmDialogs
   */
  exports.prototype['hideConfirmDialogs'] = undefined;
  /**
   * @member {Boolean} hideConnectionModal
   */
  exports.prototype['hideConnectionModal'] = undefined;
  /**
   * @member {Boolean} hideFromLeaderboard
   * @default false
   */
  exports.prototype['hideFromLeaderboard'] = false;
  /**
   * @member {Boolean} hideNameFromLeaderboard
   * @default true
   */
  exports.prototype['hideNameFromLeaderboard'] = true;
  /**
   * @member {Array.<String>} hideNotifications
   */
  exports.prototype['hideNotifications'] = undefined;
  /**
   * @member {Boolean} hidePhoneConfirm
   */
  exports.prototype['hidePhoneConfirm'] = undefined;
  /**
   * @member {String} locale
   */
  exports.prototype['locale'] = undefined;
  /**
   * @member {Array.<String>} msgsSeen
   */
  exports.prototype['msgsSeen'] = undefined;
  /**
   * @member {Number} orderBookBinning
   */
  exports.prototype['orderBookBinning'] = undefined;
  /**
   * @member {String} orderBookType
   */
  exports.prototype['orderBookType'] = undefined;
  /**
   * @member {Boolean} orderControlsPlusMinus
   */
  exports.prototype['orderControlsPlusMinus'] = undefined;
  /**
   * @member {Array.<String>} sounds
   */
  exports.prototype['sounds'] = undefined;
  /**
   * @member {Boolean} strictIPCheck
   * @default false
   */
  exports.prototype['strictIPCheck'] = false;
  /**
   * @member {Boolean} strictTimeout
   * @default true
   */
  exports.prototype['strictTimeout'] = true;
  /**
   * @member {String} tickerGroup
   */
  exports.prototype['tickerGroup'] = undefined;
  /**
   * @member {Boolean} tickerPinned
   */
  exports.prototype['tickerPinned'] = undefined;
  /**
   * @member {String} tradeLayout
   */
  exports.prototype['tradeLayout'] = undefined;



  return exports;
}));


