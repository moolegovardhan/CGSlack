package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgs.pro94tek.healthcare.bean.CgsStockMaster;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsStockMasterDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

@Repository("cgsStockMasterDAO")
public class CgsStockMasterDAOImpl extends CustomHibernateDaoSupport  implements ICgsStockMasterDAO {

	@SuppressWarnings("unchecked")
	@Transactional
	public List<CgsStockMaster> createOrUpdateCgsStockMaster(
			List<CgsStockMaster> cgsStockEntity) throws DataAccessException {
		if(cgsStockEntity !=null&&cgsStockEntity.size()>0){
			for(CgsStockMaster obj:cgsStockEntity)
			{
				getSession().save(obj);}
			}
		// TODO Auto-generated method stub
		return cgsStockEntity;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public CgsStockMaster createCgsStockMaster(CgsStockMaster cgsEntity)
			throws PMSException {
		if(cgsEntity != null){
			getSession().saveOrUpdate(cgsEntity);
		}	
	
		return cgsEntity;
	}
}
