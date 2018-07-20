package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.InwardData;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IInwardDataDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.InwardDataHelper;
import com.cgs.pro94tek.healthcare.modal.InwardDataModal;
import com.cgs.pro94tek.healthcare.service.InwardDataService;



@Service("inwardDataService")
public class InwardDataServiceImpl  implements InwardDataService {
	@Autowired
	IInwardDataDAO   inwardDataDAO;

	@Override
	public InwardDataModal fetchInwardata(String porderid) throws PMSException {
		// TODO Auto-generated method stub
		InwardData inwardData=inwardDataDAO.fetchInwardBypId(porderid);
		InwardDataHelper	inhelper=new 	InwardDataHelper();
		return inhelper.createinwardDataModal(inwardData) ;
	}

	@Override
	public void createOrUpdateInwardData(InwardData inwardDataEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		inwardDataDAO.createOrUpdateInwardData(inwardDataEntity);
	}
	
	
	

}
