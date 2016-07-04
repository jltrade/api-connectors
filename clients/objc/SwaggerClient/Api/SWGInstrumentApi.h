#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGInstrument.h"
#import "SWGInstrumentInterval.h"
#import "SWGApi.h"

/**
* BitMEX API
* REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
*
* OpenAPI spec version: 1.2.0
* Contact: support@bitmex.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


@interface SWGInstrumentApi: NSObject <SWGApi>

extern NSString* kSWGInstrumentApiErrorDomain;
extern NSInteger kSWGInstrumentApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Get instruments.
/// This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.
///
/// @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. (optional)
/// @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. (optional)
/// @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
/// @param count Number of results to fetch. (optional) (default to 100)
/// @param start Starting point for results. (optional) (default to 0)
/// @param reverse If true, will sort results newest first. (optional) (default to false)
/// @param startTime Starting date filter for results. (optional)
/// @param endTime Ending date filter for results. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSNumber*) instrumentGetWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
    completionHandler: (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Get all active instruments and instruments that have expired in <24hrs.
/// 
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSNumber*) instrumentGetActiveWithCompletionHandler: 
    (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
/// 
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSNumber*) instrumentGetActiveAndIndicesWithCompletionHandler: 
    (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;


/// Return all active contract series and interval pairs.
/// This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:404 message:"Not Found"
///
/// @return SWGInstrumentInterval*
-(NSNumber*) instrumentGetActiveIntervalsWithCompletionHandler: 
    (void (^)(SWGInstrumentInterval* output, NSError* error)) handler;


/// Get all price indices.
/// 
///
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGInstrument>*
-(NSNumber*) instrumentGetIndicesWithCompletionHandler: 
    (void (^)(NSArray<SWGInstrument>* output, NSError* error)) handler;



@end
