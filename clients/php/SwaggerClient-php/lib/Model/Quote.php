<?php
/**
 * Quote
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
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

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * Quote Class Doc Comment
 *
 * @category    Class */
/** 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Quote implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Quote';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'timestamp' => '\DateTime',
        'symbol' => 'string',
        'bid_size' => 'float',
        'bid_price' => 'double',
        'ask_price' => 'double',
        'ask_size' => 'float',
        'id' => 'double'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'timestamp' => 'timestamp',
        'symbol' => 'symbol',
        'bid_size' => 'bidSize',
        'bid_price' => 'bidPrice',
        'ask_price' => 'askPrice',
        'ask_size' => 'askSize',
        'id' => 'id'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'timestamp' => 'setTimestamp',
        'symbol' => 'setSymbol',
        'bid_size' => 'setBidSize',
        'bid_price' => 'setBidPrice',
        'ask_price' => 'setAskPrice',
        'ask_size' => 'setAskSize',
        'id' => 'setId'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'timestamp' => 'getTimestamp',
        'symbol' => 'getSymbol',
        'bid_size' => 'getBidSize',
        'bid_price' => 'getBidPrice',
        'ask_price' => 'getAskPrice',
        'ask_size' => 'getAskSize',
        'id' => 'getId'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['timestamp'] = isset($data['timestamp']) ? $data['timestamp'] : null;
        $this->container['symbol'] = isset($data['symbol']) ? $data['symbol'] : null;
        $this->container['bid_size'] = isset($data['bid_size']) ? $data['bid_size'] : null;
        $this->container['bid_price'] = isset($data['bid_price']) ? $data['bid_price'] : null;
        $this->container['ask_price'] = isset($data['ask_price']) ? $data['ask_price'] : null;
        $this->container['ask_size'] = isset($data['ask_size']) ? $data['ask_size'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        return true;
    }


    /**
     * Gets timestamp
     * @return \DateTime
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     * @param \DateTime $timestamp
     * @return $this
     */
    public function setTimestamp($timestamp)
    {
        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets symbol
     * @return string
     */
    public function getSymbol()
    {
        return $this->container['symbol'];
    }

    /**
     * Sets symbol
     * @param string $symbol
     * @return $this
     */
    public function setSymbol($symbol)
    {
        $this->container['symbol'] = $symbol;

        return $this;
    }

    /**
     * Gets bid_size
     * @return float
     */
    public function getBidSize()
    {
        return $this->container['bid_size'];
    }

    /**
     * Sets bid_size
     * @param float $bid_size
     * @return $this
     */
    public function setBidSize($bid_size)
    {
        $this->container['bid_size'] = $bid_size;

        return $this;
    }

    /**
     * Gets bid_price
     * @return double
     */
    public function getBidPrice()
    {
        return $this->container['bid_price'];
    }

    /**
     * Sets bid_price
     * @param double $bid_price
     * @return $this
     */
    public function setBidPrice($bid_price)
    {
        $this->container['bid_price'] = $bid_price;

        return $this;
    }

    /**
     * Gets ask_price
     * @return double
     */
    public function getAskPrice()
    {
        return $this->container['ask_price'];
    }

    /**
     * Sets ask_price
     * @param double $ask_price
     * @return $this
     */
    public function setAskPrice($ask_price)
    {
        $this->container['ask_price'] = $ask_price;

        return $this;
    }

    /**
     * Gets ask_size
     * @return float
     */
    public function getAskSize()
    {
        return $this->container['ask_size'];
    }

    /**
     * Sets ask_size
     * @param float $ask_size
     * @return $this
     */
    public function setAskSize($ask_size)
    {
        $this->container['ask_size'] = $ask_size;

        return $this;
    }

    /**
     * Gets id
     * @return double
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     * @param double $id
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


