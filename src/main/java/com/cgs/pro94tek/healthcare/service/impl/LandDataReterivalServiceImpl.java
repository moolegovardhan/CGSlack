package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ILanDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.LandHelper;
import com.cgs.pro94tek.healthcare.modal.LandModal;
import com.cgs.pro94tek.healthcare.service.LandDataRetrivalService;



@Service("landDataRetrivalService")
public class LandDataReterivalServiceImpl implements LandDataRetrivalService {

	
	
	@Autowired
	private ILanDAO lanDAO;
	@Override
	public LandModal fetchLandById(String landid) throws PMSException {
		// TODO Auto-generated method stub
		Land land=lanDAO.fetchLandById(landid);
		LandHelper landHelper=new LandHelper();
		return landHelper.createilandModal(land);
	}

	@Override
	public boolean deletelandById(String landid) throws PMSException {
		// TODO Auto-generated method stub
		return lanDAO.deletelandById(landid);
	}

	@Override
	public void createOrUpdateLand(Land landEntity) throws PMSException {
		// TODO Auto-generated method stub
		lanDAO.createOrUpdateLand(landEntity);
	}

}
