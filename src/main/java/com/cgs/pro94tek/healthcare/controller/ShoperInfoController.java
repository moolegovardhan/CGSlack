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

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.ShoperInfo;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.SellingOderHelper;
import com.cgs.pro94tek.healthcare.helper.ShoperInfoHellper;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.ShoperInfoModal;
import com.cgs.pro94tek.healthcare.service.IShoperDataManagerService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class ShoperInfoController {
	
	
	@Autowired
	IShoperDataManagerService shoperService;
	@Autowired
	ShoperInfoHellper   shoperInfoHelper;
	
	
	private static final Logger logger = LoggerFactory
			.getLogger(ShoperInfoController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.CREATE_MULTIPLE_SHOPER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createShoperDetails(@RequestBody List<ShoperInfoModal> shoperinfoModal) {
		List<ShoperInfo>  shoperInfo=new ArrayList<ShoperInfo>();
		try {
			System.out.println("expense Name............."
					+ shoperinfoModal);
		 shoperInfo = shoperInfoHelper.createAllShoperInfo(shoperinfoModal);
					
			/* Expenses expensesEntity = itemHelper.createExpense(itemModal); */
		 shoperService.createMultipleRecords(shoperInfo);
			response = commonUtils.createResponseData("Done",
					ResponseMessages.GENERALL_INSERT_SUCCESS,
					ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"0", "--");
		}
		return response;
	}
	
	
	/*-----------------------------------GET RECORDS BY NAME-------------------*/
	@RequestMapping(value = InventoryURIConstant.GET_SHOPER_BY_NAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchShperByname(
			@PathVariable("shoperName") String shoperName) {

		logger.info("agent detaials propetyId... . : " + shoperName);
		ShoperInfoModal shoperModal = new ShoperInfoModal();

		try {
			shoperModal = shoperService.fetchShoperRecordsByName(shoperName);
			System.out.println("try in shoper...........:");
			response = commonUtils.createResponseData(shoperModal.getAreaName(),ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", shoperModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(shoperModal.getAreaName(),ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}
	@RequestMapping(value = InventoryURIConstant.CREATE_SHOPER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createItem(@RequestBody ShoperInfoModal shoperModal) {
		try {
			System.out.println("expense Name............."+shoperModal.getShoperName());
			
			ShoperInfo  shooperInfo=shoperInfoHelper.createShoperInfo(shoperModal);
			
			shoperService.createOrUpdateShoperRecords(shooperInfo);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	
}
