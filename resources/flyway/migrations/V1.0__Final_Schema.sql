DROP TABLE IF EXISTS cast;
DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS rating;
DROP TABLE IF EXISTS actor;

CREATE TABLE actor (
  actor_id int unsigned NOT NULL AUTO_INCREMENT,
  actor_name varchar(45) NOT NULL, 
  PRIMARY KEY (actor_id)
);

CREATE TABLE rating (
  rating_id int unsigned NOT NULL AUTO_INCREMENT,
  movie_rating varchar(40) NOT NULL,
  rating_description varchar(256),
  PRIMARY KEY (rating_id)
);

CREATE TABLE movie (
  movie_id int unsigned NOT NULL AUTO_INCREMENT,
  movie_title varchar(90) NOT NULL,
  rating_id int unsigned NOT NULL,
  PRIMARY KEY (movie_id),
  FOREIGN KEY (rating_id) REFERENCES rating (rating_id)
);

CREATE TABLE cast (
  cast_id int unsigned NOT NULL AUTO_INCREMENT,
  actor_id int unsigned NOT NULL,
  movie_id int unsigned NOT NULL,
  PRIMARY KEY (cast_id),
  FOREIGN KEY (actor_id) REFERENCES actor (actor_id),
  FOREIGN KEY (movie_id) REFERENCES movie (movie_id) ON DELETE CASCADE
);

