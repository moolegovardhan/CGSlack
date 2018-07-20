package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentQuationDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("agentQuationDAO")
public class AgentQuatationDAOImp extends CustomHibernateDaoSupport implements IAgentQuationDao{
	 @SuppressWarnings ("unchecked")
	 @Transactional
	public boolean deleteAgnetById(Long sellingId) throws DataAccessException {
		// TODO Auto-generated method stub
		 String sqlQuary="Delete from AgentsQuatations where id = :sellingId";
		 Query query=getSession().createQuery(sqlQuary);
		 query.setParameter("sellingId", (sellingId));
			query.executeUpdate();
			
		return true;
	}

	
	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<AgentsQuatations> fetchAllAgentByname(String agnetName)
			throws PMSException {
		 List<AgentsQuatations> agentOder=new ArrayList<AgentsQuatations>();
		 String sqlQuary  = " from AgentsQuatations where agent_name = :agnetName";
			Query query = getSession().createQuery(sqlQuary);
			query.setParameter("agnetName",(agnetName));
			System.out.println(query);
			@SuppressWarnings("unchecked")
			List<AgentsQuatations> agentorders = query.list();
			if (PmsUtil.isCollectionNotEmpty(agentorders)) {
				return agentorders;
			}else{
				return agentOder;
		
			}
			
	}
	 @SuppressWarnings ("unchecked")
	 @Transactional
	 public List<AgentsQuatations> fetchAllAgentByorderNO(String orderNO)throws DataAccessException
	{
		List<AgentsQuatations> agentOder=new ArrayList<AgentsQuatations>();
	
	 String sqlQuary  = " from AgentsQuatations  where sellingodNo = :orderNO";
		Query query = getSession().createQuery(sqlQuary);
		query.setParameter("orderNO",orderNO);
		System.out.println(query);
		@SuppressWarnings("unchecked")
		List<AgentsQuatations> agentorders = query.list();
		if (PmsUtil.isCollectionNotEmpty(agentorders)) {
			return agentorders;
		}else{
			return agentOder;
	
		}
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<AgentsQuatations> createOrUpdateAgent(List<AgentsQuatations> agentEntity) throws DataAccessException {
		// TODO Auto-generated method stub

		if(agentEntity != null && agentEntity.size() > 0){
			for(AgentsQuatations obj : agentEntity)
			{
				getSession().saveOrUpdate(obj);
			}
		}	
	
		return agentEntity;
	}
	
	 @SuppressWarnings ("unchecked")
	 @Transactional
	public AgentsQuatations createOrUpdateAgent(AgentsQuatations agentEntity) throws DataAccessException {

		if(agentEntity != null){
			getSession().saveOrUpdate(agentEntity);
		}	
	
		return agentEntity;
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public void updateAgentQuation(AgentsQuatations  ageqt,String id) throws PMSException {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(id);
	}
	 
	 @SuppressWarnings ("unchecked")
	 @Transactional
	public AgentsQuatations getAgnetById(Long agentId)throws DataAccessException {
		
		try{
		String sqlQuary  = " from AgentsQuatations where id = :agentId";
		Query query = getSession().createQuery(sqlQuary);
		query.setParameter("agentId",agentId);
		List<AgentsQuatations> agentorders = query.list();
		return agentorders.get(0);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}


	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<String> fetchAllAgent() throws DataAccessException
	{	
		String SqlQuery="select distinct sellingodNo from AgentsQuatations order by id desc";
		Query query=getSession().createQuery(SqlQuery);
		List<String> agentQuatations=query.list();
		if (PmsUtil.isCollectionNotEmpty(agentQuatations)) {
			return agentQuatations;
		}else{
			return new ArrayList<String>();
	
		}
	
	}
	}
