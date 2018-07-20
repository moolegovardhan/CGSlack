package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.SpecialOffer;

public interface ISpecialOffereDAO {

	
	
	public SpecialOffer fetchSpecialOfferById(String officeId)throws DataAccessException;
	public boolean deleteSpecialOfferById(String officeId)throws DataAccessException;
	public void createOrUpdateSpecialOfferById(SpecialOffer  specialOffer) throws DataAccessException;
}
