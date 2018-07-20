package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.SpecialOffer;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SpecialOfferModal;



@Component
public interface ISpecialOffersService {
	
	public SpecialOfferModal fetchSpecialOfferById(String officeId) throws PMSException;
	public boolean deleteSpecialOfferById(String officeId)throws PMSException;
	public void createOrUpdateSpecialOfferById(SpecialOffer  specialOffer)throws PMSException;
	
}
