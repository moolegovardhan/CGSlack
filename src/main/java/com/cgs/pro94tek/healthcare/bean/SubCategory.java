package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
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

@Entity
@Table (name = "sub_category", uniqueConstraints = { @UniqueConstraint (columnNames = "sub_id"),
		@UniqueConstraint (columnNames = "sub_category_name") })
public class SubCategory{

	private Long id;
	private String subCategoryName;
	private String description;
	private String createdBy;
	private Date createdDate;
	private Category category;
	private String officeid;
	private String  status;
	private Set<Item> items;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subcategory")
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "sub_id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="sub_category_name")
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="created_by")
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
				
	}			
	
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name="officeid")
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="category_id")
	public Category getCategory() {
		return category;
	}	
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
