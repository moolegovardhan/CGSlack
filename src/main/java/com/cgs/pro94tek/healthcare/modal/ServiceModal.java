package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class ServiceModal {
	
	private Long id;
	private String serviceName;
	private String customerName;
	private Integer mobile;
	private String address;
	private String status;
	private Date requestdate;
	private Date requestserved;
	private String cgsEmployeeId;
	private String serviceOrder_no;
	private int quantity;
	private String description;
	private byte[] serviceImage; 
	
	public byte[] getServiceImage() {
		return serviceImage;
	}
	public void setServiceImage(byte[] serviceImage) {
		this.serviceImage = serviceImage;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	private String serviceType;
	private String companyName;
	private float cost;
	private float totalCost;
	
	public String getServiceOrder_no() {
		return serviceOrder_no;
	}
	public void setServiceOrder_no(String serviceOrder_no) {
		this.serviceOrder_no = serviceOrder_no;
	}
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}
	public Date getRequestserved() {
		return requestserved;
	}
	public void setRequestserved(Date requestserved) {
		this.requestserved = requestserved;
	}
	public String getCgsEmployeeId() {
		return cgsEmployeeId;
	}
	public void setCgsEmployeeId(String cgsEmployeeId) {
		this.cgsEmployeeId = cgsEmployeeId;
	}
	
	
	
}
