package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Component;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name = "purchaseorder", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
public class PurchageOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	private int itemId;
	private String purchaseorderId;
	private String itemName;
	private Float itemPrice;
	private Date deleveryDate;
	private String itemType;
	private String supplierName;
	private int quantity;
	private String officeId;
	private String status;
	private Date createdDate;
	private String createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="itemid")
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	@Column(name="itemPrice")
	public Float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Column(name="purchaseorderid")
	public String getPurchaseorderId() {
		return purchaseorderId;
	}
	
	public void setPurchaseorderId(String purchaseorderId) {
		this.purchaseorderId = purchaseorderId;
	}
	@Column(name="itemname")
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="deleverydate")
	public Date getDeleveryDate() {
		return deleveryDate;
	}

	public void setDeleveryDate(Date deleveryDate) {
		this.deleveryDate = deleveryDate;
	}
	@Column(name="itemtype")
	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Column(name="suppliername")
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	@Column(name="quantity")
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Column(name="officeid")
	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	@Column(name="status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Column(name="createdby")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
