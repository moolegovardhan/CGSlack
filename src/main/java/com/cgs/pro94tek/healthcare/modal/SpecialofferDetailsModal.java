package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class SpecialofferDetailsModal {
	
	private Long id ;
	private int   offeronid ;
	private String   status;
	private Date   createddate;
	private String   createdby;
	private String   splofferid ;
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSplofferid() {
		return splofferid;
	}
	public void setSplofferid(String splofferid) {
		this.splofferid = splofferid;
	}
	public int getOfferonid() {
		return offeronid;
	}
	public void setOfferonid(int offeronid) {
		this.offeronid = offeronid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	
	

}
