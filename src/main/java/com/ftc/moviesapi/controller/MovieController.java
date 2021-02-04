package com.ftc.moviesapi.controller;

import java.util.List;

import com.ftc.moviesapi.entity.Movie;
import com.ftc.moviesapi.entity.MovieDetail;

import org.springframework.http.ResponseEntity;

public interface MovieController {

    ResponseEntity<List<Movie>> searchByName(String name);
    
    ResponseEntity<MovieDetail> searchById(String id);
}
