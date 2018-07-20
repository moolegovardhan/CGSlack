package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.bean.Item;


public interface IInwardDAO {
	public void createOrUpdateInward(Inward inward) throws DataAccessException;

	public Inward fetchInwardBypId(String pId) throws DataAccessException;
}
