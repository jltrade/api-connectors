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

package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Instrument (
  symbol: String,
rootSymbol: Option[String],
state: Option[String],
typ: Option[String],
listing: Option[Date],
front: Option[Date],
expiry: Option[Date],
settle: Option[Date],
relistInterval: Option[Date],
inverseLeg: Option[String],
sellLeg: Option[String],
buyLeg: Option[String],
positionCurrency: Option[String],
underlying: Option[String],
quoteCurrency: Option[String],
underlyingSymbol: Option[String],
reference: Option[String],
referenceSymbol: Option[String],
calcInterval: Option[Date],
publishInterval: Option[Date],
publishTime: Option[Date],
maxOrderQty: Option[BigDecimal],
maxPrice: Option[Double],
lotSize: Option[BigDecimal],
tickSize: Option[Double],
multiplier: Option[BigDecimal],
settlCurrency: Option[String],
underlyingToPositionMultiplier: Option[BigDecimal],
underlyingToSettleMultiplier: Option[BigDecimal],
quoteToSettleMultiplier: Option[BigDecimal],
isQuanto: Option[Boolean],
isInverse: Option[Boolean],
initMargin: Option[Double],
maintMargin: Option[Double],
limit: Option[Double],
capped: Option[Boolean],
taxed: Option[Boolean],
makerFee: Option[Double],
takerFee: Option[Double],
settlementFee: Option[Double],
insuranceFee: Option[Double],
fundingBaseSymbol: Option[String],
fundingQuoteSymbol: Option[String],
fundingPremiumSymbol: Option[String],
fundingTimestamp: Option[Date],
fundingInterval: Option[Date],
fundingRate: Option[Double],
indicativeFundingRate: Option[Double],
rebalanceTimestamp: Option[Date],
rebalanceInterval: Option[Date],
openingTimestamp: Option[Date],
closingTimestamp: Option[Date],
sessionInterval: Option[Date],
prevClosePrice: Option[Double],
limitDownPrice: Option[Double],
limitUpPrice: Option[Double],
bankruptLimitDownPrice: Option[Double],
bankruptLimitUpPrice: Option[Double],
prevTotalVolume: Option[BigDecimal],
totalVolume: Option[BigDecimal],
volume: Option[BigDecimal],
volume24h: Option[BigDecimal],
prevTotalTurnover: Option[BigDecimal],
totalTurnover: Option[BigDecimal],
turnover: Option[BigDecimal],
turnover24h: Option[BigDecimal],
prevPrice24h: Option[Double],
vwap: Option[Double],
highPrice: Option[Double],
lowPrice: Option[Double],
lastPrice: Option[Double],
lastPriceProtected: Option[Double],
lastTickDirection: Option[String],
lastChangePcnt: Option[Double],
bidPrice: Option[Double],
midPrice: Option[Double],
askPrice: Option[Double],
impactBidPrice: Option[Double],
impactMidPrice: Option[Double],
impactAskPrice: Option[Double],
hasLiquidity: Option[Boolean],
openInterest: Option[BigDecimal],
openValue: Option[BigDecimal],
fairMethod: Option[String],
fairBasisRate: Option[Double],
fairBasis: Option[Double],
fairPrice: Option[Double],
markMethod: Option[String],
markPrice: Option[Double],
indicativeTaxRate: Option[Double],
indicativeSettlePrice: Option[Double],
settledPrice: Option[Double],
timestamp: Option[Date]
)
