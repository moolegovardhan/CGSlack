package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.manager.PurchageOrderContext;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.DealerAdressHelper;
import com.cgs.pro94tek.healthcare.helper.PurchageOrderHealper;
import com.cgs.pro94tek.healthcare.helper.SupplierHelper;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.DealerAdressModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;
import com.cgs.pro94tek.healthcare.service.IPurchageOrderManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
/*import com.cgs.pro94tek.utils.PurchageOrderContext;*/
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class PurchageOrderController {
	@Autowired
	IPurchageOrderManagementService purchageOrderService;
	@Autowired
	PurchageOrderHealper purchageHelper;
	private static final Logger logger = LoggerFactory
			.getLogger(PurchageOrderController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.GET_PURCHAGEORDER_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchPurchgeOrderDetailsBymedicineName(
			@PathVariable("medicineName") String medicineName) {
		System.out.println("fetching data............");
		logger.info("PurchageOrder detaials controller.............: "
				+ medicineName);
		System.out
				.println("PurchageOrder detaials Controller.class............:"
						+ medicineName);
		PurchageOrderModal purchageOrderModal = new PurchageOrderModal();
		// PurchageOrder purchageOrder=new PurchageOrder();
		try {
			purchageOrderModal = purchageOrderService.fetchBymedicinename(medicineName);
			response = commonUtils.createResponseData(
					purchageOrderModal.getSupplierName(),
					ResponseMessages.GENERALL_FETCH_SUCCESS,
					ResponseMessages.SUCCESS, "1", purchageOrderModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(
					purchageOrderModal.getSupplierName(),
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"1", e.getMessage());
		}

		return response;
	}

	@RequestMapping(value = InventoryURIConstant.DELETE_PURCHAGEORDER_DETAILS, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deletesupplier(
			@PathVariable("itemId") String itemId) {
		try {

			System.out.println("delete purchage item.........." + itemId);
			// call service method by passing the serviceId - >
			// isupplierDataManagementService

			PurchageOrder purchageOrder = new PurchageOrder();
			boolean result = purchageOrderService.updateItemByPId(itemId);

			if (result) {
				response = commonUtils.createResponseData("Done",
						ResponseMessages.GENERALL_DELETE_SUCCESS,
						ResponseMessages.SUCCESS, "1", purchageOrder);
			} else {

				PurchageOrder purchageOrderZero = new PurchageOrder();
				response = commonUtils.createResponseData("Zero records found",
						ResponseMessages.GENERALL_DELETE_SUCCESS,
						ResponseMessages.SUCCESS, "0", purchageOrderZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"0", e);
		}
		return response;

	}

	@RequestMapping(value = InventoryURIConstant.CREATE_PURCHAGE_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createPurchageOrder(
			@RequestBody PurchageOrderModal purchagemodal) {

		System.out
				.println("controll for create dealer.......:" + purchagemodal);
		try {
			System.out.println("dealer Name............."+ purchagemodal.getItemName());
			PurchageOrderHealper phelper = new PurchageOrderHealper();
			System.out.println("contrl of phelper....:  " + phelper);
			PurchageOrder porder = phelper.createpurchageOrderDetails(purchagemodal);
			purchageOrderService.createOrUpdateMName(porder);
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

	/* ----------------------GET ALL DATA ----------------------------- */

	@RequestMapping(value = InventoryURIConstant.GET_PURCHAGEORDER_ALL_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchByProName(
			@PathVariable("mName") String mName) {
		System.out.println("purchageoreder details.............:" + mName);
		logger.info("category details by categoryName . : " + mName);
		List<PurchageOrderModal> paModal = new ArrayList<PurchageOrderModal>();
		System.out.println("category recrds details all.......:");
		try {
			paModal = purchageOrderService.fetchAllMedicinName(mName);
			response = commonUtils.createResponseData(
					"ParchageOrder Details Fetch ",
					ResponseMessages.GENERALL_FETCH_SUCCESS,
					ResponseMessages.SUCCESS, "1", paModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(
					"Customer Details Fetch ",
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"1", e.getMessage());
		}

		return response;
	}

	/* ..................get all records................. */

	@RequestMapping(value = InventoryURIConstant.GET_PURCHAGEORDER_ALL_DETAILS_STATIC, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllCategoryDetails(PurchageOrder purchageOrderEntity) {

		logger.info("purchage datails in sql......... . : "
				+ purchageOrderEntity.getItemId());
		List<PurchageOrderModal> parchageOrderModal = new ArrayList<PurchageOrderModal>();
		System.out.println("category recrds details all.......:");
		try {
			parchageOrderModal = purchageOrderService.fetchAllPurchageOrder(purchageOrderEntity);response = commonUtils.createResponseData("purchageOrdre Details Fetch ",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", parchageOrderModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,
					"1", e.getMessage());
		}

		return response;
	}


	
	@RequestMapping(value = InventoryURIConstant.CREATE_MULTIPLE_PURCHAGEORDER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createpurchage(
			@RequestBody PurchageOrderContext purchageOrderContext) {
		try {
			System.out.println("purchageOrderContext   : "+purchageOrderContext.getOfficeId());
			System.out.println("purchageOrderContext   : "+purchageOrderContext.getSupplierName());
			List<PurchageOrderModal> data = purchageOrderContext.getData();
			System.out.println("printing list objects -------  ");
			for(PurchageOrderModal pm : data){
				System.out.println("data1 : "+pm.getItemId());
			}
			List<PurchageOrder> porchageOrder = purchageHelper.inserMultiplepurchageOrderList(data,purchageOrderContext.getOfficeId(),purchageOrderContext.getSupplierName());
			purchageOrderService.createMultipleRecords(porchageOrder);
			
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
					ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
}
