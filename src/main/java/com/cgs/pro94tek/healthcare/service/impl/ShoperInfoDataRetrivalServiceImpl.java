package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.ShoperInfo;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IShoperInfoDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentHelper;
import com.cgs.pro94tek.healthcare.helper.ShoperInfoHellper;
import com.cgs.pro94tek.healthcare.modal.ShoperInfoModal;
import com.cgs.pro94tek.healthcare.service.IShoperDataManagerService;

@Service("shoperInfoService")
public class ShoperInfoDataRetrivalServiceImpl implements IShoperDataManagerService {

	@Autowired
	IShoperInfoDAO  shoperDAO;
	
	@Override
	public void createOrUpdateShoperRecords(ShoperInfo shoperInfoEnity)throws PMSException {
	ShoperInfo object = shoperDAO.createOrUpdateShoperRecords(shoperInfoEnity);
	System.out.println("id of shoperInfoEnity *****  "+object.getId());
	String shoperNo = "shoper"+object.getId();
		object.setShoperId(shoperNo);
		shoperDAO.createOrUpdateShoperRecords(object);
	}

	@Override
	public List<ShoperInfoModal> fetchAllSchoperInfo(ShoperInfo SellingOderEnity)
			throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoperInfoModal fetchShoperRecordsByName(String shoperName)
			throws PMSException {

		ShoperInfo shoperInfo = shoperDAO.fetchShoperRecordsByName(shoperName);
		ShoperInfoHellper agHelper = new ShoperInfoHellper();
		// TODO Auto-generated method stub
		return agHelper.createShoperModal(shoperInfo);
	}

	@Override
	public void createMultipleRecords(List<ShoperInfo> shoperEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		
	}

	
}
