package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;



import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISellingOrderListDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("sellingorderDAO")
public class SellingOrderListDaoImple extends CustomHibernateDaoSupport implements ISellingOrderListDAO  {

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateSelleingOrder(SellingOderList sellingOderEntity)
			throws DataAccessException {
		getSession().saveOrUpdate(sellingOderEntity);		
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<SellingOderList> fetchAlSellingOrder(SellingOderList SellingOderEnity) throws DataAccessException {
		String sqlquery  = "from SellingOderList where sellingOderNumber IN (select distinct sellingOderNumber from SellingOderList order by sellingOderNumber)" ;
		Query query = getSession().createQuery(sqlquery);
		List<SellingOderList> sellingOrders = query.list();
		if (PmsUtil.isCollectionNotEmpty(sellingOrders)) {
			return sellingOrders;
		}else{
			return new ArrayList<SellingOderList>();
	
		}
	
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public SellingOderList getSellingorderbyId(String agentId)
			throws DataAccessException {
		// TODO Auto-generated method stub
		SellingOderList  sellinglist=new SellingOderList();
		System.out.println("get the agent name in DAO......:"+agentId);
		String sqlquery=" from SellingOderList sellingOderNumber = :agentId";
		System.out.println("get data by purchage id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		List<SellingOderList> sellingOrders = query.list();
		
		if (PmsUtil.isCollectionNotEmpty(sellingOrders)) {
			sellinglist = sellingOrders.get(0);
		}
		return sellinglist;
	}


	@SuppressWarnings("unchecked")
	@Transactional
	public List<SellingOderList>  createMultipleRecords(List<SellingOderList> sellOrder)
			throws DataAccessException {		
		if(sellOrder != null && sellOrder.size() > 0){
			for(SellingOderList obj : sellOrder){
				getSession().saveOrUpdate(obj);
			}
		}	
		return sellOrder;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<SellingOderList> getSellingOrderByNumber(String sellingOrderNo)
			throws DataAccessException {
		String sqlquery=" select s from SellingOderList s where s.sellingOderNumber = :sellingOrderNo";
		Query query = getSession().createQuery(sqlquery);
		query.setParameter("sellingOrderNo", sellingOrderNo);
		List<SellingOderList> sellingOrders = query.list();
		
		if (PmsUtil.isCollectionNotEmpty(sellingOrders)) {
			return sellingOrders;
		}
		return new ArrayList<SellingOderList>();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<String> fetchAllSellingOrders() throws DataAccessException {
		String sqlquery  = "select distinct sellingOderNumber from SellingOderList order by id desc " ;
		Query query = getSession().createQuery(sqlquery);
		List<String> sellingOrders = query.list();
		if (PmsUtil.isCollectionNotEmpty(sellingOrders)) {
			return sellingOrders;
		}else{
			return new ArrayList<String>();
	
		}
	
	}


}