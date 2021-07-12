package com.Amdocs.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Amdocs.elearning.StaticConfig;
import com.Amdocs.elearning.models.Contact;
import com.Amdocs.elearning.repositories.ContactRepository;

@RestController
@CrossOrigin(origins = StaticConfig.crossOrigin)
public class ContactController {
	@Autowired
	ContactRepository contactRepo;
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		return contactRepo.findAll();
	}
	
	@PostMapping("/contacts")
	public void postContact(@RequestBody Contact c) {
		contactRepo.save(c);
	}
	@DeleteMapping("/contacts/{contactId}")
	public void deleteById(@PathVariable int contactId) {
		contactRepo.deleteById(contactId);
	}
}
