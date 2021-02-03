package com.ftc.moviesapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetail {
    
  private String imdbID;
  private String title;
  private String year;
  private String poster;
  private String plot;
  private String actors;
  private String genre;
  private String director;
  private List<Rating> ratings;

  public MovieDetail() {
  }

  public String getImdbID() {
      return imdbID;
  }

  @JsonProperty("imdbID")
  public void setImdbID(String imdbID) {
      this.imdbID = imdbID;
  }

  public String getTitle() {
      return title;
  }

  @JsonProperty("Title")
  public void setTitle(String title) {
      this.title = title;
  }

  public String getYear() {
      return year;
  }

  @JsonProperty("Year")
  public void setYear(String year) {
      this.year = year;
  }

  public String getPoster() {
      return poster;
  }

  @JsonProperty("Poster")
  public void setPoster(String poster) {
      this.poster = poster;
  }

  public String getPlot() {
      return plot;
  }

  @JsonProperty("Plot")
  public void setPlot(String plot) {
      this.plot = plot;
  }

  public String getActors() {
      return actors;
  }

  @JsonProperty("Actors")
  public void setActors(String actors) {
      this.actors = actors;
  }

  public String getGenre() {
      return genre;
  }

  @JsonProperty("Genre")
  public void setGenre(String genre) {
      this.genre = genre;
  }

  public String getDirector() {
      return director;
  }

  @JsonProperty("Director")
  public void setDirector(String director) {
      this.director = director;
  }

  public List<Rating> getRatings() {
      return ratings;
  }

  @JsonProperty("Ratings")
  public void setRatings(List<Rating> ratings) {
      this.ratings = ratings;
  }
}
