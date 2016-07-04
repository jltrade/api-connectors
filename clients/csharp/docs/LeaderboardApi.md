# IO.Swagger.Api.LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeaderboardGet**](LeaderboardApi.md#leaderboardget) | **GET** /leaderboard | Get current leaderboard.


# **LeaderboardGet**
> List<Leaderboard> LeaderboardGet (string method = null)

Get current leaderboard.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LeaderboardGetExample
    {
        public void main()
        {
            
            var apiInstance = new LeaderboardApi();
            var method = method_example;  // string | Ranking type. Options: \"notional\", \"ROE\" (optional)  (default to notional)

            try
            {
                // Get current leaderboard.
                List&lt;Leaderboard&gt; result = apiInstance.LeaderboardGet(method);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LeaderboardApi.LeaderboardGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **string**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**List<Leaderboard>**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

