package com.cgs.pro94tek.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.InwardData;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.InwardDataHelper;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.modal.InwardDataModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.healthcare.modal.SpecialOfferModal;
import com.cgs.pro94tek.healthcare.service.IInwardDataManagmentServices;
import com.cgs.pro94tek.healthcare.service.ISpecialOffersService;
import com.cgs.pro94tek.healthcare.service.IWardDataManagementService;
import com.cgs.pro94tek.healthcare.service.InwardDataService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class InwardDataController {
	

	
		
		@Autowired 
		InwardDataService inwardDataModalService;

		private static final Logger logger = LoggerFactory.getLogger(InwardDataController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
		
		
		@RequestMapping(value = InventoryURIConstant.GET_INWARDDATA_DETAILS, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchInwardDataDetailsBypId(@PathVariable("porderid") String porderid){

			logger.info("Specialoffer.......... . : "+porderid);
			
			InwardDataModal inwardDataModal = new InwardDataModal();

			try {
				inwardDataModal = inwardDataModalService.fetchInwardata(porderid);
				response = commonUtils.createResponseData(inwardDataModal.getMrp(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", inwardDataModal);

			} catch (PMSException e) {
				// TODO Auto-generated catch block
				logger.error(" In message Error"+e.getMessage());
				logger.error(" In cause Error"+e.getCause());

				e.printStackTrace();
				response = commonUtils.createResponseData(inwardDataModal.getMrp(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}

			return response;
		}
		
		
		/*CREATEUPDATE*/
		
		@RequestMapping(value = InventoryURIConstant.CREATE_INWARDDATA_DETAILS, method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody InventoryRequestResponse createInwardData(@RequestBody InwardDataModal inward) {
			// SchoolModal is just used for controller and DataRetrieval service only.
			// School is used for Database Interaction - Hibernate, why because School class is having all configurations of database, @Table, @Column
			// SchoolHelper is used only for converting School to SchoolModal and vice versa.
			try {
				System.out.println("school Name............."+inward.getMedicine());
				InwardDataHelper inHelper = new InwardDataHelper();
				InwardData inwardDataEntity = inHelper.createinwardData(inward);
				inwardDataModalService.createOrUpdateInwardData(inwardDataEntity);
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
			} 
			return response;
		}
		

}
