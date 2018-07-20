package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountArea;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountAreaModal;

@Component
public interface ICgsDiscountAreaDataService {
	
	public void createDiscoutArea(CgsDiscountArea  areaEntity)throws PMSException;
	public List<CgsDiscountAreaModal> getDiscountArea(CgsDiscountArea  areaEnity)throws PMSException;

}
