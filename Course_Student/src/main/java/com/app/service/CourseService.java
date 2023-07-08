package com.app.service;

import com.app.dto.CourseDTO;
import com.app.entites.Course;

public interface CourseService {

	CourseDTO getCourseDtls(String coursename);

	Course addNewCourse(Course transientCourse);

	Course updateCourseDtls(Course detachedCourse);

}
