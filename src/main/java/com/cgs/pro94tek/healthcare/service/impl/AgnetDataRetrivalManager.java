package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentHelper;
import com.cgs.pro94tek.healthcare.modal.AgentModal;
import com.cgs.pro94tek.healthcare.service.IAgentDataManagementService;

@Service("agentdataretrival")
public class AgnetDataRetrivalManager implements IAgentDataManagementService {

	@Autowired
	private IAgentDAO agentDAO;

	@Override
	public AgentModal fetchAgentId(String agentName) throws PMSException {
		// TODO Auto-generated method stub

		Construction_Agents cagent = agentDAO.fetchAgentId(agentName);
		AgentHelper agHelper = new AgentHelper();
		return agHelper.createAgentModal(cagent);
	}

	@Override
	public boolean deleteByAgentId(String agentName) throws PMSException {
		// TODO Auto-generated method stub
		return agentDAO.deleteByAgentId(agentName);
	}

	@Override
	public void createOrUpdateAgent(Construction_Agents agentEntity)
			throws PMSException {
		// TODO Auto-generated method stub
/*
		Construction_Agents object = agentDAO.createOrUpdateAgent(agentEntity);
		System.out.println("id of selling *****  " + object.getId());
		String agentorderNo = "agent" + object.getId();
		object.getId();*/
		agentDAO.createOrUpdateAgent(agentEntity);
	}

}
