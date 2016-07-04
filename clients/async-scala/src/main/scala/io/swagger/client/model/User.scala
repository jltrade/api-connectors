package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class User (
  id: Option[Number],
ownerId: Option[Number],
firstname: Option[String],
lastname: Option[String],
status: Option[String],
username: String,
email: String,
phone: Option[String],
countryCode: Option[Number],
created: Option[Date],
lastUpdated: Option[Date],
preferences: Option[UserPreferences],
TFAEnabled: Option[String],
affiliateID: Option[String],
pgpPubKey: Option[String],
country: Option[String],
disabled: Option[Boolean]
)
