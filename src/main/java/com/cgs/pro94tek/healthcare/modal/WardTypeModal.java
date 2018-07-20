package com.cgs.pro94tek.healthcare.modal;

public class WardTypeModal {
	
	private Long     id;
	private String   wardtype;
	private String   status;
	private String officeid;
	private String   createdBy;
	private String   createdDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWardtype() {
		return wardtype;
	}
	public void setWardtype(String wardtype) {
		this.wardtype = wardtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	

}
