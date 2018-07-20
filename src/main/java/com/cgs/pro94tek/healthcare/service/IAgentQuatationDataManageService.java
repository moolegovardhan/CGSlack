package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;



@Component
public interface IAgentQuatationDataManageService {
	
	
	public List<AgentQuationModal>  fetchAllAgents()throws PMSException;
	public List<AgentQuationModal>  fetchAllQuation(String quationNO)throws PMSException;
	public boolean deleteAgentId(Long sellingId)throws PMSException;
	public void createMultipleRecords(List<AgentsQuatations> agentEntity)throws PMSException;
	public List<AgentQuationModal> fetchAllAgentByname(String agnetName)throws PMSException;
	public void updateAgentQuatation(AgentQuationModal  agentQuatationModal,String id) throws PMSException;
	public boolean updateAgentQuaObj(AgentQuationModal agentQuatationModal,String id)throws PMSException; 
	public void createNestedRecords(List<AgentsQuatations> agentEntity)throws PMSException;
	public List<AgentQuationModal> fetchAllAgentByorderNO(String orderNO)throws PMSException;
}
