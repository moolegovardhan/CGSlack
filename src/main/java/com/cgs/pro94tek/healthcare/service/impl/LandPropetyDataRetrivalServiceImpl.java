package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IPropertyDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.LandPropetyHelper;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;
import com.cgs.pro94tek.healthcare.service.ILandPropetyDataManagementService;



@Service("landPropetyService")
public class LandPropetyDataRetrivalServiceImpl implements ILandPropetyDataManagementService {

	
	@Autowired
	private IPropertyDAO  propertyDAO;
	
	
	@Override
	public LandPropertyModal fetchLandPropertyById(String propertyid)
			throws PMSException {
		LandProperty  landp=propertyDAO.fetchLandPropertyById(propertyid);
		//Item item = itemDAO.fetchItemById(itemId);
		LandPropetyHelper lhelper=new LandPropetyHelper();

		return lhelper.createLandpropertyId(landp);
		
		
		
	}

	@Override
	public boolean deletelandPrortyById(String propertyid) throws PMSException {
		// TODO Auto-generated method stub
		return propertyDAO.deletelandPrortyById(propertyid);
	}

	@Override
	public void createOrUpdateLandProperty(LandProperty landPropertyEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		propertyDAO.createOrUpdateLandProperty(landPropertyEntity);
	}

}
