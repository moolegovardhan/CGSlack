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

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentHelper;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.LandPropetyHelper;
import com.cgs.pro94tek.healthcare.modal.AgentModal;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;
import com.cgs.pro94tek.healthcare.service.IAgentDataManagementService;
import com.cgs.pro94tek.healthcare.service.ILandPropetyDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class AgentsController {
	
	
		@Autowired
		
		IAgentDataManagementService  agentService;

		private static final Logger logger = LoggerFactory.getLogger(AgentsController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
		
		@RequestMapping(value = InventoryURIConstant.GET_AGENT_ID, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchAgentByid(@PathVariable("agentName") String agentName){

			logger.info("agent detaials propetyId... . : "+agentName);
			AgentModal agentModal =new AgentModal();
			

			try {
				agentModal = agentService.fetchAgentId(agentName);
				System.out.println("try in landproperty...........:"+agentModal);
				response = commonUtils.createResponseData(agentModal.getEmail(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", agentModal);

			} catch (PMSException e) {
				// TODO Auto-generated catch block
				logger.error(" In message Error"+e.getMessage());
				logger.error(" In cause Error"+e.getCause());

				e.printStackTrace();
				response = commonUtils.createResponseData(agentModal.getEmail(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}

			return response;
		}
		
		@RequestMapping(value = InventoryURIConstant.CREATE_AGENT_DETAILS, method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody InventoryRequestResponse createAgent(@RequestBody AgentModal agemtModal) {
			System.out.println("agent controller...........:");
			try {
				System.out.println("agent Name............."+agemtModal.getCity());
				AgentHelper  agentHelper=new AgentHelper();
				System.out.println("controller helper"+agentHelper);
				Construction_Agents  agentEntity=agentHelper.createAgent(agemtModal);
				/*Expenses expensesEntity = agentHelper.createAgent(agent);*/
				agentService.createOrUpdateAgent(agentEntity);
				System.out.println("agent service in .....:");
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
			} 
			return response;
		}

		@RequestMapping(value = InventoryURIConstant.DELETE_AGENTS_ID, method = RequestMethod.DELETE, produces = "application/json")
		public @ResponseBody InventoryRequestResponse deleteById(@PathVariable("agentName") String agentName){
			try {
				// call service method by passing the expensesId - > ISchoolDataService
				boolean result = agentService.deleteByAgentId(agentName);
				Construction_Agents agentZero = new Construction_Agents();
				if(result){
					response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", agentZero);
				}else{
					response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", agentZero);

				}

			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
				response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
			} 
			return response;
	}

}
