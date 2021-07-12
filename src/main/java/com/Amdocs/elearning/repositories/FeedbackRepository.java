package com.Amdocs.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
