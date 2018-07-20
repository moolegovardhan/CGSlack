package com.cgs.pro94tek.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.SpecialOffer;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ExpensesHelper;
import com.cgs.pro94tek.healthcare.helper.SpecialOfferHelper;
import com.cgs.pro94tek.healthcare.modal.ExpensesModal;
import com.cgs.pro94tek.healthcare.modal.SpecialOfferModal;
import com.cgs.pro94tek.healthcare.service.IExpensesDataRetrivalService;
import com.cgs.pro94tek.healthcare.service.ISpecialOffersService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;



@Controller
public class SpecialOfferController {
	
	@Autowired 
	ISpecialOffersService iSpecialOffersService;

	private static final Logger logger = LoggerFactory.getLogger(ExpensesController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	
	@RequestMapping(value = InventoryURIConstant.GET_SPECIALOFFER, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchExpensesDetailsById(@PathVariable("officeId") String officeId){

		logger.info("Specialoffer.......... . : "+officeId);
		
		SpecialOfferModal specialOfferModal = new SpecialOfferModal();

		try {
			specialOfferModal = iSpecialOffersService.fetchSpecialOfferById(officeId);
			response = commonUtils.createResponseData(specialOfferModal.getOffername(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", specialOfferModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(specialOfferModal.getOffername(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.DELETE_SPECIALOFFER_ID, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteById(@PathVariable("officeId") String officeId){
		try {
			// call service method by passing the expensesId - > ISchoolDataService
			boolean result = iSpecialOffersService.deleteSpecialOfferById(officeId);
			SpecialOffer specialZone = new SpecialOffer();
			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", specialZone);
			}else{
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", specialZone);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}
	
	@RequestMapping(value = InventoryURIConstant.CREATE_SPECIALOFFER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createExpenses(@RequestBody SpecialOfferModal specialOfferModal) {
		// SchoolModal is just used for controller and DataRetrieval service only.
		// School is used for Database Interaction - Hibernate, why because School class is having all configurations of database, @Table, @Column
		// SchoolHelper is used only for converting School to SchoolModal and vice versa.
		try {
			System.out.println("specialOfferModal Name............."+specialOfferModal.getOfficeid());
			SpecialOfferHelper   specialOfferHelper = new SpecialOfferHelper();
			SpecialOffer specialOffer = specialOfferHelper.createSpecialoffer(specialOfferModal);
			iSpecialOffersService.createOrUpdateSpecialOfferById(specialOffer);   
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	
		
}
