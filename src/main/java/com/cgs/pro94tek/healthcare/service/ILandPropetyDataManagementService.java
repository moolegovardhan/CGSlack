package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;




import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;


@Component
public interface ILandPropetyDataManagementService  {
	
	
	public LandPropertyModal fetchLandPropertyById(String propertyid) throws PMSException;
	public boolean deletelandPrortyById(String propertyid)throws PMSException;
	public void createOrUpdateLandProperty(LandProperty landPropertyEntity)throws PMSException;

}
