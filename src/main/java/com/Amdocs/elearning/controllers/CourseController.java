package com.Amdocs.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Amdocs.elearning.StaticConfig;
import com.Amdocs.elearning.models.Course;
import com.Amdocs.elearning.repositories.CourseRepository;

@RestController
@CrossOrigin(origins = StaticConfig.crossOrigin)
public class CourseController {
	@Autowired
	CourseRepository courseRepo;
	
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		return courseRepo.findAll();
	}
	@PostMapping("/courses")
	public void postCourse(@RequestBody Course c) {
		courseRepo.save(c);
	}
}
