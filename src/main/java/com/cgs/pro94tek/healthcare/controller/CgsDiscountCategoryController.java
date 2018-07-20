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

import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.helper.CgsDiscountCategoryHelper;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;
import com.cgs.pro94tek.healthcare.service.ICgsDiscountCategoryDataServce;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class CgsDiscountCategoryController {
	
	@Autowired
	ICgsDiscountCategoryDataServce  disCategoryService;
	@Autowired
	CgsDiscountCategoryHelper   categoryHelper;
	
	private static final Logger logger = LoggerFactory.getLogger(CgsDiscountCategoryController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.CREATE_CGSDISCOUT_CATEGORY, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createDiscountCategory(@RequestBody CgsDiscountCategoryModal    discCategoryModal) {
	System.out.println("controll for create agcgsdiscountcateCgsdicountcatesentQuatationModal......:"+discCategoryModal);
	CgsDiscountCategory  dscCategoryObject=new CgsDiscountCategory();
	try {
		System.out.println("dscCategoryObject Name............."+dscCategoryObject);
		dscCategoryObject=categoryHelper.createDiscoutnCategory(discCategoryModal);
		System.out.println("dscCategoryObject helper..........:"+dscCategoryObject);
		disCategoryService.createDiscoutnCategory(dscCategoryObject);
		response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_DISCOUNT_CATEGORY_ALL_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllCgsDiscountCate(CgsDiscountCategory disCategoryEntity) {

		logger.info("purchage datails in sql......... . : "+ disCategoryEntity.getCategoryName());
		List<CgsDiscountCategoryModal>  discCategoryModal = new ArrayList<CgsDiscountCategoryModal>();
		System.out.println("cgsSystsemDiscount recrds details all.......:");
		try 
		{
			discCategoryModal = disCategoryService.getdiscountCategory(disCategoryEntity);
		response = commonUtils.createResponseData("purchageOrdre Details Fetch ",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", discCategoryModal);

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
