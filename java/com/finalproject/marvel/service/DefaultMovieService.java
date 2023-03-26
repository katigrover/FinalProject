package com.finalproject.marvel.service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.marvel.dao.MovieDao;
import com.finalproject.marvel.entity.Actor;
import com.finalproject.marvel.entity.Movie;
import com.finalproject.marvel.entity.Rating;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class DefaultMovieService implements MovieService {
  
  @Autowired
  private MovieDao movieDao;

  @Transactional(readOnly = true)
  @Override
  public List<Movie> fetchMovies() {
    log.info("The fetchMovies method was called.");
    
    List<Movie> movies = movieDao.fetchMovies();
    
    if(movies.isEmpty()) {
      String msg = String.format("No movies found.");
      
      throw new NoSuchElementException(msg);
    }
    
    return movies;
  }

  @Override
  public List<Rating> viewRating() {
    log.info("The viewRating method was called.");
    
    List<Rating> rating = movieDao.viewRating();
    
    if(rating.isEmpty()) {
      String msg = String.format("No rating found.");
      
      throw new NoSuchElementException(msg);
    }
    
    return rating;
  }

  @Override
  public boolean addActor(String actorName) {
    log.info("The addActor method was called.");
    
    boolean newActor = movieDao.addActor(actorName);
    
    if(!newActor) {
      String msg = String.format("Actor not added.");
      
      throw new NoSuchElementException(msg);
    }
    
    return newActor;
  }

  @Override
  public List<Actor> fetchActors() {
    log.info("The fetchActors method was called.");
    
    List<Actor> actors = movieDao.fetchActors();
    
    if(actors.isEmpty()) {
      String msg = String.format("No actors found.");
      
      throw new NoSuchElementException(msg);
    }
    
    return actors;
  }

  @Override
  public boolean deleteActor(String actorId) {
    log.info("The deleteActor method was called.");
    
    boolean removeActor = movieDao.deleteActor(actorId);
    
    if(!removeActor) {
      String msg = String.format("Actor was not deleted.");
      
      throw new NoSuchElementException(msg);
    }
    
    return removeActor;
  }

}
