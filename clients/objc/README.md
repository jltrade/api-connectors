# SwaggerClient

REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>

This ObjC package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.2.0
- Package version: 
- Build date: 2016-07-05T09:40:53.525-05:00
- Build package: class io.swagger.codegen.languages.ObjcClientCodegen

## Requirements

The SDK requires [**ARC (Automatic Reference Counting)**](http://stackoverflow.com/questions/7778356/how-to-enable-disable-automatic-reference-counting) to be enabled in the Xcode project.

## Installation & Usage
### Install from Github using [CocoaPods](https://cocoapods.org/)

Add the following to the Podfile:

```ruby
pod 'SwaggerClient', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'
```

To specify a particular branch, append `, :branch => 'branch-name-here'`

To specify a particular commit, append `, :commit => '11aa22'`

### Install from local path using [CocoaPods](https://cocoapods.org/)

Put the SDK under your project folder (e.g. /path/to/objc_project/Vendor/SwaggerClient) and then add the following to the Podfile:

```ruby
pod 'SwaggerClient', :path => 'Vendor/SwaggerClient'
```

### Usage

Import the following:

```objc
#import <SwaggerClient/SWGApiClient.h>
#import <SwaggerClient/SWGConfiguration.h>
// load models
#import <SwaggerClient/SWGAccessToken.h>
#import <SwaggerClient/SWGAffiliate.h>
#import <SwaggerClient/SWGAnnouncement.h>
#import <SwaggerClient/SWGApiKey.h>
#import <SwaggerClient/SWGChat.h>
#import <SwaggerClient/SWGConnectedUsers.h>
#import <SwaggerClient/SWGError.h>
#import <SwaggerClient/SWGExecution.h>
#import <SwaggerClient/SWGFunding.h>
#import <SwaggerClient/SWGInlineResponse200.h>
#import <SwaggerClient/SWGInstrument.h>
#import <SwaggerClient/SWGInstrumentInterval.h>
#import <SwaggerClient/SWGInsurance.h>
#import <SwaggerClient/SWGLeaderboard.h>
#import <SwaggerClient/SWGLiquidation.h>
#import <SwaggerClient/SWGMargin.h>
#import <SwaggerClient/SWGOrder.h>
#import <SwaggerClient/SWGOrderBook.h>
#import <SwaggerClient/SWGOrderBookL2.h>
#import <SwaggerClient/SWGPosition.h>
#import <SwaggerClient/SWGQuote.h>
#import <SwaggerClient/SWGSettlement.h>
#import <SwaggerClient/SWGStats.h>
#import <SwaggerClient/SWGStatsHistory.h>
#import <SwaggerClient/SWGTrade.h>
#import <SwaggerClient/SWGTradeBin.h>
#import <SwaggerClient/SWGTransaction.h>
#import <SwaggerClient/SWGUser.h>
#import <SwaggerClient/SWGUserCommission.h>
#import <SwaggerClient/SWGUserPreferences.h>
// load API classes for accessing endpoints
#import <SwaggerClient/SWGAnnouncementApi.h>
#import <SwaggerClient/SWGApiKeyApi.h>
#import <SwaggerClient/SWGChatApi.h>
#import <SwaggerClient/SWGExecutionApi.h>
#import <SwaggerClient/SWGFundingApi.h>
#import <SwaggerClient/SWGInstrumentApi.h>
#import <SwaggerClient/SWGInsuranceApi.h>
#import <SwaggerClient/SWGLeaderboardApi.h>
#import <SwaggerClient/SWGLiquidationApi.h>
#import <SwaggerClient/SWGOrderApi.h>
#import <SwaggerClient/SWGOrderBookApi.h>
#import <SwaggerClient/SWGPositionApi.h>
#import <SwaggerClient/SWGQuoteApi.h>
#import <SwaggerClient/SWGSchemaApi.h>
#import <SwaggerClient/SWGSettlementApi.h>
#import <SwaggerClient/SWGStatsApi.h>
#import <SwaggerClient/SWGTradeApi.h>
#import <SwaggerClient/SWGUserApi.h>

```

## Recommendation

It's recommended to create an instance of ApiClient per thread in a multi-threaded environment to avoid any potential issue.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```objc


NSString* *columns = @"columns_example"; // Array of column names to fetch. If omitted, will return all columns. (optional)

SWGAnnouncementApi *apiInstance = [[SWGAnnouncementApi alloc] init];

// Get site announcements.
[apiInstance announcementGetWithColumns:columns
              completionHandler: ^(NSArray<SWGAnnouncement>* output, NSError* error) {
                            if (output) {
                                NSLog(@"%@", output);
                            }
                            if (error) {
                                NSLog(@"Error: %@", error);
                            }
                        }];

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SWGAnnouncementApi* | [**announcementGet**](docs/SWGAnnouncementApi.md#announcementget) | **GET** /announcement | Get site announcements.
*SWGAnnouncementApi* | [**announcementGetUrgent**](docs/SWGAnnouncementApi.md#announcementgeturgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.
*SWGApiKeyApi* | [**apiKeyDisable**](docs/SWGApiKeyApi.md#apikeydisable) | **POST** /apiKey/disable | Disable an API Key.
*SWGApiKeyApi* | [**apiKeyEnable**](docs/SWGApiKeyApi.md#apikeyenable) | **POST** /apiKey/enable | Enable an API Key.
*SWGApiKeyApi* | [**apiKeyGet**](docs/SWGApiKeyApi.md#apikeyget) | **GET** /apiKey | Get your API Keys.
*SWGApiKeyApi* | [**apiKeyNew**](docs/SWGApiKeyApi.md#apikeynew) | **POST** /apiKey | Create a new API Key.
*SWGApiKeyApi* | [**apiKeyRemove**](docs/SWGApiKeyApi.md#apikeyremove) | **DELETE** /apiKey | Remove an API Key.
*SWGChatApi* | [**chatGet**](docs/SWGChatApi.md#chatget) | **GET** /chat | Get chat messages.
*SWGChatApi* | [**chatGetConnected**](docs/SWGChatApi.md#chatgetconnected) | **GET** /chat/connected | Get connected users.
*SWGChatApi* | [**chatNew**](docs/SWGChatApi.md#chatnew) | **POST** /chat | Send a chat message.
*SWGExecutionApi* | [**executionGet**](docs/SWGExecutionApi.md#executionget) | **GET** /execution | Get all raw executions for your account.
*SWGExecutionApi* | [**executionGetTradeHistory**](docs/SWGExecutionApi.md#executiongettradehistory) | **GET** /execution/tradeHistory | Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
*SWGFundingApi* | [**fundingGet**](docs/SWGFundingApi.md#fundingget) | **GET** /funding | Get funding history.
*SWGInstrumentApi* | [**instrumentGet**](docs/SWGInstrumentApi.md#instrumentget) | **GET** /instrument | Get instruments.
*SWGInstrumentApi* | [**instrumentGetActive**](docs/SWGInstrumentApi.md#instrumentgetactive) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
*SWGInstrumentApi* | [**instrumentGetActiveAndIndices**](docs/SWGInstrumentApi.md#instrumentgetactiveandindices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
*SWGInstrumentApi* | [**instrumentGetActiveIntervals**](docs/SWGInstrumentApi.md#instrumentgetactiveintervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
*SWGInstrumentApi* | [**instrumentGetIndices**](docs/SWGInstrumentApi.md#instrumentgetindices) | **GET** /instrument/indices | Get all price indices.
*SWGInsuranceApi* | [**insuranceGet**](docs/SWGInsuranceApi.md#insuranceget) | **GET** /insurance | Get insurance fund history.
*SWGLeaderboardApi* | [**leaderboardGet**](docs/SWGLeaderboardApi.md#leaderboardget) | **GET** /leaderboard | Get current leaderboard.
*SWGLiquidationApi* | [**liquidationGet**](docs/SWGLiquidationApi.md#liquidationget) | **GET** /liquidation | Get liquidation orders.
*SWGOrderApi* | [**orderAmend**](docs/SWGOrderApi.md#orderamend) | **PUT** /order | Amend the quantity or price of an open order.
*SWGOrderApi* | [**orderAmendBulk**](docs/SWGOrderApi.md#orderamendbulk) | **PUT** /order/bulk | Amend multiple orders.
*SWGOrderApi* | [**orderCancel**](docs/SWGOrderApi.md#ordercancel) | **DELETE** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
*SWGOrderApi* | [**orderCancelAll**](docs/SWGOrderApi.md#ordercancelall) | **DELETE** /order/all | Cancels all of your orders.
*SWGOrderApi* | [**orderCancelAllAfter**](docs/SWGOrderApi.md#ordercancelallafter) | **POST** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
*SWGOrderApi* | [**orderClosePosition**](docs/SWGOrderApi.md#ordercloseposition) | **POST** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
*SWGOrderApi* | [**orderGetOrders**](docs/SWGOrderApi.md#ordergetorders) | **GET** /order | Get your orders.
*SWGOrderApi* | [**orderNew**](docs/SWGOrderApi.md#ordernew) | **POST** /order | Create a new order.
*SWGOrderApi* | [**orderNewBulk**](docs/SWGOrderApi.md#ordernewbulk) | **POST** /order/bulk | Create multiple new orders.
*SWGOrderBookApi* | [**orderBookGet**](docs/SWGOrderBookApi.md#orderbookget) | **GET** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
*SWGOrderBookApi* | [**orderBookGetL2**](docs/SWGOrderBookApi.md#orderbookgetl2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.
*SWGPositionApi* | [**positionGet**](docs/SWGPositionApi.md#positionget) | **GET** /position | Get your positions.
*SWGPositionApi* | [**positionIsolateMargin**](docs/SWGPositionApi.md#positionisolatemargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
*SWGPositionApi* | [**positionTransferIsolatedMargin**](docs/SWGPositionApi.md#positiontransferisolatedmargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
*SWGPositionApi* | [**positionUpdateLeverage**](docs/SWGPositionApi.md#positionupdateleverage) | **POST** /position/leverage | Choose leverage for a position.
*SWGQuoteApi* | [**quoteGet**](docs/SWGQuoteApi.md#quoteget) | **GET** /quote | Get Quotes.
*SWGQuoteApi* | [**quoteGetBucketed**](docs/SWGQuoteApi.md#quotegetbucketed) | **GET** /quote/bucketed | Get previous quotes in time buckets.
*SWGSchemaApi* | [**schemaGet**](docs/SWGSchemaApi.md#schemaget) | **GET** /schema | Get model schemata for data objects returned by this API.
*SWGSchemaApi* | [**schemaWebsocketHelp**](docs/SWGSchemaApi.md#schemawebsockethelp) | **GET** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.
*SWGSettlementApi* | [**settlementGet**](docs/SWGSettlementApi.md#settlementget) | **GET** /settlement | Get settlement history.
*SWGStatsApi* | [**statsGet**](docs/SWGStatsApi.md#statsget) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
*SWGStatsApi* | [**statsHistory**](docs/SWGStatsApi.md#statshistory) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
*SWGTradeApi* | [**tradeGet**](docs/SWGTradeApi.md#tradeget) | **GET** /trade | Get Trades.
*SWGTradeApi* | [**tradeGetBucketed**](docs/SWGTradeApi.md#tradegetbucketed) | **GET** /trade/bucketed | Get previous trades in time buckets.
*SWGUserApi* | [**userCancelWithdrawal**](docs/SWGUserApi.md#usercancelwithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
*SWGUserApi* | [**userCheckReferralCode**](docs/SWGUserApi.md#usercheckreferralcode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
*SWGUserApi* | [**userConfirmEmail**](docs/SWGUserApi.md#userconfirmemail) | **POST** /user/confirmEmail | Confirm your email address with a token.
*SWGUserApi* | [**userConfirmEnableTFA**](docs/SWGUserApi.md#userconfirmenabletfa) | **POST** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
*SWGUserApi* | [**userConfirmPasswordReset**](docs/SWGUserApi.md#userconfirmpasswordreset) | **POST** /user/confirmPasswordReset | Confirm a password reset.
*SWGUserApi* | [**userConfirmWithdrawal**](docs/SWGUserApi.md#userconfirmwithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
*SWGUserApi* | [**userDisableTFA**](docs/SWGUserApi.md#userdisabletfa) | **POST** /user/disableTFA | Disable two-factor auth for this account.
*SWGUserApi* | [**userGet**](docs/SWGUserApi.md#userget) | **GET** /user | Get your user model.
*SWGUserApi* | [**userGetAffiliateStatus**](docs/SWGUserApi.md#usergetaffiliatestatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
*SWGUserApi* | [**userGetCommission**](docs/SWGUserApi.md#usergetcommission) | **GET** /user/commission | Get your account&#39;s commission status.
*SWGUserApi* | [**userGetDepositAddress**](docs/SWGUserApi.md#usergetdepositaddress) | **GET** /user/depositAddress | Get a deposit address.
*SWGUserApi* | [**userGetMargin**](docs/SWGUserApi.md#usergetmargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
*SWGUserApi* | [**userGetWalletHistory**](docs/SWGUserApi.md#usergetwallethistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits and withdrawals).
*SWGUserApi* | [**userLogin**](docs/SWGUserApi.md#userlogin) | **POST** /user/login | Log in to BitMEX.
*SWGUserApi* | [**userLogout**](docs/SWGUserApi.md#userlogout) | **POST** /user/logout | Log out of BitMEX.
*SWGUserApi* | [**userLogoutAll**](docs/SWGUserApi.md#userlogoutall) | **POST** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
*SWGUserApi* | [**userNew**](docs/SWGUserApi.md#usernew) | **POST** /user | Register a new user.
*SWGUserApi* | [**userRequestEnableTFA**](docs/SWGUserApi.md#userrequestenabletfa) | **POST** /user/requestEnableTFA | Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
*SWGUserApi* | [**userRequestPasswordReset**](docs/SWGUserApi.md#userrequestpasswordreset) | **POST** /user/requestPasswordReset | Request a password reset.
*SWGUserApi* | [**userRequestWithdrawal**](docs/SWGUserApi.md#userrequestwithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
*SWGUserApi* | [**userSavePreferences**](docs/SWGUserApi.md#usersavepreferences) | **POST** /user/preferences | Save user preferences.
*SWGUserApi* | [**userSendVerificationEmail**](docs/SWGUserApi.md#usersendverificationemail) | **POST** /user/resendVerificationEmail | Re-send verification email.
*SWGUserApi* | [**userUpdate**](docs/SWGUserApi.md#userupdate) | **PUT** /user | Update your password, name, and other attributes.


## Documentation For Models

 - [SWGAccessToken](docs/SWGAccessToken.md)
 - [SWGAffiliate](docs/SWGAffiliate.md)
 - [SWGAnnouncement](docs/SWGAnnouncement.md)
 - [SWGApiKey](docs/SWGApiKey.md)
 - [SWGChat](docs/SWGChat.md)
 - [SWGConnectedUsers](docs/SWGConnectedUsers.md)
 - [SWGError](docs/SWGError.md)
 - [SWGExecution](docs/SWGExecution.md)
 - [SWGFunding](docs/SWGFunding.md)
 - [SWGInlineResponse200](docs/SWGInlineResponse200.md)
 - [SWGInstrument](docs/SWGInstrument.md)
 - [SWGInstrumentInterval](docs/SWGInstrumentInterval.md)
 - [SWGInsurance](docs/SWGInsurance.md)
 - [SWGLeaderboard](docs/SWGLeaderboard.md)
 - [SWGLiquidation](docs/SWGLiquidation.md)
 - [SWGMargin](docs/SWGMargin.md)
 - [SWGOrder](docs/SWGOrder.md)
 - [SWGOrderBook](docs/SWGOrderBook.md)
 - [SWGOrderBookL2](docs/SWGOrderBookL2.md)
 - [SWGPosition](docs/SWGPosition.md)
 - [SWGQuote](docs/SWGQuote.md)
 - [SWGSettlement](docs/SWGSettlement.md)
 - [SWGStats](docs/SWGStats.md)
 - [SWGStatsHistory](docs/SWGStatsHistory.md)
 - [SWGTrade](docs/SWGTrade.md)
 - [SWGTradeBin](docs/SWGTradeBin.md)
 - [SWGTransaction](docs/SWGTransaction.md)
 - [SWGUser](docs/SWGUser.md)
 - [SWGUserCommission](docs/SWGUserCommission.md)
 - [SWGUserPreferences](docs/SWGUserPreferences.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author

support@bitmex.com


