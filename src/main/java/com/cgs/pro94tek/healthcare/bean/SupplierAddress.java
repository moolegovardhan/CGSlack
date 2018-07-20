package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table (name = "supplieraddress", uniqueConstraints = { @UniqueConstraint (columnNames = "addressid")})

public class SupplierAddress {
	
	@Id
	@GeneratedValue
	@SequenceGenerator (sequenceName = "address_id", name = "ID_seq")
	@Column (name = "addressid", unique = true, nullable = false)
	private Long addressid;

	@Column(name="mailingaddress", length=100)
	private String mailingaddress;	

	@Column(name="billingaddress", length=250)
	private String billingaddress;

	@Column(name="dealeraddress", length=250)
	private String dealereaddress;
	
	@Column (name = "status", nullable = true)
	private String status;
	
	@Temporal(TemporalType.DATE)
	@Column (name = "createdDate", nullable = false)
	private Date createdDate;
	
	
	@Column (name = "createdBy", nullable = false)
	private String createdBy;
	
	//@JoinColumn(name="supplieraddress")
	private Supplier supplier;

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	
	

}
