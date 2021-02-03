package com.ftc.moviesapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

  private String title;
  private int year;
  
  public Movie() {
  }

  public String getTitle() {
      return title;
  }

  @JsonProperty("Title")
  public void setTitle(String title) {
      this.title = title;
  }

  public int getYear() {
    return year;
  }

  @JsonProperty("Year")
  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "Title='" + title + '\'' +
        "Year='" + year + '\'' +
        '}';
  }
}
