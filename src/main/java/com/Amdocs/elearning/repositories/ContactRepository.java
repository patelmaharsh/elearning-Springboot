package com.Amdocs.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
