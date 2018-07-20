package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

import javax.persistence.Column;

public class SubcategorydemoModal {
	
	
	private Long id;
	private String subCategoryName;
	private String description;
	private String createdBy;
	private Date createdDate;
	private Long cateId;
	public Long getCateId() {
		return cateId;
	}
	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}
	private String officeid;
	private String  status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
	

}
