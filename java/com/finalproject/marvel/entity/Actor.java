package com.finalproject.marvel.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Actor {
  private int actorId;
  private String actorName;
}
