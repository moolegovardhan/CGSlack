package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;


public class SpecialOfferModal {
	
	
	private Long id ;
	private String   offername;
	private Date   offerfromdate;
	private  Date offertodate ;
	private   int officeid ;
	private String   status ;
	private double  offerprice ;
	private  Date    createddate;
	private  String   createdby;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOffername() {
		return offername;
	}
	public void setOffername(String offername) {
		this.offername = offername;
	}
	public Date getOfferfromdate() {
		return offerfromdate;
	}
	public void setOfferfromdate(Date offerfromdate) {
		this.offerfromdate = offerfromdate;
	}
	public Date getOffertodate() {
		return offertodate;
	}
	public void setOffertodate(Date offertodate) {
		this.offertodate = offertodate;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getOfferprice() {
		return offerprice;
	}
	public void setOfferprice(double offerprice) {
		this.offerprice = offerprice;
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
