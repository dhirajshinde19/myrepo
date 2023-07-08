package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Category;
import com.app.entities.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
////@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	
	private String moviename;
	private Category category;
	private LocalDate releaseDate;
	private Double budget;
	
	public ApiResponse(Movie movieDetails) {
		super();
		this.moviename = moviename;
		this.category = category;
		this.releaseDate = releaseDate;
		this.budget = budget;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	
	
}
