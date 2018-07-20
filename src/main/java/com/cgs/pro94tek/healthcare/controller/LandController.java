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

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.LandHelper;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.LandModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.healthcare.service.ISchoolDataRetrivalService;
import com.cgs.pro94tek.healthcare.service.LandDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
@Controller
public class LandController {
	

	

		@Autowired 
		LandDataRetrivalService landService;

		private static final Logger logger = LoggerFactory.getLogger(LandController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
		


		@RequestMapping(value = InventoryURIConstant.GET_LAND_DETAILS, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchlandDetailsById(@PathVariable("landid") String landid){

			logger.info("LandController detaials schoolid . : "+landid);
			
			LandModal landModal = new LandModal();

			try {
				landModal = landService.fetchLandById(landid);
				response = commonUtils.createResponseData(landModal.getBuy(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", landModal);

			} catch (PMSException e) {
				// TODO Auto-generated catch block
				logger.error(" In message Error"+e.getMessage());
				logger.error(" In cause Error"+e.getCause());

				e.printStackTrace();
				response = commonUtils.createResponseData(landModal.getBuy(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}

			return response;
		}
		
		@RequestMapping(value = InventoryURIConstant.DELETE_LAND_ID, method = RequestMethod.DELETE, produces = "application/json")
		public @ResponseBody InventoryRequestResponse deleteById(@PathVariable("landid") String landid){
			System.out.println("delete land id.............:"+landid);
			try {
				// call service method by passing the expensesId - > ISchoolDataService
				boolean result = landService.deletelandById(landid);
				Land landZero = new Land();
				if(result){
					response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", landZero);
				}else{
					response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", landZero);

				}

			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
			} 
			return response;
	}
		@RequestMapping(value = InventoryURIConstant.CREATE_LAND_ID, method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody InventoryRequestResponse createItem(@RequestBody LandModal landModal) {
			// SchoolModal is just used for controller and DataRetrieval service only.
			// School is used for Database Interaction - Hibernate, why because School class is having all configurations of database, @Table, @Column
			// SchoolHelper is used only for converting School to SchoolModal and vice versa.
			try {
				System.out.println("land Name............."+landModal.getId());
				LandHelper  landHelper=new LandHelper();
				Land  land=landHelper.createland(landModal);
				/*Expenses expensesEntity = itemHelper.createExpense(itemModal);*/
				landService.createOrUpdateLand(land);
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
			} 
			return response;
		}

}
