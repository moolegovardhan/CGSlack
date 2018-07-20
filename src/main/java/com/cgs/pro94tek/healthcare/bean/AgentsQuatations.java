package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "sellinglist", uniqueConstraints = { @UniqueConstraint(columnNames = "id_sell") })

public class AgentsQuatations {
	private Long id;
	private String agent_no;
	private String agent_name;
	private String	itemname;
	private String	customerName;
	private Date	sellingDate;
	private float	totalAmount;
	private Long	mobileNumber;
	private String	customerAddress;
	private String  sellingodNo;
	private Long agent_id;
	private float itemquantity;
	private float itemprice;
	private String status;
	
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/*private String supplairName;
	public String getSupplairName() {
		return supplairName;
	}
	public void setSupplairName(String supplairName) {
		this.supplairName = supplairName;
	}
	public int getSupplairMobile() {
		return supplairMobile;
	}
	public void setSupplairMobile(int supplairMobile) {
		this.supplairMobile = supplairMobile;
	}
	private int supplairMobile;
	*/
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setItemquantity(Integer itemquantity) {
		this.itemquantity = itemquantity;
	}
	@Column(name="mobileNumber")
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	@Column(name="itemprice")
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	@Column(name="agents_id")
	public Long getAgent_id() {
		return agent_id;
	}
	public void setAgent_id(Long agent_id) {
		this.agent_id = agent_id;
	}
	
	@Column(name="itemquantity")
	public float getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(float itemquantity) {
		this.itemquantity = itemquantity;
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
	@Column(name="agent_no")
	public String getAgent_no() {
		return agent_no;
	}
	public void setAgent_no(String agent_no) {
		this.agent_no = agent_no;
	}
	@Column(name="agent_name")
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	@Column(name="itemname")
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	@Column(name="customerName")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name="sellingDate")
	public Date getSellingDate() {
		return sellingDate;
	}
	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}
	
	
	@Column(name="customerAddress")
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Column(name="sellingodNo")
	public String getSellingodNo() {
		return sellingodNo;
	}
	public void setSellingodNo(String sellingodNo) {
		this.sellingodNo = sellingodNo;
	}
}
