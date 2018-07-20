package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;



public interface IPurchageOrderDAO
{
	
	public PurchageOrder fetchBymedicinename(String medicineName) throws DataAccessException;
	public boolean updateItemByPId(String itemId)throws DataAccessException;
	public void createOrUpdateItem(PurchageOrder purchageOrder) throws DataAccessException;
	public List<PurchageOrder>fetchAllMedicinName(String mName)throws DataAccessException;
	public List<PurchageOrder> fetchAllpurcchageOrder(PurchageOrder purchageOrderEnity)throws DataAccessException;
	public void createMultipleRecords(List<PurchageOrder> purchageOrder) throws DataAccessException;

}
