package com.ftc.moviesapi.controller;

import com.ftc.moviesapi.entity.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    private static String ROOT_URI = "http://www.omdbapi.com/?s=man&apikey=6e4b42b5";
    
    @GetMapping("/all")
    public ResponseEntity<Search> getAll() {
        ResponseEntity<Search> response = restTemplate.getForEntity(ROOT_URI, Search.class);

        if (response.getBody() != null) {
            return new ResponseEntity<Search>(response.getBody(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Search>(HttpStatus.NOT_FOUND);
        }
    }
}