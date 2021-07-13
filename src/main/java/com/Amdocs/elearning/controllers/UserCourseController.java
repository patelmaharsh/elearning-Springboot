package com.Amdocs.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Amdocs.elearning.StaticConfig;
import com.Amdocs.elearning.models.UserCourse;
import com.Amdocs.elearning.repositories.UserCourseRepository;

@RestController
@CrossOrigin(origins = StaticConfig.crossOrigin)
public class UserCourseController {
	@Autowired
	UserCourseRepository userCourseRepo;
	
	@GetMapping("/usercourse/user/{userId}")
	public List<UserCourse> getUserCourseByUserId(@PathVariable int userId){
		return userCourseRepo.findAllByUserId(userId);
	}
	
	@PostMapping("/usercourse")
	public void postUserCourse(@RequestBody UserCourse uc) {
		userCourseRepo.save(uc);
	}
}
