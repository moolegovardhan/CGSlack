package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;


import com.cgs.pro94tek.healthcare.bean.Land;

public interface ILanDAO {

	public Land fetchLandById(String landid)throws DataAccessException;
	public boolean deletelandById(String landid)throws DataAccessException;
	public void createOrUpdateLand(Land landEntity) throws DataAccessException;

}
