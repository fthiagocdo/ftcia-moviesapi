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

  
  /** 
   * @return String
   */
  public String getImdbID() {
      return imdbID;
  }

  
  /** 
   * @param imdbID
   */
  @JsonProperty("imdbID")
  public void setImdbID(String imdbID) {
      this.imdbID = imdbID;
  }

  
  /** 
   * @return String
   */
  public String getTitle() {
      return title;
  }

  
  /** 
   * @param title
   */
  @JsonProperty("Title")
  public void setTitle(String title) {
      this.title = title;
  }

  
  /** 
   * @return String
   */
  public String getYear() {
      return year;
  }

  
  /** 
   * @param year
   */
  @JsonProperty("Year")
  public void setYear(String year) {
      this.year = year;
  }

  
  /** 
   * @return String
   */
  public String getPoster() {
      return poster;
  }

  
  /** 
   * @param poster
   */
  @JsonProperty("Poster")
  public void setPoster(String poster) {
      this.poster = poster;
  }

  
  /** 
   * @return String
   */
  public String getPlot() {
      return plot;
  }

  
  /** 
   * @param plot
   */
  @JsonProperty("Plot")
  public void setPlot(String plot) {
      this.plot = plot;
  }

  
  /** 
   * @return String
   */
  public String getActors() {
      return actors;
  }

  
  /** 
   * @param actors
   */
  @JsonProperty("Actors")
  public void setActors(String actors) {
      this.actors = actors;
  }

  
  /** 
   * @return String
   */
  public String getGenre() {
      return genre;
  }

  
  /** 
   * @param genre
   */
  @JsonProperty("Genre")
  public void setGenre(String genre) {
      this.genre = genre;
  }

  
  /** 
   * @return String
   */
  public String getDirector() {
      return director;
  }

  
  /** 
   * @param director
   */
  @JsonProperty("Director")
  public void setDirector(String director) {
      this.director = director;
  }

  
  /** 
   * @return List<Rating>
   */
  public List<Rating> getRatings() {
      return ratings;
  }

  
  /** 
   * @param ratings
   */
  @JsonProperty("Ratings")
  public void setRatings(List<Rating> ratings) {
      this.ratings = ratings;
  }
}
