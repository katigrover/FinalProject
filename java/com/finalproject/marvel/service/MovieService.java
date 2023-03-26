package com.finalproject.marvel.service;

import java.util.List;
import com.finalproject.marvel.entity.Actor;
import com.finalproject.marvel.entity.Movie;
import com.finalproject.marvel.entity.Rating;

public interface MovieService {
  
  List<Movie> fetchMovies();
  List<Rating> viewRating();
  boolean addActor(String actorName);
  List<Actor> fetchActors();
  boolean deleteActor(String actorId);
  
}
