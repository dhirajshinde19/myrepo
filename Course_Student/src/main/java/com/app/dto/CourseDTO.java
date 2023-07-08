package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.app.entites.Category;

import lombok.Data;

@Data
public class CourseDTO {
	@NotBlank(message = "course name cannot be blank")
	private String name;
	private Category category;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fee;
}
