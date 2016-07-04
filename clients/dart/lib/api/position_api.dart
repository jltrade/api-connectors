part of api;


class PositionApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  PositionApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  
  /// Get your positions.
  ///
  /// See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
  Future<List<Position>> positionGet(String filter, String columns, Number count) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/position".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != filter)
      queryParams["filter"] = filter is List ? filter.join(',') : filter;
    if("null" != columns)
      queryParams["columns"] = columns is List ? columns.join(',') : columns;
    if("null" != count)
      queryParams["count"] = count is List ? count.join(',') : count;
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Position);
      }
      else {
        return null;
      }
    });
  }
  
  /// Enable isolated margin or cross margin per-position.
  ///
  /// On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
  Future<Position> positionIsolateMargin(String symbol, bool enabled) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/position/isolate".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (symbol != null) {
        hasFields = true;
        mp.fields['symbol'] = apiClient.parameterToString(symbol);
      }
      
      if (enabled != null) {
        hasFields = true;
        mp.fields['enabled'] = apiClient.parameterToString(enabled);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
      if (enabled != null)
        formParams['enabled'] = apiClient.parameterToString(enabled);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Position);
      }
      else {
        return null;
      }
    });
  }
  
  /// Choose leverage for a position.
  ///
  /// On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
  Future<Position> positionUpdateLeverage(String symbol, num leverage) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/position/leverage".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (symbol != null) {
        hasFields = true;
        mp.fields['symbol'] = apiClient.parameterToString(symbol);
      }
      
      if (leverage != null) {
        hasFields = true;
        mp.fields['leverage'] = apiClient.parameterToString(leverage);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
      if (leverage != null)
        formParams['leverage'] = apiClient.parameterToString(leverage);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Position);
      }
      else {
        return null;
      }
    });
  }
  
  /// Transfer equity in or out of a position.
  ///
  /// When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
  Future<Position> positionTransferIsolatedMargin(String symbol, Number amount) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/position/transferMargin".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (symbol != null) {
        hasFields = true;
        mp.fields['symbol'] = apiClient.parameterToString(symbol);
      }
      
      if (amount != null) {
        hasFields = true;
        mp.fields['amount'] = apiClient.parameterToString(amount);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
      if (amount != null)
        formParams['amount'] = apiClient.parameterToString(amount);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Position);
      }
      else {
        return null;
      }
    });
  }
  
}
