# PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**positionGet**](PositionApi.md#positionGet) | **GET** /position | Get your positions.
[**positionIsolateMargin**](PositionApi.md#positionIsolateMargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**positionTransferIsolatedMargin**](PositionApi.md#positionTransferIsolatedMargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**positionUpdateLeverage**](PositionApi.md#positionUpdateLeverage) | **POST** /position/leverage | Choose leverage for a position.


<a name="positionGet"></a>
# **positionGet**
> List&lt;Position&gt; positionGet(filter, columns, count)

Get your positions.

See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String filter = "filter_example"; // String | Table filter. For example, send {\"symbol\": \"XBT24H\"}.
String columns = "columns_example"; // String | Which columns to fetch. For example, send [\"columnName\"].
BigDecimal count = new BigDecimal(); // BigDecimal | Number of rows to fetch.
try {
    List<Position> result = apiInstance.positionGet(filter, columns, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional]
 **columns** | **String**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional]
 **count** | **BigDecimal**| Number of rows to fetch. | [optional]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionIsolateMargin"></a>
# **positionIsolateMargin**
> Position positionIsolateMargin(symbol, enabled)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Position symbol to isolate.
Boolean enabled = true; // Boolean | True for isolated margin, false for cross margin.
try {
    Position result = apiInstance.positionIsolateMargin(symbol, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionIsolateMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Position symbol to isolate. |
 **enabled** | **Boolean**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionTransferIsolatedMargin"></a>
# **positionTransferIsolatedMargin**
> Position positionTransferIsolatedMargin(symbol, amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to isolate.
BigDecimal amount = new BigDecimal(); // BigDecimal | Amount to transfer, in Satoshis. May be negative.
try {
    Position result = apiInstance.positionTransferIsolatedMargin(symbol, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionTransferIsolatedMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to isolate. |
 **amount** | **BigDecimal**| Amount to transfer, in Satoshis. May be negative. |

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="positionUpdateLeverage"></a>
# **positionUpdateLeverage**
> Position positionUpdateLeverage(symbol, leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```java
// Import classes:
//import io.swagger.client.api.PositionApi;

PositionApi apiInstance = new PositionApi();
String symbol = "symbol_example"; // String | Symbol of position to adjust.
Double leverage = 3.4D; // Double | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
try {
    Position result = apiInstance.positionUpdateLeverage(symbol, leverage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionApi#positionUpdateLeverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to adjust. |
 **leverage** | **Double**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. |

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

