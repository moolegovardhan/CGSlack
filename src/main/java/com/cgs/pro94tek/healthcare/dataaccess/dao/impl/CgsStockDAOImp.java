package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CgsStock;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsStockDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("cgsStockDAO")
public class CgsStockDAOImp extends CustomHibernateDaoSupport  implements ICgsStockDAO{

	@Transactional
	public CgsStock createCgsStock(CgsStock cgsStockEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		if(cgsStockEntity != null ){
			getSession().saveOrUpdate(cgsStockEntity);
			
		}
		return cgsStockEntity;
	}

	@Transactional
	public CgsStock createOrUpdatecreateCgsStock(CgsStock cgsStockEntity)
			throws DataAccessException {
		System.out.println("deleterservied");
		/*String sqlQuery="update CgsStock where status = :status";
		Query query=getSession().createQuery(sqlQuery);
		
		query.setParameter("status",'r');
		System.out.println(query);
		System.out.println("hellow dao");*/
		// TODO Auto-generated method stub
		
		if(cgsStockEntity != null){
			getSession().saveOrUpdate(cgsStockEntity);
		}	
	
		return cgsStockEntity;
	}

	@Transactional
	public List<CgsStock> createCgsStock(List<CgsStock> cgsStockEntitys)
			throws DataAccessException {
		System.out.println("dao");

		if(cgsStockEntitys != null && cgsStockEntitys.size() > 0){
			for(CgsStock obj : cgsStockEntitys)
			{
				getSession().saveOrUpdate(obj);
			}
		}	
		return cgsStockEntitys;
	}

	@SuppressWarnings ("unchecked")
	 @Transactional
	public List<String> fetchAllCgsStock() throws DataAccessException {
		String SqlQuery="select distinct cgsStockId from CgsStock  where status = :status "+" order by id desc ";
		Query query=getSession().createQuery(SqlQuery);
		query.setParameter("status","y");
		List<String> cgsStockobj=query.list();
		if (PmsUtil.isCollectionNotEmpty(cgsStockobj)) {
			return cgsStockobj;
		}else{
			return new ArrayList<String>();
	
		}
	}

	@SuppressWarnings ("unchecked")
	 @Transactional
	public List<CgsStock> fetchAllCgsStockByorderNO(String orderNO)
			throws DataAccessException {
		
		List<CgsStock> cgsStocks=new ArrayList<CgsStock>();
		 String sqlQuary  = "from CgsStock where cgsStockId = :orderNO";
		 	Query query = getSession().createQuery(sqlQuary);
			query.setParameter("orderNO",orderNO);
			System.out.println(query);
			@SuppressWarnings("unchecked")
			List<CgsStock> cgsStock = query.list();
			if (PmsUtil.isCollectionNotEmpty(cgsStock)) {
				getSession().flush();
				return cgsStock;
			}else{
				return cgsStocks;
		
			}
		
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public boolean deleteCgsStockById(Long orderNO) throws DataAccessException {
		// TODO Auto-generated method stub
		
	System.out.println("hell pavansir................:");
			// TODO Auto-generated method stub
			 String sqlQuary="Update CgsStock set status = :status "+" where id = :orderNO ";
			 Query query=getSession().createQuery(sqlQuary);
			 query.setParameter("status", "r");
			 query.setParameter("orderNO", (orderNO));
				query.executeUpdate();
				
			return true;
		}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public CgsStock getCgsStockId(Long orderNO) throws DataAccessException {
		// TODO Auto-generated method stub
		
		try{
			String sqlQuary  = " from CgsStock where id = :orderNO";
			Query query = getSession().createQuery(sqlQuary);
			query.setParameter("orderNO",orderNO);
			List<CgsStock> cgsStockorders = query.list();
			return cgsStockorders.get(0);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		return null;
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public CgsStock createOrUpdatePurchageAamount(Long id,Long totalAmount)
			throws DataAccessException {
		 CgsStock cgstock=new CgsStock();
		 String sqlQuary="update CgsStock set  totalAmount= :totalAmount + totalAmount"+" where id = :id";
		 Query query=getSession().createQuery(sqlQuary);
		 query.setParameter("id", (id));
		 query.setParameter("totalAmount",totalAmount);
			query.executeUpdate();
		return cgstock;
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public CgsStock getCgsStockStoreId(String orderNO) throws DataAccessException {
		try{
		String sqlQuary  = "from CgsStock where cgsStockId = :orderNO";
		Query query = getSession().createQuery(sqlQuary);
		query.setParameter("orderNO",orderNO);
		List<CgsStock> cgsStockorders = query.list();
		return cgsStockorders.get(0);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<CgsStock> getStockStatusTracking(String orderNO)
			throws DataAccessException {
		 System.out.println("dao for stor tracktrace.......:"+orderNO);
		 List<CgsStock> cgsStocks=new ArrayList<CgsStock>();
			
		 String sqlQuary  = " from CgsStock where   cgsStockId = :orderNO ";
		 	Query query = getSession().createQuery(sqlQuary);
			query.setParameter("orderNO",orderNO);
			System.out.println(query);
			@SuppressWarnings("unchecked")
			List<CgsStock> cgsStock = query.list();
			if (PmsUtil.isCollectionNotEmpty(cgsStock)) {
				return cgsStock;
			}else{
				return cgsStocks;
		
			}	
			
	 }

	

		
	
	
	

}
