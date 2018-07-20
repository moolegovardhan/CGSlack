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

import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.QuatationData;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.PurchageOrderHealper;
import com.cgs.pro94tek.healthcare.helper.QuatationHelper;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.QuatationModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;
import com.cgs.pro94tek.healthcare.service.IQuantityDataManagementService;
import com.cgs.pro94tek.healthcare.service.impl.QuantityDataRetrivalServices;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;




@Controller
public class QuatationController  {
	
	
	

	@Autowired 
	IQuantityDataManagementService iqueantation;

	private static final Logger logger = LoggerFactory.getLogger(QuatationController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	


	@RequestMapping(value = InventoryURIConstant.GET_QUANTITY_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchSchoolDetailsById(@PathVariable("purchageId") String purchageId){

		logger.info("Quantity detaials purchageId. : "+purchageId);
		System.out.println("Quantity details purchaid..............:"+purchageId);
		QuatationModal quatationModal = new QuatationModal();

		try {
			quatationModal = iqueantation.fetchQuatationByPId(purchageId);
			response = commonUtils.createResponseData(quatationModal.getSuppliername(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", quatationModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(quatationModal.getSuppliername(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	
	@RequestMapping(value = InventoryURIConstant.CREATE_QUANTITY_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createQuantity(@RequestBody QuatationModal quatation) {
		
		try {
			System.out.println("Quatation Name............."+quatation.getQuotationnumber());
			//SchoolHelper sHelper = new SchoolHelper();
			QuatationHelper qHeper = new QuatationHelper();
			QuatationData quantity=qHeper.createQuatation(quatation);
			//School schoolEntity = sHelper.createSchool(quatation);
			iqueantation.createOrUpdateQuatation(quantity);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.GETALL_QUATATION_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchSubCategoryByName(QuatationData quatationEntity)
	
	{System.out.println("quatationdetails all...................:");
		logger.info("quatationEntity details by quatationEntity. : "+quatationEntity);
		List<QuatationModal> quatationModal = new ArrayList<QuatationModal>();
	
		try {
			quatationModal = iqueantation.fetchAllQuatation(quatationEntity);
			
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", quatationModal);
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
	
	
	
		/*	-----------------INSERT MULTIPULE RECORDS---------------------*/

	@RequestMapping(value = InventoryURIConstant.CREATE_MULTIPLE_QUATATIONS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createaaQuatity(@RequestBody List<QuatationModal> quatationModal) {
	// SchoolModal is just used for controller and DataRetrieval service only.
	// School is used for Database Interaction - Hibernate, why because School class is having all configurations of database, @Table, @Column
	// SchoolHelper is used only for converting School to SchoolModal and vice versa.
	System.out.println("controll for create dealer.......:"+quatationModal);
	List<QuatationData>  quantity=new ArrayList<QuatationData>();
	try {
		System.out.println("qua Name............."+quantity);
		QuatationHelper qHeper = new QuatationHelper();
		 quantity=qHeper.createAllQuatationDataList(quatationModal);
		/*Expenses expensesEntity = dhelper.createDealerAdress(adressModal);*/
		System.out.println("quatation..........:"+quantity);
		iqueantation.createMultipleQuatation(quantity);
		System.out.println("controlle of quantity service...........:"+quantity);
		response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
	} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	

}
