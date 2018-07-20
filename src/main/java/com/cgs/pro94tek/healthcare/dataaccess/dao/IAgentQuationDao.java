package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentQuationHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
public interface IAgentQuationDao {
	
	public List<String>  fetchAllAgent()throws DataAccessException; 
	public boolean deleteAgnetById(Long sellingId)throws DataAccessException;
	public List<AgentsQuatations> createOrUpdateAgent(List<AgentsQuatations> agentEntity) throws DataAccessException;
	public List<AgentsQuatations>  fetchAllAgentByname(String agnetName)throws PMSException;
	public AgentsQuatations createOrUpdateAgent(AgentsQuatations agentEntity)throws PMSException;
	public void  updateAgentQuation(AgentsQuatations  ageqt,String id)throws PMSException;
	public AgentsQuatations getAgnetById(Long agentId)throws DataAccessException;
	public List<AgentsQuatations> fetchAllAgentByorderNO(String orderNO)throws DataAccessException;
}      
