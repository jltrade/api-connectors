package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.OrderBook;
import io.swagger.model.Error;
import java.math.BigDecimal;
import io.swagger.model.OrderBookL2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/orderBook", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/orderBook", description = "the orderBook API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:39.823-05:00")
public class OrderBookApi {
  

  @ApiOperation(value = "Get current orderbook [deprecated, use /orderBook/L2].", notes = "", response = OrderBook.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<OrderBook>> orderBookGet(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", required = true) @RequestParam(value = "symbol", required = true) String symbol


,
    @ApiParam(value = "Orderbook depth.", defaultValue = "25") @RequestParam(value = "depth", required = false, defaultValue="25") BigDecimal depth


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<OrderBook>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get current orderbook in vertical format.", notes = "", response = OrderBookL2.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/L2", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<OrderBookL2>> orderBookGetL2(@ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", required = true) @RequestParam(value = "symbol", required = true) String symbol


,
    @ApiParam(value = "Orderbook depth per side. Send 0 for full depth.", defaultValue = "25") @RequestParam(value = "depth", required = false, defaultValue="25") BigDecimal depth


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<OrderBookL2>>(HttpStatus.OK);
  }

  
}
