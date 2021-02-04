package com.ftc.moviesapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

  private String imdbID;
  private String title;
  private String year;
  private String poster;
  
  public Movie() {
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
  @Override
  public String toString() {
    return "Movie{" +
        "ImdbID='" + imdbID + '\'' +
        "Title='" + title + '\'' +
        "Year='" + year + '\'' +
        "Poster='" + poster + '\'' +
        '}';
  }
}
