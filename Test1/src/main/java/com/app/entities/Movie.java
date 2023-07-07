package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movies")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Movie extends BaseEntity{
	@NotBlank
	@Column(name = "movie_name",length = 50,nullable = false)
	private String movieName;
	@Future
	@Column(name="release_date",nullable = false)
	private LocalDate releaseDate;
	@Column(nullable = false)
	private Double budget;
	@Column(nullable = false)
	private String director;
	@Enumerated(EnumType.STRING)
	@Column(length = 20,nullable = false)
	private Category category;
}
