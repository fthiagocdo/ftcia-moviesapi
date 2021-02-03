package com.ftc.moviesapi.controller;

import com.ftc.moviesapi.entity.MovieDetail;
import com.ftc.moviesapi.entity.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    private static String ROOT_URI = "http://www.omdbapi.com/?apikey=6e4b42b5&";
    
    @GetMapping("/name/{name}")
    public ResponseEntity<Search> searchByName(@PathVariable("name") String name) {
        ResponseEntity<Search> response = restTemplate.getForEntity(ROOT_URI+"s="+name, Search.class);

        if (response.getBody() != null) {
            return new ResponseEntity<Search>(response.getBody(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Search>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<MovieDetail> searchById(@PathVariable("id") String id) {
        ResponseEntity<MovieDetail> response = restTemplate.getForEntity(ROOT_URI+"i="+id, MovieDetail.class);

        if (response.getBody() != null) {
            return new ResponseEntity<MovieDetail>(response.getBody(), HttpStatus.OK);
        } else {
            return new ResponseEntity<MovieDetail>(HttpStatus.NOT_FOUND);
        }
    }
}
