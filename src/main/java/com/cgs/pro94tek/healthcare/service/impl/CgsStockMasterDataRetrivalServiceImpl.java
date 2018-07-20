package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.cgs.pro94tek.healthcare.bean.CgsStockMaster;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsStockMasterDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.service.ICgsStockMasterDataRetrivalService;

@Service("cgsStockMasterServices")
public class CgsStockMasterDataRetrivalServiceImpl  implements ICgsStockMasterDataRetrivalService{
	@Autowired
	private  ICgsStockMasterDAO  cgsStockMasterDAO;
	
	@Override
	public void createNestCgsStock(List<CgsStockMaster> cgsStockMasterEntity)
			throws PMSException {
		List<CgsStockMaster> cgsstockMasterObj = cgsStockMasterDAO.createOrUpdateCgsStockMaster(cgsStockMasterEntity);
		if(cgsstockMasterObj != null && cgsstockMasterObj.size() > 0)
		{
			Long id = cgsstockMasterObj.get(0) != null ? cgsstockMasterObj.get(0).getId() : 555; 
			String cgsStockMasterNO = "STOCK"+id;
			for(Object object : cgsstockMasterObj)
			{
				CgsStockMaster cgsObj = (CgsStockMaster)object;			
				cgsObj.setStockId(cgsStockMasterNO);
				cgsStockMasterDAO.createCgsStockMaster(cgsObj);
			}
	
		
	
		}
	}

}
