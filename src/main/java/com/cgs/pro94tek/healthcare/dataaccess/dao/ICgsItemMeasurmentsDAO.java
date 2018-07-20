package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CgsItemMeasurments;
import com.cgs.pro94tek.healthcare.modal.CgsItemMeasurmentsModal;

public interface ICgsItemMeasurmentsDAO {
	
	 public List<CgsItemMeasurments>  fetchAllMesurments(CgsItemMeasurments cgsItems)throws DataAccessException;
	 
}
