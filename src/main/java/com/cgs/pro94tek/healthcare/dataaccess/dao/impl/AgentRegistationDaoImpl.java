package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.AgentRegistation;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentRegistationDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;

@Repository()
public class AgentRegistationDaoImpl  extends CustomHibernateDaoSupport implements IAgentRegistationDAO{

	@Override
	public void createAgent(AgentRegistation agentEnti)
			throws DataAccessException {
		// TODO Auto-generated method stub
		getSession().save(agentEnti);
	}

}
