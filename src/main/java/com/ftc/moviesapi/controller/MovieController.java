package com.ftc.moviesapi.controller;

import com.ftc.moviesapi.entity.MovieDetail;
import com.ftc.moviesapi.entity.Search;

import org.springframework.http.ResponseEntity;

public interface MovieController {

    ResponseEntity<Search> searchByName(String name);
    
    ResponseEntity<MovieDetail> searchById(String id);
}
