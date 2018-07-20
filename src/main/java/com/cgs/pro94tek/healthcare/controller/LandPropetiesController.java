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
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.LandPropetyHelper;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;
import com.cgs.pro94tek.healthcare.service.ILandPropetyDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class LandPropetiesController {

	
	
	@Autowired
	
	ILandPropetyDataManagementService  ilandproService;

	private static final Logger logger = LoggerFactory.getLogger(LandPropetiesController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.GET_LANDPROPETY_ID, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchpropertyByid(@PathVariable("propertyid") String propertyid){

		logger.info("propety detaials propetyId... . : "+propertyid);
		LandPropertyModal myland =new LandPropertyModal();
		

		try {
			myland = ilandproService.fetchLandPropertyById(propertyid);
			System.out.println("try in landproperty...........:"+myland);
			response = commonUtils.createResponseData(myland.getAgricultural(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", myland);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(myland.getAgricultural(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	/*DELETE ELEMENTS*/
	
	@RequestMapping(value = InventoryURIConstant.DELETE_lANDPROPERTY_ID, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteBypId(@PathVariable("propertyid") String propertyid){
		try {
			// call service method by passing the expensesId - > ISchoolDataService
			boolean result = ilandproService.deletelandPrortyById(propertyid);
			LandProperty lpropety = new LandProperty();
			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", lpropety);
			}else{
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", lpropety);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;
}
@RequestMapping(value = InventoryURIConstant.CREATE_LANDPROPERT, method = RequestMethod.POST, produces = "application/json")
public @ResponseBody InventoryRequestResponse createProperty(@RequestBody LandPropertyModal lpropertyModal) {
	// SchoolModal is just used for controller and DataRetrieval service only.
	// School is used for Database Interaction - Hibernate, why because School class is having all configurations of database, @Table, @Column
	// SchoolHelper is used only for converting School to SchoolModal and vice versa.
	try {
		System.out.println("expense Name............."+lpropertyModal.getAgricultural());
		LandPropetyHelper  landHelper=new LandPropetyHelper();
		LandProperty  lproperty=landHelper.createlandPropety(lpropertyModal);
		/*Expenses expensesEntity = landHelper.createLandpropertyId(lpropertyModal);*/
		ilandproService.createOrUpdateLandProperty(lproperty);
		response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
	} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
	} 
	return response;
}


	
}
