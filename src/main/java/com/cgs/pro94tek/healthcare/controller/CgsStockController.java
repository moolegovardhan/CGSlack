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
import com.cgs.pro94tek.healthcare.dataaccess.manager.CgsStockContext;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsStockHelper;
import com.cgs.pro94tek.healthcare.modal.CgsStockModal;
import com.cgs.pro94tek.healthcare.service.ICgsStockDataManagementServices;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
import com.cgs.pro94tek.utils.SMSUtil;




@Controller
public class CgsStockController {
	
	@Autowired
	ICgsStockDataManagementServices cgsStockService;

	private static final Logger logger = LoggerFactory.getLogger(CgsStockController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.CREATE_CGSSTOCK_ORDER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createGgsStock(@RequestBody CgsStockModal cgsStockModal) 
		{
	System.out.println("controll for create agentQuatationModal......:"+cgsStockModal);
		CgsStock cgsStockObject=new CgsStock();
		try {
		System.out.println("Stock Name.............");
		CgsStockHelper  cgsHelper=new CgsStockHelper();
		cgsStockObject=cgsHelper.createALLCgsStock(cgsStockModal);
		cgsStockService.createCgsStcok(cgsStockObject);
		
		response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
			} catch (Exception e)
				{
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
				} 
		return response;
	
	}
		
	
	@RequestMapping(value = InventoryURIConstant.CREATE_JSON_DATA_CGSSTOCK_ORDER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createCgsStockNested(@RequestBody CgsStockContext cgsStockContext) {
		try {
			System.out.println("cgsStock.......: "+cgsStockContext.getRoleId());
			System.out.println("dealer phonenumber  : "+cgsStockContext.getDealerContectNo());
			List<CgsStockModal> cgsStockData = cgsStockContext.getCgsStockData();
			System.out.println("printing list objects -------  "+cgsStockData);
										
			for(CgsStockModal cgsmodal : cgsStockData){
				System.out.println("data1 : "+cgsmodal.getDealerName());
			}
			/*CgsStock cstock=new CgsStock();
			SMSUtil smsUtil= new SMSUtil();
			HashMap<String, String> params = new HashMap<String, String>();
			 params.put("user", "CGSGROUPTRANS");
			 params.put("pass", "123456");
			 params.put("sender", "CGSHCM");
			 params.put("phone",cgsStockContext.getDealerContectNo()+"");
			 params.put("text","Thanking u for Shopping");
			 params.put("priority", "ndnd");
			 params.put("stype", "normal");
			 
			String resp = smsUtil.performPostCall("http://trans.smsfresh.co/api/sendmsg.php", params);
			logger.info("sms sent ..:"+resp);*/
			
			CgsStockHelper  cgsHelper=new CgsStockHelper();
			List<CgsStock> cgsStock = cgsHelper.createCgsStockNested(cgsStockData, cgsStockContext.getDealerName(), cgsStockContext.getDealerContectNo(),cgsStockContext.getTotalAmount(),cgsStockContext.getCustomerName(),cgsStockContext.getCustomerAddress(),cgsStockContext.getRoleId(),cgsStockContext.getCustMobileNO());
			cgsStockService.createCgsStockNested(cgsStock); 
						
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
			ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_ALL_CGSSTOCK_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllCgsStockGroupBy(){

		logger.info("purchage details by . : ");
		List<CgsStockModal> cgsStockModal = new ArrayList<CgsStockModal>();
		System.out.println("item recrds details all.......:");
		try {
			cgsStockModal = cgsStockService.fetchAllCgsStock();
			response = commonUtils.createResponseData("item detailsfetch", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cgsStockModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_CGSSTOCK_BY_ORDERNO, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchByStockOrderNO(@PathVariable("orderNo") String orderNo)
		
	{	System.out.println("help cate");
		logger.info("CgsStock details by categoryName . : "+orderNo);
		List<CgsStockModal> cgsStockModal = new ArrayList<CgsStockModal>();
	
		try {
			cgsStockModal = cgsStockService.fetchAllCgsStockByorderNO(orderNo);
			
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cgsStockModal);
			System.out.println("response.......:"+response);
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	@RequestMapping(value = InventoryURIConstant.DELETE_CGSSTOCK_ORDER_ID, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteStockById(@PathVariable("orederid") Long orederid)
	{	
	try {
		System.out.println("help cate");
		CgsStock cgsstockObj = new CgsStock();
		boolean result=cgsStockService.deleteCgsstockById(orederid);
		if(result){
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", cgsstockObj);
		}else{

			CgsStock cgsstockz = new CgsStock();
			response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", cgsstockz);

		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
		}
@RequestMapping(value = InventoryURIConstant.CGSSTOCK_UPDATE_DETAILS, method = RequestMethod.PUT, produces = "application/json")
	
	public @ResponseBody InventoryRequestResponse updateCgsStock(@RequestBody CgsStockModal cgsStockModal,@PathVariable("id") String id){
		
		System.out.println("controll for create id.......:"+id);
		System.out.println("dealer Name............."+cgsStockModal.getItemPrice());
		try {			
			if(id != null && !"".equals(id)){			 
			boolean status = cgsStockService.updateCgsStock(cgsStockModal, id);
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
/*@RequestMapping(value = InventoryURIConstant.CGSSTOCK_UPDATE_AMOUNT_DETAILS, method = RequestMethod.PUT, produces = "application/json")

public @ResponseBody InventoryRequestResponse updateCgsStockAmount(@RequestBody CgsStockModal cgsStockModal,@PathVariable("id") String id){
	
	System.out.println("controll for create id.......:"+id);
	System.out.println("dealer Name............."+cgsStockModal.getItemPrice());
	try {			
		if(id != null && !"".equals(id)){			 
		boolean status = cgsStockService.updateCgsStock(cgsStockModal, id);
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
}*/
@RequestMapping(value = InventoryURIConstant.CGSSTOCK_UPDATE_PURCHGE_DETAILS, method = RequestMethod.PUT, produces = "application/json")

public @ResponseBody InventoryRequestResponse updateCgsStockPurchageOrder(@PathVariable("id") Long id,@PathVariable("totalAmount") Long totalAmount){
	
	System.out.println("controll for create id.......:"+id);
	System.out.println("dealer amount............."+totalAmount);
	try {			
		if(id != null && !"".equals(id)){			 
		CgsStock status = cgsStockService.updatePurchageAmount(id, totalAmount);
			if(status !=null){  
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
@RequestMapping(value = InventoryURIConstant.CGSSTOCK_UPDATE_SELLING_DETAILS, method = RequestMethod.PUT, produces = "application/json")

public @ResponseBody InventoryRequestResponse updateCgsStockSellingOrder(@PathVariable("id") String id,@RequestBody CgsStockModal cgsStockModal){
	
	System.out.println("controll for create id.......:"+id);
	System.out.println("dealer amount.............");
	try {			
		if(id != null && !"".equals(id)){			 
			boolean status = cgsStockService.updateSellingAmount(cgsStockModal, id);
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


@RequestMapping(value = InventoryURIConstant.GET_CGSSTOCK_STATUSTRACK_BY_ORDERNO, method = RequestMethod.GET, produces = "application/json")
public @ResponseBody InventoryRequestResponse fetchByStockorderStatus(@PathVariable("orderNo") String orderNo)
	
{	System.out.println("help cate");
	logger.info("CgsStock details by categoryName . : "+orderNo);
	List<CgsStockModal> cgsStockModal = new ArrayList<CgsStockModal>();

	try {
		cgsStockModal = cgsStockService.fetchAllCgsStockTracking(orderNo);
		
		response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cgsStockModal);
		System.out.println("response.......:"+response);
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
