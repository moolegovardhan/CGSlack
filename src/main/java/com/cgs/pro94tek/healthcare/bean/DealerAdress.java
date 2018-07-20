package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@Entity
@Table (name = "dealeraddress", uniqueConstraints = { @UniqueConstraint (columnNames = "addressid")})


public class DealerAdress {
	
	
	@Id
	@GeneratedValue
	@SequenceGenerator (sequenceName = "address_id", name = "ID_seq")
	@Column (name = "addressid", unique = true, nullable = false)
	private Long addressid;
	
	@Column(name="mailingAddress", length=100)
	private String	 mailingAddress;
	@Column(name="billingAddress", length=100)
		private String		billingAddress;
	@Column(name="dealerAddress", length=100)
		private String		dealerAddress;
	@Column(name="status", length=100)
		private String		status;
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	private Date createddate;
	
	
	@Column(name="createdby", length=100)
		private String		createdby;
	
	
	
	
	
	
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	public Long getAddressid() {
		return addressid;
	}
	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}
	public String getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
		

}
