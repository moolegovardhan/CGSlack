package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsItemMeasurments;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsItemMeasurmentsDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsItemsMeasurmentsHelper;
import com.cgs.pro94tek.healthcare.modal.CgsItemMeasurmentsModal;
import com.cgs.pro94tek.healthcare.service.ICgsItemMeasurmentsDataService;

@Service("cgsitemMeasurmentData")
public class CgsItemMeasurmentsImpl  implements ICgsItemMeasurmentsDataService{
	
	@Autowired
	ICgsItemMeasurmentsDAO itemMeasurmentDAO ; 
	@Override
	public List<CgsItemMeasurmentsModal> fetchAllMesurments(
			CgsItemMeasurments cgsItems) throws PMSException {
		// TODO Auto-generated method stub
		List<CgsItemMeasurments> itemmz=itemMeasurmentDAO.fetchAllMesurments(cgsItems);
		CgsItemsMeasurmentsHelper   itemMezHelper=new CgsItemsMeasurmentsHelper();
		
		return itemMezHelper.cgsItemModal(itemmz);
	}

}
