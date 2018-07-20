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

import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;
import com.cgs.pro94tek.healthcare.dataaccess.manager.OnlineShopingContext;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.OnlineShopingPurchageHelper;
import com.cgs.pro94tek.healthcare.modal.OnlinePurchageModal;
import com.cgs.pro94tek.healthcare.service.IOnlineShopingDataManagementServices;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
/*import com.cgs.pro94tek.utils.OnlineShopingContext;*/
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class OnlineShopingController {

	
	@Autowired 
	IOnlineShopingDataManagementServices  onlineShopingService;
	@Autowired
	OnlineShopingPurchageHelper  onlineShopingHelper;
	
	private static final Logger logger = LoggerFactory.getLogger(OnlineShopingController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.BUY_MULTIPLR_ITEMS_PURCHAGEORDER, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllOnlineItem(OnlinePurchage onlinePurchageEnitity) {

		logger.info("selling details by sellingEntity . : "
				+ onlinePurchageEnitity.getCustomerName());
		List<OnlinePurchageModal> onlinePurchageModal = new ArrayList<OnlinePurchageModal>();
		System.out.println("item recrds details all.......:");
		try {
			onlinePurchageModal = onlineShopingService.fetchAlOnlinePurchageMulitpule(onlinePurchageEnitity);
			response = commonUtils.createResponseData("item detailsfetch",
					ResponseMessages.GENERALL_FETCH_SUCCESS,
					ResponseMessages.SUCCESS, "1", onlinePurchageModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}
	@RequestMapping(value = InventoryURIConstant.CREATE_BUY_ITEMS_ONLINESHOPING_PURCHAGE, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createOnlineShoping(@RequestBody List<OnlinePurchageModal> onlinepurchageModal) 
	{	System.out.println("enter into controller.....:"+onlinepurchageModal);
		List<OnlinePurchageModal> modelobject=new ArrayList<OnlinePurchageModal>();
		     
		List<OnlinePurchage>  onlinePurchageEntity=new ArrayList<OnlinePurchage>();
		try {
			OnlineShopingPurchageHelper  onlinePurHelper=new OnlineShopingPurchageHelper();
			System.out.println("expense Name............."+ onlinepurchageModal);
			onlinePurchageEntity = onlinePurHelper.createALLOnlinePurchage(onlinepurchageModal);
					
			/* Expenses expensesEntity = itemHelper.createExpense(itemModal); */
			onlineShopingService.postMultipleRecordsOnlinep(onlinePurchageEntity);
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"0", "--");
		}
		return response;
	}
	/*----------------------------<CreateOnlinePurchage>----------------------*/
	@RequestMapping(value = InventoryURIConstant.CREATE_ONLINE_PURCHAGE, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createOnlinePurchage(@RequestBody OnlinePurchageModal onlinpModal) {

		try {
			System.out.println("expense Name............."+ onlinpModal.getCustomerName());
			OnlinePurchage onlienPurchage = onlineShopingHelper.createOnlineSellingOrder(onlinpModal);
			/* Expenses expensesEntity = itemHelper.createExpense(itemModal); */
			onlineShopingService.onlineserCreatePost(onlienPurchage);
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
	/*------------------BILLING_ONLINE_PURCHAGE_ITEM---------------------------*/
	@RequestMapping(value = InventoryURIConstant.BILLING_ONLINE_PURCHAGE_ITEM, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createOnlinepurchage(@RequestBody OnlineShopingContext onlineShopeingContext) {
		try {
			System.out.println("purchageOrderContext   : "+onlineShopeingContext.getCustomerAddress());
			System.out.println("purchageOrderContext   : "+onlineShopeingContext.getCustomerName());
			List<OnlinePurchageModal> data = onlineShopeingContext.getData();
			System.out.println("printing list objects -------  ");
			for(OnlinePurchageModal pm : data){
				System.out.println("data1 : "+pm.getItemname());
			}
			List<OnlinePurchage> onlineporchageOrder = onlineShopingHelper.createALLOnlinePurchageContext(data,onlineShopeingContext.getCustomerName(),onlineShopeingContext.getPhoneNumber(),onlineShopeingContext.getCustomerAddress(),onlineShopeingContext.getOrderDate(),onlineShopeingContext.getTotalAmout(),onlineShopeingContext.getStatus(),onlineShopeingContext.getPaymentType());
			
			onlineShopingService.postMultipleRecordsOnlinep(onlineporchageOrder);
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_PURCHAGEORDER_ITEM_BY_ORDERNO, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllOnlineItemByOrderId(@PathVariable("orderNO") String orderNO) {

		logger.info("selling details by sellingEntity . : "+ orderNO);
		List<OnlinePurchageModal> onlinePurchageModal = new ArrayList<OnlinePurchageModal>();
		System.out.println("item recrds details all.......:");
		try {
			onlinePurchageModal = onlineShopingService.fetchOnlinePurchageByOrderNO(orderNO);
			response = commonUtils.createResponseData("item detailsfetch",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", onlinePurchageModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}

}