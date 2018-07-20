package com.cgs.pro94tek.healthcare.dataaccess.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISchoolDAO;
import com.cgs.pro94tek.healthcare.dataaccess.manager.ISchoolDataAccessManager;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
@Service("SchoolDataAccessManager")
public class SchoolDataAccessManagerImpl implements ISchoolDataAccessManager{

	@Autowired
	private ISchoolDAO schoolDAO;
	public School getSchoolByName(String schoolName) throws PMSException {

		try {
			return schoolDAO.getSchoolByName(schoolName);
		} catch (DataAccessException dae) 
		{
			throw new PMSException(1000, dae);
		}
	}
	@Override
	public School getSchoolById(String schoolId) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void createSchool(School school) throws PMSException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateSchool(School school) throws PMSException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteSchool(School school) throws PMSException {
		// TODO Auto-generated method stub
		
	}

/*	@Override
	public School getSchoolById(String schoolId) throws PMSException {
		try
		{
			return schoolDAO.getSchoolById(schoolId);
		} catch (DataAccessException dae) 
		{
			throw new PMSException(1000, dae);
		}
	}

	public void createSchool(School school) throws PMSException {
		try {
			schoolDAO.createSchool(school);
		} catch (DataAccessException dae) {
			throw new PMSException(1000, dae);
		}

	}


	public void updateSchool(School school) throws PMSException {
		try {
			schoolDAO.updateSchool(school);
		} catch (DataAccessException dae) {
			throw new PMSException(1000, dae);
		}
	}


	public void deleteSchool(School school) throws PMSException {
		try {
			schoolDAO.deleteSchool(school);
		} catch (DataAccessException dae) {
			throw new PMSException(1000, dae);
		}
*/
	}


