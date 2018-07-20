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
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.service.IItemDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class ItemController {
	
	@Autowired 
	IItemDataManagementService  itemsevice;
	
	@Autowired
	ItemHelper itemHelper;
	
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.GET_ITEM_ID, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchItemById(@PathVariable("itemId") String itemId){
		System.out.println("enter the conteroller of item");
		logger.info("Item detaials ItemId . : "+itemId);
		ItemModal  itemModal= new ItemModal ();
		

		try {
			itemModal = itemsevice.fetchItemById(itemId);
			System.out.println("try in item...........:"+itemModal);
			response = commonUtils.createResponseData(itemModal.getItemname(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", itemModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(itemModal.getItemname(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.DELETE_ITEM_ID, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteById(@PathVariable("itemId") String itemId){
		try {
			// call service method by passing the expensesId - > ISchoolDataService
			boolean result = itemsevice.deleteItemById(itemId);
			Item ItemZero = new Item();
			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", ItemZero);
			}else{
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", ItemZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;
}
@RequestMapping(value = InventoryURIConstant.CREATE_ITEM_DETAILS, method = RequestMethod.POST, produces = "application/json")
public @ResponseBody InventoryRequestResponse createItem(@RequestBody ItemModal itemModal) {
	
	try {
			
		Item item=itemHelper.createItem(itemModal);
		itemsevice.createOrUpdateItem(item);
		response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
	} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
	} 
	return response;
}

/*..................get all records.................*/

@RequestMapping(value = InventoryURIConstant.GET_ALL_ITEM_DETAILS, method = RequestMethod.GET, produces = "application/json")

public @ResponseBody InventoryRequestResponse fetchAllItemDetails(Item itemEntity){

	logger.info("category details by categoryName . : "+itemEntity.getItemname());
	List<ItemModal> itemModal = new ArrayList<ItemModal>();
	System.out.println("item recrds details all.......:");
	try {
		itemModal = itemsevice.fetchAllItems(itemEntity);
		response = commonUtils.createResponseData("item detailsfetch", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", itemModal);

	} catch (PMSException e) {
		// TODO Auto-generated catch block
		logger.error(" In message Error"+e.getMessage());
		logger.error(" In cause Error"+e.getCause());

		e.printStackTrace();
		response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
	}

	return response;
}

/*-----------------------:Get multipule records  items by Name:----------------*/


@RequestMapping(value = InventoryURIConstant.GET_ALL_ITEMS_BYNAME, method = RequestMethod.GET, produces = "application/json")
public @ResponseBody InventoryRequestResponse fetchByProName(@PathVariable("itemName") String itemName)
{		System.out.println("purchageoreder details.............:"+itemName);
		logger.info("category details by categoryName . : "+itemName);
		List<ItemModal> itemModal = new ArrayList<ItemModal>();
		System.out.println("category recrds details all.......:");
		try {
			itemModal = itemsevice.fetchAllItemsByname(itemName);
			response = commonUtils.createResponseData("ParchageOrder Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", itemModal);

		} 
		catch (PMSException e) 
		{
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}


}
