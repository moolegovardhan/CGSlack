package com.cgs.pro94tek.healthcare.dataaccess.manager;

import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface ISchoolDataAccessManager {
	
	 public School getSchoolByName(String schoolName) throws PMSException;
	   
	   public School getSchoolById(String schoolId) throws PMSException;
	   
	   public void createSchool(School school)throws PMSException;
	   
	   public void updateSchool(School school)throws PMSException;
	   
	   public void deleteSchool(School school)throws PMSException;

}
