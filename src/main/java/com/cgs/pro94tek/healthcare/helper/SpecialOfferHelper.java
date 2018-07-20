package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import com.cgs.pro94tek.healthcare.bean.SpecialOffer;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SpecialOfferModal;

public class SpecialOfferHelper {
	
	
	public SpecialOfferModal createSpecialModal(SpecialOffer specialOffer){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		SpecialOfferModal   specialOfferModal = new SpecialOfferModal();
		specialOfferModal.setOfficeid(specialOffer.getOfficeid());
		specialOfferModal.setOffername(specialOffer.getOffername());
		specialOfferModal.setId(specialOffer.getId());
		specialOfferModal.setCreatedby(specialOffer.getCreatedby());
		specialOfferModal.setOfferfromdate(specialOffer.getOfferfromdate());
		specialOfferModal.setStatus(specialOffer.getStatus());
		specialOfferModal.setOfferprice(specialOffer.getOfferprice());
		
		return specialOfferModal;
	}
	
	
	public SpecialOffer createSpecialoffer(SpecialOfferModal    specialOfferModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		SpecialOffer    specialOffer = new SpecialOffer();
		specialOffer.setOfficeid(specialOfferModal.getOfficeid());
		specialOffer.setOffername(specialOfferModal.getOffername());
		specialOffer.setId(specialOfferModal.getId());
		specialOffer.setCreatedby(specialOfferModal.getCreatedby());
		specialOffer.setCreateddate(specialOfferModal.getCreateddate());
		specialOffer.setOfferprice(specialOfferModal.getOfferprice());
		specialOffer.setStatus(specialOfferModal.getStatus());
		return specialOffer;
	}

	

}
