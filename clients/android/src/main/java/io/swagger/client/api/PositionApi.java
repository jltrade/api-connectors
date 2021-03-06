package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Position;
import io.swagger.client.model.Error;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PositionApi {
  String basePath = "https://localhost/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get your positions.
  * See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
   * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
   * @param count Number of rows to fetch.
   * @return List<Position>
  */
  public List<Position> positionGet (String filter, String columns, BigDecimal count) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/position".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "columns", columns));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));


      String[] contentTypes = {
  "application/json","application/x-www-form-urlencoded"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Position>) ApiInvoker.deserialize(localVarResponse, "array", Position.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get your positions.
   * See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.   * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].   * @param count Number of rows to fetch.
  */
  public void positionGet (String filter, String columns, BigDecimal count, final Response.Listener<List<Position>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/position".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "columns", columns));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Position>) ApiInvoker.deserialize(localVarResponse,  "array", Position.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Enable isolated margin or cross margin per-position.
  * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
   * @param symbol Position symbol to isolate.
   * @param enabled True for isolated margin, false for cross margin.
   * @return Position
  */
  public Position positionIsolateMargin (String symbol, Boolean enabled) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling positionIsolateMargin",
      new ApiException(400, "Missing the required parameter 'symbol' when calling positionIsolateMargin"));
      }
  

  // create path and map variables
  String path = "/position/isolate".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json","application/x-www-form-urlencoded"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (symbol != null) {
          localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (enabled != null) {
          localVarBuilder.addTextBody("enabled", ApiInvoker.parameterToString(enabled), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("enabled", ApiInvoker.parameterToString(enabled));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Position) ApiInvoker.deserialize(localVarResponse, "", Position.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Enable isolated margin or cross margin per-position.
   * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
   * @param symbol Position symbol to isolate.   * @param enabled True for isolated margin, false for cross margin.
  */
  public void positionIsolateMargin (String symbol, Boolean enabled, final Response.Listener<Position> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling positionIsolateMargin",
         new ApiException(400, "Missing the required parameter 'symbol' when calling positionIsolateMargin"));
    }
    

    // create path and map variables
    String path = "/position/isolate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (enabled != null) {
        localVarBuilder.addTextBody("enabled", ApiInvoker.parameterToString(enabled), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("enabled", ApiInvoker.parameterToString(enabled));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Position) ApiInvoker.deserialize(localVarResponse,  "", Position.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Transfer equity in or out of a position.
  * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
   * @param symbol Symbol of position to isolate.
   * @param amount Amount to transfer, in Satoshis. May be negative.
   * @return Position
  */
  public Position positionTransferIsolatedMargin (String symbol, BigDecimal amount) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin",
      new ApiException(400, "Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin"));
      }
  
      // verify the required parameter 'amount' is set
      if (amount == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling positionTransferIsolatedMargin",
      new ApiException(400, "Missing the required parameter 'amount' when calling positionTransferIsolatedMargin"));
      }
  

  // create path and map variables
  String path = "/position/transferMargin".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json","application/x-www-form-urlencoded"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (symbol != null) {
          localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (amount != null) {
          localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("amount", ApiInvoker.parameterToString(amount));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Position) ApiInvoker.deserialize(localVarResponse, "", Position.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Transfer equity in or out of a position.
   * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
   * @param symbol Symbol of position to isolate.   * @param amount Amount to transfer, in Satoshis. May be negative.
  */
  public void positionTransferIsolatedMargin (String symbol, BigDecimal amount, final Response.Listener<Position> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin",
         new ApiException(400, "Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin"));
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling positionTransferIsolatedMargin",
         new ApiException(400, "Missing the required parameter 'amount' when calling positionTransferIsolatedMargin"));
    }
    

    // create path and map variables
    String path = "/position/transferMargin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (amount != null) {
        localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("amount", ApiInvoker.parameterToString(amount));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Position) ApiInvoker.deserialize(localVarResponse,  "", Position.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Choose leverage for a position.
  * On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
   * @param symbol Symbol of position to adjust.
   * @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
   * @return Position
  */
  public Position positionUpdateLeverage (String symbol, Double leverage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling positionUpdateLeverage",
      new ApiException(400, "Missing the required parameter 'symbol' when calling positionUpdateLeverage"));
      }
  
      // verify the required parameter 'leverage' is set
      if (leverage == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'leverage' when calling positionUpdateLeverage",
      new ApiException(400, "Missing the required parameter 'leverage' when calling positionUpdateLeverage"));
      }
  

  // create path and map variables
  String path = "/position/leverage".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json","application/x-www-form-urlencoded"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (symbol != null) {
          localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (leverage != null) {
          localVarBuilder.addTextBody("leverage", ApiInvoker.parameterToString(leverage), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("leverage", ApiInvoker.parameterToString(leverage));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Position) ApiInvoker.deserialize(localVarResponse, "", Position.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Choose leverage for a position.
   * On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
   * @param symbol Symbol of position to adjust.   * @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
  */
  public void positionUpdateLeverage (String symbol, Double leverage, final Response.Listener<Position> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling positionUpdateLeverage",
         new ApiException(400, "Missing the required parameter 'symbol' when calling positionUpdateLeverage"));
    }
    
    // verify the required parameter 'leverage' is set
    if (leverage == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'leverage' when calling positionUpdateLeverage",
         new ApiException(400, "Missing the required parameter 'leverage' when calling positionUpdateLeverage"));
    }
    

    // create path and map variables
    String path = "/position/leverage".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (leverage != null) {
        localVarBuilder.addTextBody("leverage", ApiInvoker.parameterToString(leverage), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("leverage", ApiInvoker.parameterToString(leverage));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Position) ApiInvoker.deserialize(localVarResponse,  "", Position.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
