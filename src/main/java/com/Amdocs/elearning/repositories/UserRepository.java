package com.Amdocs.elearning.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.Other;

public interface UserRepository extends JpaRepository<Other, Integer>{

	Optional<Other> findByEmail(String email);
	
}
