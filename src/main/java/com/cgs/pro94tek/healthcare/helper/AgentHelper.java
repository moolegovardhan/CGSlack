package com.cgs.pro94tek.healthcare.helper;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.modal.AgentModal;

public class AgentHelper {
	
	public AgentModal createAgentModal(Construction_Agents cagent)
	{
	AgentModal agent=new AgentModal();
	
	agent.setId(cagent.getId());
	agent.setCity(cagent.getCity());
	agent.setAltphone(cagent.getAltphone());
	agent.setCard(cagent.getCard());
	agent.setAreaswant(cagent.getAreaswant());
	agent.setEmail(cagent.getEmail());
	agent.setFavorites(cagent.getFavorites());
	agent.setName(cagent.getName());
	agent.setPassword(cagent.getPassword());
	agent.setPhone(cagent.getPhone());
	agent.setName(cagent.getName());
	agent.setOfficeid(cagent.getOfficeid());
	agent.setStatus(cagent.getStatus());
	agent.setId_sell(cagent.getId());
	
	return agent;
	
	
	}
	public Construction_Agents  createAgent(AgentModal agent)
	{
		Construction_Agents  cagent= new Construction_Agents();
		
		cagent.setId(agent.getId());
		cagent.setCity(agent.getCity());
		cagent.setCard(agent.getCard());
		cagent.setAltphone(agent.getAltphone());
		cagent.setAreaswant(agent.getAreaswant());
		cagent.setEmail(agent.getEmail());
		cagent.setFavorites(agent.getFavorites());
		cagent.setName(agent.getName());
		cagent.setPassword(agent.getPassword());
		cagent.setPhone(agent.getPhone());
		cagent.setName(agent.getName());
		cagent.setOfficeid(agent.getOfficeid());
		cagent.setStatus(agent.getStatus());
		/*cagent.setId("1");*/
	
		return cagent;
	}

}
