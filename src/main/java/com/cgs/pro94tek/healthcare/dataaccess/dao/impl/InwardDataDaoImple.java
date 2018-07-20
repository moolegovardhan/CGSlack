package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.InwardData;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IInwardDataDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;



@Repository("inwardDataDAO")

public class InwardDataDaoImple extends CustomHibernateDaoSupport  implements IInwardDataDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public InwardData fetchInwardBypId(String porderid)
			throws DataAccessException {
		InwardData  inwardData=null;
		
		System.out.println("dao implementation...........:"+porderid);
		String sqlquery="from InwardData where purchaseorderid = :porderid ";
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("porderid", porderid);
		List<InwardData> inwardDatas = query.list();
		if (PmsUtil.isCollectionNotEmpty(inwardDatas)) {
			inwardData = inwardDatas.get(0);
		}
		return inwardData;
		
		// TODO Auto-generated method stub
		/*Create or update*/
		
	}

	@Transactional
	public void createOrUpdateInwardData(InwardData inwardDataEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("createorupdate Item ............:"+inwardDataEntity);
		getSession().saveOrUpdate(inwardDataEntity);
	}
		
	}
	
	
	
	
	


