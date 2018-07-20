package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.ReferalRates;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IReferalRatesDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ExpensesHelper;
import com.cgs.pro94tek.healthcare.helper.ReferalRatesHelper;
import com.cgs.pro94tek.healthcare.modal.HealthReferalModal;
import com.cgs.pro94tek.healthcare.modal.ReferalRatesModal;
import com.cgs.pro94tek.healthcare.service.IReferalDataManagementService;
import com.cgs.pro94tek.healthcare.service.IReferalRatesDataManagementService;



@Service("referaRatesDataRetrivalServiceImpl")
public class ReferaRatesDataRetrivalServiceImpl   implements IReferalRatesDataManagementService{

	@Autowired
	IReferalRatesDAO  ireferalRatesDAO;

	@Override
	public ReferalRatesModal fetchReferalRateById(String referalRateId)
			throws PMSException {
		ReferalRates referalRates = ireferalRatesDAO.fetchReferalRateById(referalRateId);
		ReferalRatesHelper referalRatesHelper = new ReferalRatesHelper();
		return referalRatesHelper.createReferalRatesModal(referalRates);
		
		
		
	}
	

		
	
		
	
}
