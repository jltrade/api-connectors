# SwaggerClient::PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**position_get**](PositionApi.md#position_get) | **GET** /position | Get your positions.
[**position_isolate_margin**](PositionApi.md#position_isolate_margin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**position_transfer_isolated_margin**](PositionApi.md#position_transfer_isolated_margin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**position_update_leverage**](PositionApi.md#position_update_leverage) | **POST** /position/leverage | Choose leverage for a position.


# **position_get**
> Array&lt;Position&gt; position_get(opts)

Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PositionApi.new

opts = { 
  filter: "filter_example", # String | Table filter. For example, send {\"symbol\": \"XBT24H\"}.
  columns: "columns_example", # String | Which columns to fetch. For example, send [\"columnName\"].
  count: 3.4 # Float | Number of rows to fetch.
}

begin
  #Get your positions.
  result = api_instance.position_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional] 
 **columns** | **String**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **Float**| Number of rows to fetch. | [optional] 

### Return type

[**Array&lt;Position&gt;**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_isolate_margin**
> Position position_isolate_margin(symbol, opts)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PositionApi.new

symbol = "symbol_example" # String | Position symbol to isolate.

opts = { 
  enabled: true # BOOLEAN | True for isolated margin, false for cross margin.
}

begin
  #Enable isolated margin or cross margin per-position.
  result = api_instance.position_isolate_margin(symbol, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_isolate_margin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Position symbol to isolate. | 
 **enabled** | **BOOLEAN**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_transfer_isolated_margin**
> Position position_transfer_isolated_margin(symbol, amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PositionApi.new

symbol = "symbol_example" # String | Symbol of position to isolate.

amount = 3.4 # Float | Amount to transfer, in Satoshis. May be negative.


begin
  #Transfer equity in or out of a position.
  result = api_instance.position_transfer_isolated_margin(symbol, amount)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_transfer_isolated_margin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to isolate. | 
 **amount** | **Float**| Amount to transfer, in Satoshis. May be negative. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_update_leverage**
> Position position_update_leverage(symbol, leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PositionApi.new

symbol = "symbol_example" # String | Symbol of position to adjust.

leverage = 1.2 # Float | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.


begin
  #Choose leverage for a position.
  result = api_instance.position_update_leverage(symbol, leverage)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_update_leverage: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to adjust. | 
 **leverage** | **Float**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 

### Return type

[**Position**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



