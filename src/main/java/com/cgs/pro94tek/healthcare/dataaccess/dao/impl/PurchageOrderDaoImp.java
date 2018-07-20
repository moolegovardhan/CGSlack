package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IPurchageOrderDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("purchageOrderDao")
public class PurchageOrderDaoImp extends CustomHibernateDaoSupport implements
		IPurchageOrderDAO {

	@SuppressWarnings("unchecked")
	@Transactional
	public PurchageOrder fetchBymedicinename(String medicineName)
			throws DataAccessException {
		PurchageOrder purchageOrder = null;
		String sqlquery = "from PurchageOrder p where p.itemName like :medicineName ";
		/* ("from User u where u.idAsString like :userId"); */
		System.out
				.println("purchage dao implementation...........:" + sqlquery);
		Query query = getSession().createQuery(sqlquery);
		query.setParameter("medicineName", medicineName + "%");
		System.out.println("query  Dao...........:");
		List<PurchageOrder> purchageOrders = query.list();
		if (PmsUtil.isCollectionNotEmpty(purchageOrders)) {
			purchageOrder = purchageOrders.get(0);
			// TODO Auto-generated method stub
		}
		return purchageOrder;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateItem(PurchageOrder purchageOrder)
			throws DataAccessException {
		// TODO Auto-generated method stub

		System.out.println(" dao implementation..............:" + purchageOrder);
		getSession().saveOrUpdate(purchageOrder);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public boolean updateItemByPId(String itemId) throws DataAccessException {
		// TODO Auto-generated method stub
		String queryserviceId = " Update PurchageOrder set status =:status "
				+ " where itemId =:itemId";
		Query query = getSession().createQuery(queryserviceId);
		query.setParameter("itemId", Long.parseLong(itemId));
		query.setParameter("status", "n");
		query.executeUpdate();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<PurchageOrder> fetchAllMedicinName(String mName)
			throws DataAccessException {
		// TODO Auto-generated method stub
		List<PurchageOrder> purchageOrder = new ArrayList<PurchageOrder>();
		String sqlquery = "from PurchageOrder p where p.itemName like :mName ";
		System.out
				.println("purchage dao implementation...........:" + sqlquery);
		Query query = getSession().createQuery(sqlquery);
		query.setParameter("mName", mName + "%");
		System.out.println("query  Dao...........:");
		List<PurchageOrder> purchageOrders = query.list();
		if (PmsUtil.isCollectionNotEmpty(purchageOrders)) {
			return purchageOrders;
		} else {
			return purchageOrder;
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<PurchageOrder> fetchAllpurcchageOrder(
			PurchageOrder purchageOrderEnity) throws DataAccessException {
		List<PurchageOrder> purchageOrder = new ArrayList<PurchageOrder>();
		String sqlquery = "from PurchageOrder";
		System.out.println("get data by purchage id............:" + sqlquery);
		Query query = getSession().createQuery(sqlquery);
		/* query.setParameter("status",status +"y"); */
		// query.setParameter("itemId", Long.parseLong(itemId));
		List<PurchageOrder> purchageOrders = query.list();
		if (PmsUtil.isCollectionNotEmpty(purchageOrders)) {
			return purchageOrders;
		} else {
			return purchageOrder;

		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createMultipleRecords(List<PurchageOrder> purchageOrder)
			throws DataAccessException {
		System.out.println(" dao implementation..............:" + purchageOrder);
		if (purchageOrder != null && purchageOrder.size() > 0) {
			for (PurchageOrder obj : purchageOrder) {
				getSession().saveOrUpdate(obj);
			}
		}

	}

}
