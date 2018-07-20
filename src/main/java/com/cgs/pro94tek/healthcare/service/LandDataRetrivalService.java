package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;


import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.LandModal;


@Component
public interface LandDataRetrivalService {
	
	public LandModal fetchLandById(String landid) throws PMSException;
	public boolean deletelandById(String landid)throws PMSException;
	public void createOrUpdateLand(Land landEntity)throws PMSException;

}
