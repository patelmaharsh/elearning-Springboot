package com.Amdocs.elearning.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);
	
}
