package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountArea;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountAreaDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountAreaModal;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("cgsDiscountAreaDAO")
public class CgsDiscountAreaDAOImpl  extends CustomHibernateDaoSupport   implements ICgsDiscountAreaDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public void createDiscountArea(CgsDiscountArea areaEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		getSession().save(areaEntity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<CgsDiscountAreaModal> getDiscountModal(CgsDiscountArea areaEnity)
			throws DataAccessException {
		List<CgsDiscountAreaModal> discountArea=new ArrayList<CgsDiscountAreaModal>();;
		String sqlQuery="from  CgsDiscountArea ";
		Query query=getSession().createQuery(sqlQuery);
		List<CgsDiscountAreaModal> discountAreas=query.list();
		if (PmsUtil.isCollectionNotEmpty(discountAreas))
		{
			return discountAreas;
		} else {
			return discountArea;

		}
	}

}
