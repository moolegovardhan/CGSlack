package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.cgs.pro94tek.healthcare.bean.Category;


public class SubCategoryModal {
	
	private Long     id;
	private String   subCategoryName;
	private String   description;
	private String   createdBy;
	private Date     createdDate;
	private String  status;
	private Category category;
	private Long categoryId;
	private String categoryName;
	private String officeid;
	
	
	
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
		System.out.println("leist...:"+getCategoryId());
	}
	
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
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
}
