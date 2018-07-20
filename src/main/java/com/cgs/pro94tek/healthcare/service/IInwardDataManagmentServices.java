package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.InwardModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;




@Component
public interface IInwardDataManagmentServices {
	
	
	public void createOrUpdateInward(Inward inward)throws PMSException;
	public InwardModal fetchInwardBypId(String pId) throws PMSException;
	

}
