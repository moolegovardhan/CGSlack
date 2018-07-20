package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IDealerAdressDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("dealerAdminDAO")
public class DealaerAdressDAOImpl extends CustomHibernateDaoSupport implements IDealerAdressDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public DealerAdress fetchDealerAdressById(String officeId)
			throws DataAccessException {
		DealerAdress dealer=null;			
		String querysql="from DealerAdress where addressid = :officeId ";
		Query query=getSession().createQuery(querysql);
		query.setParameter("officeId",Long.parseLong(officeId));
		List<DealerAdress> dealers = query.list();
		if (PmsUtil.isCollectionNotEmpty(dealers)) {
			dealer = dealers.get(0);
		}
		
		// TODO Auto-generated method stub
		return dealer;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public boolean deleteDealerAdressById(String adressId)
			throws DataAccessException {
		System.out.println("deleteDealerAdressById"+adressId);
		DealerAdress dealer=null;
		String queryitem = " Delete from DealerAdress where addressid = :adressId";
		Query query = getSession().createQuery(queryitem);
		query.setParameter("adressId", Long.parseLong(adressId));
		query.executeUpdate();
		
		// TODO Auto-generated method stub
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateDealerAdress(DealerAdress adressEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("create or udate");
		getSession().saveOrUpdate(adressEntity);
		
	}
	
	
	

	
	
	

}
