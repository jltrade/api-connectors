# IO.Swagger.Api.PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PositionGet**](PositionApi.md#positionget) | **GET** /position | Get your positions.
[**PositionIsolateMargin**](PositionApi.md#positionisolatemargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**PositionTransferIsolatedMargin**](PositionApi.md#positiontransferisolatedmargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**PositionUpdateLeverage**](PositionApi.md#positionupdateleverage) | **POST** /position/leverage | Choose leverage for a position.


# **PositionGet**
> List<Position> PositionGet (string filter = null, string columns = null, decimal? count = null)

Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionGetExample
    {
        public void main()
        {
            
            var apiInstance = new PositionApi();
            var filter = filter_example;  // string | Table filter. For example, send {\"symbol\": \"XBT24H\"}. (optional) 
            var columns = columns_example;  // string | Which columns to fetch. For example, send [\"columnName\"]. (optional) 
            var count = 3.4;  // decimal? | Number of rows to fetch. (optional) 

            try
            {
                // Get your positions.
                List&lt;Position&gt; result = apiInstance.PositionGet(filter, columns, count);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional] 
 **columns** | **string**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **decimal?**| Number of rows to fetch. | [optional] 

### Return type

[**List<Position>**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionIsolateMargin**
> Position PositionIsolateMargin (string symbol, bool? enabled = null)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionIsolateMarginExample
    {
        public void main()
        {
            
            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Position symbol to isolate.
            var enabled = true;  // bool? | True for isolated margin, false for cross margin. (optional)  (default to true)

            try
            {
                // Enable isolated margin or cross margin per-position.
                Position result = apiInstance.PositionIsolateMargin(symbol, enabled);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionIsolateMargin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Position symbol to isolate. | 
 **enabled** | **bool?**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionTransferIsolatedMargin**
> Position PositionTransferIsolatedMargin (string symbol, decimal? amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionTransferIsolatedMarginExample
    {
        public void main()
        {
            
            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Symbol of position to isolate.
            var amount = 3.4;  // decimal? | Amount to transfer, in Satoshis. May be negative.

            try
            {
                // Transfer equity in or out of a position.
                Position result = apiInstance.PositionTransferIsolatedMargin(symbol, amount);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionTransferIsolatedMargin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to isolate. | 
 **amount** | **decimal?**| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionUpdateLeverage**
> Position PositionUpdateLeverage (string symbol, double? leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PositionUpdateLeverageExample
    {
        public void main()
        {
            
            var apiInstance = new PositionApi();
            var symbol = symbol_example;  // string | Symbol of position to adjust.
            var leverage = 1.2;  // double? | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.

            try
            {
                // Choose leverage for a position.
                Position result = apiInstance.PositionUpdateLeverage(symbol, leverage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PositionApi.PositionUpdateLeverage: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to adjust. | 
 **leverage** | **double?**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

