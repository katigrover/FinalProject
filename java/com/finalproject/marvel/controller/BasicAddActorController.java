package com.finalproject.marvel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.marvel.entity.Actor;
import com.finalproject.marvel.service.MovieService;

@RestController

public class BasicAddActorController implements AddActorController {

  
  @Autowired
  private MovieService movieService;
  
  @Override
  public List<Actor> addActor(String actorName) {
    boolean added =  movieService.addActor(actorName);
   
    return movieService.fetchActors();
  }

  @Override
  public List<Actor> deleteActor(String actorId) {
    boolean deleted =  movieService.deleteActor(actorId);
    
    return movieService.fetchActors();
  }

}
