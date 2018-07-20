package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICGSSystemDiscountDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("SystemDiscountDao")
public class CgsSystemDiscountDAOImpl extends CustomHibernateDaoSupport  implements ICGSSystemDiscountDAO  {

	@Transactional
	public void createSystemDiscount(CgsSystemDiscount systemDiscountEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(systemDiscountEntity);
		
	}

	 @SuppressWarnings ("unchecked")
	   @Transactional
	public List<CgsSystemDiscountModal> getAllDiscount(
			CgsSystemDiscount systemDiscountEntity) throws DataAccessException {
		List<CgsSystemDiscountModal> cgsDiscount=new ArrayList<CgsSystemDiscountModal>();
		String sqlQuery="from CgsSystemDiscount";
		Query query=getSession().createQuery(sqlQuery);
		List<CgsSystemDiscountModal> cgsDiscouts=query.list();
		if (PmsUtil.isCollectionNotEmpty(cgsDiscouts)) {
			return cgsDiscouts;
		} else {
			return cgsDiscount;

		}
	

	 }
	 }
