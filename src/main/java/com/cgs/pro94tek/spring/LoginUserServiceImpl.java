package com.cgs.pro94tek.spring;

import org.apache.log4j.jmx.Agent;
import org.springframework.beans.factory.annotation.Autowired;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;

public class LoginUserServiceImpl  implements ILoginUserService{
	
	
	private ILoginUserService serviceType=null;
	@Autowired
	AgentsQuatations  agent;
	@Autowired
	Customer  customer;
	AgentQuationModal agentModal;
	@Autowired
	User user;
	@Override
	public void loginCreate() {
		// TODO Auto-generated method stub
		/*if(user.getServiceType() .equals(agentModal.getId()))
		{
			serviceType=new AgentQuationModal();
		}
		else(user.getServiceType().equals(anObject))
		*/
	}

	@Override
	public void login(String userName, String password) {
		// TODO Auto-generated method stub
		/*if(serviceType.equals(agent.getAgent_no()) )
		{
			serviceType=new AgentsQuatations();
		}
		else(serviceType.equals(customer.getCust_regNo()))
		{
			serviceType=new Customer();
		}*/
	}

}
