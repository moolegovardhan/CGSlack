package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;


@Component
public interface ISellingDataManagementService {
	
	public void createOrUpdateSellingService(SellingOderList  sellingOderList)throws PMSException;
	public List<SellingOrderListModal>  fetchAlSellingOrder(SellingOderList SellingOderEnity)throws PMSException;
	public SellingOrderListModal  getSellingorderbyId(String agentId)throws PMSException;
	public void createMultipleRecords(List<SellingOderList> SellOrder)throws PMSException;
	public List<SellingOrderListModal>  fetchAlSellingOrderByNo(String  sellingOrderNo)throws PMSException;
	public List<SellingOrderListModal> fetchAllSellingOrders() throws PMSException;
	
}
