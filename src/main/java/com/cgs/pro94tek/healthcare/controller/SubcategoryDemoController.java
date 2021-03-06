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

import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SubcategorydemoModal;
import com.cgs.pro94tek.healthcare.service.ISubcategoryDemoDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class SubcategoryDemoController {

	
	
	
	
		

		@Autowired 
		ISubcategoryDemoDataService subCategery;
		
		
		private static final Logger logger = LoggerFactory.getLogger(SubcategoryDemoController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
		@RequestMapping(value = InventoryURIConstant.GETALL_MYSUBCATEGORY_DETAILS_BYNUMBER, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchSubcategoryBycateNumber(@PathVariable("catid") String catid)
			
		{	System.out.println("help cate Subcate demo");
		logger.info("category details by categoryName . : "+catid);
			List<SubcategorydemoModal> subcatgorydemoModal = new ArrayList<SubcategorydemoModal>();
		
			try {
				subcatgorydemoModal = subCategery.fetchSubCatedemoAllByName(catid);
				
				response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", subcatgorydemoModal);
				System.out.println("response.......:"+response);
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
