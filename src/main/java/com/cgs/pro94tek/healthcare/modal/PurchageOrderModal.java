package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class PurchageOrderModal {

	private Long id;
	private int itemId;
	private String purchaseorderId;
	private String itemName;
	private Date deleveryDate;
	private String itemType;
	private String supplierName;
	private int quantity;
	private String officeId;
	private String status;
	private Date createdDate;
	private float itemPrice;
	
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getPurchaseorderId() {
		return purchaseorderId;
	}
	public void setPurchaseorderId(String purchaseorderId) {
		this.purchaseorderId = purchaseorderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getDeleveryDate() {
		return deleveryDate;
	}
	public void setDeleveryDate(Date deleveryDate) {
		this.deleveryDate = deleveryDate;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	private String createdBy;
	
}
