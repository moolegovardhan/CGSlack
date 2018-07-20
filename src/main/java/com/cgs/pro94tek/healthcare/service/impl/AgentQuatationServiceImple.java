package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentQuationDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMySubCategoryDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.AgentQuationHelper;
import com.cgs.pro94tek.healthcare.helper.SellingOderHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.service.IAgentQuatationDataManageService;


@Service("agentQuatation")
public class AgentQuatationServiceImple implements IAgentQuatationDataManageService{
	@Autowired
	private IAgentQuationDao  agentQdao;
	
	@Autowired
	AgentQuationHelper agentQuationHelper;

	@Override
	public List<AgentQuationModal> fetchAllAgents()
			throws PMSException {
		// TODO Auto-generated method stub
		List<String> sellingOrderNos=agentQdao.fetchAllAgent();
		AgentQuationHelper agentqhelper=new AgentQuationHelper();
		return agentqhelper.createALLAgentQuatationNO1Modal(sellingOrderNos);
	}

	@Override
	public List<AgentQuationModal> fetchAllQuation(String quationNO)
			throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAgentId(Long sellingId) throws PMSException {
		// TODO Auto-generated method stub
		return agentQdao.deleteAgnetById(sellingId);
	}
	
	@Override
	public void createMultipleRecords(List<AgentsQuatations> agentEntity)
			throws PMSException {								
		// TODO Auto-generated method stub
		List<AgentsQuatations> agentquatationObject = agentQdao.createOrUpdateAgent(agentEntity);
		if(agentquatationObject != null && agentquatationObject.size() > 0){
			for (Object object : agentquatationObject)
			{				
					AgentsQuatations agnetQuatatioObj = (AgentsQuatations)object;
					String agentOrderNo = "Cgssel"+agnetQuatatioObj.getId();
					agnetQuatatioObj.setSellingodNo(agentOrderNo);
					agentQdao.createOrUpdateAgent(agnetQuatatioObj);
			}
		}
		
		
	}/*List<SellingOderList> sellingObjects = sellingOrdreDao.createMultipleRecords(sellOrder);
	if(sellingObjects != null && sellingObjects.size() > 0){
		for (Object object : sellingObjects){
			SellingOderList sellingObj = (SellingOderList)object;
			String sellingOrderNo = "cgssel"+sellingObj.getId();
			sellingObj.setSellingOderNumber(sellingOrderNo);
			sellingOrdreDao.createOrUpdateSelleingOrder(sellingObj);
		}
	}*/

	@Override
	public List<AgentQuationModal> fetchAllAgentByname(String agnetName)
			throws PMSException {
		
		List<AgentsQuatations> agentQuatatrion=agentQdao.fetchAllAgentByname(agnetName);
		AgentQuationHelper agentqhelper=new AgentQuationHelper();
		return agentqhelper.createALLAgentsModal(agentQuatatrion);
	}

	@Override
	public void updateAgentQuatation(AgentQuationModal agentQuatationModal,
			String id) throws PMSException {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateAgentQuaObj(AgentQuationModal agentQuatationModal,String id){
		try{
		 AgentsQuatations agentObj = agentQdao.getAgnetById(Long.parseLong(id));
		 System.out.println("agentObj ph : "+agentObj.getMobileNumber());
		 AgentsQuatations agentEntity = agentQuationHelper.createAgentQuatationEntity(agentQuatationModal,agentObj);
		 System.out.println("agentEntity ph : "+agentEntity.getMobileNumber());
		 agentQdao.createOrUpdateAgent(agentEntity);
		 return true;
		}catch(Exception e){
			 return false;			
		}
		
	}

	@Override
	public void createNestedRecords(List<AgentsQuatations> agentEntity)
			throws PMSException {
		List<AgentsQuatations> agentquatationObject = agentQdao.createOrUpdateAgent(agentEntity);
			if(agentquatationObject != null && agentquatationObject.size() > 0)
			{
				Long id = agentquatationObject.get(0) != null ? agentquatationObject.get(0).getId() : 555; 
				String agentOrderNo = "Cgssel"+id;
				for(Object object : agentquatationObject)
				{
				AgentsQuatations agnetQuatatioObj = (AgentsQuatations)object;			
				agnetQuatatioObj.setSellingodNo(agentOrderNo);
				agentQdao.createOrUpdateAgent(agnetQuatatioObj);
				}
		
			
		
			}
	}

	@Override
	public List<AgentQuationModal> fetchAllAgentByorderNO(String orderNO)
			throws PMSException {
		System.out.println("enter the value serviceimp.....:");
		List<AgentsQuatations> agentQuatatrion=agentQdao.fetchAllAgentByorderNO(orderNO);
		AgentQuationHelper agentqhelper=new AgentQuationHelper();
		return agentqhelper.createALLAgentsModal(agentQuatatrion);
	}
}
