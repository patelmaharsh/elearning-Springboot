package com.Amdocs.elearning.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amdocs.elearning.models.UserCourse;

public interface UserCourseRepository extends JpaRepository<UserCourse, Integer>{

	List<UserCourse> findAllByUserId(int userId);

}
