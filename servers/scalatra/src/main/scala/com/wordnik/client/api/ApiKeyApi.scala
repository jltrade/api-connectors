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

package com.wordnik.client.api

import com.wordnik.client.model.ApiKey
import com.wordnik.client.model.Error
import com.wordnik.client.model.Inline_response_200

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ApiKeyApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ApiKeyApi"
  override protected val applicationName: Option[String] = Some("ApiKey")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val apiKey.disableOperation = (apiOperation[ApiKey]("apiKey.disable")
      summary "Disable an API Key."
      parameters(formParam[String]("apiKeyID").description(""))
  )

  post("/apiKey/disable",operation(apiKey.disableOperation)) {
    
    
          val apiKeyID = params.getAs[String]("apiKeyID")

    println("apiKeyID: " + apiKeyID)
  }

  

  val apiKey.enableOperation = (apiOperation[ApiKey]("apiKey.enable")
      summary "Enable an API Key."
      parameters(formParam[String]("apiKeyID").description(""))
  )

  post("/apiKey/enable",operation(apiKey.enableOperation)) {
    
    
          val apiKeyID = params.getAs[String]("apiKeyID")

    println("apiKeyID: " + apiKeyID)
  }

  

  val apiKey.getOperation = (apiOperation[List[ApiKey]]("apiKey.get")
      summary "Get your API Keys."
      parameters(queryParam[Boolean]("reverse").description("").optional.defaultValue(false))
  )

  get("/apiKey",operation(apiKey.getOperation)) {
    
    
                val reverse = params.getAs[Boolean]("reverse")

    println("reverse: " + reverse)
  }

  

  val apiKey.newOperation = (apiOperation[ApiKey]("apiKey.new")
      summary "Create a new API Key."
      parameters(formParam[String]("name").description("").optional,
        formParam[String]("cidr").description("").optional,
        formParam[String]("permissions").description("").optional,
        formParam[Boolean]("enabled").description("").optional.defaultValue(false),
        formParam[String]("token").description("").optional)
  )

  post("/apiKey",operation(apiKey.newOperation)) {
    
    
          val name = params.getAs[String]("name")

    println("name: " + name)
    
    
          val cidr = params.getAs[String]("cidr")

    println("cidr: " + cidr)
    
    
          val permissions = params.getAs[String]("permissions")

    println("permissions: " + permissions)
    
    
          val enabled = params.getAs[Boolean]("enabled")

    println("enabled: " + enabled)
    
    
          val token = params.getAs[String]("token")

    println("token: " + token)
  }

  

  val apiKey.removeOperation = (apiOperation[Inline_response_200]("apiKey.remove")
      summary "Remove an API Key."
      parameters(formParam[String]("apiKeyID").description(""))
  )

  delete("/apiKey",operation(apiKey.removeOperation)) {
    
    
          val apiKeyID = params.getAs[String]("apiKeyID")

    println("apiKeyID: " + apiKeyID)
  }

}