package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Dealer;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IDealerDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;
@Repository("dealerDAO")
public class DealerDAOImpl  extends CustomHibernateDaoSupport implements IDealerDAO{
	
	
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public Dealer  fetchDealerById(String officeId) throws DataAccessException {
		// TODO Auto-generated method stub
		
		Dealer dealer = new Dealer();
		System.out.println("dao..........:"+dealer);
		String dealerquery="from Dealer where officeid=:officeId";
		Query query =getSession().createQuery(dealerquery);
		query.setParameter("officeId",officeId);
		System.out.println("query element dao......:"+query);
		@SuppressWarnings("unchecked")
		List<Dealer> dealers = query.list();
		
			if (PmsUtil.isCollectionNotEmpty(dealers)) {
				dealer = dealers.get(0);
			}
			return dealer;
		}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public boolean deleteDealerById(String dealerId) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println(dealerId);
				String queryserviceId = " Update Dealer set status =:status " + " where id =:dealerId";
				Query query = getSession().createQuery(queryserviceId);
				query.setParameter("dealerId",Long.parseLong(dealerId));
				query.setParameter("status", "n");
				query.executeUpdate();
				return true;
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateDealer(Dealer dealerEntity)
		throws DataAccessException {
	
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(dealerEntity);
	}


	@SuppressWarnings("unchecked")
	@Transactional
	public Dealer fetchBealerByDealaerName(String dealerName)
			throws DataAccessException {
		// TODO Auto-generated method stub
		
		Dealer deal = new Dealer();
		System.out.println("dao dealerName..........:"+dealerName);
		String derquery="from Dealer WHERE dealerName=:dealerName";

		Query query =getSession().createQuery(derquery);
		query.setParameter("dealerName",dealerName);
		System.out.println("query dealerName dao......:"+query);
		@SuppressWarnings("unchecked")
		List<Dealer> dealers = query.list();
		
			if (PmsUtil.isCollectionNotEmpty(dealers)) {
				deal = dealers.get(0);
			}
			return deal;
		
		}


	@SuppressWarnings("unchecked")
	@Transactional
	public boolean deleteDealerByName(String dealerName)
			throws DataAccessException {
		System.out.println("dealer daoimple.............:"+dealerName);
		Dealer dealer=new Dealer();
		String queryserviceId = " Update Dealer set status =:status " + " where dealerName =:dealerName";
		Query query = getSession().createQuery(queryserviceId);
		query.setParameter("dealerName", dealerName);
		query.setParameter("status", "n");
		query.executeUpdate();
		return true;
	}


	@SuppressWarnings("unchecked")
	@Transactional
	public List<Dealer> fetchAllDealerModal(Dealer dealerEntity)
			throws PMSException {
		 List<Dealer> dealer=new ArrayList<Dealer>();
		String sqlquery  = "from Dealer " ;
		System.out.println("get data by purchage id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		/*query.setParameterList("status",status +'y');*/
		/*query.setParameter("status",status +'y');*/
		//query.setParameter("itemId", Long.parseLong(itemId));
		List<Dealer> dealers = query.list();
		if (PmsUtil.isCollectionNotEmpty(dealers)) {
			return dealers;
		}else{
			return dealer;
	
		}
	
	}



}