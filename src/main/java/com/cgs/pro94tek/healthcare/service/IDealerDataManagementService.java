package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Dealer;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.DealerModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;


@Component
public interface IDealerDataManagementService {
	
	
	public DealerModal fetchBealerByDealaerName(String dealerName)throws PMSException;
	public DealerModal fetchDealerById(String officeId) throws PMSException;
	public void createOrUpdateDealer(Dealer dealerEntity) throws PMSException;
	public boolean deleteDealerById(String dealerId) throws PMSException;
	public boolean deleteDealerByName(String dealerName)throws PMSException;
	public List<DealerModal> fetchAllDealerModal(Dealer dealerEntity)throws PMSException;

}
