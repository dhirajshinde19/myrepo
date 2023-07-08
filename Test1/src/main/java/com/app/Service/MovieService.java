package com.app.Service;

import com.app.dto.ApiResponse;
import com.app.entities.Movie;

public interface MovieService {

	Movie addMovieDetails(Movie transientMovie);

	Movie updateMovieDetails(Movie detachedMovie);

	ApiResponse getMovieDetails(String moviename);

}
