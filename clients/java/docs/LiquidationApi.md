# LiquidationApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**liquidationGet**](LiquidationApi.md#liquidationGet) | **GET** /liquidation | Get liquidation orders.


<a name="liquidationGet"></a>
# **liquidationGet**
> List&lt;Liquidation&gt; liquidationGet(symbol, filter, columns, count, start, reverse, startTime, endTime)

Get liquidation orders.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LiquidationApi;


LiquidationApi apiInstance = new LiquidationApi();
String symbol = "symbol_example"; // String | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
String filter = "filter_example"; // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
BigDecimal count = new BigDecimal(); // BigDecimal | Number of results to fetch.
BigDecimal start = new BigDecimal(); // BigDecimal | Starting point for results.
Boolean reverse = false; // Boolean | If true, will sort results newest first.
LocalDate startTime = new LocalDate(); // LocalDate | Starting date filter for results.
LocalDate endTime = new LocalDate(); // LocalDate | Ending date filter for results.
try {
    List<Liquidation> result = apiInstance.liquidationGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LiquidationApi#liquidationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional]
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **BigDecimal**| Number of results to fetch. | [optional] [default to 100]
 **start** | **BigDecimal**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **LocalDate**| Starting date filter for results. | [optional]
 **endTime** | **LocalDate**| Ending date filter for results. | [optional]

### Return type

[**List&lt;Liquidation&gt;**](Liquidation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript
