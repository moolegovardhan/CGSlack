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

import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.DealerAdressHelper;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.modal.DealerAdressModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.service.IDealerAdressDataManagerService;
import com.cgs.pro94tek.healthcare.service.IItemDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class DealerAdressController {
	
	
	
	
	
	
		
		@Autowired 
		IDealerAdressDataManagerService  idealerAdressService;
		
		private static final Logger logger = LoggerFactory.getLogger(DealerAdressController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
		
		@RequestMapping(value = InventoryURIConstant.GET_DEALERADRESS_ID, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchDealereById(@PathVariable("adressId") String adressId){

			
			System.out.println("dealer adresss....."+adressId);
			logger.info("adressId detaials ItemId . : "+adressId);
			DealerAdressModal  dealerAdressModal= new DealerAdressModal ();
			

			try {
				dealerAdressModal = idealerAdressService.fetchDealerAdressById(adressId);
				System.out.println("try in adress...........:"+dealerAdressModal);
				response = commonUtils.createResponseData(dealerAdressModal.getBillingAddress(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", dealerAdressModal);

			} catch (PMSException e) {
				// TODO Auto-generated catch block
				logger.error(" In message Error"+e.getMessage());
				logger.error(" In cause Error"+e.getCause());

				e.printStackTrace();
				response = commonUtils.createResponseData(dealerAdressModal.getBillingAddress(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}

			return response;
		}
		
		@RequestMapping(value = InventoryURIConstant.DELETE_DEALERADRESS_ID, method = RequestMethod.DELETE, produces = "application/json")
		public @ResponseBody InventoryRequestResponse deleteById(@PathVariable("adressId") String adressId){
			try {
				// call service method by passing the expensesId - > ISchoolDataService
				boolean result = idealerAdressService.deleteDealerAdressById(adressId);
				DealerAdress dadress = new DealerAdress();
				if(result){
					response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", dadress);
				}else{
					response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", dadress);

				}

			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
			} 
			return response;
	}
	@RequestMapping(value = InventoryURIConstant.CREATE_DEALERADRESS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createDealerAdress(@RequestBody DealerAdressModal adressModal) {
		
		System.out.println("controll for create dealer.......:"+adressModal);
		try {
			System.out.println("dealer Name............."+adressModal.getCreatedby());
			DealerAdressHelper  dhelper=new DealerAdressHelper();
			DealerAdress  dealeradrs=dhelper.createDealerAdress(adressModal);
			/*Expenses expensesEntity = dhelper.createDealerAdress(adressModal);*/
			idealerAdressService.createOrUpdateDealerAdress(dealeradrs);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}

	
	
	

}
