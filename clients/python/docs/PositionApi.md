# swagger_client.PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**position_get**](PositionApi.md#position_get) | **GET** /position | Get your positions.
[**position_isolate_margin**](PositionApi.md#position_isolate_margin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**position_transfer_isolated_margin**](PositionApi.md#position_transfer_isolated_margin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**position_update_leverage**](PositionApi.md#position_update_leverage) | **POST** /position/leverage | Choose leverage for a position.


# **position_get**
> list[Position] position_get(filter=filter, columns=columns, count=count)

Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PositionApi()
filter = 'filter_example' # str | Table filter. For example, send {\"symbol\": \"XBT24H\"}. (optional)
columns = 'columns_example' # str | Which columns to fetch. For example, send [\"columnName\"]. (optional)
count = 3.4 # float | Number of rows to fetch. (optional)

try: 
    # Get your positions.
    api_response = api_instance.position_get(filter=filter, columns=columns, count=count)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PositionApi->position_get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional] 
 **columns** | **str**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **float**| Number of rows to fetch. | [optional] 

### Return type

[**list[Position]**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_isolate_margin**
> Position position_isolate_margin(symbol, enabled=enabled)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PositionApi()
symbol = 'symbol_example' # str | Position symbol to isolate.
enabled = true # bool | True for isolated margin, false for cross margin. (optional) (default to true)

try: 
    # Enable isolated margin or cross margin per-position.
    api_response = api_instance.position_isolate_margin(symbol, enabled=enabled)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PositionApi->position_isolate_margin: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Position symbol to isolate. | 
 **enabled** | **bool**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_transfer_isolated_margin**
> Position position_transfer_isolated_margin(symbol, amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PositionApi()
symbol = 'symbol_example' # str | Symbol of position to isolate.
amount = 3.4 # float | Amount to transfer, in Satoshis. May be negative.

try: 
    # Transfer equity in or out of a position.
    api_response = api_instance.position_transfer_isolated_margin(symbol, amount)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PositionApi->position_transfer_isolated_margin: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Symbol of position to isolate. | 
 **amount** | **float**| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_update_leverage**
> Position position_update_leverage(symbol, leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PositionApi()
symbol = 'symbol_example' # str | Symbol of position to adjust.
leverage = 1.2 # float | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.

try: 
    # Choose leverage for a position.
    api_response = api_instance.position_update_leverage(symbol, leverage)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PositionApi->position_update_leverage: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Symbol of position to adjust. | 
 **leverage** | **float**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

