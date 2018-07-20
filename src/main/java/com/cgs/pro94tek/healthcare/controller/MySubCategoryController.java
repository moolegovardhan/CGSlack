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

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CategoryHelper;
import com.cgs.pro94tek.healthcare.helper.SubCategoryHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;
import com.cgs.pro94tek.healthcare.service.IMySubCategoryDataManagerService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;




@Controller
public class MySubCategoryController {
	

	@Autowired 
	IMySubCategoryDataManagerService  subCategery;
	
	@Autowired
	SubCategoryHelper subCategoryHelper;
	
	private static final Logger logger = LoggerFactory.getLogger(MySubCategoryController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.GETALL_MYSUBCATEGORY_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchSubCategoryByName(SubCategory subCategoryEntity){
		logger.info("category details by categoryName . : "+subCategoryEntity);
		List<SubCategoryModal> subcatgoryModal = new ArrayList<SubCategoryModal>();
	
		try {
			subcatgoryModal = subCategery.fetchAllSubCategory(subCategoryEntity);
			
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", subcatgoryModal);
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
	
	
		 
		@RequestMapping(value = InventoryURIConstant.CREATE_MYSUBCATEGORY_DETAILS, method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody InventoryRequestResponse createMysubcategory(@RequestBody SubCategoryModal categoryModal) {
			try {
				SubCategory  categoryEntity=subCategoryHelper.createSubCategoryEntity(categoryModal);
				subCategery.createOrUpdateSubCategoryByname(categoryEntity);
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
			} 
			return response;
		}
		
	
	
	
	
	@RequestMapping(value = InventoryURIConstant.DELETE_MYSUBCATEGORYS_DETAILS, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteByName(@PathVariable("subCategoryId") String subCategoryId){
			System.out.println("delete the elements by name...........:"+subCategoryId);
		try {
			// call service method by passing the expensesId - > ISchoolDataService
			boolean result = subCategery.deleteSubCategoryByName(subCategoryId);
			SubCategory category = new SubCategory();
			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", category);
			}else{
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", category);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;
	}
	/*---------------------------------GetAll Details BYName---------------------------- */
	@RequestMapping(value = InventoryURIConstant.GETALL_MYSUBCATEGORY_DETAILS_BYNAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchByStockorderStatus(@PathVariable("byName") String byName)
		
	{	
		System.out.println("subcategory by name......");
		System.out.println("help cate");
		logger.info("category details by categoryName . : "+byName);
		List<SubCategoryModal> subcatgoryModal = new ArrayList<SubCategoryModal>();
	
		try {
			subcatgoryModal = subCategery. fetchSubCategoryByName(byName);
			
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", subcatgoryModal);
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
@RequestMapping(value = InventoryURIConstant.SUBCATEGORY_UPDATE, method = RequestMethod.PUT, produces = "application/json")
	
	public @ResponseBody InventoryRequestResponse updateSubCategory(@RequestBody SubCategoryModal subCategoryModal,@PathVariable("id") String id){
		
		System.out.println("controll for create id.......:"+id);
		System.out.println("subcate Name............."+subCategoryModal.getSubCategoryName());
		try {			
			if(id != null && !"".equals(id)){			 
			boolean status = subCategery.updateSubcategory(subCategoryModal,id);
				if(status){  
					response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");					
				}
				else{
					response = commonUtils.createResponseData("FAIL", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
				}
			}	
		} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
	return response;
	}
	

}
