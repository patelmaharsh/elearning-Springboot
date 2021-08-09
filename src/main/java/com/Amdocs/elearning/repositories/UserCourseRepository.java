package com.Amdocs.elearning.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Amdocs.elearning.models.Course;
import com.Amdocs.elearning.models.UserCourse;

public interface UserCourseRepository extends JpaRepository<UserCourse, Integer>{

	List<UserCourse> findAllByUserId(int userId);
	
	@Query("SELECT c from Course c where c.courseId not in (SELECT uc.courseId from UserCourse uc where uc.userId = ?1 )")
	List<Course> findAllNotByUserId(int userId);

}
