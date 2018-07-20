package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.DealerAdressModal;



@Component
public interface IDealerAdressDataManagerService {
	
	
	
	
	public DealerAdressModal fetchDealerAdressById(String adressId) throws PMSException;
	public boolean deleteDealerAdressById(String  adressId)throws PMSException;
	public void createOrUpdateDealerAdress(DealerAdress adressEntity)throws PMSException;

}
