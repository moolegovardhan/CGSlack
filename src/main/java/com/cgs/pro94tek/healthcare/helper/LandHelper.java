package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

import com.cgs.pro94tek.healthcare.modal.LandModal;

public class LandHelper {
	
	
	public LandModal createilandModal(Land land)throws NullPointerException
	{
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	LandModal landModal = new LandModal();
	
	landModal.setId(land.getId());
	landModal.setBuy(land.getBuy());
	landModal.setLease(land.getLease());
	landModal.setLocation(land.getLocation());
	landModal.setRent(land.getRent());
	landModal.setProperty(land.getProperty());
	landModal.setSell(land.getSell());
		return landModal;
	}

	public Land  createland(LandModal  landModal) throws PMSException, ParseException ,NullPointerException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Land land = new Land();
		land.setId(landModal.getId());
		land.setBuy(landModal.getBuy());
		land.setLease(landModal.getLease());
		land.setLocation(landModal.getLocation());
		land.setProperty(landModal.getProperty());
		land.setRent(landModal.getRent());
		land.setSell(landModal.getSell());
		
		
		
		
		return land;
	}
	
	

}
