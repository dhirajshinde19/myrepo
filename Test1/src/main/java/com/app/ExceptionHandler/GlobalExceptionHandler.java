package com.app.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.customexceptions.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?>handleResourceNotFoundException(ResourceNotFoundException e){
		System.out.println("handle resource not found exception "+e);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Enter valid movie name!!!");
	}

}
