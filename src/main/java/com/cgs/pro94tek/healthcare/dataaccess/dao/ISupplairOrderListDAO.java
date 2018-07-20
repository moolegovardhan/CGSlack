package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.SuppliarOrderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface ISupplairOrderListDAO {
	
		
		public void createOrUpdateSupplairOrderMultilple(List<SuppliarOrderList> supplairObject) throws DataAccessException;
		public List<SuppliarOrderList>  fetchAllSupplairOrder(SuppliarOrderList supplairObject)throws DataAccessException;
		public void createOrUpdateSupplairOrder(SuppliarOrderList supplairEntity)throws DataAccessException;
		public List<SuppliarOrderList> createMultipleSupplairOrders(List<SuppliarOrderList> supOrderObj)throws DataAccessException;
		public List<SuppliarOrderList> fetchSuppliarOrderByName(String supplierName)throws DataAccessException ;
		public SuppliarOrderList getSupplierById(String supOrderno)throws DataAccessException;
		public SuppliarOrderList createOrUpdateSupplier(SuppliarOrderList supEntity)throws PMSException; 
	}



