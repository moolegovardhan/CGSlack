package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.AgentRegistation;

public interface IAgentRegistationDAO {
	
	public void createAgent(AgentRegistation  agentEnti)throws DataAccessException;

}
