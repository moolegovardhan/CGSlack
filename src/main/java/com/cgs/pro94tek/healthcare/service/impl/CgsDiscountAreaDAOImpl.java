package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountArea;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountAreaDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountAreaModal;
import com.cgs.pro94tek.healthcare.service.ICgsDiscountAreaDataService;

@Service("cgsDiscountAreaDataService")
public class CgsDiscountAreaDAOImpl  implements ICgsDiscountAreaDataService{

	@Autowired
	ICgsDiscountAreaDAO  discountAreaDAO;
	@Override
	public void createDiscoutArea(CgsDiscountArea areaEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		discountAreaDAO.createDiscountArea(areaEntity);
	}
	@Override
	public List<CgsDiscountAreaModal> getDiscountArea(CgsDiscountArea areaEnity)
			throws PMSException {
		// TODO Auto-generated method stub
		return discountAreaDAO.getDiscountModal(areaEnity);
	}

}
