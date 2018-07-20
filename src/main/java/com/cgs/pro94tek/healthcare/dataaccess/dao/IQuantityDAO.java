package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.QuatationData;
import com.cgs.pro94tek.healthcare.exeception.PMSException;



public interface IQuantityDAO {
	public QuatationData fetchQuatationByPId(String purchageId) throws PMSException;
	public void createOrUpdateQuatation(QuatationData quatationEntity) throws DataAccessException;
	public List<QuatationData>  fetchAllQuatation(QuatationData quatationEntity)throws DataAccessException;
	public void createMultipleQuatation(List<QuatationData> quatationEntity) throws DataAccessException;
}
