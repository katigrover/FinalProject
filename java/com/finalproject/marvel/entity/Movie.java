package com.finalproject.marvel.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Movie {
  private String movieTitle;
  private String movieRating;
  private String actorName;
}
