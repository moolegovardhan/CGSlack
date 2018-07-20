package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountCategoryDao;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;
import com.cgs.pro94tek.healthcare.service.ICgsDiscountCategoryDataServce;


@Service("discountCategoryDataService")
public class CgsDiscountCategoryDataServiceImpl   implements ICgsDiscountCategoryDataServce{

	@Autowired
	ICgsDiscountCategoryDao        cgsDiscoutnCategoryDAO;
	@Override
	public void createDiscoutnCategory(CgsDiscountCategory dscCategoryObject)
			throws PMSException {
		// TODO Auto-generated method stub
		cgsDiscoutnCategoryDAO.createDiscountCategory(dscCategoryObject);
	}
	@Override
	public List<CgsDiscountCategoryModal> getdiscountCategory(
			CgsDiscountCategory disCategory) throws PMSException {
		// TODO Auto-generated method stub
		return cgsDiscoutnCategoryDAO.getDiscountCat(disCategory);
	}
	
	

}
