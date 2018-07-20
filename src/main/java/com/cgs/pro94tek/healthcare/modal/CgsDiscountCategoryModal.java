package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class CgsDiscountCategoryModal {
	private Long sysdsc_id;
	private String 	catId;
	private String	categoryName;
	private Date	cratedDate;
	private String	createdBy;
	private String discription;
	
	
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Long getSysdsc_id()
	{
		return sysdsc_id;
	}
	public void setSysdsc_id(Long sysdsc_id) {
		this.sysdsc_id = sysdsc_id;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Date getCratedDate() {
		return cratedDate;
	}
	public void setCratedDate(Date cratedDate) {
		this.cratedDate = cratedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
