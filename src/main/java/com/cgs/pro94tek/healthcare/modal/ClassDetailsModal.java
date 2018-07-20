package com.cgs.pro94tek.healthcare.modal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ClassDetailsModal {
	
	private String sectionName;
	
	private String class_id;
	
	private String className;
	
	
	private String teacherDetails;
	private String clstotal;
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getTeacherDetails() {
		return teacherDetails;
	}
	public void setTeacherDetails(String teacherDetails) {
		this.teacherDetails = teacherDetails;
	}
	public String getClstotal() {
		return clstotal;
	}
	public void setClstotal(String clstotal) {
		this.clstotal = clstotal;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

}
