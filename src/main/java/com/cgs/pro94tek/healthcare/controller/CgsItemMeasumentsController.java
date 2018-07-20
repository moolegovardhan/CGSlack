package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.CgsItemMeasurments;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.CgsItemMeasurmentsModal;
import com.cgs.pro94tek.healthcare.service.ICgsItemMeasurmentsDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class CgsItemMeasumentsController {
	@Autowired
	ICgsItemMeasurmentsDataService   iItemMeasurmentService;
	
	private static final Logger logger = LoggerFactory.getLogger(CgsItemMeasumentsController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.GET_ALL_ITEMESUEMENTS_DETAILS, method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody InventoryRequestResponse fetchAllMeasurments(CgsItemMeasurments itemMezur){

		logger.info("category details by categoryName . : "+itemMezur.getItemMeaserMents());
		List<CgsItemMeasurmentsModal > itemModal = new ArrayList<CgsItemMeasurmentsModal>();
		System.out.println("itemModal recrds details all.......:");
		try {
			itemModal = iItemMeasurmentService.fetchAllMesurments(itemMezur);
			response = commonUtils.createResponseData("Category Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", itemModal);

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
