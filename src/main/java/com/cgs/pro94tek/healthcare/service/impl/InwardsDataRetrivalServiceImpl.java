package com.cgs.pro94tek.healthcare.service.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Company;
import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IInwardDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CompanyHelper;
import com.cgs.pro94tek.healthcare.helper.InwardHelpers;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.modal.InwardModal;
import com.cgs.pro94tek.healthcare.service.IInwardDataManagmentServices;



@Service("inwardsDataRetrivalService")
public class InwardsDataRetrivalServiceImpl   implements IInwardDataManagmentServices {

	@Autowired
	private IInwardDAO   inwardDAO;
	
	
	@Override
	public void createOrUpdateInward(Inward inward) throws PMSException {
		System.out.println("enter ther inwardservices.........:");
		// TODO Auto-generated method stub
		inwardDAO.createOrUpdateInward(inward);
	}


	@Override
	public InwardModal fetchInwardBypId(String pId) throws PMSException {
		// TODO Auto-generated method stub
		System.out.println("service implementation..........:"+pId);
		Inward inward= inwardDAO.fetchInwardBypId(pId);
		InwardHelpers inHelper=new InwardHelpers(); 
		return inHelper.createinwardModal(inward);
		
		
	
	}
	


}
