package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.HealthReferal;


public interface IReferalDAO {
	
	public HealthReferal fetchReferalById(String referalId) throws DataAccessException;

}
