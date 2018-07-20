package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.HealthReferal;

import com.cgs.pro94tek.healthcare.dataaccess.dao.IReferalDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("referalDAOImpl")
public class ReferalDAOImpl extends CustomHibernateDaoSupport implements IReferalDAO {

	@SuppressWarnings("unchecked")
	@Transactional
	public HealthReferal fetchReferalById(String referalId)throws DataAccessException {
		HealthReferal referal = null;
		String queryReferalByName = "from Referal where id = :referalId";
		Query query = getSession().createQuery(queryReferalByName);
		query.setParameter("referalId", referalId);
		List<HealthReferal> referals = query.list();
		if (PmsUtil.isCollectionNotEmpty(referals)) {
			referal = referals.get(0);
		}
		return referal;
	}
	



}
