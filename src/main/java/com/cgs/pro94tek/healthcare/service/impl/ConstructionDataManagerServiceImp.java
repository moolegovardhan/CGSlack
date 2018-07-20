package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Construction;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IConstructioDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ConstructionHelper;
import com.cgs.pro94tek.healthcare.modal.ConstructionModal;
import com.cgs.pro94tek.healthcare.service.IConstructionDataManageService;


@Service("construService")
public class ConstructionDataManagerServiceImp  implements IConstructionDataManageService{

	@Autowired
	IConstructioDAO  constructDAO;

	@Override
	public ConstructionModal fetchConstructionById(String constrId)
			throws PMSException {
		Construction constraction=constructDAO.fetchConstructionById(constrId);
		ConstructionHelper  constructionHelper=new ConstructionHelper();
		// TODO Auto-generated method stub
		return constructionHelper.createConstructionModal(constraction);
	}

	@Override
	public boolean deleteConstructionById(String constrId) throws PMSException {
		// TODO Auto-generated method stub
		
		return constructDAO.deleteConstructionById(constrId);
	}

	@Override
	public void createOrUpdateConstruction(Construction construEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		constructDAO.createOrUpdateConstruction(construEntity);
	}
	
	
}
