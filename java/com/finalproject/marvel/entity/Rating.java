package com.finalproject.marvel.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Rating {
  private String ratingDescription;
  private String movieRating;
  private int ratingId;
}
