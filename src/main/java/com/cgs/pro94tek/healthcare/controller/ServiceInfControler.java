package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.ServiceInfo;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentQuationHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.healthcare.modal.ServiceInfoModal;
import com.cgs.pro94tek.healthcare.service.IAgentQuatationDataManageService;
import com.cgs.pro94tek.healthcare.service.IServiceDataManagmentService;
import com.cgs.pro94tek.healthcare.service.IServiceInfoDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class ServiceInfControler {
	
	@Autowired 
	IServiceInfoDataRetrivalService  serviceInfoData  ;
	
	@Autowired
	AgentQuationHelper  agentQHelper;

	private static final Logger logger = LoggerFactory.getLogger(ServiceInfControler.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.GET_SERVICEINFO_BY_NAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchServiceByName(@PathVariable("serviceName") String serviceName)
		
	{	System.out.println("help cate");
		logger.info("Service details by serviceName . : "+serviceName);
		List<ServiceInfoModal> serviceInfoModal = new ArrayList<ServiceInfoModal>();
	
		try {
			serviceInfoModal = serviceInfoData.fetchAllSercviceByName(serviceName);
			
			response = commonUtils.createResponseData("serviceInfo Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", serviceInfoModal);
			System.out.println("response.......:"+response);
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("serviceInfo Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}

	@RequestMapping(value = InventoryURIConstant.GET_ALL_SERVICEINFO_DETAILS, method = RequestMethod.GET, produces = "application/pdf")
	public @ResponseBody InventoryRequestResponse fetchAllServiceInfo(ServiceInfo serviceInfoEnt){

		logger.info("serviceInfoEnt details by serviceName... . : "+serviceInfoEnt.getServiceName());
		List<ServiceInfoModal> serviceModal = new ArrayList<ServiceInfoModal>();
		System.out.println("category recrds details all.......:");
		try {
			serviceModal = serviceInfoData.fetchAllServiceInfo(serviceInfoEnt);
			response = commonUtils.createResponseData("Category Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", serviceModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	/*<====================================service get for new=================================================>*/
	@RequestMapping(value = InventoryURIConstant.GET_ALL_SERVICEINFO_DETAILS_MUL, method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody InventoryRequestResponse fetchmulServiceInfo(ServiceInfo serviceInfoEnity){

		logger.info("category details by categoryName . : "+serviceInfoEnity);
		List<ServiceInfoModal> serviceInfoModal = new ArrayList<ServiceInfoModal>();
		System.out.println("category recrds details all.......:");
		try {
			serviceInfoModal = serviceInfoData.fetchAllServiceInfoMul(serviceInfoEnity);
			response = commonUtils.createResponseData("Category Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", serviceInfoModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_SERVICEINFO_BY_COMPANYNAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchServiceByCompanyName(@PathVariable("serviceid") String serviceid)
		
	{	System.out.println("help cate");
		logger.info("Service details by serviceName . : "+serviceid);
		List<ServiceInfoModal> serviceInfoModal = new ArrayList<ServiceInfoModal>();
	
		try {
			serviceInfoModal = serviceInfoData.fetchAllSercviceByComanyName(serviceid);
			
			response = commonUtils.createResponseData("serviceInfo Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", serviceInfoModal);
			System.out.println("response.......:"+response);
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("serviceInfo Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
}
