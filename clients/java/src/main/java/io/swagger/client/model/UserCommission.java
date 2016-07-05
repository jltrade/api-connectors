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


/**
 * UserCommission
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T09:40:48.217-05:00")
public class UserCommission   {
  @JsonProperty("makerFee")
  private String makerFee = null;

  @JsonProperty("takerFee")
  private String takerFee = null;

  @JsonProperty("insuranceFee")
  private String insuranceFee = null;

  public UserCommission makerFee(String makerFee) {
    this.makerFee = makerFee;
    return this;
  }

   /**
   * Get makerFee
   * @return makerFee
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMakerFee() {
    return makerFee;
  }

  public void setMakerFee(String makerFee) {
    this.makerFee = makerFee;
  }

  public UserCommission takerFee(String takerFee) {
    this.takerFee = takerFee;
    return this;
  }

   /**
   * Get takerFee
   * @return takerFee
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTakerFee() {
    return takerFee;
  }

  public void setTakerFee(String takerFee) {
    this.takerFee = takerFee;
  }

  public UserCommission insuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
    return this;
  }

   /**
   * Get insuranceFee
   * @return insuranceFee
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInsuranceFee() {
    return insuranceFee;
  }

  public void setInsuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCommission userCommission = (UserCommission) o;
    return Objects.equals(this.makerFee, userCommission.makerFee) &&
        Objects.equals(this.takerFee, userCommission.takerFee) &&
        Objects.equals(this.insuranceFee, userCommission.insuranceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makerFee, takerFee, insuranceFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCommission {\n");
    
    sb.append("    makerFee: ").append(toIndentedString(makerFee)).append("\n");
    sb.append("    takerFee: ").append(toIndentedString(takerFee)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
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

