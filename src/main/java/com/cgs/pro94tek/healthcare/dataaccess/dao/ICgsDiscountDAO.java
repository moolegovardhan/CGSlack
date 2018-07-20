package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CgsDiscounts;

public interface ICgsDiscountDAO {
	
	public void createDiscount( CgsDiscounts  discountsEntity)throws DataAccessException;
	

}
