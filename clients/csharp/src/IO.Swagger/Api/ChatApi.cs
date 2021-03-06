/* 
 * BitMEX API
 *
 * REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IChatApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get chat messages.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>List&lt;Chat&gt;</returns>
        List<Chat> ChatGet (decimal? count = null, decimal? start = null, bool? reverse = null);

        /// <summary>
        /// Get chat messages.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>ApiResponse of List&lt;Chat&gt;</returns>
        ApiResponse<List<Chat>> ChatGetWithHttpInfo (decimal? count = null, decimal? start = null, bool? reverse = null);
        /// <summary>
        /// Get connected users.
        /// </summary>
        /// <remarks>
        /// Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ConnectedUsers</returns>
        ConnectedUsers ChatGetConnected ();

        /// <summary>
        /// Get connected users.
        /// </summary>
        /// <remarks>
        /// Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of ConnectedUsers</returns>
        ApiResponse<ConnectedUsers> ChatGetConnectedWithHttpInfo ();
        /// <summary>
        /// Send a chat message.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>Chat</returns>
        Chat ChatNew (string message);

        /// <summary>
        /// Send a chat message.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>ApiResponse of Chat</returns>
        ApiResponse<Chat> ChatNewWithHttpInfo (string message);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Get chat messages.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>Task of List&lt;Chat&gt;</returns>
        System.Threading.Tasks.Task<List<Chat>> ChatGetAsync (decimal? count = null, decimal? start = null, bool? reverse = null);

        /// <summary>
        /// Get chat messages.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>Task of ApiResponse (List&lt;Chat&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Chat>>> ChatGetAsyncWithHttpInfo (decimal? count = null, decimal? start = null, bool? reverse = null);
        /// <summary>
        /// Get connected users.
        /// </summary>
        /// <remarks>
        /// Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ConnectedUsers</returns>
        System.Threading.Tasks.Task<ConnectedUsers> ChatGetConnectedAsync ();

        /// <summary>
        /// Get connected users.
        /// </summary>
        /// <remarks>
        /// Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (ConnectedUsers)</returns>
        System.Threading.Tasks.Task<ApiResponse<ConnectedUsers>> ChatGetConnectedAsyncWithHttpInfo ();
        /// <summary>
        /// Send a chat message.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>Task of Chat</returns>
        System.Threading.Tasks.Task<Chat> ChatNewAsync (string message);

        /// <summary>
        /// Send a chat message.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>Task of ApiResponse (Chat)</returns>
        System.Threading.Tasks.Task<ApiResponse<Chat>> ChatNewAsyncWithHttpInfo (string message);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ChatApi : IChatApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ChatApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ChatApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ChatApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ChatApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Get chat messages. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>List&lt;Chat&gt;</returns>
        public List<Chat> ChatGet (decimal? count = null, decimal? start = null, bool? reverse = null)
        {
             ApiResponse<List<Chat>> localVarResponse = ChatGetWithHttpInfo(count, start, reverse);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Get chat messages. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>ApiResponse of List&lt;Chat&gt;</returns>
        public ApiResponse< List<Chat> > ChatGetWithHttpInfo (decimal? count = null, decimal? start = null, bool? reverse = null)
        {

            var localVarPath = "/chat";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json", 
                "application/xml", 
                "text/xml", 
                "application/javascript", 
                "text/javascript"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (count != null) localVarQueryParams.Add("count", Configuration.ApiClient.ParameterToString(count)); // query parameter
            if (start != null) localVarQueryParams.Add("start", Configuration.ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) localVarQueryParams.Add("reverse", Configuration.ApiClient.ParameterToString(reverse)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChatGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Chat>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<Chat>) Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Chat>)));
            
        }

        /// <summary>
        /// Get chat messages. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>Task of List&lt;Chat&gt;</returns>
        public async System.Threading.Tasks.Task<List<Chat>> ChatGetAsync (decimal? count = null, decimal? start = null, bool? reverse = null)
        {
             ApiResponse<List<Chat>> localVarResponse = await ChatGetAsyncWithHttpInfo(count, start, reverse);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Get chat messages. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="count">Number of results to fetch. (optional, default to 100)</param>
        /// <param name="start">Starting point for results. (optional, default to 0)</param>
        /// <param name="reverse">If true, will sort results newest first. (optional, default to true)</param>
        /// <returns>Task of ApiResponse (List&lt;Chat&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Chat>>> ChatGetAsyncWithHttpInfo (decimal? count = null, decimal? start = null, bool? reverse = null)
        {

            var localVarPath = "/chat";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json", 
                "application/xml", 
                "text/xml", 
                "application/javascript", 
                "text/javascript"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (count != null) localVarQueryParams.Add("count", Configuration.ApiClient.ParameterToString(count)); // query parameter
            if (start != null) localVarQueryParams.Add("start", Configuration.ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) localVarQueryParams.Add("reverse", Configuration.ApiClient.ParameterToString(reverse)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChatGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Chat>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<Chat>) Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Chat>)));
            
        }

        /// <summary>
        /// Get connected users. Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ConnectedUsers</returns>
        public ConnectedUsers ChatGetConnected ()
        {
             ApiResponse<ConnectedUsers> localVarResponse = ChatGetConnectedWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Get connected users. Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of ConnectedUsers</returns>
        public ApiResponse< ConnectedUsers > ChatGetConnectedWithHttpInfo ()
        {

            var localVarPath = "/chat/connected";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json", 
                "application/xml", 
                "text/xml", 
                "application/javascript", 
                "text/javascript"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChatGetConnected", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ConnectedUsers>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ConnectedUsers) Configuration.ApiClient.Deserialize(localVarResponse, typeof(ConnectedUsers)));
            
        }

        /// <summary>
        /// Get connected users. Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ConnectedUsers</returns>
        public async System.Threading.Tasks.Task<ConnectedUsers> ChatGetConnectedAsync ()
        {
             ApiResponse<ConnectedUsers> localVarResponse = await ChatGetConnectedAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Get connected users. Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (ConnectedUsers)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ConnectedUsers>> ChatGetConnectedAsyncWithHttpInfo ()
        {

            var localVarPath = "/chat/connected";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json", 
                "application/xml", 
                "text/xml", 
                "application/javascript", 
                "text/javascript"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChatGetConnected", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ConnectedUsers>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ConnectedUsers) Configuration.ApiClient.Deserialize(localVarResponse, typeof(ConnectedUsers)));
            
        }

        /// <summary>
        /// Send a chat message. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>Chat</returns>
        public Chat ChatNew (string message)
        {
             ApiResponse<Chat> localVarResponse = ChatNewWithHttpInfo(message);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Send a chat message. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>ApiResponse of Chat</returns>
        public ApiResponse< Chat > ChatNewWithHttpInfo (string message)
        {
            // verify the required parameter 'message' is set
            if (message == null)
                throw new ApiException(400, "Missing required parameter 'message' when calling ChatApi->ChatNew");

            var localVarPath = "/chat";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json", 
                "application/xml", 
                "text/xml", 
                "application/javascript", 
                "text/javascript"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (message != null) localVarFormParams.Add("message", Configuration.ApiClient.ParameterToString(message)); // form parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChatNew", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Chat>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Chat) Configuration.ApiClient.Deserialize(localVarResponse, typeof(Chat)));
            
        }

        /// <summary>
        /// Send a chat message. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>Task of Chat</returns>
        public async System.Threading.Tasks.Task<Chat> ChatNewAsync (string message)
        {
             ApiResponse<Chat> localVarResponse = await ChatNewAsyncWithHttpInfo(message);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Send a chat message. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="message"></param>
        /// <returns>Task of ApiResponse (Chat)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Chat>> ChatNewAsyncWithHttpInfo (string message)
        {
            // verify the required parameter 'message' is set
            if (message == null)
                throw new ApiException(400, "Missing required parameter 'message' when calling ChatApi->ChatNew");

            var localVarPath = "/chat";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json", 
                "application/xml", 
                "text/xml", 
                "application/javascript", 
                "text/javascript"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (message != null) localVarFormParams.Add("message", Configuration.ApiClient.ParameterToString(message)); // form parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChatNew", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Chat>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Chat) Configuration.ApiClient.Deserialize(localVarResponse, typeof(Chat)));
            
        }

    }
}
