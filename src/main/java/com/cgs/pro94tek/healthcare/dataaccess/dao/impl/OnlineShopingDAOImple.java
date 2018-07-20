package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IOnlineShoppingDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("onlinePurchageDAO")
public class OnlineShopingDAOImple extends CustomHibernateDaoSupport  implements IOnlineShoppingDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOnlinePurchge(OnlinePurchage onlinePEnity)
			throws DataAccessException {
		getSession().saveOrUpdate(onlinePEnity);// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<OnlinePurchage> getAllOnlinePurchage(OnlinePurchage onlinePEntity) throws DataAccessException {
		List<OnlinePurchage> onlinePurchage=new ArrayList<OnlinePurchage>();
		String sqlquery  = "from OnlinePurchage" ;
		System.out.println("get data by purchage id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		/*query.setParameter("status",status +"y");*/
		//query.setParameter("itemId", Long.parseLong(itemId));
		List<OnlinePurchage> onlinePurchge1 = query.list();
		if (PmsUtil.isCollectionNotEmpty(onlinePurchge1)) {
			return onlinePurchge1;
		}else{
			return onlinePurchage;
	
		}
	}

	@Override
	public OnlinePurchage getOnlinePurchageByOrdreNo(String orderNo)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<OnlinePurchage> createMultipuleOrUpdateRecords(List<OnlinePurchage> onlinePurchageEnity)
			throws DataAccessException {System.out.println(" dao implementation..............:" + onlinePurchageEnity);
			if (onlinePurchageEnity != null && onlinePurchageEnity.size() > 0)
			{
				for (OnlinePurchage obj : onlinePurchageEnity) {
					getSession().saveOrUpdate(obj);
				}
			}
			return onlinePurchageEnity;
	}

	@Override
	public List<OnlinePurchage> getAllOnlinePurchageByOrderNo(String orderNo)
			throws DataAccessException {
		List<OnlinePurchage> onlinePurchage=new ArrayList<OnlinePurchage>();
		String sqlquery  = "from OnlinePurchage where orderNO = :orderNo " ;
		System.out.println("get data by purchage id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		query.setParameter("orderNo",(orderNo));
		//query.setParameter("itemId", Long.parseLong(itemId));
		List<OnlinePurchage> onlinePurchge1 = query.list();
		if (PmsUtil.isCollectionNotEmpty(onlinePurchge1)) {
			return onlinePurchge1;
		}else{
			return onlinePurchage;
	
		}
	}
	
	
}
