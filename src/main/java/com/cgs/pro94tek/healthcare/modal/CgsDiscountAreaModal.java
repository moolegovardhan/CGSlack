package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class CgsDiscountAreaModal {
	private Long	area_id;
	private String 		areaName;
	private String 		areaAddress;
	private Date  createdDate;
	private String status;
	private String 	createdBy;
	private Long cateId;
	public Long getArea_id() {
		return area_id;
	}
	public void setArea_id(Long area_id) {
		this.area_id = area_id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaAddress() {
		return areaAddress;
	}
	public void setAreaAddress(String areaAddress) {
		this.areaAddress = areaAddress;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
	public Long getCateId() {
		return cateId;
	}
	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}

}
