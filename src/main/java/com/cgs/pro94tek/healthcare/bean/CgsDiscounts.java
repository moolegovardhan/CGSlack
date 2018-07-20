package com.cgs.pro94tek.healthcare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.transaction.Synchronization;

@Entity
@Table(name = "discounts", uniqueConstraints = { @UniqueConstraint(columnNames = "dsc_id") })
public class CgsDiscounts implements Synchronization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dsc_id", unique = true, nullable = false)
	private Long dsc_id;
	@Column(name ="discounttype")
	private String discounttype;
	@Column(name ="endtype")
	private String endtype;
	@Column(name ="endid")
	private String endid;
	@Column(name ="discpercent")
	private String discpercent;
	@Column(name ="status")
	private String status;
	@Column(name ="createddate")
	private String createddate;
	@Column(name ="createdby")
	private String createdby;
	@Column(name ="cardtype")
	private String	cardtype;
	@Column(name ="cgsdiscount")
	private String cgsdiscount;
	
	public Long getDsc_id() {
		return dsc_id;
	}
	public void setDsc_id(Long dsc_id) {
		this.dsc_id = dsc_id;
	}
	public String getDiscounttype() {
		return discounttype;
	}
	public void setDiscounttype(String discounttype) {
		this.discounttype = discounttype;
	}
	public String getEndtype() {
		return endtype;
	}
	public void setEndtype(String endtype) {
		this.endtype = endtype;
	}
	public String getEndid() {
		return endid;
	}
	public void setEndid(String endid) {
		this.endid = endid;
	}
	public String getDiscpercent() {
		return discpercent;
	}
	public void setDiscpercent(String discpercent) {
		this.discpercent = discpercent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCgsdiscount() {
		return cgsdiscount;
	}
	public void setCgsdiscount(String cgsdiscount) {
		this.cgsdiscount = cgsdiscount;
	}
	@Override
	public void beforeCompletion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterCompletion(int status) {
		// TODO Auto-generated method stub
		
	}


}
