package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.CgsRoles;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsRolesDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("cgsRolesDao")
public class CgsRolesDAOImpl extends CustomHibernateDaoSupport implements ICgsRolesDao{

	@SuppressWarnings("unchecked")
	@Transactional
	public List<CgsRoles> getcgsRoles() throws DataAccessException {
		List<CgsRoles> cgsRole=new ArrayList<CgsRoles>();
	String sqlQuery=" From CgsRoles order by roleId";
	Query query = getSession().createQuery(sqlQuery);
	/*query.setParameter("itemId", Long.parseLong(itemId));*/
	List<CgsRoles> cgsRoles = query.list();
	if (PmsUtil.isCollectionNotEmpty(cgsRoles)) {
		return cgsRoles;
	}
	else{
		return cgsRole;

		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public CgsRoles getCgsRolesById(Integer roleId) throws DataAccessException {
		
		try{
					
		System.out.println("dao..............:");
		String sqlQuery="From CgsRoles where roleId = :roleId";
		Query query = getSession().createQuery(sqlQuery);
		System.out.println(query);
		query.setParameter("roleId",roleId );
		List<CgsRoles> cgsRoles = query.list();
		return cgsRoles.get(0);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	
}
