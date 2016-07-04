package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Trade (
  timestamp: Option[Date],
symbol: Option[String],
side: Option[String],
size: Option[Number],
price: Option[Double],
tickDirection: Option[String],
trdMatchID: Option[String],
grossValue: Option[Number],
homeNotional: Option[Double],
foreignNotional: Option[Double],
id: Option[Double]
)
