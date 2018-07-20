package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;

import java.math.BigInteger;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.ReferalRates;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IReferalRatesDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("referalRateDAOImpl")
public class ReferalRateDAOImpl  extends CustomHibernateDaoSupport  implements IReferalRatesDAO

{

	

	@SuppressWarnings("unchecked")
	@Transactional
	public ReferalRates fetchReferalRateById(String referalRateId)
			throws DataAccessException {
		System.out.println("referalrate data...................:"+referalRateId);
		ReferalRates referalRate = null;
		String queryReferanceById  = "from  ReferalRates where id =:referalRateId";
		System.out.println("get data by referalRates  id............:"+queryReferanceById);
		Query query = getSession().createQuery(queryReferanceById);
		query.setParameter("referalRateId",Long.parseLong(referalRateId));
		List<ReferalRates> referalRates = query.list();
		if (PmsUtil.isCollectionNotEmpty(referalRates)) 
		{
			referalRate = referalRates.get(0);
		}
		return referalRate;
	}
	

}
