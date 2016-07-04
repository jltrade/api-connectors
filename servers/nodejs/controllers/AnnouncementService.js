'use strict';

exports.announcement.get = function(args, res, next) {
  /**
   * parameters expected in the args:
   * columns (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "date" : "2016-07-04T23:25:34.456+0000",
  "link" : "aeiou",
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "title" : "aeiou",
  "content" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.announcement.getUrgent = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "date" : "2016-07-04T23:25:34.471+0000",
  "link" : "aeiou",
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "title" : "aeiou",
  "content" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
