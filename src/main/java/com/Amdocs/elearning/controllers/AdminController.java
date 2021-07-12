package com.Amdocs.elearning.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Amdocs.elearning.StaticConfig;
import com.Amdocs.elearning.models.Admin;
import com.Amdocs.elearning.repositories.AdminRepository;

@RestController
@CrossOrigin(origins = StaticConfig.crossOrigin)
public class AdminController {
	@Autowired
	AdminRepository adminRepo;
	
	@GetMapping("/admin/{email}")
	public Optional<Admin> getAdminByEmail(@PathVariable String email){
		return adminRepo.findByEmail(email);
	}

}
