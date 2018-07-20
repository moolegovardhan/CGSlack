package com.cgs.pro94tek.healthcare.modal;

public class CgsStockMasterModal {
	private Long  id;
	private	String stockId;
	private	String purchaId;
	private	float purchageQuantity;
	private	Integer purchagePrice;
	private	String selId;
	private	float selQuantity;
	private	Integer selPrice;
	private	Integer totalAmount;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getPurchaId() {
		return purchaId;
	}
	public void setPurchaId(String purchaId) {
		this.purchaId = purchaId;
	}
	public float getPurchageQuantity() {
		return purchageQuantity;
	}
	public void setPurchageQuantity(float purchageQuantity) {
		this.purchageQuantity = purchageQuantity;
	}
	public Integer getPurchagePrice() {
		return purchagePrice;
	}
	public void setPurchagePrice(Integer purchagePrice) {
		this.purchagePrice = purchagePrice;
	}
	public String getSelId() {
		return selId;
	}
	public void setSelId(String selId) {
		this.selId = selId;
	}
	public float getSelQuantity() {
		return selQuantity;
	}
	public void setSelQuantity(float selQuantity) {
		this.selQuantity = selQuantity;
	}
	public Integer getSelPrice() {
		return selPrice;
	}
	public void setSelPrice(Integer selPrice) {
		this.selPrice = selPrice;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

}
