package com.cgs.pro94tek.healthcare.modal;



import java.util.Date;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.SubCategory;

public class ItemModal {
	
	private Long id;
	private String   itemname ;
	private String    itemdescription ;
	private String    itemtype ;
	private String    status ;
	private Date   createddate;
	private String    createdby ;
	private String    photo ;
	private String    thumbnail;
	private Long    categoryid ;
	private Long   subcategoryid ;
	private String catName;
	private String subcateName;
	private float itemquantity;
	private int itemthreshold;
	private String officeid;
	private float itemprice;
	
	
	
	
	
	
	public float getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(float itemquantity) {
		this.itemquantity = itemquantity;
	}
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public int getItemthreshold() {
		return itemthreshold;
	}
	public void setItemthreshold(int itemthreshold) {
		this.itemthreshold = itemthreshold;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public Long getSubcategoryid() {
		return subcategoryid;
	}
	public void setSubcategoryid(Long subcategoryid) {
		this.subcategoryid = subcategoryid;
	}
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getSubcateName() {
		return subcateName;
	}
	public void setSubcateName(String subcateName) {
		this.subcateName = subcateName;
	}
	
	
	
	
	
	
	
	
	
	
}
