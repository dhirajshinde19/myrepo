package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.MovieRepository;
import com.app.customexceptions.ResourceNotFoundException;
import com.app.entities.Movie;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepo;
	
	@Override
	public Movie addMovieDetails(Movie transientMovie) {
		// TODO Auto-generated method stub
		return movieRepo.save(transientMovie);
	}

	@Override
	public Movie updateMovieDetails(Movie detachedMovie) {
	
		return movieRepo.save(detachedMovie);
	}

	@Override
	public Movie getMovieDetails(String moviename) {
		// TODO Auto-generated method stub
		return movieRepo.findByMovieName(moviename).orElseThrow(()->new ResourceNotFoundException("Movie dtls not found for given movie name!!!!!!!!!"));
	}

}
