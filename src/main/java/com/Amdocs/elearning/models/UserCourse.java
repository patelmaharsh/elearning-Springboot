package com.Amdocs.elearning.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserCourse {
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userCourseId;
	private int userId;
	private int courseId;
	private Date timestamp;
	private String cName;
	private int cFees;
	private String cDesc;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public int getcFees() {
		return cFees;
	}
	public void setcFees(int cFees) {
		this.cFees = cFees;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public int getUserCourseId() {
		return userCourseId;
	}
	public void setUserCourseId(int userCourseId) {
		this.userCourseId = userCourseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "UserCourse [userCourseId=" + userCourseId + ", userId=" + userId + ", courseId=" + courseId
				+ ", timestamp=" + timestamp + ", cName=" + cName + ", cFees=" + cFees + ", cDesc=" + cDesc + "]";
	}
	
	
	
}
