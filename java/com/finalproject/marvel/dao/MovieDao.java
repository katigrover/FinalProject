package com.finalproject.marvel.dao;

import java.util.List;
import com.finalproject.marvel.entity.Actor;
import com.finalproject.marvel.entity.Movie;
import com.finalproject.marvel.entity.Rating;

public interface MovieDao {

  List<Movie> fetchMovies();
  List<Rating> viewRating();
  boolean addActor(String actorName);
  List<Actor> fetchActors();
  boolean deleteActor(String actorId);
}
