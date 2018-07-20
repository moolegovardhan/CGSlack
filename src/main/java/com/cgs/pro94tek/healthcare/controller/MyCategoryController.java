package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CategoryHelper;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.service.IMyCategoryDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller 
public class MyCategoryController {



	
	@Autowired
	IMyCategoryDataService categoryService;
	
	private static final Logger logger = LoggerFactory.getLogger(MyCategoryController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.GET_MYCATEGORYS_DETAILS, method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody InventoryRequestResponse fetchCategoryDetailsById(@PathVariable("categoryName") String categoryName){

		logger.info("category details by categoryName . : "+categoryName);
		List<CategoryModal> catgoryModal = new ArrayList<CategoryModal>();

		try {
			catgoryModal = categoryService.fetchCategoryByName(categoryName);
			response = commonUtils.createResponseData("Category Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", catgoryModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	 
	@RequestMapping(value = InventoryURIConstant.CREATE_MYCATEGORY_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createItem(@RequestBody CategoryModal categoryModal) {
		// SchoolModal is just used for controller and DataRetrieval service only.
		// School is used for Database Interaction - Hibernate, why because School class is having all configurations of database, @Table, @Column
		// SchoolHelper is used only for converting School to SchoolModal and vice versa.
			System.out.println("CREATE_MYCATEGORY_DETAILS"+categoryModal);
		try {
			System.out.println("category create Name............."+categoryModal.getCategoryName());
			CategoryHelper catemHelper=new CategoryHelper();
			Category  categoryEntity=catemHelper.createCategoryEntity(categoryModal);
			/*Expenses expensesEntity = itemHelper.createExpense(itemModal);*/
			categoryService.createOrUpdateCategoryByname(categoryEntity);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	/*..................get all records.................*/
	
	@RequestMapping(value = InventoryURIConstant.GET_ALL_MYCATEGORYS_DETAILS, method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody InventoryRequestResponse fetchAllCategoryDetails(Category categoryEntity){

		logger.info("category details by categoryName . : "+categoryEntity.getCategoryName());
		List<CategoryModal> catgoryModal = new ArrayList<CategoryModal>();
		System.out.println("category recrds details all.......:");
		try {
			catgoryModal = categoryService.fetchAllCategory(categoryEntity);
			response = commonUtils.createResponseData("Category Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", catgoryModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	/*---------------------------DELETECATEGORY-----------------------*/
	
	
	@RequestMapping(value = InventoryURIConstant.DELETE_MYCATEGORYS_DETAILS, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteByName(@PathVariable("categoryId") String categoryId){
			System.out.println("delete the elements by name...........:"+categoryId);
		try {
			// call service method by passing the expensesId - > ISchoolDataService
			boolean result = categoryService.deleteCategoryByName(categoryId);
			Category category = new Category();
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
	
	
	

}


