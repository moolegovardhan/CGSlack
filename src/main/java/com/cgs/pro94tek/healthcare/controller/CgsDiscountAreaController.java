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

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.bean.CgsDiscountArea;
import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.helper.CgsDiscountAreaHelper;
import com.cgs.pro94tek.healthcare.helper.CgsLacsCardHelper;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountAreaModal;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;
import com.cgs.pro94tek.healthcare.service.ICgsDiscountAreaDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class CgsDiscountAreaController {
	@Autowired
	ICgsDiscountAreaDataService    discountAreaService;
	@Autowired
	CgsDiscountAreaHelper  discountAreaHelper;
	private static final Logger logger = LoggerFactory.getLogger(CgsDiscountAreaController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.CREATE_DISCOUNT_AREA, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createDiscoontAreas(@RequestBody CgsDiscountAreaModal discountModal) {
		System.out.println("Inward controller...........:");
		try {
			System.out.println("discount Name............."+discountModal.getAreaName());
			CgsLacsCardHelper   cgsCardHelper=new CgsLacsCardHelper();
			System.out.println("controller inward Helper...........:"+cgsCardHelper);
			CgsDiscountArea cgsDiscountArea=discountAreaHelper.createDiscountArea(discountModal);
			discountAreaService.createDiscoutArea(cgsDiscountArea);
			
			//iSpecialOffersService.createOrUpdateSpecialOfferById(specialOffer);   
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_DISCOUNT_AREA_ALL_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllCgsDiscountCate(CgsDiscountArea disAreaEntity) {

		logger.info("purchage datails in sql......... . : "+ disAreaEntity.getAreaAddress());
		List<CgsDiscountAreaModal>  discAreaModal = new ArrayList<CgsDiscountAreaModal>();
		System.out.println("cgsdiscountAreaService recrds details all.......:");
		try 
		{
			discAreaModal = discountAreaService.getDiscountArea(disAreaEntity);
		response = commonUtils.createResponseData("purchageOrdre Details Fetch ",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", discAreaModal);

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
