package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class HealthReferalModal {
	
	
	
	private Long	id ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReferalname() {
		return referalname;
	}
	public void setReferalname(String referalname) {
		this.referalname = referalname;
	}
	public String getReferaltype() {
		return referaltype;
	}
	public void setReferaltype(String referaltype) {
		this.referaltype = referaltype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
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
	private String	   referalname ;
	private String	   referaltype ;
	private String	   address ;
	private String	   city ;
	private String	   district ;
	private String	   mandal;
	private String	   zipcode ;
	private String	   officeid;
	private String	   status ;
	private Date	   createddate ;
	private String	   createdby;


}
