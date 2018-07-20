package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.ShoperOrderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ShoperOrderListHelper;
import com.cgs.pro94tek.healthcare.modal.DealerAdressModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.ShoperOrderListModal;
import com.cgs.pro94tek.healthcare.service.IDealerAdressDataManagerService;
import com.cgs.pro94tek.healthcare.service.IShoperOrderListDataManageService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class ShoperOrderListController {
	
	/*
	@Autowired 
	IShoperOrderListDataManageService  ShoperService;
	
	private static final Logger logger = LoggerFactory.getLogger(DealerAdressController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.GET_MULTIPLE_SHOPERORDER_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllShoperDetails(
			ShoperOrderList shoperOrderEntity) {

		logger.info("ShoperOrder details by agentname . : "
				+ shoperOrderEntity.getAgent_name());
		List<ShoperOrderListModal> shoperOrderModal = new ArrayList<ShoperOrderListModal>();
		System.out.println("item recrds details all.......:");
		try {
			shoperOrderModal = ShoperService.fetchAlSellingOrder(shoperOrderEntity);
			response = commonUtils.createResponseData("item detailsfetch",
					ResponseMessages.GENERALL_FETCH_SUCCESS,
					ResponseMessages.SUCCESS, "1", shoperOrderModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}/**/
	/*@RequestMapping(value = InventoryURIConstant.PUT_SHOPER_DETAILS_BY_ORDERNO, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse updateShoperOrderList(@PathVariable("sellingodNo") String sellingodNo){

		try {

			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1");
			// call service method by passing the schoolId - > ISchoolDataService

			ShoperOrderListHelper shoperOHelper = new ShoperOrderListHelper();
			ShoperOrderList shoperobject = new ShoperOrderList();
			shoperobject = ShoperService.createOrUpdateShoperOrder(sellingodNo);

			if(schoolDetails != null ){
				schoolModal = cHelper.createschoolModal(schoolDetails);

				response = commonUtils.createResponseData(schoolModal.getSchoolName(), message.GENERALL_UPDATE_SUCCESS, message.SUCCESS, "1", schoolModal);
			}else{

				School schoolZero = new School();
				response = commonUtils.createResponseData("Zero records found", message.GENERALL_UPDATE_SUCCESS, message.SUCCESS, "0", schoolZero);

			}


		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), message.GENERALL_EXCEPTION, message.FAIL, "0", "--");
		} 
		return response;


	}*/
	
}
