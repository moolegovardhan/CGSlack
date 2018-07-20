package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;


import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.bean.ShoperInfo;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IPurchageOrderDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IShoperInfoDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.ShoperInfoModal;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("shoperrDao")
public class ShoperInfoDaoImpl extends CustomHibernateDaoSupport implements IShoperInfoDAO{
	
	

	
		@SuppressWarnings("unchecked")
		@Transactional
	public ShoperInfo createOrUpdateShoperRecords(ShoperInfo shoperEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
			getSession().saveOrUpdate(shoperEntity);
		return null;
	}

		@SuppressWarnings("unchecked")
		@Transactional
	public List<ShoperInfo> fetchAllShoperInfo(ShoperInfo shoperEnitity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		
				List<ShoperInfo> shoperInfo = new ArrayList<ShoperInfo>();
				String sqlquery = "from ShoperInfo ";
				System.out
						.println("shpere" + sqlquery);
				Query query = (Query) getSession().createQuery(sqlquery);
				
				System.out.println("query  Dao...........:");
				List<ShoperInfo> shperes = query.list();
				if (PmsUtil.isCollectionNotEmpty(shperes)) {
					return shperes;
				} else {
					return shoperInfo;
				}

		}
		@SuppressWarnings("unchecked")
		@Transactional
	public ShoperInfo FetchAllShoperRecordsById(String shoperId)
			throws DataAccessException {
		List<ShoperInfo> shoperInfo = new ArrayList<ShoperInfo>();
		String sqlquery = "from ShoperInfo  shoperId =:shoperId";
		System.out
				.println("shoperId" + sqlquery);
		Query query = (Query) getSession().createQuery(sqlquery);
		
		System.out.println("query  Dao...........:");
		query.setParameter("shoperId", Long.parseLong(shoperId));
		List<ShoperInfo> shperes = query.list();
		if (PmsUtil.isCollectionNotEmpty(shperes)) {
			return (ShoperInfo) shperes;
		} else {
			return (ShoperInfo) shoperInfo;
		}
	}

	@Override
	public List<ShoperInfo> createMultipleRecords(List<ShoperInfo> sellOrder)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoperInfo fetchAllShoperRecordsById(String shoperId)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public ShoperInfo fetchShoperRecordsByName(String shoperName)
			throws DataAccessException {

		ShoperInfo shoperInfo = new ShoperInfo();
		String sqlquery = "from ShoperInfo WHERE shoperName = :shoperName";
		System.out.println("shpere" + sqlquery);
		Query query = (Query) getSession().createQuery(sqlquery);
		query.setParameter("shoperName", shoperName);
		System.out.println("query  Dao...........:");
		
		List<ShoperInfo> shoperInfos = query.list();
		if (PmsUtil.isCollectionNotEmpty(shoperInfos)) {
			shoperInfo = shoperInfos.get(0);
		}
		return shoperInfo;
	}
}