package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.InwardData;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.InwardDataModal;
import com.cgs.pro94tek.healthcare.modal.InwardModal;
import com.cgs.pro94tek.healthcare.modal.SpecialOfferModal;
@Component
public interface InwardDataService {
	
	
	
	public InwardDataModal fetchInwardata(String porderid) throws PMSException;
	public void createOrUpdateInwardData(InwardData inwardDataEntity) throws PMSException;
}
