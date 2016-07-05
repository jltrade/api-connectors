# BitMexApi.UserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCancelWithdrawal**](UserApi.md#userCancelWithdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**userCheckReferralCode**](UserApi.md#userCheckReferralCode) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**userConfirmEmail**](UserApi.md#userConfirmEmail) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**userConfirmEnableTFA**](UserApi.md#userConfirmEnableTFA) | **POST** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**userConfirmPasswordReset**](UserApi.md#userConfirmPasswordReset) | **POST** /user/confirmPasswordReset | Confirm a password reset.
[**userConfirmWithdrawal**](UserApi.md#userConfirmWithdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**userDisableTFA**](UserApi.md#userDisableTFA) | **POST** /user/disableTFA | Disable two-factor auth for this account.
[**userGet**](UserApi.md#userGet) | **GET** /user | Get your user model.
[**userGetAffiliateStatus**](UserApi.md#userGetAffiliateStatus) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**userGetCommission**](UserApi.md#userGetCommission) | **GET** /user/commission | Get your account&#39;s commission status.
[**userGetDepositAddress**](UserApi.md#userGetDepositAddress) | **GET** /user/depositAddress | Get a deposit address.
[**userGetMargin**](UserApi.md#userGetMargin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**userGetWalletHistory**](UserApi.md#userGetWalletHistory) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits and withdrawals).
[**userLogin**](UserApi.md#userLogin) | **POST** /user/login | Log in to BitMEX.
[**userLogout**](UserApi.md#userLogout) | **POST** /user/logout | Log out of BitMEX.
[**userLogoutAll**](UserApi.md#userLogoutAll) | **POST** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**userNew**](UserApi.md#userNew) | **POST** /user | Register a new user.
[**userRequestEnableTFA**](UserApi.md#userRequestEnableTFA) | **POST** /user/requestEnableTFA | Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
[**userRequestPasswordReset**](UserApi.md#userRequestPasswordReset) | **POST** /user/requestPasswordReset | Request a password reset.
[**userRequestWithdrawal**](UserApi.md#userRequestWithdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**userSavePreferences**](UserApi.md#userSavePreferences) | **POST** /user/preferences | Save user preferences.
[**userSendVerificationEmail**](UserApi.md#userSendVerificationEmail) | **POST** /user/resendVerificationEmail | Re-send verification email.
[**userUpdate**](UserApi.md#userUpdate) | **PUT** /user | Update your password, name, and other attributes.


<a name="userCancelWithdrawal"></a>
# **userCancelWithdrawal**
> Transaction userCancelWithdrawal(token)

Cancel a withdrawal.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCancelWithdrawal(token, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userCheckReferralCode"></a>
# **userCheckReferralCode**
> &#39;Number&#39; userCheckReferralCode(opts)

Check if a referral code is valid.

If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'referralCode': "referralCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userCheckReferralCode(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **String**|  | [optional] 

### Return type

**&#39;Number&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userConfirmEmail"></a>
# **userConfirmEmail**
> AccessToken userConfirmEmail(token)

Confirm your email address with a token.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userConfirmEmail(token, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userConfirmEnableTFA"></a>
# **userConfirmEnableTFA**
> &#39;Boolean&#39; userConfirmEnableTFA(token, opts)

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | Token from your selected TFA type.

var opts = { 
  'type': "type_example" // String | Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userConfirmEnableTFA(token, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token from your selected TFA type. | 
 **type** | **String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userConfirmPasswordReset"></a>
# **userConfirmPasswordReset**
> &#39;Boolean&#39; userConfirmPasswordReset(token, newPassword)

Confirm a password reset.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 

var newPassword = "newPassword_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userConfirmPasswordReset(token, newPassword, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 
 **newPassword** | **String**|  | 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userConfirmWithdrawal"></a>
# **userConfirmWithdrawal**
> Transaction userConfirmWithdrawal(token)

Confirm a withdrawal.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userConfirmWithdrawal(token, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userDisableTFA"></a>
# **userDisableTFA**
> &#39;Boolean&#39; userDisableTFA(token, opts)

Disable two-factor auth for this account.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var token = "token_example"; // String | Token from your selected TFA type.

var opts = { 
  'type': "type_example" // String | Two-factor auth type. Supported types: 'GA' (Google Authenticator)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userDisableTFA(token, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token from your selected TFA type. | 
 **type** | **String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGet"></a>
# **userGet**
> User userGet()

Get your user model.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetAffiliateStatus"></a>
# **userGetAffiliateStatus**
> [Affiliate] userGetAffiliateStatus()

Get your current affiliate/referral status.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetAffiliateStatus(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Affiliate]**](Affiliate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetCommission"></a>
# **userGetCommission**
> [UserCommission] userGetCommission()

Get your account&#39;s commission status.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetCommission(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[UserCommission]**](UserCommission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetDepositAddress"></a>
# **userGetDepositAddress**
> &#39;String&#39; userGetDepositAddress(opts)

Get a deposit address.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetDepositAddress(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetMargin"></a>
# **userGetMargin**
> Margin userGetMargin(opts)

Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetMargin(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userGetWalletHistory"></a>
# **userGetWalletHistory**
> [Transaction] userGetWalletHistory(opts)

Get a history of all of your wallet transactions (deposits and withdrawals).

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'currency': "XBt" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userGetWalletHistory(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

[**[Transaction]**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userLogin"></a>
# **userLogin**
> AccessToken userLogin(email, password, opts)

Log in to BitMEX.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var email = "email_example"; // String | Your email address.

var password = "password_example"; // String | Your password.

var opts = { 
  'token': "token_example" // String | OTP Token (YubiKey, Google Authenticator)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userLogin(email, password, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Your email address. | 
 **password** | **String**| Your password. | 
 **token** | **String**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userLogout"></a>
# **userLogout**
> userLogout()

Log out of BitMEX.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.userLogout(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userLogoutAll"></a>
# **userLogoutAll**
> &#39;Number&#39; userLogoutAll()

Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userLogoutAll(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**&#39;Number&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userNew"></a>
# **userNew**
> User userNew(email, password, country, opts)

Register a new user.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var email = "email_example"; // String | Your email address.

var password = "password_example"; // String | Your password.

var country = "country_example"; // String | Country of residence.

var opts = { 
  'username': "username_example", // String | Desired username.
  'firstname': "firstname_example", // String | First name.
  'lastname': "lastname_example", // String | Last name.
  'acceptsTOS': "acceptsTOS_example", // String | Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).
  'referrerID': "referrerID_example", // String | Optional Referrer ID.
  'tfaType': "tfaType_example", // String | Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef
  'tfaToken': "tfaToken_example" // String | Two-Factor Token.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userNew(email, password, country, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Your email address. | 
 **password** | **String**| Your password. | 
 **country** | **String**| Country of residence. | 
 **username** | **String**| Desired username. | [optional] 
 **firstname** | **String**| First name. | [optional] 
 **lastname** | **String**| Last name. | [optional] 
 **acceptsTOS** | **String**| Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). | [optional] 
 **referrerID** | **String**| Optional Referrer ID. | [optional] 
 **tfaType** | **String**| Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef | [optional] 
 **tfaToken** | **String**| Two-Factor Token. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userRequestEnableTFA"></a>
# **userRequestEnableTFA**
> &#39;Boolean&#39; userRequestEnableTFA(opts)

Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'type': "type_example" // String | Two-factor auth type. Supported types: 'GA' (Google Authenticator)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userRequestEnableTFA(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userRequestPasswordReset"></a>
# **userRequestPasswordReset**
> &#39;Boolean&#39; userRequestPasswordReset(email)

Request a password reset.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var email = "email_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userRequestPasswordReset(email, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userRequestWithdrawal"></a>
# **userRequestWithdrawal**
> Transaction userRequestWithdrawal(currency, amount, address, opts)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the &#x60;withdraw&#x60; permission.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var currency = "XBt"; // String | Currency you're withdrawing. Options: `XBt`

var amount = 3.4; // Number | Amount of withdrawal currency.

var address = "address_example"; // String | Destination Address.

var opts = { 
  'otpToken': "otpToken_example", // String | 2FA token. Required if 2FA is enabled on your account.
  'fee': 1.2 // Number | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userRequestWithdrawal(currency, amount, address, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **Number**| Amount of withdrawal currency. | 
 **address** | **String**| Destination Address. | 
 **otpToken** | **String**| 2FA token. Required if 2FA is enabled on your account. | [optional] 
 **fee** | **Number**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userSavePreferences"></a>
# **userSavePreferences**
> User userSavePreferences(prefs, opts)

Save user preferences.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var prefs = "prefs_example"; // String | 

var opts = { 
  'overwrite': false // Boolean | If true, will overwrite all existing preferences.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userSavePreferences(prefs, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **String**|  | 
 **overwrite** | **Boolean**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userSendVerificationEmail"></a>
# **userSendVerificationEmail**
> &#39;Boolean&#39; userSendVerificationEmail(email)

Re-send verification email.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var email = "email_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userSendVerificationEmail(email, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | 

### Return type

**&#39;Boolean&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userUpdate"></a>
# **userUpdate**
> User userUpdate(opts)

Update your password, name, and other attributes.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.UserApi();

var opts = { 
  'firstname': "firstname_example", // String | 
  'lastname': "lastname_example", // String | 
  'oldPassword': "oldPassword_example", // String | 
  'newPassword': "newPassword_example", // String | 
  'newPasswordConfirm': "newPasswordConfirm_example", // String | 
  'username': "username_example", // String | Username can only be set once. To reset, email support.
  'country': "country_example", // String | Country of residence.
  'pgpPubKey': "pgpPubKey_example" // String | PGP Public Key. If specified, automated emails will be sentwith this key.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.userUpdate(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **String**|  | [optional] 
 **lastname** | **String**|  | [optional] 
 **oldPassword** | **String**|  | [optional] 
 **newPassword** | **String**|  | [optional] 
 **newPasswordConfirm** | **String**|  | [optional] 
 **username** | **String**| Username can only be set once. To reset, email support. | [optional] 
 **country** | **String**| Country of residence. | [optional] 
 **pgpPubKey** | **String**| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

