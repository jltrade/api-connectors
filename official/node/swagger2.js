'use strict';
var SwaggerClient = require("swagger-client");
require('debug-trace')({always: true, right: true});
var _ = require('lodash');
var BitMEXAPIKeyAuthorization = require('./lib/BitMEXAPIKeyAuthorization');

var swagger = new SwaggerClient({
  url: 'https://testnet.bitmex.com/api/explorer/swagger.json',
  success: function() {
    if(swagger.ready === true) {
      isReady(swagger.apis);
    }
  }
});

// This is only needed if you're authorizing, comment it out otherwise.
swagger.clientAuthorizations.add("Cc7w28YYzLsxGOU5qJjtchEB", new BitMEXAPIKeyAuthorization('DSk4q3zgRVpXXXMpHK-ckipJ', 'CMxkNhYunN-er5eXJphrmtmRHlmlDIzit9Am0wSLgov4J19L'));

function isReady(client) {
  // Inspect the client to view our API methods
  // All methods accept a data callback.

  //console.log("This script will get the highest trade of the last 40 from XBT24H.")


  swagger.getAccount(function(wallet){
    // console.log('balance'+wallet.marginBalance)
  })

}

function inspect(client) {
  //console.log("Inspecting BitMEX API...");
  Object.keys(client).forEach(function(model) {
    if (!client[model].operations) return;
    //console.log("Available methods for %s: %s", model, Object.keys(client[model].operations).join(', '));
  });
  //console.log("------------------------\n");
}

swagger.getAccount= function(cb){
  var client = swagger.apis
  client.User.User_getMargin(function(response){
    //var wallet = JSON.parse(response);
    // Print the max price traded in the last `count` trades.
    //console.log('\nMax Trade:\n----\n', JSON.stringify(_.max(trades, 'price'), undefined, 2));
    //console.log('test'+wallet)
    cb(response)
  }, function(response) {
    console.log('error', response);
  })

}

exports.swagger = swagger
