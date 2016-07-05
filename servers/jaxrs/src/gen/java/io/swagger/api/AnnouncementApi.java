package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AnnouncementApiService;
import io.swagger.api.factories.AnnouncementApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Announcement;
import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/announcement")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the announcement API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class AnnouncementApi  {
   private final AnnouncementApiService delegate = AnnouncementApiServiceFactory.getAnnouncementApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get site announcements.", notes = "", response = Announcement.class, responseContainer = "List", tags={ "Announcement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Announcement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Announcement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Announcement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Announcement.class, responseContainer = "List") })
    public Response announcementGet(@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.") @QueryParam("columns") String columns,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.announcementGet(columns,securityContext);
    }
    @GET
    @Path("/urgent")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get urgent (banner) announcements.", notes = "", response = Announcement.class, responseContainer = "List", tags={ "Announcement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Announcement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Announcement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Announcement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Announcement.class, responseContainer = "List") })
    public Response announcementGetUrgent(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.announcementGetUrgent(securityContext);
    }
}
