package com.cgs.pro94tek.healthcare.service;


import org.springframework.stereotype.Component;


import com.cgs.pro94tek.healthcare.bean.CgsHomeService;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

import com.cgs.pro94tek.healthcare.modal.CgsHomeServiceModal;

@Component
public interface ICgsHomeServicesDataRetrivalServices {
	
	public void createCgsHomeServicesRecords(CgsHomeService cgsHomeEntity)throws PMSException;
	public CgsHomeServiceModal getFileById(String fileId)throws PMSException;
}
