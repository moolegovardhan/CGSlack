package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.metamodel.relational.Size;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.SuppliarOrderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplairOrderListDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("supplairorderDao")
public class SupplairOrderDaoImp extends CustomHibernateDaoSupport implements ISupplairOrderListDAO{ 



	@Transactional
public void createOrUpdateSupplairOrder(SuppliarOrderList supplairEntity)
		throws DataAccessException {
	// TODO Auto-generated method stub

	System.out.println("Dao Implement supplairEntity ............:"+supplairEntity);
	getSession().saveOrUpdate(supplairEntity);
}

	

	@Override
	public List<SuppliarOrderList> fetchAllSupplairOrder(
			SuppliarOrderList supplairObject) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<SuppliarOrderList> createMultipleSupplairOrders(List<SuppliarOrderList> supOrderObj) throws DataAccessException {
		// TODO Auto-generated method stub
		if(supOrderObj != null && supOrderObj.size() >0){
			for(SuppliarOrderList supplairOrder:supOrderObj){
				getSession().saveOrUpdate(supplairOrder);
			}
				
		}
		return supOrderObj;
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<SuppliarOrderList> fetchSuppliarOrderByName(String supplierName)
			throws DataAccessException {
		String sqlquery=" select s from SuppliarOrderList s where s.suppliarName = :supplierName";
		Query query = getSession().createQuery(sqlquery);
		query.setParameter("supplierName", supplierName);
		List<SuppliarOrderList> supplierOrders = query.list();
		
		if (PmsUtil.isCollectionNotEmpty(supplierOrders)) {
			return supplierOrders;
		}
		return new ArrayList<SuppliarOrderList>();
	}



	
	public void createOrUpdateSupplairOrderMultilple(
			List<SuppliarOrderList> supplairObject) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}


	@SuppressWarnings("unchecked")
	@Transactional
	public SuppliarOrderList getSupplierById(String supOrderno)
			throws DataAccessException {
		try{
			String sqlQuary  = " from SuppliarOrderList where sellingodNo = :supOrderno";
			Query query = getSession().createQuery(sqlQuary);
			query.setParameter("supOrderno",supOrderno);
			List<SuppliarOrderList> supOrders = query.list();
			return supOrders.get(0);
			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}



	@SuppressWarnings("unchecked")
	@Transactional
	public SuppliarOrderList createOrUpdateSupplier(SuppliarOrderList supEntity)
			throws PMSException {
		if(supEntity != null){
			getSession().saveOrUpdate(supEntity);
		}	
	
		return supEntity;
		
	}



	



	
}
