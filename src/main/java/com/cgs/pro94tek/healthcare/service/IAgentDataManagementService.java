package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.AgentModal;
import com.cgs.pro94tek.healthcare.modal.LandPropertyModal;


@Component
public interface IAgentDataManagementService {
	
	
		
		public AgentModal fetchAgentId(String agentName) throws PMSException;
		public boolean deleteByAgentId(String agentName)throws PMSException;
		public void createOrUpdateAgent(Construction_Agents agentEntity)throws PMSException;

}
