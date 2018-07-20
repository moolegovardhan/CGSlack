package com.cgs.pro94tek.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.bean.CgsDiscounts;
import com.cgs.pro94tek.healthcare.helper.CgsDiscountsHelper;
import com.cgs.pro94tek.healthcare.helper.CgsLacsCardHelper;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountsModal;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;
import com.cgs.pro94tek.healthcare.service.ICgsDiscountDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class CgsDiscountsController {
	
	@Autowired
	ICgsDiscountDataService		icgsDiscountService;
	
	private static final Logger logger = LoggerFactory.getLogger(CgsDiscountsController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.CREATE_DISCOUNT_ORDER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createDiscount(@RequestBody CgsDiscountsModal discountModal) {
		System.out.println("Inward controller...........:");
		try {
			System.out.println("cardtype Name............."+discountModal.getCardtype());
			System.out.println("welcome dicount");
			CgsDiscountsHelper   discHelper=new CgsDiscountsHelper();
			System.out.println("controller inward Helper...........:"+discHelper);
			CgsDiscounts cgsDiscount=discHelper.createCgsDiscount(discountModal);
			icgsDiscountService.createDiscount(cgsDiscount);
			
			//iSpecialOffersService.createOrUpdateSpecialOfferById(specialOffer);   
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	

}
