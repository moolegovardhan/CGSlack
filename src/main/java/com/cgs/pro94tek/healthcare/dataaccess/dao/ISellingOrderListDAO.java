package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.HashSet;
import java.util.List;

import org.springframework.dao.DataAccessException;






import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;


public interface ISellingOrderListDAO {
	
	public void createOrUpdateSelleingOrder(SellingOderList sellingOderEntity) throws DataAccessException;
	public List<SellingOderList>  fetchAlSellingOrder(SellingOderList SellingOderEnity)throws DataAccessException;
	public SellingOderList  getSellingorderbyId(String agentId) throws DataAccessException;
	public List<SellingOderList> createMultipleRecords(List<SellingOderList> sellOrder)throws DataAccessException;   
	public List<SellingOderList> getSellingOrderByNumber(String sellingOrderNo)throws DataAccessException; 
	public List<String> fetchAllSellingOrders() throws DataAccessException;
}
