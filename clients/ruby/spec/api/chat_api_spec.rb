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

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ChatApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ChatApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ChatApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ChatApi' do
    it 'should create an instact of ChatApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ChatApi)
    end
  end

  # unit tests for chat_get
  # Get chat messages.
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [Float] :count Number of results to fetch.
  # @option opts [Float] :start Starting point for results.
  # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
  # @return [Array<Chat>]
  describe 'chat_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for chat_get_connected
  # Get connected users.
  # Returns an array with browser users in the first position and API users (bots) in the second position.
  # @param [Hash] opts the optional parameters
  # @return [ConnectedUsers]
  describe 'chat_get_connected test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for chat_new
  # Send a chat message.
  # 
  # @param message 
  # @param [Hash] opts the optional parameters
  # @return [Chat]
  describe 'chat_new test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
