//package com.finalproject.marvel.controller;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//import com.finalproject.marvel.entity.Actor;
//import com.finalproject.marvel.service.MovieService;
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@Slf4j
//public class BasicDeleteActorController implements DeleteActorController {
//
//  @Autowired
//  private MovieService movieService;
//  
//  @Override
//  public List<Actor> deleteActor(String actorId) {
//    boolean deleted =  movieService.deleteActor(actorId);
//    
//    return movieService.fetchActors();
//  }
//  
//}
