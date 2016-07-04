<?php
/**
 * Funding
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
 * Funding Class Doc Comment
 *
 * @category    Class */
/** 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Funding implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Funding';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'timestamp' => '\DateTime',
        'symbol' => 'string',
        'funding_interval' => '\DateTime',
        'funding_rate' => 'double',
        'funding_rate_daily' => 'double'
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
        'funding_interval' => 'fundingInterval',
        'funding_rate' => 'fundingRate',
        'funding_rate_daily' => 'fundingRateDaily'
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
        'funding_interval' => 'setFundingInterval',
        'funding_rate' => 'setFundingRate',
        'funding_rate_daily' => 'setFundingRateDaily'
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
        'funding_interval' => 'getFundingInterval',
        'funding_rate' => 'getFundingRate',
        'funding_rate_daily' => 'getFundingRateDaily'
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
        $this->container['funding_interval'] = isset($data['funding_interval']) ? $data['funding_interval'] : null;
        $this->container['funding_rate'] = isset($data['funding_rate']) ? $data['funding_rate'] : null;
        $this->container['funding_rate_daily'] = isset($data['funding_rate_daily']) ? $data['funding_rate_daily'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        if ($this->container['timestamp'] === null) {
            $invalid_properties[] = "'timestamp' can't be null";
        }
        if ($this->container['symbol'] === null) {
            $invalid_properties[] = "'symbol' can't be null";
        }
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
        if ($this->container['timestamp'] === null) {
            return false;
        }
        if ($this->container['symbol'] === null) {
            return false;
        }
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
     * Gets funding_interval
     * @return \DateTime
     */
    public function getFundingInterval()
    {
        return $this->container['funding_interval'];
    }

    /**
     * Sets funding_interval
     * @param \DateTime $funding_interval
     * @return $this
     */
    public function setFundingInterval($funding_interval)
    {
        $this->container['funding_interval'] = $funding_interval;

        return $this;
    }

    /**
     * Gets funding_rate
     * @return double
     */
    public function getFundingRate()
    {
        return $this->container['funding_rate'];
    }

    /**
     * Sets funding_rate
     * @param double $funding_rate
     * @return $this
     */
    public function setFundingRate($funding_rate)
    {
        $this->container['funding_rate'] = $funding_rate;

        return $this;
    }

    /**
     * Gets funding_rate_daily
     * @return double
     */
    public function getFundingRateDaily()
    {
        return $this->container['funding_rate_daily'];
    }

    /**
     * Sets funding_rate_daily
     * @param double $funding_rate_daily
     * @return $this
     */
    public function setFundingRateDaily($funding_rate_daily)
    {
        $this->container['funding_rate_daily'] = $funding_rate_daily;

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


