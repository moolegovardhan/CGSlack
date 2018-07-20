package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.LandModal;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;

public class LandPropetyHelper {
	
	
	public LandPropertyModal  createLandpropertyId(LandProperty LandProperty )throws NullPointerException

	
	{	DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		LandPropertyModal landpro=new LandPropertyModal();
		landpro.setId(LandProperty.getId());
		landpro.setAgricultural(LandProperty.getAgricultural());
		landpro.setAllCommercial(LandProperty.getAllCommercial());
		landpro.setAllrdential(LandProperty.getAllrdential());
		landpro.setDisptusitestatus(LandProperty.getDisptusitestatus());
		landpro.setIndustrees(LandProperty.getIndustrees());
		return landpro;
	}
	
	
	public LandProperty  createlandPropety(LandPropertyModal  landPropertyModal) throws PMSException, ParseException ,NullPointerException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		LandProperty   landProperty=new LandProperty();
		landProperty.setId(landPropertyModal.getId());
		landProperty.setAgricultural(landPropertyModal.getAgricultural());
		landProperty.setAllCommercial(landPropertyModal.getAllCommercial());
		landProperty.setDisptusitestatus(landPropertyModal.getDisptusitestatus());
		landProperty.setIndustrees(landPropertyModal.getIndustrees());
		return landProperty;
	
		}
}
