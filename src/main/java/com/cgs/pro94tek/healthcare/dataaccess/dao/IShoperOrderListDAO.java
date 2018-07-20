package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.ShoperOrderList;


public interface IShoperOrderListDAO {
	public void createOrUpdateShoperOrder(ShoperOrderList shoperOrderEntity) throws DataAccessException;
	public List<ShoperOrderList> fetchAlShoperOrder(ShoperOrderList shoperOderEnity)throws DataAccessException;
	public ShoperOrderList  getSellingorderbyId(String agentId) throws DataAccessException;
	public List<ShoperOrderList> createMultipleRecords(List<SellingOderList> sellOrder)throws DataAccessException;

}
