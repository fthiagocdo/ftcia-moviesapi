package com.ftc.moviesapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

  private String imdbID;
  private String title;
  private String year;
  private String poster;
  
  public Movie() {
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
