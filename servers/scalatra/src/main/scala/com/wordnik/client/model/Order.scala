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


case class Order (
  orderID: String,
clOrdID: Option[String],
clOrdLinkID: Option[String],
account: Option[BigDecimal],
symbol: Option[String],
side: Option[String],
simpleOrderQty: Option[Double],
orderQty: Option[BigDecimal],
price: Option[Double],
displayQty: Option[BigDecimal],
stopPx: Option[Double],
pegOffsetValue: Option[Double],
pegPriceType: Option[String],
currency: Option[String],
settlCurrency: Option[String],
ordType: Option[String],
timeInForce: Option[String],
execInst: Option[String],
contingencyType: Option[String],
exDestination: Option[String],
ordStatus: Option[String],
triggered: Option[String],
workingIndicator: Option[Boolean],
ordRejReason: Option[String],
simpleLeavesQty: Option[Double],
leavesQty: Option[BigDecimal],
simpleCumQty: Option[Double],
cumQty: Option[BigDecimal],
avgPx: Option[Double],
multiLegReportingType: Option[String],
text: Option[String],
transactTime: Option[Date],
timestamp: Option[Date]
)
