=begin
#BitMEX API

#REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>

OpenAPI spec version: 1.2.0
Contact: support@bitmex.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end

require "uri"

module SwaggerClient
  class ExecutionApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Get all raw executions for your account.
    # This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.  You may also use the `filter` param to target your query. Specify an array as a filter value, such as `{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch. (default to 100)
    # @option opts [Float] :start Starting point for results. (default to 0)
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first. (default to false)
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<Execution>]
    def execution_get(opts = {})
      data, _status_code, _headers = execution_get_with_http_info(opts)
      return data
    end

    # Get all raw executions for your account.
    # This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at &#x60;/execution/tradeHistory&#x60;.  You may also use the &#x60;filter&#x60; param to target your query. Specify an array as a filter value, such as &#x60;{\&quot;execType\&quot;: [\&quot;Settlement\&quot;, \&quot;Trade\&quot;]}&#x60; to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<(Array<Execution>, Fixnum, Hash)>] Array<Execution> data, response status code and response headers
    def execution_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ExecutionApi.execution_get ..."
      end
      # resource path
      local_var_path = "/execution".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'symbol'] = opts[:'symbol'] if !opts[:'symbol'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'columns'] = opts[:'columns'] if !opts[:'columns'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'start'] = opts[:'start'] if !opts[:'start'].nil?
      query_params[:'reverse'] = opts[:'reverse'] if !opts[:'reverse'].nil?
      query_params[:'startTime'] = opts[:'start_time'] if !opts[:'start_time'].nil?
      query_params[:'endTime'] = opts[:'end_time'] if !opts[:'end_time'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Execution>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ExecutionApi#execution_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch. (default to 100)
    # @option opts [Float] :start Starting point for results. (default to 0)
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first. (default to false)
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<Execution>]
    def execution_get_trade_history(opts = {})
      data, _status_code, _headers = execution_get_trade_history_with_http_info(opts)
      return data
    end

    # Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<(Array<Execution>, Fixnum, Hash)>] Array<Execution> data, response status code and response headers
    def execution_get_trade_history_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ExecutionApi.execution_get_trade_history ..."
      end
      # resource path
      local_var_path = "/execution/tradeHistory".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'symbol'] = opts[:'symbol'] if !opts[:'symbol'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'columns'] = opts[:'columns'] if !opts[:'columns'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'start'] = opts[:'start'] if !opts[:'start'].nil?
      query_params[:'reverse'] = opts[:'reverse'] if !opts[:'reverse'].nil?
      query_params[:'startTime'] = opts[:'start_time'] if !opts[:'start_time'].nil?
      query_params[:'endTime'] = opts[:'end_time'] if !opts[:'end_time'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Execution>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ExecutionApi#execution_get_trade_history\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
