package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.InwardData;
import com.cgs.pro94tek.healthcare.bean.SpecialOffer;




public interface IInwardDataDAO {

	
	public InwardData fetchInwardBypId(String porderid)throws DataAccessException;
	public void createOrUpdateInwardData(InwardData inwardDataEntity)throws DataAccessException;
}
