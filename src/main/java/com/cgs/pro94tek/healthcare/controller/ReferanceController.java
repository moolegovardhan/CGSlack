package com.cgs.pro94tek.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.HealthReferalModal;

import com.cgs.pro94tek.healthcare.service.IReferalDataManagementService;


@Controller
public class ReferanceController {
	
	
	@Autowired
	IReferalDataManagementService   ireferalDataManagementService;
	
	private static final Logger logger =  LoggerFactory.getLogger(ReferanceController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.GET_REFERAL_ID, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchReferalDetailsById(@PathVariable("referalId") String referalId){
		
		
		
		System.out.println("referal......:"+referalId);
		logger.info("Referal detaials ReferalId . : "+referalId);
		System.out.println("Referal detaials ReferalId............"+referalId);
		HealthReferalModal referalModal = new HealthReferalModal();

		try {
			referalModal = ireferalDataManagementService.fetchReferalById(referalId);
			response = commonUtils.createResponseData(referalModal.getReferalname(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", referalModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());
			System.out.println("In cause Error"+e.getCause());
			e.printStackTrace();
			response = commonUtils.createResponseData(referalModal.getReferalname(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	
	
	
	}
	

}
