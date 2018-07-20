package com.cgs.pro94tek.healthcare.modal;

public class SupplierAddressModal {
	
	
	private Long addressid;

	private String mailingaddress;	

	private String billingaddress;

	private String dealereaddress;
	
	private String status;

	private String createdDate;
	
	private String createdBy;

	public Long getAddressid() {
		return addressid;
	}

	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}

	public String getMailingaddress() {
		return mailingaddress;
	}

	public void setMailingaddress(String mailingaddress) {
		this.mailingaddress = mailingaddress;
	}

	public String getBillingaddress() {
		return billingaddress;
	}

	public void setBillingaddress(String billingaddress) {
		this.billingaddress = billingaddress;
	}

	public String getDealereaddress() {
		return dealereaddress;
	}

	public void setDealereaddress(String dealereaddress) {
		this.dealereaddress = dealereaddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	
}
