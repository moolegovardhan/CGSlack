package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;


import com.cgs.pro94tek.healthcare.bean.ReferalRates;

public interface IReferalRatesDAO {

	public ReferalRates fetchReferalRateById(String referalRateId)throws DataAccessException;
	
	
}
