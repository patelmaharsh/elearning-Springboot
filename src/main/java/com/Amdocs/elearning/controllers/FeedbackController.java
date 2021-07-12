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
import com.Amdocs.elearning.models.Feedback;
import com.Amdocs.elearning.repositories.FeedbackRepository;

@RestController
@CrossOrigin(origins = StaticConfig.crossOrigin)
public class FeedbackController {
	@Autowired
	FeedbackRepository feedbackRepo;
	
	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks(){
		return feedbackRepo.findAll();
	}
	
	@PostMapping("feedbacks")
	public void postFeedback(@RequestBody Feedback f) {
		feedbackRepo.save(f);
	}
	
	@DeleteMapping("/feedbacks/{fId}")
	public void deleteFeedbackById(@PathVariable int fId) {
		feedbackRepo.deleteById(fId);
	}
}
