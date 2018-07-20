package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsHomeService;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsHomeServiceDao;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsHomeServicesHelper;
import com.cgs.pro94tek.healthcare.modal.CgsHomeServiceModal;
import com.cgs.pro94tek.healthcare.service.ICgsHomeServicesDataRetrivalServices;

@Service("CgsHomeServices")
public class CgsHomeServiceDataRetrivalServiceImpl implements ICgsHomeServicesDataRetrivalServices {
	@Autowired
	ICgsHomeServiceDao homeDAO;
	

	@Override
	public void createCgsHomeServicesRecords(CgsHomeService cgsHomeEntity)
			throws PMSException {
		
		homeDAO.createCGSHome(cgsHomeEntity);
	}


	@Override
	public CgsHomeServiceModal getFileById(String fileId) throws PMSException {
		// TODO Auto-generated method stub
		CgsHomeService   cgsHomeService=homeDAO.fetchByfileNO(fileId);
		CgsHomeServicesHelper	 cgsHomeHelper=new 	CgsHomeServicesHelper();
		return cgsHomeHelper.fileDownlaodById(cgsHomeService);
	}
	

}
