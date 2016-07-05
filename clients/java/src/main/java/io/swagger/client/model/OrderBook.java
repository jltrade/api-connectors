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


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;


/**
 * OrderBook
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T09:40:48.217-05:00")
public class OrderBook   {
  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("level")
  private BigDecimal level = null;

  @JsonProperty("bidSize")
  private BigDecimal bidSize = null;

  @JsonProperty("bidPrice")
  private Double bidPrice = null;

  @JsonProperty("askPrice")
  private Double askPrice = null;

  @JsonProperty("askSize")
  private BigDecimal askSize = null;

  @JsonProperty("timestamp")
  private LocalDate timestamp = null;

  public OrderBook symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OrderBook level(BigDecimal level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BigDecimal getLevel() {
    return level;
  }

  public void setLevel(BigDecimal level) {
    this.level = level;
  }

  public OrderBook bidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * Get bidSize
   * @return bidSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBidSize() {
    return bidSize;
  }

  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  public OrderBook bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public OrderBook askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * Get askPrice
   * @return askPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public OrderBook askSize(BigDecimal askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * Get askSize
   * @return askSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getAskSize() {
    return askSize;
  }

  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  public OrderBook timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBook orderBook = (OrderBook) o;
    return Objects.equals(this.symbol, orderBook.symbol) &&
        Objects.equals(this.level, orderBook.level) &&
        Objects.equals(this.bidSize, orderBook.bidSize) &&
        Objects.equals(this.bidPrice, orderBook.bidPrice) &&
        Objects.equals(this.askPrice, orderBook.askPrice) &&
        Objects.equals(this.askSize, orderBook.askSize) &&
        Objects.equals(this.timestamp, orderBook.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, level, bidSize, bidPrice, askPrice, askSize, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBook {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

