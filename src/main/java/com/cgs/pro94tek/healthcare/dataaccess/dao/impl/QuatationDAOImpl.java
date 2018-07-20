package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.QuatationData;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IQuantityDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;



@Repository("quatationDAO")
public class QuatationDAOImpl  extends CustomHibernateDaoSupport implements IQuantityDAO {

	@SuppressWarnings("unchecked")
	@Transactional
	public QuatationData fetchQuatationByPId(String purchageId)
			throws PMSException {
		
		System.out.println("DaoImplementation ...........:"+purchageId);
		QuatationData   quatationData=null;
		String sqlQuery="from QuatationData  where  purchaseorderid =:purchageId";
		Query query = getSession().createQuery(sqlQuery);
		query.setParameter("purchageId", purchageId);
		List<QuatationData> quatation = query.list();
		if (PmsUtil.isCollectionNotEmpty(quatation)) {
			quatationData = quatation.get(0);
		}
		return quatationData;
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateQuatation(QuatationData quatationEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("createorupdate quatation ............:"+quatationEntity);
		getSession().saveOrUpdate(quatationEntity);
		/*if(quatationEntity != null && quatationEntity.size() > 0){
			for(QuatationData obj : quatationEntity){
				getSession().saveOrUpdate(obj);
			}
		}*/	
	
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<QuatationData> fetchAllQuatation(QuatationData quatationEntity)
			throws DataAccessException {
		List<QuatationData>  quatation=new ArrayList<QuatationData>();
		String sqlquery="From QuatationData";
		System.out.println("get data by itemId id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		//query.setParameter("status", "y");
		//query.setParameter("itemId", Long.parseLong(itemId));
		List<QuatationData> quatations = query.list();
		if (PmsUtil.isCollectionNotEmpty(quatations)) {
			return quatations;
		}else{
			return quatation;
	
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void createMultipleQuatation(List<QuatationData> quatationEntity)
			throws DataAccessException {
		
		if(quatationEntity !=null&&quatationEntity.size()>0)
		{
			for(QuatationData  qut:quatationEntity)
			{
				getSession().saveOrUpdate(qut);
			}
		}
	}

}
