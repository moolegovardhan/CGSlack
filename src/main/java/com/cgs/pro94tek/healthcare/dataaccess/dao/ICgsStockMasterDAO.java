package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.CgsStockMaster;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface ICgsStockMasterDAO {
	
	public List<CgsStockMaster> createOrUpdateCgsStockMaster(List<CgsStockMaster> cgsStockEntity) throws DataAccessException;
	public CgsStockMaster createCgsStockMaster(CgsStockMaster cgsEntity)throws PMSException;
}
