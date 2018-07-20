package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;





import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
@Component
public interface IPurchageOrderManagementService 
{
	
	public PurchageOrderModal fetchBymedicinename(String medicineName) throws PMSException;
	public boolean updateItemByPId(String itemId)throws PMSException;
	public void createOrUpdateMName(PurchageOrder purchageOrder)throws PMSException;
	public List<PurchageOrderModal>  fetchAllMedicinName(String mName)throws PMSException;
	public List<PurchageOrderModal> fetchAllPurchageOrder(PurchageOrder purchageOrderEntity)throws PMSException;
	public void createMultipleRecords(List<PurchageOrder> purchageOrder )throws PMSException;
	
}
