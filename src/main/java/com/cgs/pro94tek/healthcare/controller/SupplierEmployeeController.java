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

import com.cgs.pro94tek.healthcare.bean.CgsStock;
import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.SupplierEmployee;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.helper.SupplierEmployeeHelper;
import com.cgs.pro94tek.healthcare.modal.CgsRolesModal;
import com.cgs.pro94tek.healthcare.modal.SupplierEmployeeModal;
import com.cgs.pro94tek.healthcare.service.ISupEumployeeDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
import com.cgs.pro94tek.utils.SMSUtil;
@Controller
public class SupplierEmployeeController {
	
		
		@Autowired
		ISupEumployeeDataRetrivalService sEmployeeServices;
		
		private static final Logger logger = LoggerFactory.getLogger(SupplierEmployeeController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

		@RequestMapping(value = InventoryURIConstant.CREATE_SUPLIER_EMPLOYEE_DETAILS, method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody InventoryRequestResponse createSupplierEmployee(@RequestBody SupplierEmployeeModal sEmployeeModal) {
			try {
				System.out.println("employee phone no.....:"+sEmployeeModal.getPhoneNumber());
				SupplierEmployeeHelper eHelper = new SupplierEmployeeHelper();
				SupplierEmployee createEmpEntity = eHelper.createSupplierEmployee(sEmployeeModal);
				SupplierEmployee supplierEmployee = sEmployeeServices.createOrUpdateSupplierEmployee(createEmpEntity);
				System.out.println("cust.....................:"+supplierEmployee);
				User user = sEmployeeServices.generateEmployeeCredentials(supplierEmployee);
				System.out.println("user.......................:"+user.getPassword()+"phone no....:"+user.getPhoneNumber());
				String dr=CommonUtils.decryptPassword(user.getPassword());
				
				System.out.println("user.......................:"+dr+"uaername...."+user.getUserName());
				SMSUtil smsUtil= new SMSUtil();
				HashMap<String, String> params = new HashMap<String, String>();
				 params.put("user", "CGSGROUPTRANS");
				 params.put("pass", "123456");
				 params.put("sender", "CGSHCM");
				 params.put("phone",sEmployeeModal.getPhoneNumber()+"");
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
		@RequestMapping(value = InventoryURIConstant.GET_SUPPLIER_EMPLOYEE_DETAILS, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchcgsRole(SupplierEmployee   supEmployee){
			System.out.println("enter the conteroller of item");
			System.out.println("cgsRolesDao 55 ");
			logger.info("Item detaials ItemId . : ");
			List<SupplierEmployeeModal>  supEmpModal= new ArrayList<SupplierEmployeeModal>();
			

			try {
				supEmpModal = sEmployeeServices.getSupEmployeDetails(supEmployee);
				System.out.println("try in item...........:"+supEmpModal);
				response = commonUtils.createResponseData("cgsRoles", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", supEmpModal);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.error(" In message Error"+e.getMessage());
				logger.error(" In cause Error"+e.getCause());

				e.printStackTrace();
				response = commonUtils.createResponseData("cgsRoles", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}

			return response;
		}
		@RequestMapping(value = InventoryURIConstant.DELETE_SHOPER_EMPLOYEE_ORDER_ID, method = RequestMethod.PUT, produces = "application/json")
		public @ResponseBody InventoryRequestResponse deleteStockById(@PathVariable("sempId") Integer sempId)
		{	
		try {
			System.out.println("help cate");
			SupplierEmployee sEmployeeObj = new SupplierEmployee();
			boolean result=sEmployeeServices.deleteshopEmployeeById(sempId);
			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", sEmployeeObj);
			}else{
				SupplierEmployee sEmployeeObjz = new SupplierEmployee();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", sEmployeeObjz);

			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return response;
			}
		
}
