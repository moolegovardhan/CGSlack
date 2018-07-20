package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Construction;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ConstructionModal;



public interface IConstructioDAO {
	
	public Construction fetchConstructionById(String constrId)throws DataAccessException;
	public boolean deleteConstructionById(String constrId)throws DataAccessException;
	public void createOrUpdateConstruction(Construction construEntity) throws DataAccessException;
	
}


