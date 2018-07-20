package com.cgs.pro94tek.healthcare.helper;


import java.text.ParseException;


import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;

public class CgsLacsCardHelper {
	public CgsCards  createCards(CgsLacs_CardsModal  cgsLacsModal)throws PMSException, ParseException ,NullPointerException
	{
		CgsCards cgsCard=new CgsCards();
		cgsCard.setCardName(cgsLacsModal.getCardName());
		cgsCard.setCardtype(cgsLacsModal.getCardtype());
		cgsCard.setDescription(cgsLacsModal.getDescription());
		cgsCard.setGroup(cgsLacsModal.getGroup());
		cgsCard.setPrice(cgsLacsModal.getPrice());
		cgsCard.setStatus("y");
		
	return cgsCard;
		
	}

}
