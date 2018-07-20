package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.manager.SellingOrderConstant;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.PurchageOrderHealper;
import com.cgs.pro94tek.healthcare.helper.SellingOderHelper;
import com.cgs.pro94tek.healthcare.modal.AgentModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.service.ISellingDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
/*import com.cgs.pro94tek.utils.SellingOrderConstant;*/

@Controller
public class SellingOrderController {

	@Autowired
	ISellingDataManagementService sllingService;
	@Autowired
	SellingOderHelper sellingOrderHelper;

	private static final Logger logger = LoggerFactory
			.getLogger(SellingOrderController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.CREATE_SELLING_ORDER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createSellingOrder(@RequestBody SellingOrderListModal sellingOrderListModal) {

		try {
			System.out.println("expense Name............."+ sellingOrderListModal.getCustomerName());
			SellingOderList sellingOrder = sellingOrderHelper.createSellingList(sellingOrderListModal);
			/* Expenses expensesEntity = itemHelper.createExpense(itemModal); */
			sllingService.createOrUpdateSellingService(sellingOrder);
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

	/*@RequestMapping(value = InventoryURIConstant.GET_ALL_SELLING_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllItemDetails(SellingOderList sellingEntity) {
		
		logger.info("selling details by sellingEntity . : "+ sellingEntity.getCustomerName());
		List<SellingOrderListModal> sellingModal = new ArrayList<SellingOrderListModal>();
		System.out.println("item recrds details all.......:");
		try {
			sellingModal = sllingService.fetchAlSellingOrder(sellingEntity);
			response = commonUtils.createResponseData("item detailsfetch",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", sellingModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}*/

	@RequestMapping(value = InventoryURIConstant.GET_SELLING_ORDER_NAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAgentByid(@PathVariable("agentId") String agentId) {

		logger.info("agent detaials propetyId... . : " + agentId);
		SellingOrderListModal sellingtModal = new SellingOrderListModal();

		try {
			sellingtModal = sllingService.getSellingorderbyId(agentId);
			System.out.println("try in landproperty...........:"+ sellingtModal);
			response = commonUtils.createResponseData(sellingtModal.getAgent_name(),ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", sellingtModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(sellingtModal.getAgent_name(),ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}

	@RequestMapping(value = InventoryURIConstant.CREATE_SELLING_ORDER_MULTIPLE, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createSellingOrder(@RequestBody SellingOrderConstant sellingOrderconstant) {
		try {
			System.out.println();
			System.out.println("sellign order   : "+sellingOrderconstant.getCustomerName());
			System.out.println("sellign order ...: "+sellingOrderconstant.getCustaddress());
			List<SellingOrderListModal> data = sellingOrderconstant.getData();
			System.out.println("printing list objects -------  ");
			for(SellingOrderListModal sellingModal : data){
				System.out.println("data1 : "+sellingModal.getAgent_name());
			}
			List<SellingOderList> sellingOrder = sellingOrderHelper.createALLSellingOrderList(data,sellingOrderconstant.getCustaddress(),sellingOrderconstant.getCustomerName(),sellingOrderconstant.getMobileNumber(),sellingOrderconstant.getSellingDate(),sellingOrderconstant.getTotalAmount());
			sllingService.createMultipleRecords(sellingOrder);
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
	@RequestMapping(value = InventoryURIConstant.GET_SELLING_ORDER_BY_NO, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAgentBySellingOrderNo(@PathVariable("selOrderNo") String selOrderNo) {

		logger.info("agent detaials propetyId... . : " + selOrderNo);
		List<SellingOrderListModal> sellingtModal = new ArrayList<SellingOrderListModal>();

		try {
			sellingtModal = sllingService.fetchAlSellingOrderByNo(selOrderNo);
			System.out.println("try in landproperty...........:"+ sellingtModal);
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", sellingtModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.GET_ALL_SELLING_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllItemDetails() {
		List<SellingOrderListModal> sellingModal = new ArrayList<SellingOrderListModal>();
		try {
			sellingModal = sllingService.fetchAllSellingOrders();
			response = commonUtils.createResponseData("item detailsfetch",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", sellingModal);

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
