package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ExpensesModal;
import com.cgs.pro94tek.healthcare.modal.ReferalRatesModal;

@Component
public interface IReferalRatesDataManagementService {

	
	public ReferalRatesModal fetchReferalRateById(String referalRateId) throws PMSException;
	
}
