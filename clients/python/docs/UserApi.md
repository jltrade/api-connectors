# swagger_client.UserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_cancel_withdrawal**](UserApi.md#user_cancel_withdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**user_check_referral_code**](UserApi.md#user_check_referral_code) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**user_confirm_email**](UserApi.md#user_confirm_email) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**user_confirm_enable_tfa**](UserApi.md#user_confirm_enable_tfa) | **POST** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**user_confirm_password_reset**](UserApi.md#user_confirm_password_reset) | **POST** /user/confirmPasswordReset | Confirm a password reset.
[**user_confirm_withdrawal**](UserApi.md#user_confirm_withdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**user_disable_tfa**](UserApi.md#user_disable_tfa) | **POST** /user/disableTFA | Disable two-factor auth for this account.
[**user_get**](UserApi.md#user_get) | **GET** /user | Get your user model.
[**user_get_affiliate_status**](UserApi.md#user_get_affiliate_status) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**user_get_commission**](UserApi.md#user_get_commission) | **GET** /user/commission | Get your account&#39;s commission status.
[**user_get_deposit_address**](UserApi.md#user_get_deposit_address) | **GET** /user/depositAddress | Get a deposit address.
[**user_get_margin**](UserApi.md#user_get_margin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**user_get_wallet_history**](UserApi.md#user_get_wallet_history) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits and withdrawals).
[**user_login**](UserApi.md#user_login) | **POST** /user/login | Log in to BitMEX.
[**user_logout**](UserApi.md#user_logout) | **POST** /user/logout | Log out of BitMEX.
[**user_logout_all**](UserApi.md#user_logout_all) | **POST** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**user_new**](UserApi.md#user_new) | **POST** /user | Register a new user.
[**user_request_enable_tfa**](UserApi.md#user_request_enable_tfa) | **POST** /user/requestEnableTFA | Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
[**user_request_password_reset**](UserApi.md#user_request_password_reset) | **POST** /user/requestPasswordReset | Request a password reset.
[**user_request_withdrawal**](UserApi.md#user_request_withdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**user_save_preferences**](UserApi.md#user_save_preferences) | **POST** /user/preferences | Save user preferences.
[**user_send_verification_email**](UserApi.md#user_send_verification_email) | **POST** /user/resendVerificationEmail | Re-send verification email.
[**user_update**](UserApi.md#user_update) | **PUT** /user | Update your password, name, and other attributes.


# **user_cancel_withdrawal**
> Transaction user_cancel_withdrawal(token)

Cancel a withdrawal.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 

try: 
    # Cancel a withdrawal.
    api_response = api_instance.user_cancel_withdrawal(token)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_cancel_withdrawal: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_check_referral_code**
> float user_check_referral_code(referral_code=referral_code)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
referral_code = 'referral_code_example' # str |  (optional)

try: 
    # Check if a referral code is valid.
    api_response = api_instance.user_check_referral_code(referral_code=referral_code)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_check_referral_code: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referral_code** | **str**|  | [optional] 

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_confirm_email**
> AccessToken user_confirm_email(token)

Confirm your email address with a token.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 

try: 
    # Confirm your email address with a token.
    api_response = api_instance.user_confirm_email(token)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_confirm_email: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_confirm_enable_tfa**
> bool user_confirm_enable_tfa(token, type=type)

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | Token from your selected TFA type.
type = 'type_example' # str | Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey' (optional)

try: 
    # Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
    api_response = api_instance.user_confirm_enable_tfa(token, type=type)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_confirm_enable_tfa: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Token from your selected TFA type. | 
 **type** | **str**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_confirm_password_reset**
> bool user_confirm_password_reset(token, new_password)

Confirm a password reset.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 
new_password = 'new_password_example' # str | 

try: 
    # Confirm a password reset.
    api_response = api_instance.user_confirm_password_reset(token, new_password)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_confirm_password_reset: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 
 **new_password** | **str**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_confirm_withdrawal**
> Transaction user_confirm_withdrawal(token)

Confirm a withdrawal.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 

try: 
    # Confirm a withdrawal.
    api_response = api_instance.user_confirm_withdrawal(token)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_confirm_withdrawal: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_disable_tfa**
> bool user_disable_tfa(token, type=type)

Disable two-factor auth for this account.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | Token from your selected TFA type.
type = 'type_example' # str | Two-factor auth type. Supported types: 'GA' (Google Authenticator) (optional)

try: 
    # Disable two-factor auth for this account.
    api_response = api_instance.user_disable_tfa(token, type=type)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_disable_tfa: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Token from your selected TFA type. | 
 **type** | **str**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get**
> User user_get()

Get your user model.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()

try: 
    # Get your user model.
    api_response = api_instance.user_get()
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_get: %s\n" % e
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_affiliate_status**
> list[Affiliate] user_get_affiliate_status()

Get your current affiliate/referral status.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()

try: 
    # Get your current affiliate/referral status.
    api_response = api_instance.user_get_affiliate_status()
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_get_affiliate_status: %s\n" % e
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Affiliate]**](Affiliate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_commission**
> list[UserCommission] user_get_commission()

Get your account's commission status.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()

try: 
    # Get your account's commission status.
    api_response = api_instance.user_get_commission()
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_get_commission: %s\n" % e
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[UserCommission]**](UserCommission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_deposit_address**
> str user_get_deposit_address(currency=currency)

Get a deposit address.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
currency = 'XBt' # str |  (optional) (default to XBt)

try: 
    # Get a deposit address.
    api_response = api_instance.user_get_deposit_address(currency=currency)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_get_deposit_address: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**|  | [optional] [default to XBt]

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_margin**
> Margin user_get_margin(currency=currency)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
currency = 'XBt' # str |  (optional) (default to XBt)

try: 
    # Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
    api_response = api_instance.user_get_margin(currency=currency)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_get_margin: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**|  | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet_history**
> list[Transaction] user_get_wallet_history(currency=currency)

Get a history of all of your wallet transactions (deposits and withdrawals).

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
currency = 'XBt' # str |  (optional) (default to XBt)

try: 
    # Get a history of all of your wallet transactions (deposits and withdrawals).
    api_response = api_instance.user_get_wallet_history(currency=currency)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_get_wallet_history: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**|  | [optional] [default to XBt]

### Return type

[**list[Transaction]**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_login**
> AccessToken user_login(email, password, token=token)

Log in to BitMEX.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
email = 'email_example' # str | Your email address.
password = 'password_example' # str | Your password.
token = 'token_example' # str | OTP Token (YubiKey, Google Authenticator) (optional)

try: 
    # Log in to BitMEX.
    api_response = api_instance.user_login(email, password, token=token)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_login: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| Your email address. | 
 **password** | **str**| Your password. | 
 **token** | **str**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_logout**
> user_logout()

Log out of BitMEX.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()

try: 
    # Log out of BitMEX.
    api_instance.user_logout()
except ApiException as e:
    print "Exception when calling UserApi->user_logout: %s\n" % e
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_logout_all**
> float user_logout_all()

Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()

try: 
    # Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.
    api_response = api_instance.user_logout_all()
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_logout_all: %s\n" % e
```

### Parameters
This endpoint does not need any parameter.

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_new**
> User user_new(email, password, country, username=username, firstname=firstname, lastname=lastname, accepts_tos=accepts_tos, referrer_id=referrer_id, tfa_type=tfa_type, tfa_token=tfa_token)

Register a new user.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
email = 'email_example' # str | Your email address.
password = 'password_example' # str | Your password.
country = 'country_example' # str | Country of residence.
username = 'username_example' # str | Desired username. (optional)
firstname = 'firstname_example' # str | First name. (optional)
lastname = 'lastname_example' # str | Last name. (optional)
accepts_tos = 'accepts_tos_example' # str | Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). (optional)
referrer_id = 'referrer_id_example' # str | Optional Referrer ID. (optional)
tfa_type = 'tfa_type_example' # str | Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef (optional)
tfa_token = 'tfa_token_example' # str | Two-Factor Token. (optional)

try: 
    # Register a new user.
    api_response = api_instance.user_new(email, password, country, username=username, firstname=firstname, lastname=lastname, accepts_tos=accepts_tos, referrer_id=referrer_id, tfa_type=tfa_type, tfa_token=tfa_token)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_new: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| Your email address. | 
 **password** | **str**| Your password. | 
 **country** | **str**| Country of residence. | 
 **username** | **str**| Desired username. | [optional] 
 **firstname** | **str**| First name. | [optional] 
 **lastname** | **str**| Last name. | [optional] 
 **accepts_tos** | **str**| Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms). | [optional] 
 **referrer_id** | **str**| Optional Referrer ID. | [optional] 
 **tfa_type** | **str**| Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef | [optional] 
 **tfa_token** | **str**| Two-Factor Token. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_request_enable_tfa**
> bool user_request_enable_tfa(type=type)

Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
type = 'type_example' # str | Two-factor auth type. Supported types: 'GA' (Google Authenticator) (optional)

try: 
    # Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
    api_response = api_instance.user_request_enable_tfa(type=type)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_request_enable_tfa: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_request_password_reset**
> bool user_request_password_reset(email)

Request a password reset.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
email = 'email_example' # str | 

try: 
    # Request a password reset.
    api_response = api_instance.user_request_password_reset(email)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_request_password_reset: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_request_withdrawal**
> Transaction user_request_withdrawal(currency, amount, address, otp_token=otp_token, fee=fee)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
currency = 'XBt' # str | Currency you're withdrawing. Options: `XBt` (default to XBt)
amount = 3.4 # float | Amount of withdrawal currency.
address = 'address_example' # str | Destination Address.
otp_token = 'otp_token_example' # str | 2FA token. Required if 2FA is enabled on your account. (optional)
fee = 1.2 # float | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional)

try: 
    # Request a withdrawal to an external wallet.
    api_response = api_instance.user_request_withdrawal(currency, amount, address, otp_token=otp_token, fee=fee)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_request_withdrawal: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **float**| Amount of withdrawal currency. | 
 **address** | **str**| Destination Address. | 
 **otp_token** | **str**| 2FA token. Required if 2FA is enabled on your account. | [optional] 
 **fee** | **float**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_save_preferences**
> User user_save_preferences(prefs, overwrite=overwrite)

Save user preferences.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
prefs = 'prefs_example' # str | 
overwrite = false # bool | If true, will overwrite all existing preferences. (optional) (default to false)

try: 
    # Save user preferences.
    api_response = api_instance.user_save_preferences(prefs, overwrite=overwrite)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_save_preferences: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **str**|  | 
 **overwrite** | **bool**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_send_verification_email**
> bool user_send_verification_email(email)

Re-send verification email.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
email = 'email_example' # str | 

try: 
    # Re-send verification email.
    api_response = api_instance.user_send_verification_email(email)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_send_verification_email: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_update**
> User user_update(firstname=firstname, lastname=lastname, old_password=old_password, new_password=new_password, new_password_confirm=new_password_confirm, username=username, country=country, pgp_pub_key=pgp_pub_key)

Update your password, name, and other attributes.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
firstname = 'firstname_example' # str |  (optional)
lastname = 'lastname_example' # str |  (optional)
old_password = 'old_password_example' # str |  (optional)
new_password = 'new_password_example' # str |  (optional)
new_password_confirm = 'new_password_confirm_example' # str |  (optional)
username = 'username_example' # str | Username can only be set once. To reset, email support. (optional)
country = 'country_example' # str | Country of residence. (optional)
pgp_pub_key = 'pgp_pub_key_example' # str | PGP Public Key. If specified, automated emails will be sentwith this key. (optional)

try: 
    # Update your password, name, and other attributes.
    api_response = api_instance.user_update(firstname=firstname, lastname=lastname, old_password=old_password, new_password=new_password, new_password_confirm=new_password_confirm, username=username, country=country, pgp_pub_key=pgp_pub_key)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserApi->user_update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **str**|  | [optional] 
 **lastname** | **str**|  | [optional] 
 **old_password** | **str**|  | [optional] 
 **new_password** | **str**|  | [optional] 
 **new_password_confirm** | **str**|  | [optional] 
 **username** | **str**| Username can only be set once. To reset, email support. | [optional] 
 **country** | **str**| Country of residence. | [optional] 
 **pgp_pub_key** | **str**| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

