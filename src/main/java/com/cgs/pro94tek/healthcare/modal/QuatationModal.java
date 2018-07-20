package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class QuatationModal {
	
	private Long id;
	private String 	 quotationnumber;
	private  String purchaseorderid;
	private  String	 medicinename;
	private  String	 suppliername;
	private  String	 status;
	private  String	 quantity;
	private  String	 unitprice;
	private  double	 totalamount;
	private  Date	 podeliverydate;
	private  Date	quotationdeliverydate;
	private  String		 cost;
	private  Date		createddate;
	private  String		 createdby;
	private  String		officeid;
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuotationnumber() {
		return quotationnumber;
	}
	public void setQuotationnumber(String quotationnumber) {
		this.quotationnumber = quotationnumber;
	}
	public String getPurchaseorderid() {
		return purchaseorderid;
	}
	public void setPurchaseorderid(String purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public Date getPodeliverydate() {
		return podeliverydate;
	}
	public void setPodeliverydate(Date podeliverydate) {
		this.podeliverydate = podeliverydate;
	}
	public Date getQuotationdeliverydate() {
		return quotationdeliverydate;
	}
	public void setQuotationdeliverydate(Date quotationdeliverydate) {
		this.quotationdeliverydate = quotationdeliverydate;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	

}
