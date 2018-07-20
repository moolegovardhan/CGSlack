package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface IDealerAdressDAO {
	
	
	public DealerAdress fetchDealerAdressById(String adressId)throws DataAccessException;
	public boolean deleteDealerAdressById(String  adressId)throws  DataAccessException;
	public void createOrUpdateDealerAdress(DealerAdress adressEntity)throws  DataAccessException;
	
}
