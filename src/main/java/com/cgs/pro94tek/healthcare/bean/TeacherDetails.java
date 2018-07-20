package com.cgs.pro94tek.healthcare.bean;

public class TeacherDetails {
private String className;	
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public String getSectionName() {
	return sectionName;
}
public void setSectionName(String sectionName) {
	this.sectionName = sectionName;
}
public String getCurrentTeacher() {
	return currentTeacher;
}
public void setCurrentTeacher(String currentTeacher) {
	this.currentTeacher = currentTeacher;
}
public String getWantedTeacher() {
	return wantedTeacher;
}
public void setWantedTeacher(String wantedTeacher) {
	this.wantedTeacher = wantedTeacher;
}
private String sectionName;
private String currentTeacher;
private String wantedTeacher;
	

}
