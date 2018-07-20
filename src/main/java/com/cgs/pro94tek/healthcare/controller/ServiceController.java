package com.cgs.pro94tek.healthcare.controller;

import java.io.*;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.OnlineShopingPurchageHelper;
import com.cgs.pro94tek.healthcare.helper.ServiceHelper;
import com.cgs.pro94tek.healthcare.modal.OnlinePurchageModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.ServiceModal;
import com.cgs.pro94tek.healthcare.service.IServiceDataManagmentService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
/*import com.cgs.pro94tek.utils.OnlineShopingContext;*/
import com.cgs.pro94tek.utils.ResponseMessages;
/*import com.cgs.pro94tek.utils.SellingOrderConstant;
*/
@Controller
public class ServiceController {
	

	@Autowired
	IServiceDataManagmentService iserviceDataManagementService;
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.GET_SERVICE_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchServiceDetailsById(@PathVariable("serviceId") String serviceId){

		logger.info("Service details serviceId . : "+serviceId);
		List<ServiceModal> serviceModal = new ArrayList<ServiceModal>();
		
		try {
			serviceModal = iserviceDataManagementService.fetchServiceById(serviceId);
			logger.error(serviceModal.toString());
			response = commonUtils.createResponseData("Service Details fetch", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", serviceModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());
			e.printStackTrace();
			response = commonUtils.createResponseData("Service Details fetch", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	/**
	 * this method will either create or update serivce object
	 * @param serivce
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.CREATE_SERVICE_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createService(@RequestBody ServiceModal service) {
		System.out.println("Service Name............."+service.getServiceName());
		try {
			System.out.println("Service Name............."+service.getServiceName());
			ServiceHelper sHelper = new ServiceHelper();
			Services serviceEntity = sHelper.createService(service);
			iserviceDataManagementService.createOrUpdateService(serviceEntity);
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
	 * @param serviceId
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.DELETE_SERVICE_DETAILS, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteService(@PathVariable("serviceId") String serviceId){
		try {
		

			Services serviceDetails = new Services();
			boolean result = iserviceDataManagementService.deleteServiceById(serviceId);

			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", serviceDetails);
			}else{

				Services serviceZero = new Services();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", serviceZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}
	
	@RequestMapping(value = InventoryURIConstant.CREATE_SERVICE_MULTIPLE_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createMultipleServiceOrder(@RequestBody  List<ServiceModal> serviceModal) 		
	{
		System.out.println("service");
		//List<Services> serviceEntity=new ArrayList<Services>();
		try {
			/*ServiceHelper  onlineserviceHelper=new ServiceHelper();
			System.out.println("expense Name............."+ serviceModal);
			serviceEntity = onlineserviceHelper.createserviceMultiple(serviceModal);
			iserviceDataManagementService.createOrUpdateServiceMultipule(serviceEntity);
*/			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.GET_MULTIPLE_SERVICE_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllServicesDetails(Services serviceEntity) {

		logger.info("selling details by service . : ");
		List<ServiceModal> serviceModal = new ArrayList<ServiceModal>();
		System.out.println("item recrds details all.......:");
		try {
			serviceModal = iserviceDataManagementService.fetchAllServices(serviceEntity);
			response = commonUtils.createResponseData("item detailsfetch",ResponseMessages.GENERALL_FETCH_SUCCESS,ResponseMessages.SUCCESS, "1", serviceModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error" + e.getMessage());
			logger.error(" In cause Error" + e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ",ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"1", e.getMessage());
		}

		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.CREATE_SERVICE_FILE_UPLOAD, method = RequestMethod.POST, produces = "application/pdf")
	public @ResponseBody String Uploadfile(@RequestParam("file") CommonsMultipartFile[] fileUpload) {	
		List serviceModal = new ArrayList<Services>();
		try{
			List<Services> serviceEntity=new ArrayList<Services>();
			if(fileUpload != null && fileUpload.length > 0){
			for (CommonsMultipartFile aFile : fileUpload){
				
				System.out.println("Saving file: " + aFile.getOriginalFilename());
				ServiceHelper sHelper = new ServiceHelper();
				serviceModal= sHelper.createserviceMultipleFiles(fileUpload);
				iserviceDataManagementService.createServiceMultipuleFile(serviceEntity);
				
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "success";
		}
	
}
