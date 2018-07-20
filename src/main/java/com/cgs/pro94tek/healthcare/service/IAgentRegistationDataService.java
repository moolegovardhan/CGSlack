package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.AgentRegistation;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

@Component
public interface IAgentRegistationDataService {
	public void createAgent(AgentRegistation agentEntity)throws PMSException;

}
