package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;


public interface IOnlineShoppingDAO {
	
	public void createOnlinePurchge(OnlinePurchage onlinePEnity) throws DataAccessException;
	public List<OnlinePurchage>  getAllOnlinePurchage(OnlinePurchage onlinePEntity)throws DataAccessException;
	public OnlinePurchage  getOnlinePurchageByOrdreNo(String orderNo) throws DataAccessException;
	public List<OnlinePurchage> createMultipuleOrUpdateRecords(List<OnlinePurchage> onlinePurchageEnity)throws DataAccessException; 
	public List<OnlinePurchage>  getAllOnlinePurchageByOrderNo(String orderNo)throws DataAccessException;
}
