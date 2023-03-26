//package com.finalproject.marvel.controller;
//
//import java.util.List;
//import org.springframework.http.HttpStatus;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import com.finalproject.marvel.entity.Actor;
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.info.Info;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.servers.Server;
//
//@Validated
//@RequestMapping("/marvel")
//@OpenAPIDefinition(info = @Info(title = "Marvel Movie List"),
//    servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
//
//public interface DeleteActorController {
//
//  //@formatter:off
//  @Operation(
//    summary = "Deletes an actor", 
//    description = "Returns an updated actor list",
//    responses = {
//        @ApiResponse(
//            responseCode = "201", 
//            description = "The updated actor list is returned", 
//            content = @Content(
//                mediaType = "application/json", 
//                schema = @Schema(implementation = Actor.class))), //change optional to class once made)
//        @ApiResponse(
//            responseCode = "400", 
//            description = "The updated actor list failed", 
//            content = @Content(mediaType = "application/json")),
//        @ApiResponse(
//            responseCode = "404", 
//            description = "A updated actor list failed to create", 
//            content = @Content(mediaType = "application/json")),
//        @ApiResponse(
//            responseCode = "500", 
//            description = "An unplanned error occurred.", 
//            content = @Content(mediaType = "application/json"))
//    },
//    parameters = {
//        @Parameter(
//            name = "movieService", 
//            required = true, 
//            description = "The order as JSON)")
////    }
////  )
//  
////  @PostMapping
////  @ResponseStatus(code = HttpStatus.OK)
////  List<Actor> deleteActor(String actorId);
//   
// //@formatter:on
//  
//}
