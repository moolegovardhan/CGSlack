package com.cgs.pro94tek.healthcare.dataaccess.manager;

import java.util.List;

import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.SupplairOrderListModal;

public class SupplairOrderListConstant {
	
	private List<SupplairOrderListModal> order;
	private String suppliarName;
	private Long supMobileNo;
	private String sms="hellow balakrishn "+supMobileNo+"password...:"+"haridahs";
	
	public String getSms()
	{
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public Long getSupMobileNo() {
		return supMobileNo;
	}
	public void setSupMobileNo(Long supMobileNo) {
		this.supMobileNo = supMobileNo;
	}
	public List<SupplairOrderListModal> getOrder() {
		return order;
	}
	public void setOrder(List<SupplairOrderListModal> order) {
		this.order = order;
	}
	public String getSuppliarName() {
		return suppliarName;
	}
	public void setSuppliarName(String suppliarName) {
		this.suppliarName = suppliarName;
	}
	
	
	
	
	
	

}
