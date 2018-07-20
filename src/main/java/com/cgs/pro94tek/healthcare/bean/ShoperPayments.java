package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="shoper_payments", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })

public class ShoperPayments implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;
	private String orderNo;
	private String customerName;
	private String itemsName;
	private String customerAdress;
	private int totalAmount ;
	private String billingStatus;
	private String paymentType;
	private int quantity;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="orderNo", length=100)
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	@Column(name="customerName", length=100)
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name="itemsName", length=100)
	public String getItemsName() {
		return itemsName;
	}
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}
	@Column(name="customerAdress", length=100)
	public String getCustomerAdress() {
		return customerAdress;
	}
	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}
	@Column(name="totalAmount", length=100)
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Column(name="billingStatus", length=100)
	public String getBillingStatus() {
		return billingStatus;
	}
	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}
	@Column(name="paymentType", length=100)
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Column(name="quantity", length=100)
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
