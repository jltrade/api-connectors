package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.OrderBook;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import io.swagger.client.model.OrderBookL2;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class OrderBookApi {
  private ApiClient apiClient;

  public OrderBookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderBookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get current orderbook [deprecated, use /orderBook/L2].
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @param depth Orderbook depth.
   * @return List<OrderBook>
   */
  public List<OrderBook> orderBookGet (String symbol, BigDecimal depth) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'symbol' is set
     if (symbol == null) {
        throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGet");
     }
     
    // create path and map variables
    String path = "/orderBook".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(apiClient.parameterToPairs("", "depth", depth));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<OrderBook>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get current orderbook in vertical format.
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @param depth Orderbook depth per side. Send 0 for full depth.
   * @return List<OrderBookL2>
   */
  public List<OrderBookL2> orderBookGetL2 (String symbol, BigDecimal depth) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'symbol' is set
     if (symbol == null) {
        throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGetL2");
     }
     
    // create path and map variables
    String path = "/orderBook/L2".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(apiClient.parameterToPairs("", "depth", depth));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<OrderBookL2>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
