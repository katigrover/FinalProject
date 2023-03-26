package com.finalproject.marvel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.marvel.entity.Movie;
import com.finalproject.marvel.service.MovieService;

@RestController

public class BasicMovieController implements MovieController {

  @Autowired
  private MovieService movieService;
  
  @Override
  public List<Movie> fetchMovies() {
    return movieService.fetchMovies();
  }
     
}
