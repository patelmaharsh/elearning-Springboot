package com.Amdocs.elearning.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Optional<Admin> findByEmail(String email);

}
