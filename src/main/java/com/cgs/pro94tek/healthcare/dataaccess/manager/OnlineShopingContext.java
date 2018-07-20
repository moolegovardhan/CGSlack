package com.cgs.pro94tek.healthcare.dataaccess.manager;


import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.modal.OnlinePurchageModal;

public class OnlineShopingContext {
	
	private List<OnlinePurchageModal> data; 
	private float totalAmout;
	private Date orderDate;
	private String status;
	private String customerName;
	private String customerAddress;
	private Integer phoneNumber;
	private String paymentType;
	
	
	
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public List<OnlinePurchageModal> getData() {
		return data;
	}
	public void setData(List<OnlinePurchageModal> data) {
		this.data = data;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	
	
}
