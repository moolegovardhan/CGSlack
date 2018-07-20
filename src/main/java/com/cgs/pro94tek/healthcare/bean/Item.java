package com.cgs.pro94tek.healthcare.bean;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.transaction.annotation.Transactional;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="item", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })

public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;
	@Column(name="itemname", length=100)
	private String   itemname ;
	@Column(name="itemdescription", length=100)
	private String    itemdescription ;
	@Column(name="itemtype", length=100)
	private String    itemtype ;
	@Column(name="status", length=100)
	private String    status ;
	@Temporal(TemporalType.DATE)
	@Column(name = "createddate")
	private Date   createddate ;
	@Column(name="createdby", length=100)
	private String    createdby ;
	@Column(name="photo", length=100)
	private String    photo ;
	@Column(name="thumbnail", length=100)
	private String    thumbnail;
	/*@Column(name="category_id", length=100)
	private String    categoryid ;*/
	@Column(name="itemquantity", length=100)
	private float itemquantity;
	@Column(name="itemprice", length=100)
	private float itemprice;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="category_id")
	private Category category;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="sub_id")
	private SubCategory subcategory;
	@Column(name="officeid")
	private String officeId;

	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) 
	{
		this.category = category;
	}
	
	public SubCategory getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(SubCategory subcategory) {
		this.subcategory = subcategory;
	}
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	public float getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(float itemquantity) {
		this.itemquantity = itemquantity;
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
	public void setStatus(String status) 
	{
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
	
	
}

