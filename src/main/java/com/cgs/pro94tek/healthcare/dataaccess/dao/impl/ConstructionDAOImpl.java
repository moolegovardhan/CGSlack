package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Construction;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IConstructioDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("constructioDAO")
public class ConstructionDAOImpl extends CustomHibernateDaoSupport implements IConstructioDAO  {
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public Construction fetchConstructionById(String constrId)
			throws DataAccessException {
		Construction constru=null;
		
		System.out.println("enter the consctru.........:"+constrId);
		String sqlquery="from Construction where id=:constrId";
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("constrId", Long.parseLong(constrId));
		List<Construction> constructions = query.list();
		if (PmsUtil.isCollectionNotEmpty(constructions)) {
			constru = constructions.get(0);
		}
		return constru; 
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public boolean deleteConstructionById(String constrId)
			throws DataAccessException {
		Construction constru=null;
		
		System.out.println("delete the consctru.........:"+constrId);
		String sqlquery="delete Construction where id=:constrId";
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("constrId", Long.parseLong(constrId));
		query.executeUpdate();
		// TODO Auto-generated method stub
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateConstruction(Construction construEntity)
			throws DataAccessException {
		System.out.println("enter the valuof java dao...........:"+construEntity);
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(construEntity);
		
	}
	
	

}
