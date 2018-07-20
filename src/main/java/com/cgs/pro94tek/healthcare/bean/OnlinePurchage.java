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
@Entity
@Table(name = "onlineshpingorderdata", uniqueConstraints = { @UniqueConstraint(columnNames = "order_id") })
public class OnlinePurchage {
	
	private Long id;
	private String itemName;
	private Integer itemquantity;
	private Integer itemPrice;
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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "order_id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="itemName", length=50)
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Column(name="itemQuantity", length=50)
	public Integer getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(Integer itemquantity) {
		this.itemquantity = itemquantity;
	}
	@Column(name="itemPrice", length=50)
	public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Column(name="customerName", length=50)
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name="customerAddress", length=50)
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Column(name="phoneNumber", length=50)
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Column(name="totalAmount", length=50)
	public float getTotalAmout() {
		return totalAmout;
	}
	public void setTotalAmout(float totalAmout) {
		this.totalAmout = totalAmout;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="oderDate", length=50)
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="deliverDate", length=50)
	public Date getDeleverydDate() {
		return deleverydDate;
	}
	public void setDeleverydDate(Date deleverydDate) {
		this.deleverydDate = deleverydDate;
	}
	@Column(name="status", length=50)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="paymentType", length=50)
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	

}
