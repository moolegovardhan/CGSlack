package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@Table(name = "sellinglist", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id_sell"),
		@UniqueConstraint(columnNames = "customerName") })

public class SellingOderList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String sellingOderNumber;
	private String customerName;
	private Long mobileNumber;
	private String customerAddress;
	private float totalAmount;
	private String agent_no;
	private int itemQuantity;
	private Date sellingDate;
	private	String agent_name;
	private float itemprice;
	private String itemname;
	
	@Column(name = "itemname")
	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	@Column(name = "itemprice", length = 100)
	public float getItemprice() {
		return itemprice;
	}

	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}

	@Column(name = "agent_name", length = 100)
	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}

	private Construction_Agents  agent;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="agents_id")
	public Construction_Agents getAgent() {
		return agent;
	}

	public void setAgent(Construction_Agents agent) {
		this.agent = agent;
	}

	
	@Column(name = "agent_no", length = 100)
	public String getAgent_no() {
		return agent_no;
	}

	public void setAgent_no(String agent_no) {
		this.agent_no = agent_no;
	}

	@Column(name = "itemquantity", length = 100)
	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sell", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "sellingodNo", length = 100)
	public String getSellingOderNumber() {
		return sellingOderNumber;
	}

	public void setSellingOderNumber(String sellingOderNumber) {
		this.sellingOderNumber = sellingOderNumber;
	}

	@Column(name = "customerName", length = 100)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "mobileNumber", length = 100)
	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "customeraddress")
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "sellingDate")
	public Date getSellingDate() {
		return sellingDate;
	}

	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}

	@Column(name = "totalAmount")
	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

}
