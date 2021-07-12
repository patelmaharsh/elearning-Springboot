package com.Amdocs.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
