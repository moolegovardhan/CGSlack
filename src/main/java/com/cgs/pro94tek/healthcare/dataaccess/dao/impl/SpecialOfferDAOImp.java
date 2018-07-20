package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.SpecialOffer;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISpecialOffereDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("specialOfferDAOImp")
public class SpecialOfferDAOImp  extends CustomHibernateDaoSupport implements ISpecialOffereDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public SpecialOffer fetchSpecialOfferById(String officeId)throws DataAccessException {
		// TODO Auto-generated method stub
		SpecialOffer specialOffer = null;
		String querySpecialofferById  = "from SpecialOffer where id = :officeId";
		System.out.println("get data by Special offer id............:"+querySpecialofferById);
		Query query = getSession().createQuery(querySpecialofferById);
		query.setParameter("officeId", Long.parseLong(officeId));
		List<SpecialOffer> specialOffers = query.list();
		if (PmsUtil.isCollectionNotEmpty(specialOffers)) {
			specialOffer = specialOffers.get(0);
		}
		return specialOffer;
	}

	@Transactional
	public boolean deleteSpecialOfferById(String officeId)
			throws DataAccessException {
		System.out.println("delete SpecialOffer...........:"+officeId);
		String querySpecialofferById = " Delete from SpecialOffer where id = :officeId";
		Query query = getSession().createQuery(querySpecialofferById);
		query.setParameter("officeId", Long.parseLong(officeId));
		query.executeUpdate();
		// TODO Auto-generated method stub
		return true;
	}

	@Transactional
	public void createOrUpdateSpecialOfferById(SpecialOffer specialOffer)
			throws DataAccessException {
		System.out.println("Special offers.............:"+specialOffer);
		
		getSession().saveOrUpdate(specialOffer);
		// TODO Auto-generated method stub
		
	}


	}
	
	


