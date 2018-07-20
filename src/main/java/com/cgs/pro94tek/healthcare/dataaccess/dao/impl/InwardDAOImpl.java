package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IInwardDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("inwardDAO")
public class InwardDAOImpl  extends CustomHibernateDaoSupport implements  IInwardDAO{

	@Transactional
	public void createOrUpdateInward(Inward inward) throws DataAccessException
	{
		// TODO Auto-generated method stub
		
		System.out.println("createorupdate inward ............:"+inward);
		getSession().save(inward);
		
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public Inward fetchInwardBypId(String pId)throws DataAccessException {
		// TODO Auto-generated method stub
		Inward inward = null;
		String sqlquery  = "from Inward where purchaseorderid = :pId";
		System.out.println("get data by in id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		query.setParameter("pId", pId);
		System.out.println(query);
		List<Inward> inwards = query.list();
		System.out.println("liste of inward");
		if (PmsUtil.isCollectionNotEmpty(inwards)) {
			inward = inwards.get(0);
		}
		
		return inward;
	}

}
