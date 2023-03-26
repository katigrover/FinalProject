package com.finalproject.marvel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.marvel.entity.Actor;
import com.finalproject.marvel.entity.Movie;
import com.finalproject.marvel.entity.Rating;



@Component
public class DefaultMovieDao implements MovieDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Movie> fetchMovies() { 
    
 // @formatter:off
    String sql = ""
        + "SELECT m.movie_title,r.movie_rating, a.actor_name "
        + "FROM movie m "
        + "JOIN rating r "
        + "on m.rating_id = r.rating_id "
        + "join cast c "
        + "on m.movie_id = c.movie_id "
        + "join actor a "
        + "on c.actor_id = a.actor_id ";
    // @formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Movie>() {
      @Override
      public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        // @formatter:off
        return Movie.builder()
            .movieTitle(rs.getString("movie_title"))
            .movieRating(rs.getString("movie_rating"))
            .actorName(rs.getString("actor_name"))
            .build();
        // @formatter:on
      }
    });
  }

  @Override
  public List<Rating> viewRating() {
    
 // @formatter:off
    String sql = ""
        + "SELECT * "
        + "FROM rating ";
    // @formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Rating>() {
      @Override
      public Rating mapRow(ResultSet rs, int rowNum) throws SQLException {
        // @formatter:off
        return Rating.builder()
            .ratingId(rs.getInt("rating_id"))
            .movieRating(rs.getString("movie_rating"))
            .ratingDescription(rs.getString("movie_description"))
            .build();
        // @formatter:on
      }
    });
  }

  
  @Override
  public boolean addActor(String actorName) {
    // @formatter:off
    String sql = ""
        + "INSERT INTO actor "
        + "(actor_name) "
        + "VALUES ('" + actorName + "')";
   // @formatter:on
    
     Optional.ofNullable(
        jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {
          public Boolean doInPreparedStatement(PreparedStatement ps)  
              throws SQLException, DataAccessException {  
        return ps.execute();
          }}));
   return true;
  }

  @Override
  public List<Actor> fetchActors() {
    
 // @formatter:off
    String sql = ""
        + "SELECT * "
        + "FROM actor ";
   // @formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Actor>() {
      @Override
      public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
        // @formatter:off
        return Actor.builder()
            .actorId(rs.getInt("actor_id"))
            .actorName(rs.getString("actor_name"))
            .build();
        // @formatter:on
      }
    });
  }

  
  @Override
  public boolean deleteActor(String actorId) {
    // @formatter:off
    String sql = ""
        + "DELETE FROM actor "
        + "WHERE actor_id = ('" + actorId + "')";
   // @formatter:on
    
    Optional.ofNullable(
        jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {
          public Boolean doInPreparedStatement(PreparedStatement ps)  
              throws SQLException, DataAccessException {  
        return ps.execute();
          }}));
   return true;
    
  }
  
}
