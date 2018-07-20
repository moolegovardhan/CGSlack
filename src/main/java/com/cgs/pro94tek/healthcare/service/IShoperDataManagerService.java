package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.ShoperInfo;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.ShoperInfoModal;


@Component
public interface IShoperDataManagerService {
	
	public void createOrUpdateShoperRecords(ShoperInfo  shoperInfoEnity)throws PMSException;
	public List<ShoperInfoModal>  fetchAllSchoperInfo(ShoperInfo SellingOderEnity)throws PMSException;
	public  ShoperInfoModal fetchShoperRecordsByName(String shoperName)throws PMSException;
	public void createMultipleRecords(List<ShoperInfo> shoperEntity)throws PMSException;
		

}
