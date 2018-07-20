package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;




import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.CgsStockMaster;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

@Component
public interface ICgsStockMasterDataRetrivalService {
	
	/*public CgsStockMaster createOrUpdateCgsStockMaster(CgsStockMaster stockEntity)throws PMSException;*/
	public void createNestCgsStock(List<CgsStockMaster> cgsStockMasterEntity)throws PMSException;
}
