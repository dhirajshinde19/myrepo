package com.app.Service;

import com.app.entities.Movie;

public interface MovieService {

	Movie addMovieDetails(Movie transientMovie);

	Movie updateMovieDetails(Movie detachedMovie);

	Movie getMovieDetails(String moviename);

}
