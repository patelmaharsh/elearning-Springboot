package com.Amdocs.elearning.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@Column(nullable = false)
	private int courseId;
	private String cName;
	private String cDesc;
	private int cFees;
	private String cResource;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public int getcFees() {
		return cFees;
	}
	public void setcFees(int cFees) {
		this.cFees = cFees;
	}
	public String getcResource() {
		return cResource;
	}
	public void setcResource(String cResource) {
		this.cResource = cResource;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", cName=" + cName + ", cDesc=" + cDesc + ", cFees=" + cFees
				+ ", cResource=" + cResource + "]";
	}
	
}