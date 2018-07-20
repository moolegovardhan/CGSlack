package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

import javax.persistence.Column;

public class InwardDataModal {
	private String	dealer;
	@Column(name="itemname", length=100)
	private String	purchaseorderid;
	private String	batch;
	private Date	batchdate;
	private Date	expirydate;
	private String	orderedqty;
	private String	Invoiceqty;
	private Date	createddate;
	private String	status;
	private String	createdBy;
	private String	units;
	private String	noofunits;
	private String	noofpacks;
	private String	freeqty;
	private String	mrp;
	private String	sellingrate;
	private String	purchasecost;
	private float	totalamount;
	private String	officeid;
	private int medicine;
	
	
	private Long	id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getPurchaseorderid() {
		return purchaseorderid;
	}
	public void setPurchaseorderid(String purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Date getBatchdate() {
		return batchdate;
	}
	public void setBatchdate(Date batchdate) {
		this.batchdate = batchdate;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public String getOrderedqty() {
		return orderedqty;
	}
	public void setOrderedqty(String orderedqty) {
		this.orderedqty = orderedqty;
	}
	public String getInvoiceqty() {
		return Invoiceqty;
	}
	public void setInvoiceqty(String invoiceqty) {
		Invoiceqty = invoiceqty;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getNoofunits() {
		return noofunits;
	}
	public void setNoofunits(String noofunits) {
		this.noofunits = noofunits;
	}
	public String getNoofpacks() {
		return noofpacks;
	}
	public void setNoofpacks(String noofpacks) {
		this.noofpacks = noofpacks;
	}
	public String getFreeqty() {
		return freeqty;
	}
	public void setFreeqty(String freeqty) {
		this.freeqty = freeqty;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getSellingrate() {
		return sellingrate;
	}
	public void setSellingrate(String sellingrate) {
		this.sellingrate = sellingrate;
	}
	public String getPurchasecost() {
		return purchasecost;
	}
	public void setPurchasecost(String purchasecost) {
		this.purchasecost = purchasecost;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public int getMedicine() {
		return medicine;
	}
	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}
	
}
