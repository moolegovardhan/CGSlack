package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class CgsStockModal {
	
	private Long id;
	private Long custMobileNO;
	
	private String roleId;
	private String cgsStockId;
	private String itemName;
	private int itemQuantity;
	private float itemPrice;
	private String itemModalNO;
	private String itemCompanyName;
	private byte[] images;
	private float orderQuantity;
	private String dealerName;
	private Long dealerContectNo;
	private Long totalAmount;
	private String sellingorderNo;
	private Long selprice;
	private String customerName;
	private String regNo;
	private String customerAddress;
	private String status;
	private float selQuantity;
	private Date orderDate;
	private Date recivedDate;
	private float dbtcashBill;
	private float wantedStock;
	private float outofStock;
	private String agenceName;
	private Long agencyContactNo;
	private String purchageOrderNO;
	private float purchageOrderQuantity;
	private float crdtBill;
	private String adminStatus;
	private long purchagetotal;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public long getPurchagetotal() {
		return purchagetotal;
	}
	public void setPurchagetotal(long purchagetotal) {
		this.purchagetotal = purchagetotal;
	}
	public float getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(float orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public Long getDealerContectNo() {
		return dealerContectNo;
	}
	public void setDealerContectNo(Long dealerContectNo) {
		this.dealerContectNo = dealerContectNo;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getSellingorderNo() {
		return sellingorderNo;
	}
	public void setSellingorderNo(String sellingorderNo) {
		this.sellingorderNo = sellingorderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getRecivedDate() {
		return recivedDate;
	}
	public void setRecivedDate(Date recivedDate) {
		this.recivedDate = recivedDate;
	}
	public float getDbtcashBill() {
		return dbtcashBill;
	}
	public void setDbtcashBill(float dbtcashBill) {
		this.dbtcashBill = dbtcashBill;
	}
	public float getWantedStock() {
		return wantedStock;
	}
	public void setWantedStock(float wantedStock) {
		this.wantedStock = wantedStock;
	}
	public float getOutofStock() {
		return outofStock;
	}
	public void setOutofStock(float outofStock) {
		this.outofStock = outofStock;
	}
	public String getAgenceName() {
		return agenceName;
	}
	public void setAgenceName(String agenceName) {
		this.agenceName = agenceName;
	}
	public Long getAgencyContactNo() {
		return agencyContactNo;
	}
	public void setAgencyContactNo(Long agencyContactNo) {
		this.agencyContactNo = agencyContactNo;
	}
	public String getPurchageOrderNO() {
		return purchageOrderNO;
	}
	public void setPurchageOrderNO(String purchageOrderNO) {
		this.purchageOrderNO = purchageOrderNO;
	}
	public float getPurchageOrderQuantity() {
		return purchageOrderQuantity;
	}
	public void setPurchageOrderQuantity(float purchageOrderQuantity) {
		this.purchageOrderQuantity = purchageOrderQuantity;
	}
	public float getCrdtBill() {
		return crdtBill;
	}
	public void setCrdtBill(float crdtBill) 
	{
		this.crdtBill = crdtBill;
	}
	public String getAdminStatus() 
	{
		return adminStatus;
	}
	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}
	public Long getSelprice() {
		return selprice;
	}
	public void setSelprice(Long selprice) {
		this.selprice = selprice;
	}
	public float getSelQuantity() {
		return selQuantity;
	}
	public void setSelQuantity(float selQuantity) {
		this.selQuantity = selQuantity;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCgsStockId() {
		return cgsStockId;
	}
	public void setCgsStockId(String cgsStockId) {
		this.cgsStockId = cgsStockId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemprice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemModalNO() {
		return itemModalNO;
	}
	public void setItemModalNO(String itemModalNO) {
		this.itemModalNO = itemModalNO;
	}
	public String getItemCompanyName() {
		return itemCompanyName;
	}
	public void setItemCompanyName(String itemCompanyName) {
		this.itemCompanyName = itemCompanyName;
	}
	public byte[] getImages() {
		return images;
	}
	public void setImages(byte[] images) {
		this.images = images;
	}
	public Long getCustMobileNO() {
		return custMobileNO;
	}
	public void setCustMobileNO(Long custMobileNO) {
		this.custMobileNO = custMobileNO;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
