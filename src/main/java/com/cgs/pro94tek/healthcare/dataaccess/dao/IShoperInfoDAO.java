package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.ShoperInfo;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ShoperInfoModal;



public interface IShoperInfoDAO {
	
	
	
	public ShoperInfo createOrUpdateShoperRecords(ShoperInfo shoperEntity) throws DataAccessException;
	public List<ShoperInfo> fetchAllShoperInfo(ShoperInfo shoperEnitity)throws DataAccessException;
	public ShoperInfo  fetchAllShoperRecordsById(String shoperId) throws DataAccessException;
	public List<ShoperInfo> createMultipleRecords(List<ShoperInfo> sellOrder)throws DataAccessException;   
	public  ShoperInfo fetchShoperRecordsByName(String shoperName)throws DataAccessException;
	
	

	
	

}
