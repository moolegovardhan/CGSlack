package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.SuppliarOrderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.SupplairOrderListModal;

@Component
public interface ISupplairOrderListService {
	
	public void createMultipleRecords(List<SuppliarOrderList> supplairList)throws PMSException;
	public List<SupplairOrderListModal>  fetchAllSupllairOrderList(SuppliarOrderList supplairListEntity)throws PMSException;
	public void createOrUpdateSupplair(SuppliarOrderList supplairList) throws PMSException;
	public void createSupplairOfdata(List<SuppliarOrderList> supOrder)throws PMSException;
	public List<SupplairOrderListModal>  fetchSupplierOrderRequest(String  supplierName)throws PMSException;
	public boolean updateSupplierOrder(SupplairOrderListModal supModal,String supordeno)throws PMSException; 
}

