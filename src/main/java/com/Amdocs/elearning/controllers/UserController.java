package com.Amdocs.elearning.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Amdocs.elearning.StaticConfig;
import com.Amdocs.elearning.models.Other;
import com.Amdocs.elearning.repositories.UserRepository;

@RestController
@CrossOrigin(origins = StaticConfig.crossOrigin)
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/users")
	public List<Other> getAllUser(){
		return userRepo.findAll();
	}
	@GetMapping("/users/{email}")
	public Optional<Other> getUserByEmail(@PathVariable String email){
		return userRepo.findByEmail(email);
	}
	@PostMapping("/users")
	public void postUser(@RequestBody Other u) {
		userRepo.save(u);
	}
	@DeleteMapping("/users/id/{userId}")
	public void deleteById(@PathVariable int userId) {
		userRepo.deleteById(userId);
	}
}
