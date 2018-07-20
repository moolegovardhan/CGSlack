package com.cgs.pro94tek.healthcare.service.impl;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsDiscounts;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountDAO;
import com.cgs.pro94tek.healthcare.service.ICgsDiscountDataService;

@Service("IcgsDiscountService")
public class CgsDiscountDataServiceImpl implements ICgsDiscountDataService {
	@Autowired
	ICgsDiscountDAO  cgsDiscountDAO;
	@Override
	public void createDiscount(CgsDiscounts disuontEntity) throws DataException {
		// TODO Auto-generated method stub
		cgsDiscountDAO.createDiscount(disuontEntity);
	}

}
