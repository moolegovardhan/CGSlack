package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class OnlinePurchageModal {
	

	private Long id;
	private String itemname;
	private Integer quantity;
	
	private Integer itemprice;
	
	private String customerName;
	private String customerAddress;
	private Integer phoneNumber;
	private float totalAmout;
	private Date orderDate;
	private String paymentType;
	private Date deleverydDate;
	private String status;
	private String orderNO;
	
	
	
	
	public String getOrderNO() {
		return orderNO;
	}
	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
	}
	public Date getDeleverydDate() {
		return deleverydDate;
	}
	public void setDeleverydDate(Date deleverydDate) {
		this.deleverydDate = deleverydDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/*public Integer getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(Integer itemquantity) {
		this.itemquantity = itemquantity;
	}*/
	/*public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}*/
	public Integer getItemprice() {
		return itemprice;
	}
	public void setItemprice(Integer itemprice) {
		this.itemprice = itemprice;
	}
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
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public float getTotalAmout() {
		return totalAmout;
	}
	public void setTotalAmout(float totalAmout) {
		this.totalAmout = totalAmout;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
