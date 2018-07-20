package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cgs.pro94tek.healthcare.bean.SpecialOffer;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISpecialOffereDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SpecialOfferHelper;
import com.cgs.pro94tek.healthcare.modal.SpecialOfferModal;
import com.cgs.pro94tek.healthcare.service.ISpecialOffersService;



@Service("specialOfferDataRetrivalServiceImpl")
public class SpecialOfferDataRetrivalServiceImpl  implements ISpecialOffersService {
	@Autowired
	private ISpecialOffereDAO   specialOffereDAO;

	@Override
	public SpecialOfferModal fetchSpecialOfferById(String officeId)
			throws PMSException {
		// TODO Auto-generated method stub
		
		SpecialOffer  specialOffer=specialOffereDAO.fetchSpecialOfferById(officeId);
		SpecialOfferHelper   specialOfferHelper= new SpecialOfferHelper();
		return specialOfferHelper.createSpecialModal(specialOffer);
	}

	@Override
	public boolean deleteSpecialOfferById(String officeId) throws PMSException {
		// TODO Auto-generated method stub
		return specialOffereDAO.deleteSpecialOfferById(officeId);
	}

	@Override
	public void createOrUpdateSpecialOfferById(SpecialOffer specialOffer)
			throws PMSException {
		// TODO Auto-generated method stub
		specialOffereDAO.createOrUpdateSpecialOfferById(specialOffer);
	}	
	

	
	}


