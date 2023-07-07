package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.MovieService;
import com.app.entities.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService movservice;
	public MovieController() {
		System.out.println("In ctor of "+getClass());
	}
	
	@PostMapping
	public ResponseEntity<?> saveMovieDetails(@RequestBody Movie transientMovie){
		System.out.println("in save of "+transientMovie);
		return new ResponseEntity<>(movservice.addMovieDetails(transientMovie),HttpStatus.CREATED);
	}
	
	@PutMapping
	public Movie updateMovieDetails(@RequestBody Movie detachedMovie) {
		System.out.println("in update emp "+detachedMovie);
		return movservice.updateMovieDetails(detachedMovie);
	}
	
	@GetMapping("/{moviename}")
	public Movie getMovieDetails(@PathVariable String moviename) {
		System.out.println("in get movie dtls "+moviename);
		return movservice.getMovieDetails(moviename);
	}

}
