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
import io.swagger.client.model.UserPreferences;
import java.math.BigDecimal;
import org.joda.time.LocalDate;


/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:27:59.355-05:00")
public class User   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("ownerId")
  private BigDecimal ownerId = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("lastname")
  private String lastname = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("countryCode")
  private BigDecimal countryCode = null;

  @JsonProperty("created")
  private LocalDate created = null;

  @JsonProperty("lastUpdated")
  private LocalDate lastUpdated = null;

  @JsonProperty("preferences")
  private UserPreferences preferences = null;

  @JsonProperty("TFAEnabled")
  private String tFAEnabled = null;

  @JsonProperty("affiliateID")
  private String affiliateID = null;

  @JsonProperty("pgpPubKey")
  private String pgpPubKey = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("disabled")
  private Boolean disabled = false;

  public User id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public User ownerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
  }

  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public User status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User countryCode(BigDecimal countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(BigDecimal countryCode) {
    this.countryCode = countryCode;
  }

  public User created(LocalDate created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getCreated() {
    return created;
  }

  public void setCreated(LocalDate created) {
    this.created = created;
  }

  public User lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public User preferences(UserPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(UserPreferences preferences) {
    this.preferences = preferences;
  }

  public User tFAEnabled(String tFAEnabled) {
    this.tFAEnabled = tFAEnabled;
    return this;
  }

   /**
   * Get tFAEnabled
   * @return tFAEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTFAEnabled() {
    return tFAEnabled;
  }

  public void setTFAEnabled(String tFAEnabled) {
    this.tFAEnabled = tFAEnabled;
  }

  public User affiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
    return this;
  }

   /**
   * Get affiliateID
   * @return affiliateID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAffiliateID() {
    return affiliateID;
  }

  public void setAffiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
  }

  public User pgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
    return this;
  }

   /**
   * Get pgpPubKey
   * @return pgpPubKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPgpPubKey() {
    return pgpPubKey;
  }

  public void setPgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
  }

  public User country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public User disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.ownerId, user.ownerId) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.countryCode, user.countryCode) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.lastUpdated, user.lastUpdated) &&
        Objects.equals(this.preferences, user.preferences) &&
        Objects.equals(this.tFAEnabled, user.tFAEnabled) &&
        Objects.equals(this.affiliateID, user.affiliateID) &&
        Objects.equals(this.pgpPubKey, user.pgpPubKey) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.disabled, user.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, firstname, lastname, status, username, email, phone, countryCode, created, lastUpdated, preferences, tFAEnabled, affiliateID, pgpPubKey, country, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    tFAEnabled: ").append(toIndentedString(tFAEnabled)).append("\n");
    sb.append("    affiliateID: ").append(toIndentedString(affiliateID)).append("\n");
    sb.append("    pgpPubKey: ").append(toIndentedString(pgpPubKey)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

