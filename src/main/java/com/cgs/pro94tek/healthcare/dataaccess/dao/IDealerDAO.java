package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Dealer;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.DealerModal;

public interface IDealerDAO {
	
	
	public Dealer  fetchBealerByDealaerName(String dealerName)throws DataAccessException;
	public Dealer fetchDealerById(String officeId)throws DataAccessException;
	public boolean deleteDealerById(String dealerId)throws DataAccessException;
	public void createOrUpdateDealer(Dealer dealerEntity) throws DataAccessException;
	public boolean deleteDealerByName(String dealerName)throws DataAccessException;
	public List<Dealer> fetchAllDealerModal(Dealer dealerEntity)throws PMSException;
}
