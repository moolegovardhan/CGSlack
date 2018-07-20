package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.exeception.PMSException;

import com.cgs.pro94tek.healthcare.modal.SubcategorydemoModal;

@Component
public interface ISubcategoryDemoDataService {
	
	
	
	public List<SubcategorydemoModal>  fetchSubCatedemoAllByName(String catId)throws PMSException;
	

}
