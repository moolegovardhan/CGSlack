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
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SupplierHelper;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;
import com.cgs.pro94tek.healthcare.service.ISupplierDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class SupplierController {
	
	@Autowired
	ISupplierDataManagementService iSupplierDataManagementService;
	
	private static final Logger logger = LoggerFactory.getLogger(SupplierController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.GET_SUPPLIER_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchSupplierDetailsById(@PathVariable("supplierId") String supplierId){

		logger.info("Supplier details supplierId . : "+supplierId);
		List<SupplierModal> supplierModal = new ArrayList<SupplierModal>();

		try {
			supplierModal = iSupplierDataManagementService.fetchSupplierById(supplierId);
			response = commonUtils.createResponseData("Supplier Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", supplierModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Supplier Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	/**
	 * this method will either create or update supplier object
	 * @param supplier
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.CREATE_SUPPLIER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createSupplier(@RequestBody SupplierModal supplier) {
		
		try {
			System.out.println("Suplier Name............."+supplier.getSuppliername());
			SupplierHelper sHelper = new SupplierHelper();
			Supplier supplierEntity = sHelper.createSupplier(supplier);
			iSupplierDataManagementService.createOrUpdateSupplier(supplierEntity);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	
	/**
	 * this method is for delete operation
	 * @param supplierId
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.DELETE_SUPPLIER_DETAILS, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deletesupplier(@PathVariable("supplierId") String supplierId){
		try {
			// call service method by passing the serviceId - > isupplierDataManagementService

			Supplier supplierDetails = new Supplier();
			boolean result = iSupplierDataManagementService.deleteSupplierById(supplierId);

			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", supplierDetails);
			}else{

				Supplier supplierZero = new Supplier();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", supplierZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}
	@RequestMapping(value = InventoryURIConstant.GET_ALL_SUPPLIRE_DETAILS, method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody InventoryRequestResponse fetchAllSuppliar(Supplier suppliereEntity){

		logger.info("selling details by sellingEntity . : "+suppliereEntity.getContactpersonName());
		List<SupplierModal> suppliarModal = new ArrayList<SupplierModal>();
		System.out.println("item recrds details all.......:");
		try {
			suppliarModal = iSupplierDataManagementService.fetchAllSupplier(suppliereEntity);
			response = commonUtils.createResponseData("item detailsfetch", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", suppliarModal);

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
