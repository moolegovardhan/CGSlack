package com.cgs.pro94tek.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.InwardHelpers;
import com.cgs.pro94tek.healthcare.modal.InwardModal;
import com.cgs.pro94tek.healthcare.service.IInwardDataManagmentServices;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;




@Controller
public class InwardController  {
	
	
	@Autowired 
	IInwardDataManagmentServices  inwardService;
	
	private static final Logger logger = LoggerFactory.getLogger(InwardController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.CREATE_INWARD_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createInward(@RequestBody InwardModal inwardModal) {
		System.out.println("Inward controller...........:");
		try {
			System.out.println("Inward Name............."+inwardModal.getDealer());
			System.out.println("welcome invard");
			InwardHelpers   inwardHelper=new InwardHelpers();
			System.out.println("controller inward Helper...........:"+inwardHelper);
			Inward inward=inwardHelper.createInward(inwardModal);
			inwardService.createOrUpdateInward(inward);
			
			//iSpecialOffersService.createOrUpdateSpecialOfferById(specialOffer);   
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	
	@RequestMapping(value = InventoryURIConstant.GET_INWARD_PID, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchInwardpId(@PathVariable("pId") String pId){
		System.out.println("Inward controller...........:"+pId);
		logger.info("Inward detaials pId . : "+pId);
		InwardModal  inwardModal= new InwardModal ();
		

		try {
			inwardModal = inwardService.fetchInwardBypId(pId);
			response = commonUtils.createResponseData(inwardModal.getCreatedBy(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", inwardModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(inwardModal.getCreatedBy(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	

}
