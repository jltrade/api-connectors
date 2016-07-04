package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Stats  {
  
  @SerializedName("rootSymbol")
  private String rootSymbol = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("volume24h")
  private BigDecimal volume24h = null;
  @SerializedName("turnover24h")
  private BigDecimal turnover24h = null;
  @SerializedName("openInterest")
  private BigDecimal openInterest = null;
  @SerializedName("openValue")
  private BigDecimal openValue = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenValue() {
    return openValue;
  }
  public void setOpenValue(BigDecimal openValue) {
    this.openValue = openValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stats stats = (Stats) o;
    return (rootSymbol == null ? stats.rootSymbol == null : rootSymbol.equals(stats.rootSymbol)) &&
        (currency == null ? stats.currency == null : currency.equals(stats.currency)) &&
        (volume24h == null ? stats.volume24h == null : volume24h.equals(stats.volume24h)) &&
        (turnover24h == null ? stats.turnover24h == null : turnover24h.equals(stats.turnover24h)) &&
        (openInterest == null ? stats.openInterest == null : openInterest.equals(stats.openInterest)) &&
        (openValue == null ? stats.openValue == null : openValue.equals(stats.openValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (rootSymbol == null ? 0: rootSymbol.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (volume24h == null ? 0: volume24h.hashCode());
    result = 31 * result + (turnover24h == null ? 0: turnover24h.hashCode());
    result = 31 * result + (openInterest == null ? 0: openInterest.hashCode());
    result = 31 * result + (openValue == null ? 0: openValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    
    sb.append("  rootSymbol: ").append(rootSymbol).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  volume24h: ").append(volume24h).append("\n");
    sb.append("  turnover24h: ").append(turnover24h).append("\n");
    sb.append("  openInterest: ").append(openInterest).append("\n");
    sb.append("  openValue: ").append(openValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
