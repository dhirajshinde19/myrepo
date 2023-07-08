package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customexception.ResourceNotFoundException;
import com.app.dto.CourseDTO;
import com.app.entites.Course;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private ModelMapper mapper;
	@Override
	public CourseDTO getCourseDtls(String coursename) {
		Course course = courseRepo.findByName(coursename).orElseThrow(()->new ResourceNotFoundException("Enter Valid course name!!!!"));
		CourseDTO cDto = mapper.map(course, CourseDTO.class);
		return cDto;
	}
	@Override
	public Course addNewCourse(Course transientCourse) {
		
		return courseRepo.save(transientCourse);
	}
	@Override
	public Course updateCourseDtls(Course detachedCourse) {
		
		return courseRepo.save(detachedCourse);
	}

}
