package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("agentDAO")
public class AgentDAOImple   extends CustomHibernateDaoSupport implements IAgentDAO{
	

		@SuppressWarnings("unchecked")
		@Transactional
	public Construction_Agents fetchAgentId(String agentName)
			throws DataAccessException {
		Construction_Agents  agent=null;
		System.out.println("agenetname  : "+agentName);
		try{
		String querysql="select ca from Construction_Agents ca where ca.name=:agentName";
	
		System.out.println("enter dao imple...........:"+querysql);
		Query query = getSession().createQuery(querysql);
		System.out.println("query .........:"+query);
		query.setParameter("agentName",agentName);
		List<Construction_Agents> agents = query.list();	
		if (PmsUtil.isCollectionNotEmpty(agents)) {
			agent = agents.get(0);		
		}
		}catch(Exception e){
			System.out.println("this is bala %%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return agent;
	}

		@SuppressWarnings("unchecked")
		@Transactional
	public boolean deleteByAgentId(String agentName) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("delete agent...........:"+agentName);
		String queryitem = " Update  Construction_Agents set status = :status " + " where name = :agentName";
		Query query = getSession().createQuery(queryitem);
		query.setParameter("agentName", agentName);
		query.setParameter("status", "n");
		query.executeUpdate();
		
		
		return true;
	}

		@SuppressWarnings("unchecked")
		@Transactional
	public Construction_Agents createOrUpdateAgent(Construction_Agents agentEntity)
			throws DataAccessException {
			System.out.println("daoimple.............:"+agentEntity);
		getSession().saveOrUpdate(agentEntity);
		return agentEntity;
	}
}