package com.finalproject.marvel.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Cast {
  private int actorId;
  private int castId;
  private int movieId;
}
