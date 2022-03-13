package com.simply.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.simply.entity.*;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/setup")
@OpenAPIDefinition(info = @Info(title = "fly rod setup"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server.")})

public interface FlySetupController {



	  // @formatter:off
	  @Operation(
	      summary = "Create a setup for fly fishing outfit",
	      description = "Returns the created setup",
	      responses = {
	          @ApiResponse(
	              responseCode = "201",
	              description = "A created Fly fishing setup is returned",
	              content = @Content(
	                  mediaType = "application/json", 
	                  schema = @Schema(implementation = Setup.class))),
	          @ApiResponse(
	              responseCode = "400", 
	              description = "The request parameters are invalid",  
	              content = @Content(mediaType = "application/json")),
	          @ApiResponse(
	              responseCode = "404", 
	              description = "A setup component was not found with the input criteria",  
	              content = @Content(mediaType = "application/json")),
	          @ApiResponse(
	              responseCode = "500", 
	              description = "An unplanned error occurred.",  
	              content = @Content(mediaType = "application/json"))
	      },
	      parameters = {
	          @Parameter(name = "setupRequest", 
	              required = true, 
	              description = "The setup as JSON")
	          }
	  )
	  @PostMapping
	  @ResponseStatus(code = HttpStatus.CREATED)
	  Setup createSetup(@Valid @RequestBody SetupRequest setupRequest);
	  //@formatter:on
	}
	
}
