package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;

public interface IAgentDAO {
	
	public Construction_Agents  fetchAgentId(String agentName)throws DataAccessException;
	public boolean deleteByAgentId(String agentId)throws DataAccessException;
	public Construction_Agents createOrUpdateAgent(Construction_Agents agentEntity) throws DataAccessException;
	
	

}
