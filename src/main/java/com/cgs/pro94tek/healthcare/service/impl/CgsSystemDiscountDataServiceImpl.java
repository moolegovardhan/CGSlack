package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICGSSystemDiscountDAO;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;
import com.cgs.pro94tek.healthcare.service.ICGSSystemDiscountDataService;

@Service("cgsSystemDiscountDataService")
public class CgsSystemDiscountDataServiceImpl implements ICGSSystemDiscountDataService {
	
	@Autowired
	ICGSSystemDiscountDAO  systemDiscountDao;
	@Override
	public void createSystsemDiscount(CgsSystemDiscount discountObj)
			throws DataAccessException {
		// TODO Auto-generated method stub
		systemDiscountDao.createSystemDiscount(discountObj);
	}
	@Override
	public List<CgsSystemDiscountModal> getAlldiscoutn(
			CgsSystemDiscount discountEntity) throws DataAccessException {
		// TODO Auto-generated method stub
		return systemDiscountDao.getAllDiscount(discountEntity);
	}

}
