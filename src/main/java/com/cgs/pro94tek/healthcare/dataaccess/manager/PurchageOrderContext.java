package com.cgs.pro94tek.healthcare.dataaccess.manager;


import java.util.List;

import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;

public class PurchageOrderContext {
	
	private String officeId;
	private String supplierName;
    private List<PurchageOrderModal> data;
    
	public List<PurchageOrderModal> getData() {
		return data;
	}
	public void setData(List<PurchageOrderModal> data) {
		this.data = data;
	}
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
}
