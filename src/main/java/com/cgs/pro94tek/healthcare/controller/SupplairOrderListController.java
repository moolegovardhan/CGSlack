package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.FormParam;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;







import com.cgs.pro94tek.healthcare.bean.SuppliarOrderList;
import com.cgs.pro94tek.healthcare.dataaccess.manager.SupplairOrderListConstant;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SupplairOrderListHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.SupplairOrderListModal;
import com.cgs.pro94tek.healthcare.service.ISupplairOrderListService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
import com.cgs.pro94tek.utils.SMSUtil;


@Controller
public class SupplairOrderListController {


	
	@Autowired
	ISupplairOrderListService   iSupplairOrderService;
	
	@Autowired
	SupplairOrderListHelper supplairHelper1;
	
	
	private static final Logger logger = LoggerFactory.getLogger(SupplairOrderListController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.CREATE_SUPPLAIRORDER_DETAILS, method = RequestMethod.POST, produces = "application/json")	
	public @ResponseBody InventoryRequestResponse createSupplairOrderList(@RequestBody SupplairOrderListModal supplairOrderModal) {
	System.out.println("controll for create supplairOrder......:"+supplairOrderModal);
	try {
			System.out.println("selling Name............."+supplairOrderModal.getSuppliarName());
			SupplairOrderListHelper  suplayaerHelper = new SupplairOrderListHelper();
			SuppliarOrderList suplairEntity =new SuppliarOrderList();
			suplairEntity=suplayaerHelper.createSupplair(supplairOrderModal);
			iSupplairOrderService.createOrUpdateSupplair(suplairEntity);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		}
		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.CREATE_SUPPLAIR_ORDER_MULTIPLE, method = RequestMethod.POST, produces = "application/json")	
	public @ResponseBody InventoryRequestResponse createSupplairOfdata(@RequestBody SupplairOrderListConstant supConstobj) {		
		try{
			SMSUtil smsUtil= new SMSUtil();
			HashMap<String, String> params = new HashMap<String, String>();
			 params.put("user", "CGSGROUPTRANS");
			 params.put("pass", "123456");
			 params.put("sender", "CGSHCM");
			 params.put("phone", supConstobj.getSupMobileNo()+"");
			 params.put("text", supConstobj.getSms()+" "+"GOOD EVINING FROM CGSLACS UR BALA ");
			 params.put("priority", "ndnd");
			 params.put("stype", "normal");
			 
			String resp = smsUtil.performPostCall("http://trans.smsfresh.co/api/sendmsg.php", params);
			logger.info("sms sent ..:"+resp);
			
			List<SupplairOrderListModal> order = supConstobj.getOrder();		
			List<SuppliarOrderList> suporderListObj=supplairHelper1.createALLSupplairOfdata(order,supConstobj.getSuppliarName(),supConstobj.getSupMobileNo());
			iSupplairOrderService.createSupplairOfdata(suporderListObj);
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
				
	}
		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.GET_SUPPLAIR_ORDER_BY_SUPPLIERNAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAgentBySupplierName(@PathVariable("supplierName") String supplierName)
	{
		System.out.println("selling ordedrdag..........:");
		logger.info("agent detaials propetyId... . : " + supplierName);
		List<SupplairOrderListModal> supModal = new ArrayList<SupplairOrderListModal>();

	try {
			supModal = iSupplairOrderService.fetchSupplierOrderRequest(supplierName);
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", supModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		
		return response;
	}
	
@RequestMapping(value = InventoryURIConstant.SUPPLIEROREDER_UPDATE_BY_ORDERNO, method = RequestMethod.PUT, produces = "application/json")

public @ResponseBody InventoryRequestResponse updateSup(@PathVariable("idSupplairOrder")  String idSupplairOrder ,@RequestBody SupplairOrderListModal supplierOrModal){
	
	System.out.println("controll for create id.......:"+supplierOrModal.getItemName()+"________"+supplierOrModal.getItemQuantity());
	System.out.println("dealer Name.............");
	try {			
		if(idSupplairOrder != null && !"".equals(idSupplairOrder)){			 
		boolean status = iSupplairOrderService.updateSupplierOrder(supplierOrModal, idSupplairOrder);
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

	