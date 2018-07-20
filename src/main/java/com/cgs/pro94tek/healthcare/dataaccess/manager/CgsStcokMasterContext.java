package com.cgs.pro94tek.healthcare.dataaccess.manager;

import java.util.List;

import com.cgs.pro94tek.healthcare.modal.CgsStockMasterModal;

public class CgsStcokMasterContext {
	List<CgsStockMasterModal>  masterData;
	private Integer totalAmount;
	
	
	
	
	public List<CgsStockMasterModal> getMasterData() {
		return masterData;
	}
	public void setMasterData(List<CgsStockMasterModal> masterData) {
		this.masterData = masterData;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

}
