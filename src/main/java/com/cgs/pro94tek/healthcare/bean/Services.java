package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="servicerequest", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class Services {
	
	private Long id;
	private String serviceOrdre_no;
	private String serviceName;
	private String customerName;
	private Integer mobile;
	private String address;
	private String status;
	private Date requestdate;
	private Date requestserved;
	private String cgsEmployeeId;
	private float cost;
	private float totalCost;
	private int quantity;
	private String description;
	private String serviceType;
	private String companyName;
	private byte[] serviceImage; 
	
	
	@Column(name="serviceImg")
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
	}@Column(name="companyName")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	@Column(name="serviceOrder_no")
	public String getServiceOrdre_no() 
	{
		return serviceOrdre_no;
	}
	public void setServiceOrdre_no(String serviceOrdre_no) {
		this.serviceOrdre_no = serviceOrdre_no;
	}
	
	@Column(name="cost")
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Column(name="totalcost")
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	@Id
	@GeneratedValue
	@SequenceGenerator (sequenceName = "id", name = "id")
	@Column (name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="servicename", length=100)
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@Column(name="customername", length=100)
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name="mobile", length=100)
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	@Column(name="address", length=100)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="status", length=100)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="requestdate", length=100)
	public Date getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}
	@Column(name="requestserved", length=100)
	public Date getRequestserved() {
		return requestserved;
	}
	public void setRequestserved(Date requestserved) {
		this.requestserved = requestserved;
	}
	@Column(name="cgsEmployeeId", length=100)
	public String getCgsEmployeeId() {
		return cgsEmployeeId;
	}
	public void setCgsEmployeeId(String cgsEmployeeId) {
		this.cgsEmployeeId = cgsEmployeeId;
	}
	
	

}
