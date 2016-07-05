# \UserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserCancelWithdrawal**](UserApi.md#UserCancelWithdrawal) | **Post** /user/cancelWithdrawal | Cancel a withdrawal.
[**UserCheckReferralCode**](UserApi.md#UserCheckReferralCode) | **Get** /user/checkReferralCode | Check if a referral code is valid.
[**UserConfirmEmail**](UserApi.md#UserConfirmEmail) | **Post** /user/confirmEmail | Confirm your email address with a token.
[**UserConfirmEnableTFA**](UserApi.md#UserConfirmEnableTFA) | **Post** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**UserConfirmPasswordReset**](UserApi.md#UserConfirmPasswordReset) | **Post** /user/confirmPasswordReset | Confirm a password reset.
[**UserConfirmWithdrawal**](UserApi.md#UserConfirmWithdrawal) | **Post** /user/confirmWithdrawal | Confirm a withdrawal.
[**UserDisableTFA**](UserApi.md#UserDisableTFA) | **Post** /user/disableTFA | Disable two-factor auth for this account.
[**UserGet**](UserApi.md#UserGet) | **Get** /user | Get your user model.
[**UserGetAffiliateStatus**](UserApi.md#UserGetAffiliateStatus) | **Get** /user/affiliateStatus | Get your current affiliate/referral status.
[**UserGetCommission**](UserApi.md#UserGetCommission) | **Get** /user/commission | Get your account&#39;s commission status.
[**UserGetDepositAddress**](UserApi.md#UserGetDepositAddress) | **Get** /user/depositAddress | Get a deposit address.
[**UserGetMargin**](UserApi.md#UserGetMargin) | **Get** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**UserGetWalletHistory**](UserApi.md#UserGetWalletHistory) | **Get** /user/walletHistory | Get a history of all of your wallet transactions (deposits and withdrawals).
[**UserLogin**](UserApi.md#UserLogin) | **Post** /user/login | Log in to BitMEX.
[**UserLogout**](UserApi.md#UserLogout) | **Post** /user/logout | Log out of BitMEX.
[**UserLogoutAll**](UserApi.md#UserLogoutAll) | **Post** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**UserNew**](UserApi.md#UserNew) | **Post** /user | Register a new user.
[**UserRequestEnableTFA**](UserApi.md#UserRequestEnableTFA) | **Post** /user/requestEnableTFA | Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
[**UserRequestPasswordReset**](UserApi.md#UserRequestPasswordReset) | **Post** /user/requestPasswordReset | Request a password reset.
[**UserRequestWithdrawal**](UserApi.md#UserRequestWithdrawal) | **Post** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**UserSavePreferences**](UserApi.md#UserSavePreferences) | **Post** /user/preferences | Save user preferences.
[**UserSendVerificationEmail**](UserApi.md#UserSendVerificationEmail) | **Post** /user/resendVerificationEmail | Re-send verification email.
[**UserUpdate**](UserApi.md#UserUpdate) | **Put** /user | Update your password, name, and other attributes.


# **UserCancelWithdrawal**
> Transaction UserCancelWithdrawal($token)

Cancel a withdrawal.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserCheckReferralCode**
> float64 UserCheckReferralCode($referralCode)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referralCode** | **string**|  | [optional] 

### Return type

**float64**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmEmail**
> AccessToken UserConfirmEmail($token)

Confirm your email address with a token.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmEnableTFA**
> bool UserConfirmEnableTFA($token, $type_)

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token from your selected TFA type. | 
 **type_** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmPasswordReset**
> bool UserConfirmPasswordReset($token, $newPassword)

Confirm a password reset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 
 **newPassword** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserConfirmWithdrawal**
> Transaction UserConfirmWithdrawal($token)

Confirm a withdrawal.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserDisableTFA**
> bool UserDisableTFA($token, $type_)

Disable two-factor auth for this account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token from your selected TFA type. | 
 **type_** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGet**
> User UserGet()

Get your user model.


### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetAffiliateStatus**
> []Affiliate UserGetAffiliateStatus()

Get your current affiliate/referral status.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Affiliate**](Affiliate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetCommission**
> []UserCommission UserGetCommission()

Get your account's commission status.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]UserCommission**](UserCommission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetDepositAddress**
> string UserGetDepositAddress($currency)

Get a deposit address.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetMargin**
> Margin UserGetMargin($currency)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserGetWalletHistory**
> []Transaction UserGetWalletHistory($currency)

Get a history of all of your wallet transactions (deposits and withdrawals).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**[]Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserLogin**
> AccessToken UserLogin($email, $password, $token)

Log in to BitMEX.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| Your email address. | 
 **password** | **string**| Your password. | 
 **token** | **string**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserLogout**
> UserLogout()

Log out of BitMEX.


### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserLogoutAll**
> float64 UserLogoutAll()

Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.


### Parameters
This endpoint does not need any parameter.

### Return type

**float64**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserNew**
> User UserNew($email, $password, $country, $username, $firstname, $lastname, $acceptsTOS, $referrerID, $tfaType, $tfaToken)

Register a new user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| Your email address. | 
 **password** | **string**| Your password. | 
 **country** | **string**| Country of residence. | 
 **username** | **string**| Desired username. | [optional] 
 **firstname** | **string**| First name. | [optional] 
 **lastname** | **string**| Last name. | [optional] 
 **acceptsTOS** | **string**| Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). | [optional] 
 **referrerID** | **string**| Optional Referrer ID. | [optional] 
 **tfaType** | **string**| Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef | [optional] 
 **tfaToken** | **string**| Two-Factor Token. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestEnableTFA**
> bool UserRequestEnableTFA($type_)

Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestPasswordReset**
> bool UserRequestPasswordReset($email)

Request a password reset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserRequestWithdrawal**
> Transaction UserRequestWithdrawal($currency, $amount, $address, $otpToken, $fee)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **float32**| Amount of withdrawal currency. | 
 **address** | **string**| Destination Address. | 
 **otpToken** | **string**| 2FA token. Required if 2FA is enabled on your account. | [optional] 
 **fee** | **float64**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserSavePreferences**
> User UserSavePreferences($prefs, $overwrite)

Save user preferences.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **string**|  | 
 **overwrite** | **bool**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserSendVerificationEmail**
> bool UserSendVerificationEmail($email)

Re-send verification email.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserUpdate**
> User UserUpdate($firstname, $lastname, $oldPassword, $newPassword, $newPasswordConfirm, $username, $country, $pgpPubKey)

Update your password, name, and other attributes.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **string**|  | [optional] 
 **lastname** | **string**|  | [optional] 
 **oldPassword** | **string**|  | [optional] 
 **newPassword** | **string**|  | [optional] 
 **newPasswordConfirm** | **string**|  | [optional] 
 **username** | **string**| Username can only be set once. To reset, email support. | [optional] 
 **country** | **string**| Country of residence. | [optional] 
 **pgpPubKey** | **string**| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

