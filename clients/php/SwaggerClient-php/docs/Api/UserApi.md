# Swagger\Client\UserApi

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


# **userCancelWithdrawal**
> \Swagger\Client\Model\Transaction userCancelWithdrawal($token)

Cancel a withdrawal.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$token = "token_example"; // string | 

try {
    $result = $api_instance->userCancelWithdrawal($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userCancelWithdrawal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  |

### Return type

[**\Swagger\Client\Model\Transaction**](../Model/Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userCheckReferralCode**
> double userCheckReferralCode($referral_code)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$referral_code = "referral_code_example"; // string | 

try {
    $result = $api_instance->userCheckReferralCode($referral_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userCheckReferralCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referral_code** | **string**|  | [optional]

### Return type

**double**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userConfirmEmail**
> \Swagger\Client\Model\AccessToken userConfirmEmail($token)

Confirm your email address with a token.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$token = "token_example"; // string | 

try {
    $result = $api_instance->userConfirmEmail($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userConfirmEmail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  |

### Return type

[**\Swagger\Client\Model\AccessToken**](../Model/AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userConfirmEnableTFA**
> bool userConfirmEnableTFA($token, $type)

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$token = "token_example"; // string | Token from your selected TFA type.
$type = "type_example"; // string | Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'

try {
    $result = $api_instance->userConfirmEnableTFA($token, $type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userConfirmEnableTFA: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token from your selected TFA type. |
 **type** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userConfirmPasswordReset**
> bool userConfirmPasswordReset($token, $new_password)

Confirm a password reset.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$token = "token_example"; // string | 
$new_password = "new_password_example"; // string | 

try {
    $result = $api_instance->userConfirmPasswordReset($token, $new_password);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userConfirmPasswordReset: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  |
 **new_password** | **string**|  |

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userConfirmWithdrawal**
> \Swagger\Client\Model\Transaction userConfirmWithdrawal($token)

Confirm a withdrawal.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$token = "token_example"; // string | 

try {
    $result = $api_instance->userConfirmWithdrawal($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userConfirmWithdrawal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  |

### Return type

[**\Swagger\Client\Model\Transaction**](../Model/Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userDisableTFA**
> bool userDisableTFA($token, $type)

Disable two-factor auth for this account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$token = "token_example"; // string | Token from your selected TFA type.
$type = "type_example"; // string | Two-factor auth type. Supported types: 'GA' (Google Authenticator)

try {
    $result = $api_instance->userDisableTFA($token, $type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userDisableTFA: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token from your selected TFA type. |
 **type** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userGet**
> \Swagger\Client\Model\User userGet()

Get your user model.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();

try {
    $result = $api_instance->userGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userGetAffiliateStatus**
> \Swagger\Client\Model\Affiliate[] userGetAffiliateStatus()

Get your current affiliate/referral status.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();

try {
    $result = $api_instance->userGetAffiliateStatus();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userGetAffiliateStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Affiliate[]**](../Model/Affiliate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userGetCommission**
> \Swagger\Client\Model\UserCommission[] userGetCommission()

Get your account's commission status.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();

try {
    $result = $api_instance->userGetCommission();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userGetCommission: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\UserCommission[]**](../Model/UserCommission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userGetDepositAddress**
> string userGetDepositAddress($currency)

Get a deposit address.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$currency = "XBt"; // string | 

try {
    $result = $api_instance->userGetDepositAddress($currency);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userGetDepositAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userGetMargin**
> \Swagger\Client\Model\Margin userGetMargin($currency)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$currency = "XBt"; // string | 

try {
    $result = $api_instance->userGetMargin($currency);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userGetMargin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**\Swagger\Client\Model\Margin**](../Model/Margin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userGetWalletHistory**
> \Swagger\Client\Model\Transaction[] userGetWalletHistory($currency)

Get a history of all of your wallet transactions (deposits and withdrawals).

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$currency = "XBt"; // string | 

try {
    $result = $api_instance->userGetWalletHistory($currency);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userGetWalletHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**|  | [optional] [default to XBt]

### Return type

[**\Swagger\Client\Model\Transaction[]**](../Model/Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userLogin**
> \Swagger\Client\Model\AccessToken userLogin($email, $password, $token)

Log in to BitMEX.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$email = "email_example"; // string | Your email address.
$password = "password_example"; // string | Your password.
$token = "token_example"; // string | OTP Token (YubiKey, Google Authenticator)

try {
    $result = $api_instance->userLogin($email, $password, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userLogin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| Your email address. |
 **password** | **string**| Your password. |
 **token** | **string**| OTP Token (YubiKey, Google Authenticator) | [optional]

### Return type

[**\Swagger\Client\Model\AccessToken**](../Model/AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userLogout**
> userLogout()

Log out of BitMEX.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();

try {
    $api_instance->userLogout();
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userLogout: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userLogoutAll**
> double userLogoutAll()

Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();

try {
    $result = $api_instance->userLogoutAll();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userLogoutAll: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

**double**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userNew**
> \Swagger\Client\Model\User userNew($email, $password, $country, $username, $firstname, $lastname, $accepts_tos, $referrer_id, $tfa_type, $tfa_token)

Register a new user.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$email = "email_example"; // string | Your email address.
$password = "password_example"; // string | Your password.
$country = "country_example"; // string | Country of residence.
$username = "username_example"; // string | Desired username.
$firstname = "firstname_example"; // string | First name.
$lastname = "lastname_example"; // string | Last name.
$accepts_tos = "accepts_tos_example"; // string | Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).
$referrer_id = "referrer_id_example"; // string | Optional Referrer ID.
$tfa_type = "tfa_type_example"; // string | Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef
$tfa_token = "tfa_token_example"; // string | Two-Factor Token.

try {
    $result = $api_instance->userNew($email, $password, $country, $username, $firstname, $lastname, $accepts_tos, $referrer_id, $tfa_type, $tfa_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userNew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| Your email address. |
 **password** | **string**| Your password. |
 **country** | **string**| Country of residence. |
 **username** | **string**| Desired username. | [optional]
 **firstname** | **string**| First name. | [optional]
 **lastname** | **string**| Last name. | [optional]
 **accepts_tos** | **string**| Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). | [optional]
 **referrer_id** | **string**| Optional Referrer ID. | [optional]
 **tfa_type** | **string**| Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef | [optional]
 **tfa_token** | **string**| Two-Factor Token. | [optional]

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userRequestEnableTFA**
> bool userRequestEnableTFA($type)

Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$type = "type_example"; // string | Two-factor auth type. Supported types: 'GA' (Google Authenticator)

try {
    $result = $api_instance->userRequestEnableTFA($type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userRequestEnableTFA: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional]

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userRequestPasswordReset**
> bool userRequestPasswordReset($email)

Request a password reset.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$email = "email_example"; // string | 

try {
    $result = $api_instance->userRequestPasswordReset($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userRequestPasswordReset: ', $e->getMessage(), PHP_EOL;
}
?>
```

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userRequestWithdrawal**
> \Swagger\Client\Model\Transaction userRequestWithdrawal($currency, $amount, $address, $otp_token, $fee)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$currency = "XBt"; // string | Currency you're withdrawing. Options: `XBt`
$amount = 3.4; // float | Amount of withdrawal currency.
$address = "address_example"; // string | Destination Address.
$otp_token = "otp_token_example"; // string | 2FA token. Required if 2FA is enabled on your account.
$fee = 1.2; // double | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.

try {
    $result = $api_instance->userRequestWithdrawal($currency, $amount, $address, $otp_token, $fee);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userRequestWithdrawal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **float**| Amount of withdrawal currency. |
 **address** | **string**| Destination Address. |
 **otp_token** | **string**| 2FA token. Required if 2FA is enabled on your account. | [optional]
 **fee** | **double**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional]

### Return type

[**\Swagger\Client\Model\Transaction**](../Model/Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userSavePreferences**
> \Swagger\Client\Model\User userSavePreferences($prefs, $overwrite)

Save user preferences.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$prefs = "prefs_example"; // string | 
$overwrite = false; // bool | If true, will overwrite all existing preferences.

try {
    $result = $api_instance->userSavePreferences($prefs, $overwrite);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userSavePreferences: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **string**|  |
 **overwrite** | **bool**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userSendVerificationEmail**
> bool userSendVerificationEmail($email)

Re-send verification email.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$email = "email_example"; // string | 

try {
    $result = $api_instance->userSendVerificationEmail($email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userSendVerificationEmail: ', $e->getMessage(), PHP_EOL;
}
?>
```

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **userUpdate**
> \Swagger\Client\Model\User userUpdate($firstname, $lastname, $old_password, $new_password, $new_password_confirm, $username, $country, $pgp_pub_key)

Update your password, name, and other attributes.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$firstname = "firstname_example"; // string | 
$lastname = "lastname_example"; // string | 
$old_password = "old_password_example"; // string | 
$new_password = "new_password_example"; // string | 
$new_password_confirm = "new_password_confirm_example"; // string | 
$username = "username_example"; // string | Username can only be set once. To reset, email support.
$country = "country_example"; // string | Country of residence.
$pgp_pub_key = "pgp_pub_key_example"; // string | PGP Public Key. If specified, automated emails will be sentwith this key.

try {
    $result = $api_instance->userUpdate($firstname, $lastname, $old_password, $new_password, $new_password_confirm, $username, $country, $pgp_pub_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->userUpdate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **string**|  | [optional]
 **lastname** | **string**|  | [optional]
 **old_password** | **string**|  | [optional]
 **new_password** | **string**|  | [optional]
 **new_password_confirm** | **string**|  | [optional]
 **username** | **string**| Username can only be set once. To reset, email support. | [optional]
 **country** | **string**| Country of residence. | [optional]
 **pgp_pub_key** | **string**| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional]

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

