package com.cgs.pro94tek.healthcare.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsLacsCardsDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;
import com.cgs.pro94tek.healthcare.service.ICgsLacsCardsDataRetrivalService;

@Service("cgsLacsCardDataRetrivalService")
public class CgsCardsDataServiceImple implements ICgsLacsCardsDataRetrivalService {

	
	@Autowired
	ICgsLacsCardsDAO  cgsCardDao;
	
	
	@Override
	public void updateCgsLacsCards(Long id) throws PMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteCgsLacsCardsId(Long Id) throws PMSException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createCgsLacsCards(CgsCards cgsCardsEntity)
			throws PMSException {
		System.out.println("hellow...................:");
		cgsCardDao.createCgsLacsCards(cgsCardsEntity);
	}

	

	@Override
	public List<CgsCards> getCgslaksCard(CgsLacs_CardsModal cgsCardsModal)
			throws PMSException {
		// TODO Auto-generated method stub
		return cgsCardDao.getCgslaksCard(cgsCardsModal);
	}

}

