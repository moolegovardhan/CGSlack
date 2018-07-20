package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;

@Component
public interface ICgsDiscountCategoryDataServce {
	
	public void createDiscoutnCategory(CgsDiscountCategory    dscCategoryObject)throws PMSException;
	public List<CgsDiscountCategoryModal>   getdiscountCategory(CgsDiscountCategory  disCategory)throws PMSException;
}
