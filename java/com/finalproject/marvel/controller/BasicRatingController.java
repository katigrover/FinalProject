package com.finalproject.marvel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.finalproject.marvel.entity.Rating;
import com.finalproject.marvel.service.MovieService;

public class BasicRatingController implements RatingController {

  @Autowired
  private MovieService movieService;
  
  @Override
  public List<Rating> viewRating() {
    return movieService.viewRating();
  }

}
