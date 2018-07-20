package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.HealthReferal;

import com.cgs.pro94tek.healthcare.dataaccess.dao.IReferalDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ReferalHelper;
import com.cgs.pro94tek.healthcare.modal.HealthReferalModal;

import com.cgs.pro94tek.healthcare.service.IReferalDataManagementService;


@Service("referalDataRetrivalServiceImpl")
public class ReferalDataRetrivalServiceImpl  implements  IReferalDataManagementService {
	@Autowired 
	IReferalDAO  ireferalDAO;
	
	@Override
	public HealthReferalModal fetchReferalById(String referalId) throws PMSException {
		HealthReferal referal = ireferalDAO.fetchReferalById(referalId);
		ReferalHelper referalHelper = new ReferalHelper();
		return referalHelper.createReferalModal(referal);
	}

}
