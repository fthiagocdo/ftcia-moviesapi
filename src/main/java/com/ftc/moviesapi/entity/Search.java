package com.ftc.moviesapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Search {

    private List<Movie> search;

    public Search() { 
    }

    
    /** 
     * @return List<Movie>
     */
    @JsonProperty("Search")
    public List<Movie> getSearch() {
        return search;
    }

    
    /** 
     * @param search
     */
    public void setSearch(List<Movie> search) {
        this.search = search;
    }
    
}
