package com.wordnik.client.api

import com.wordnik.client.model.Error
import com.wordnik.client.model.Inline_response_200_1

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class SchemaApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "SchemaApi"
  override protected val applicationName: Option[String] = Some("Schema")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val schema.getOperation = (apiOperation[Inline_response_200_1]("schema.get")
      summary "Get model schemata for data objects returned by this API."
      parameters(queryParam[String]("model").description("").optional)
  )

  get("/schema",operation(schema.getOperation)) {
    
    
    
        
      
      val model = params.getAs[String]("model")
            

    
    println("model: " + model)
  
  }

  

  val schema.websocketHelpOperation = (apiOperation[Inline_response_200_1]("schema.websocketHelp")
      summary "Returns help text & subject list for websocket usage."
      parameters()
  )

  get("/schema/websocketHelp",operation(schema.websocketHelpOperation)) {
    
  }

}