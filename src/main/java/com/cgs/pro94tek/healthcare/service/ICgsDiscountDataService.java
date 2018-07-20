package com.cgs.pro94tek.healthcare.service;

import org.hibernate.exception.DataException;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsDiscounts;
@Component
public interface ICgsDiscountDataService {
	
	public void createDiscount(CgsDiscounts  disuontEntity)throws DataException;

}
