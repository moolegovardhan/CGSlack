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

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;



import com.cgs.pro94tek.healthcare.dataaccess.manager.AgentQuationOrderContext;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentQuationHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.service.IAgentQuatationDataManageService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class AgentQuatationController {
	
	@Autowired 
	IAgentQuatationDataManageService   agnetQuationService;
	
	@Autowired
	AgentQuationHelper  agentQHelper;

	private static final Logger logger = LoggerFactory.getLogger(AgentQuatationController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.CREATE_AGENTQUATATION_ORDER_MULTIPLE, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createAgentquation(@RequestBody List<AgentQuationModal> agentQuatationModal) {
	System.out.println("controll for create agentQuatationModal......:"+agentQuatationModal);
	List<AgentsQuatations>  agentObject=new ArrayList<AgentsQuatations>();
	try {
		System.out.println("dealer Name............."+agentObject);
		agentObject=agentQHelper.createALLAgentQuatation(agentQuatationModal);
		System.out.println("SELLING..........:"+agentObject);
		agnetQuationService.createMultipleRecords(agentObject);
		response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
	} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
		response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	@RequestMapping(value = InventoryURIConstant.GET_ALL_AGENTQUATATION_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllAgentQquation(){

		logger.info("selling details by sellingEntity . : ");
		List<AgentQuationModal> agentModal = new ArrayList<AgentQuationModal>();
		System.out.println("item recrds details all.......:");
		try {
			agentModal = agnetQuationService.fetchAllAgents();
			response = commonUtils.createResponseData("item detailsfetch", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", agentModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	/*---------------------------------GetAll Details BYName---------------------------- */
	@RequestMapping(value = InventoryURIConstant.GET_AGENTQUATION_ORDER_NAME, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchByName(@PathVariable("agentName") String agnetName)
		
	{	System.out.println("help cate");
		logger.info("category details by categoryName . : "+agnetName);
		List<AgentQuationModal> agentquationModal = new ArrayList<AgentQuationModal>();
	
		try {
			agentquationModal = agnetQuationService.fetchAllAgentByname(agnetName);
			
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", agentquationModal);
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
	/*---------------------------------GetAll Details BYName---------------------------- */
	@RequestMapping(value = InventoryURIConstant.GET_AGENQUATATION_BY_ORDERNO, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchBySellingOrderNO(@PathVariable("orderNo") String orderNO)
		
	{	System.out.println("help cate");
		logger.info("category details by categoryName . : "+orderNO);
		List<AgentQuationModal> agentquationModal = new ArrayList<AgentQuationModal>();
	
		try {
			agentquationModal = agnetQuationService.fetchAllAgentByorderNO(orderNO);
			
			response = commonUtils.createResponseData("subcategory Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", agentquationModal);
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
	
	/*--------------------/protek/create/agentquation/update/record-----------------*/
	
	
	
	@RequestMapping(value = InventoryURIConstant.AGENTQUATATION_UPDATE, method = RequestMethod.PUT, produces = "application/json")
	
	public @ResponseBody InventoryRequestResponse updateAgentQuatation(@RequestBody AgentQuationModal agentQuatationModal,@PathVariable("id") String id){
		
		System.out.println("controll for create id.......:"+id);
		System.out.println("dealer Name............."+agentQuatationModal.getMobileNumber());
		try {			
			if(id != null && !"".equals(id)){			 
			boolean status = agnetQuationService.updateAgentQuaObj(agentQuatationModal,id);
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
	/*-----------------------------JosonDataImplementation------------------*/
	@RequestMapping(value = InventoryURIConstant.CREATE_JSON_DATA_AGENT_QUATATION, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createAgentQuatationNeste(@RequestBody AgentQuationOrderContext agentQuationOrderContext) {
		try {
			System.out.println("AgentQuationOrderContext   : "+agentQuationOrderContext.getAgent_name());
			System.out.println("purchageOrderContext   : "+agentQuationOrderContext.getAgentid());
			List<AgentQuationModal> data = agentQuationOrderContext.getData();
			System.out.println("printing list objects -------  ");
			for(AgentQuationModal agmodal : data){
				System.out.println("data1 : "+agmodal.getAgent_no());
			}
			List<AgentsQuatations> agentsQuatations = agentQHelper.createNestedAgentQuatation(data,agentQuationOrderContext.getCustomerName(),agentQuationOrderContext.getMobileNumber(),agentQuationOrderContext.getAgent_name(),agentQuationOrderContext.getTotalAmount(),agentQuationOrderContext.getSellingDate(),agentQuationOrderContext.getAgentid(),agentQuationOrderContext.getCustomerAddress());
			
			agnetQuationService.createNestedRecords(agentsQuatations); 
			
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
			ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
@RequestMapping(value = InventoryURIConstant.DELETE_AGENTQUATION_ORDER_ID, method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteByName(@PathVariable("sellingId") Long sellingId)
	{	
	try {
		System.out.println("help cate");
		AgentsQuatations agequatation = new AgentsQuatations();
		boolean result=agnetQuationService.deleteAgentId(sellingId);
		if(result){
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", agequatation);
		}else{

			AgentsQuatations agentZero = new AgentsQuatations();
			response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", agentZero);

		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
		}

}
