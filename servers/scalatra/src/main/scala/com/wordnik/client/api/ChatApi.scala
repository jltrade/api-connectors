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

import com.wordnik.client.model.Chat
import com.wordnik.client.model.Error
import java.math.BigDecimal
import com.wordnik.client.model.ConnectedUsers

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ChatApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ChatApi"
  override protected val applicationName: Option[String] = Some("Chat")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val chat.getOperation = (apiOperation[List[Chat]]("chat.get")
      summary "Get chat messages."
      parameters(queryParam[BigDecimal]("count").description("").optional.defaultValue(100),
        queryParam[BigDecimal]("start").description("").optional.defaultValue(0),
        queryParam[Boolean]("reverse").description("").optional.defaultValue(true))
  )

  get("/chat",operation(chat.getOperation)) {
    
    
                val count = params.getAs[BigDecimal]("count")

    println("count: " + count)
    
    
                val start = params.getAs[BigDecimal]("start")

    println("start: " + start)
    
    
                val reverse = params.getAs[Boolean]("reverse")

    println("reverse: " + reverse)
  }

  

  val chat.getConnectedOperation = (apiOperation[ConnectedUsers]("chat.getConnected")
      summary "Get connected users."
      parameters()
  )

  get("/chat/connected",operation(chat.getConnectedOperation)) {
  }

  

  val chat.newOperation = (apiOperation[Chat]("chat.new")
      summary "Send a chat message."
      parameters(formParam[String]("message").description(""))
  )

  post("/chat",operation(chat.newOperation)) {
    
    
          val message = params.getAs[String]("message")

    println("message: " + message)
  }

}