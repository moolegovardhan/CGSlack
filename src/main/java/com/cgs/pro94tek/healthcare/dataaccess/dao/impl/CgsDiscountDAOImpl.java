package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CgsDiscounts;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;

@Repository("cgsDiscountDAO")
public class CgsDiscountDAOImpl extends CustomHibernateDaoSupport implements ICgsDiscountDAO{

	
	@Transactional
	public void createDiscount(CgsDiscounts discountsEntity)
			throws DataAccessException {
		System.out.println("hellow discount.........:"+discountsEntity);
		// TODO Auto-generated method stub
		
		getSession().save(discountsEntity);
		
	}

}
