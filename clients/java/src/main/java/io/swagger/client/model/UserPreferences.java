package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import java.util.Date;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class UserPreferences   {
  
  private Date announcementsLastSeen = null;
  private String colorTheme = null;
  private String currency = null;
  private Boolean debug = null;
  private List<String> disableEmails = new ArrayList<String>();
  private List<String> hideConfirmDialogs = new ArrayList<String>();
  private Boolean hideConnectionModal = null;
  private Boolean hideFromLeaderboard = false;
  private Boolean hideNameFromLeaderboard = true;
  private List<String> hideNotifications = new ArrayList<String>();
  private Boolean hidePhoneConfirm = null;
  private String locale = null;
  private List<String> msgsSeen = new ArrayList<String>();
  private BigDecimal orderBookBinning = null;
  private String orderBookType = null;
  private Boolean orderControlsPlusMinus = null;
  private List<String> sounds = new ArrayList<String>();
  private Boolean strictIPCheck = false;
  private Boolean strictTimeout = true;
  private String tickerGroup = null;
  private Boolean tickerPinned = null;
  private String tradeLayout = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("announcementsLastSeen")
  public Date getAnnouncementsLastSeen() {
    return announcementsLastSeen;
  }
  public void setAnnouncementsLastSeen(Date announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("colorTheme")
  public String getColorTheme() {
    return colorTheme;
  }
  public void setColorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("debug")
  public Boolean getDebug() {
    return debug;
  }
  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("disableEmails")
  public List<String> getDisableEmails() {
    return disableEmails;
  }
  public void setDisableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideConfirmDialogs")
  public List<String> getHideConfirmDialogs() {
    return hideConfirmDialogs;
  }
  public void setHideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideConnectionModal")
  public Boolean getHideConnectionModal() {
    return hideConnectionModal;
  }
  public void setHideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideFromLeaderboard")
  public Boolean getHideFromLeaderboard() {
    return hideFromLeaderboard;
  }
  public void setHideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideNameFromLeaderboard")
  public Boolean getHideNameFromLeaderboard() {
    return hideNameFromLeaderboard;
  }
  public void setHideNameFromLeaderboard(Boolean hideNameFromLeaderboard) {
    this.hideNameFromLeaderboard = hideNameFromLeaderboard;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideNotifications")
  public List<String> getHideNotifications() {
    return hideNotifications;
  }
  public void setHideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hidePhoneConfirm")
  public Boolean getHidePhoneConfirm() {
    return hidePhoneConfirm;
  }
  public void setHidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("msgsSeen")
  public List<String> getMsgsSeen() {
    return msgsSeen;
  }
  public void setMsgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderBookBinning")
  public BigDecimal getOrderBookBinning() {
    return orderBookBinning;
  }
  public void setOrderBookBinning(BigDecimal orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderBookType")
  public String getOrderBookType() {
    return orderBookType;
  }
  public void setOrderBookType(String orderBookType) {
    this.orderBookType = orderBookType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderControlsPlusMinus")
  public Boolean getOrderControlsPlusMinus() {
    return orderControlsPlusMinus;
  }
  public void setOrderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sounds")
  public List<String> getSounds() {
    return sounds;
  }
  public void setSounds(List<String> sounds) {
    this.sounds = sounds;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("strictIPCheck")
  public Boolean getStrictIPCheck() {
    return strictIPCheck;
  }
  public void setStrictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("strictTimeout")
  public Boolean getStrictTimeout() {
    return strictTimeout;
  }
  public void setStrictTimeout(Boolean strictTimeout) {
    this.strictTimeout = strictTimeout;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tickerGroup")
  public String getTickerGroup() {
    return tickerGroup;
  }
  public void setTickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tickerPinned")
  public Boolean getTickerPinned() {
    return tickerPinned;
  }
  public void setTickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tradeLayout")
  public String getTradeLayout() {
    return tradeLayout;
  }
  public void setTradeLayout(String tradeLayout) {
    this.tradeLayout = tradeLayout;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferences userPreferences = (UserPreferences) o;
    return Objects.equals(announcementsLastSeen, userPreferences.announcementsLastSeen) &&
        Objects.equals(colorTheme, userPreferences.colorTheme) &&
        Objects.equals(currency, userPreferences.currency) &&
        Objects.equals(debug, userPreferences.debug) &&
        Objects.equals(disableEmails, userPreferences.disableEmails) &&
        Objects.equals(hideConfirmDialogs, userPreferences.hideConfirmDialogs) &&
        Objects.equals(hideConnectionModal, userPreferences.hideConnectionModal) &&
        Objects.equals(hideFromLeaderboard, userPreferences.hideFromLeaderboard) &&
        Objects.equals(hideNameFromLeaderboard, userPreferences.hideNameFromLeaderboard) &&
        Objects.equals(hideNotifications, userPreferences.hideNotifications) &&
        Objects.equals(hidePhoneConfirm, userPreferences.hidePhoneConfirm) &&
        Objects.equals(locale, userPreferences.locale) &&
        Objects.equals(msgsSeen, userPreferences.msgsSeen) &&
        Objects.equals(orderBookBinning, userPreferences.orderBookBinning) &&
        Objects.equals(orderBookType, userPreferences.orderBookType) &&
        Objects.equals(orderControlsPlusMinus, userPreferences.orderControlsPlusMinus) &&
        Objects.equals(sounds, userPreferences.sounds) &&
        Objects.equals(strictIPCheck, userPreferences.strictIPCheck) &&
        Objects.equals(strictTimeout, userPreferences.strictTimeout) &&
        Objects.equals(tickerGroup, userPreferences.tickerGroup) &&
        Objects.equals(tickerPinned, userPreferences.tickerPinned) &&
        Objects.equals(tradeLayout, userPreferences.tradeLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementsLastSeen, colorTheme, currency, debug, disableEmails, hideConfirmDialogs, hideConnectionModal, hideFromLeaderboard, hideNameFromLeaderboard, hideNotifications, hidePhoneConfirm, locale, msgsSeen, orderBookBinning, orderBookType, orderControlsPlusMinus, sounds, strictIPCheck, strictTimeout, tickerGroup, tickerPinned, tradeLayout);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("    announcementsLastSeen: ").append(StringUtil.toIndentedString(announcementsLastSeen)).append("\n");
    sb.append("    colorTheme: ").append(StringUtil.toIndentedString(colorTheme)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    debug: ").append(StringUtil.toIndentedString(debug)).append("\n");
    sb.append("    disableEmails: ").append(StringUtil.toIndentedString(disableEmails)).append("\n");
    sb.append("    hideConfirmDialogs: ").append(StringUtil.toIndentedString(hideConfirmDialogs)).append("\n");
    sb.append("    hideConnectionModal: ").append(StringUtil.toIndentedString(hideConnectionModal)).append("\n");
    sb.append("    hideFromLeaderboard: ").append(StringUtil.toIndentedString(hideFromLeaderboard)).append("\n");
    sb.append("    hideNameFromLeaderboard: ").append(StringUtil.toIndentedString(hideNameFromLeaderboard)).append("\n");
    sb.append("    hideNotifications: ").append(StringUtil.toIndentedString(hideNotifications)).append("\n");
    sb.append("    hidePhoneConfirm: ").append(StringUtil.toIndentedString(hidePhoneConfirm)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    msgsSeen: ").append(StringUtil.toIndentedString(msgsSeen)).append("\n");
    sb.append("    orderBookBinning: ").append(StringUtil.toIndentedString(orderBookBinning)).append("\n");
    sb.append("    orderBookType: ").append(StringUtil.toIndentedString(orderBookType)).append("\n");
    sb.append("    orderControlsPlusMinus: ").append(StringUtil.toIndentedString(orderControlsPlusMinus)).append("\n");
    sb.append("    sounds: ").append(StringUtil.toIndentedString(sounds)).append("\n");
    sb.append("    strictIPCheck: ").append(StringUtil.toIndentedString(strictIPCheck)).append("\n");
    sb.append("    strictTimeout: ").append(StringUtil.toIndentedString(strictTimeout)).append("\n");
    sb.append("    tickerGroup: ").append(StringUtil.toIndentedString(tickerGroup)).append("\n");
    sb.append("    tickerPinned: ").append(StringUtil.toIndentedString(tickerPinned)).append("\n");
    sb.append("    tradeLayout: ").append(StringUtil.toIndentedString(tradeLayout)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
