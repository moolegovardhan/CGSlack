package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;


import com.cgs.pro94tek.healthcare.bean.CgsHomeService;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface ICgsHomeServiceDao {
	public List<CgsHomeService> createOrUpdateCgsHome(List<CgsHomeService> cgsHomeEntity) throws DataAccessException;
	public List<CgsHomeService>  fetchAllCgsHomeByname(String hsModalName)throws PMSException;
	public void createCGSHome(CgsHomeService homeEnitity) throws DataAccessException;
	public CgsHomeService fetchByfileNO(String fileId)throws DataAccessException;

}
