package com.cgs.pro94tek.healthcare.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsSystemDiscountHelper;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.service.ICGSSystemDiscountDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class CgsSystemDiscountController {
	
	@Autowired
	ICGSSystemDiscountDataService systemDiscoutService;
	private static final Logger logger = LoggerFactory.getLogger(CgsSystemDiscountController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.CREATE_SYSTEM_DISCOUNT_ORDER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createSystemDiscount(@RequestBody CgsSystemDiscountModal discountModal) {
		System.out.println("Inward controller...........:");
		try {
			System.out.println("cardtype Name............."+discountModal.getCreatedby());
			System.out.println("welcome dicount");
			CgsSystemDiscountHelper   discHelper=new CgsSystemDiscountHelper();
			System.out.println("controller inward Helper...........:"+discHelper);
			CgsSystemDiscount     cgsDiscount=discHelper.createSystemDiscunt(discountModal);
			systemDiscoutService.createSystsemDiscount(cgsDiscount);
			
			//iSpecialOffersService.createOrUpdateSpecialOfferById(specialOffer);   
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_SYSTEM_DISCOUNT_ALL_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllCgsDiscount(CgsSystemDiscount discoutnEntity) {

		logger.info("purchage datails in sql......... . : "
				+ discoutnEntity.getCreatedby());
		List<CgsSystemDiscountModal> cgsSysModal = new ArrayList<CgsSystemDiscountModal>();
		System.out.println("cgsSystsemDiscount recrds details all.......:");
		try 
		{
			cgsSysModal = systemDiscoutService.getAlldiscoutn(discoutnEntity);
		response = commonUtils.createResponseData("purchageOrdre Details Fetch ",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", cgsSysModal);

		} catch (Exception pe) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + pe.getMessage());
			logger.error(" In cause Error" + pe.getCause());

			pe.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"1", pe.getMessage());
		}

		return response;
	}
}
