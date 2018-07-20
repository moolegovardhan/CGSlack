package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsItemMeasurments;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsItemMeasurmentsModal;
@Component
public interface ICgsItemMeasurmentsDataService {
	
	 public List<CgsItemMeasurmentsModal>  fetchAllMesurments(CgsItemMeasurments cgsItems)throws PMSException;
	
}
