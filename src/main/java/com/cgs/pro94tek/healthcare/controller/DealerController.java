package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Dealer;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.DealerHelper;
import com.cgs.pro94tek.healthcare.helper.SupplierHelper;
import com.cgs.pro94tek.healthcare.modal.DealerModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;
import com.cgs.pro94tek.healthcare.service.IDealerDataManagementService;
import com.cgs.pro94tek.healthcare.service.ISupplierDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
@Controller
public class DealerController {
	
	
	@Autowired
	IDealerDataManagementService dealerServices;
	
	private static final Logger logger = LoggerFactory.getLogger(DealerController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.GET_DEALER_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchDealerDetailsById(@PathVariable("officeId") String officeId){
		System.out.println("dealer controller.........:"+officeId);
		logger.info("Dealer details dealerId . : "+officeId);
		DealerModal  dealerModal = new DealerModal();

		try {
			dealerModal = dealerServices.fetchDealerById(officeId);
			response = commonUtils.createResponseData("Dealer Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", dealerModal);
			System.out.println("response data in controller.....:"+response);
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Dealer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	
	@RequestMapping(value = InventoryURIConstant.GET_BY_DEALERNAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchDealerDetailsByDealerName(@PathVariable("dealerName") String dealerName){
		System.out.println("dealer controller Dealer Name.........:"+dealerName);
		logger.info("Dealer details dealername. : "+dealerName);
		DealerModal  dealerMod = new DealerModal();

		try {
			dealerMod = dealerServices.fetchBealerByDealaerName(dealerName);
			response = commonUtils.createResponseData("Dealer Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", dealerMod);
			System.out.println("response data in dealerName.....:"+response);
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Dealer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	
	@RequestMapping(value = InventoryURIConstant.CREATE_DEALER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createDealer(@RequestBody DealerModal dealermodal) {
		
		try {
			System.out.println("DealerName............."+dealermodal.getDealerName());
			DealerHelper dHelper = new DealerHelper();
			Dealer dealerEntity = dHelper.createDealer(dealermodal);
			dealerServices.createOrUpdateDealer(dealerEntity);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	
	@RequestMapping(value = InventoryURIConstant.DELETE_DEALER_DETAILS, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteDealer(@PathVariable("dealerId") String dealerId){
		
				System.out.println("enter the value to dealer...."+dealerId);
		try {
			// call service method by passing the serviceId - > isupplierDataManagementService
			System.out.println("dealer elements...........:"+dealerId);
			Dealer dealerDetails = new Dealer();
			boolean result = dealerServices.deleteDealerById(dealerId);

			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", dealerDetails);
			}else{

				Dealer dealerZero = new Dealer();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", dealerZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}

	@RequestMapping(value = InventoryURIConstant.DELETE_DEALER_BYNAME, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteDealerByName(@PathVariable("dealerName") String dealerName){
		
				System.out.println("dealer value to dealer...."+dealerName);
		try {
			// call service method by passing the serviceId - > isupplierDataManagementService
			System.out.println("dealer elements...........:"+dealerName);
			Dealer dealerDetails = new Dealer();
			boolean result = dealerServices.deleteDealerByName(dealerName);
				System.out.println("result for workcontroller...............:"+result);
			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", dealerDetails);
			}else{

				Dealer dealerZero = new Dealer();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", dealerZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}
/*..................get all records.................*/
	
	@RequestMapping(value = InventoryURIConstant.GET_ALL_DEALERS, method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody InventoryRequestResponse fetchAllDealer(Dealer dealerEntity){

		logger.info("Dealer datails in sql......... . : "+dealerEntity.getContactPersonName());
		List<DealerModal> dealerModal = new ArrayList<DealerModal>();
		System.out.println("dealer recrds details all.......:");
		try {
			dealerModal = dealerServices.fetchAllDealerModal(dealerEntity);
			response = commonUtils.createResponseData("purchageOrdre Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", dealerModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}

	
	

}
