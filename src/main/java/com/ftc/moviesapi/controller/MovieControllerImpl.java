package com.ftc.moviesapi.controller;

import java.util.ArrayList;
import java.util.List;

import com.ftc.moviesapi.entity.Movie;
import com.ftc.moviesapi.entity.MovieDetail;
import com.ftc.moviesapi.entity.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("movies")
public class MovieControllerImpl implements MovieController {

    @Autowired
    private RestTemplate restTemplate;

    private static String ROOT_URI = "http://www.omdbapi.com/?apikey=6e4b42b5&";
    
    
    /** 
     * @param name
     * @return ResponseEntity<List<Movie>>
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Movie>> searchByName(@PathVariable("name") String name) {
        ResponseEntity<Search> response = restTemplate.getForEntity(ROOT_URI+"s="+name, Search.class);

        if (response.getBody() != null && response.getBody().getSearch() != null) {
            return new ResponseEntity<List<Movie>>(response.getBody().getSearch(), HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Movie>>(new ArrayList<>(), HttpStatus.OK);
        }
    }

    
    /** 
     * @param id
     * @return ResponseEntity<MovieDetail>
     */
    @GetMapping("/id/{id}")
    public ResponseEntity<MovieDetail> searchById(@PathVariable("id") String id) {
        ResponseEntity<MovieDetail> response = restTemplate.getForEntity(ROOT_URI+"i="+id, MovieDetail.class);

        if (response.getBody() != null && response.getBody().getImdbID() != null) {
            return new ResponseEntity<MovieDetail>(response.getBody(), HttpStatus.OK);
        } else {
            return new ResponseEntity<MovieDetail>(HttpStatus.NOT_FOUND);
        }
    }
}
