package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ILanDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("lanDAO")
public class LandDAOImpl extends CustomHibernateDaoSupport implements ILanDAO{

	@SuppressWarnings("unchecked")
	@Transactional@Override
	public Land fetchLandById(String landid) throws DataAccessException {
		// TODO Auto-generated method stub
		Land land =null;
		String landsql ="from Land where id=:landid";
		Query query=getSession().createQuery(landsql);
		query.setParameter("landid", Long.parseLong(landid));
		List<Land> lands = query.list();
		if (PmsUtil.isCollectionNotEmpty(lands)) {
			land= lands.get(0);
		}
		return land;
	}

	@SuppressWarnings("unchecked")
	@Transactional@Override
	public boolean deletelandById(String landid) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("delete id from daoimple...........:"+landid);
		String queryland = " Delete from Land where id = :landid";
		Query query = getSession().createQuery(queryland);
		query.setParameter("landid", Long.parseLong(landid));
		query.executeUpdate();
		
		// TODO Auto-generated method stub
		return true;
		
	}

	@SuppressWarnings("unchecked")
	@Transactional@Override
	public void createOrUpdateLand(Land landEntity) throws DataAccessException {
		// TODO Auto-generated method stub
		
		System.out.println("enter create Land DAOIM.............:"+landEntity);
		getSession().saveOrUpdate( landEntity);
	}

}
