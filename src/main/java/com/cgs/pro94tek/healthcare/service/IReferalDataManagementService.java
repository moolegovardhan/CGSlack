package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.HealthReferalModal;


@Component
public interface IReferalDataManagementService {

	public HealthReferalModal fetchReferalById(String referalId) throws PMSException;


}
