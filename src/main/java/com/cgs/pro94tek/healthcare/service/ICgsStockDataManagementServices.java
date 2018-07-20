package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsStock;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsStockModal;

@Component
public interface ICgsStockDataManagementServices {
	public void createCgsStcok(CgsStock cgsStockEntity)throws PMSException;
	public void createCgsStockNested(List<CgsStock> cgsStockEntity)throws PMSException;
	public List<CgsStockModal> fetchAllCgsStock()throws PMSException;
	public List<CgsStockModal> fetchAllCgsStockByorderNO(String orderNO)throws PMSException;
	public boolean deleteCgsstockById(Long orderNO)throws PMSException;
	public boolean updateCgsStock(CgsStockModal cgsStockModal,String id)throws PMSException;
	public CgsStock updatePurchageAmount(Long id,Long totalAmount)throws PMSException;
	public boolean updateSellingAmount(CgsStockModal cgsStockModal,String id)throws PMSException;
	public boolean updatePurchageAmount(CgsStockModal cgsStockModal,String id)throws PMSException;
	public List<CgsStockModal> fetchAllCgsStockTracking(String orderNO)throws PMSException;
	
}
