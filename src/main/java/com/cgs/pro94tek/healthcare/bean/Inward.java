package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="medicalshop_inward", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class Inward implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long	id;
	@Column(name="purchaseorderid", length=100)
	private String		purchaseorderid;
	@Column(name="batch", length=100)
	private String		batch;
	@Temporal(TemporalType.DATE)
	@Column(name="batchdate",nullable = true)
	private Date	batchdate;
	@Column(name="expirydate")
	private Date		expirydate;
	@Column(name="orderedqty", length=100)
	private String		orderedqty;
	@Column(name="invoiceqty", length=100)
	private String		invoiceqty;
	
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	private Date		createddate;
	@Column(name="status", length=100)
	private String		status;
	@Column(name="createdBy", length=100)
	private String		createdBy;
	@Column(name="units", length=100)
	private String 		units;
	@Column(name="noofunits", length=100)
	private String		noofunits;
	@Column(name="noofpacks", length=100)
	private String		noofpacks;
	@Column(name="freeqty", length=100)
	private String		freeqty;
	@Column(name="mrp", length=100)
	private String		mrp;
	@Column(name="sellingrate", length=100)
	private String		sellingrate;
	@Column(name="purchasecost", length=100)
	private 	String	purchasecost;
	@Column(name="totalamount", length=100)
	private float		totalamount;
	@Column(name="officeid", length=100)
	private String		officeid;
	@Column(name="medicine", length=100)
	private int	    medicine;
	
	
	
	
	
	
	
	
	
	
	@Column(name="dealer", length=100)
	private String	dealer;
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
	public Date getBatchdate() {
		return batchdate;
	}
	public void setBatchdate(Date batchdate) {
		this.batchdate = batchdate;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getInvoiceqty() {
		return invoiceqty;
	}
	public void setInvoiceqty(String invoiceqty) {
		this.invoiceqty = invoiceqty;
	}
	
	

}
