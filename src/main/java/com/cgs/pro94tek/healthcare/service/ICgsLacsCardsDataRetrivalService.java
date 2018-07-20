package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;

@Component
public interface ICgsLacsCardsDataRetrivalService {
	
	public List<CgsCards> getCgslaksCard(CgsLacs_CardsModal  cgsCardsModal)throws PMSException	;
	public void updateCgsLacsCards(Long id) throws PMSException;
	public boolean deleteCgsLacsCardsId(Long Id)throws PMSException;
	public void createCgsLacsCards(CgsCards cgsCardsEntity)throws PMSException;

}
