package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Construction;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ConstructionModal;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;


@Component
public interface IConstructionDataManageService {

	
	
	public ConstructionModal fetchConstructionById(String constrId) throws PMSException;
	public boolean deleteConstructionById(String constrId)throws PMSException;
	public void createOrUpdateConstruction(Construction construEntity)throws PMSException;

}
