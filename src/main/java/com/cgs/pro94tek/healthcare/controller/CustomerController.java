package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.HashMap;
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

import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CustomerHelper;
import com.cgs.pro94tek.healthcare.modal.CustomerModal;
import com.cgs.pro94tek.healthcare.service.ICustomerDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
import com.cgs.pro94tek.utils.SMSUtil;

@Controller
public class CustomerController {
	
	
	@Autowired
	ICustomerDataManagementService icustomerDataManagementService;
	@Autowired 
	CustomerHelper customerHelper;
	
	/*@Autowired
	User  user;*/
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.GET_CUSTOMER_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchCustomerDetailsById(@PathVariable("customerId") String customerId){

		logger.info("Customer details customerId . : "+customerId);
		List<CustomerModal> cusotmerModal = new ArrayList<CustomerModal>();

		try {
			cusotmerModal = icustomerDataManagementService.fetchCustomerById(customerId);
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cusotmerModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	/**
	 * this method will either create or update customer object
	 * @param customer
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.CREATE_CUSTOMER_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createCustomer(@RequestBody CustomerModal customerModal) {
		try {
			CustomerHelper cHelper = new CustomerHelper();
			Customer createCustEntity = cHelper.createCustomer(customerModal);
			Customer customer = icustomerDataManagementService.createOrUpdateCustomer(createCustEntity);
			System.out.println("cust.....................:"+customer);
			User user = icustomerDataManagementService.generateCustomerCredentials(customer);
			System.out.println("user.......................:"+user);
			String dr=CommonUtils.decryptPassword(user.getPassword());
			
			System.out.println("user.......................:"+dr+"uaername...."+user.getUserName());
			SMSUtil smsUtil= new SMSUtil();
			HashMap<String, String> params = new HashMap<String, String>();
			 params.put("user", "CGSGROUPTRANS");
			 params.put("pass", "123456");
			 params.put("sender", "CGSHCM");
			 params.put("phone",customerModal.getCustContactNo()+"");
			 params.put("text","user name ....:"+user.getUserName()+" "+"password.....:"+dr);
			 params.put("priority", "ndnd");
			 params.put("stype", "normal");
			 
			String resp = smsUtil.performPostCall("http://trans.smsfresh.co/api/sendmsg.php", params);
			logger.info("sms sent ..:"+resp);
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
	 * @param customerId
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.DELETE_CUSTOMER_DETAILS, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deletecustomer(@PathVariable("customerId") String customerId){
		try {
			
			
			Customer customerDetails = new Customer();
			boolean result = icustomerDataManagementService.deleteCustomerById(customerId);

			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", customerDetails);
			}else{

				Customer customerZero = new Customer();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", customerZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}
	@RequestMapping(value = InventoryURIConstant.CREATE_CUSTOMER_DETAILS_MULTIPLE, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createCusMul(@RequestBody List<CustomerModal> customerModal) {
	System.out.println("controll for create agentQuatationModal......:");
	List<Customer>  customerobj=new ArrayList<Customer>();
	try{
			System.out.println("hellow......................:");
			customerobj=customerHelper.createcustomerModalmul(customerModal);
			icustomerDataManagementService.createMultipleCustomer(customerobj);
			System.out.println(icustomerDataManagementService);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
	} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}


}
