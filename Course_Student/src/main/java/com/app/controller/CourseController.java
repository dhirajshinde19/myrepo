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

import com.app.entites.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseSer;
	
	@GetMapping("/{coursename}")
	public ResponseEntity<?> getCourseDtls(@PathVariable String coursename){
		return ResponseEntity.status(HttpStatus.OK).body(courseSer.getCourseDtls(coursename));
	}
	
	@PostMapping
	public ResponseEntity<?> addNewCourse(@RequestBody Course transientCourse){
		return ResponseEntity.status(HttpStatus.OK).body(courseSer.addNewCourse(transientCourse));
	}
	
	@PutMapping
	public ResponseEntity<?> updateCourseDtls(@RequestBody Course detachedCourse){
		return ResponseEntity.status(HttpStatus.OK).body(courseSer.updateCourseDtls(detachedCourse));
	}
 
}
