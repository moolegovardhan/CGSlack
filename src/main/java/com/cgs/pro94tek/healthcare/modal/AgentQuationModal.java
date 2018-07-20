package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class AgentQuationModal {
	private Long id;
	private String agent_no;
	private String agent_name;
	private String	itemname;
	private String	customerName;
	private Date	sellingDate;
	private Long	mobileNumber;
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private String	customerAddress;
	private String  sellingodNo;
	private float itemquantity;
	private float itemprice;
	private float	totalAmount;
	private String status;
	//private String supplairName;
	
	
	/*public String getSupplairName() {
		return supplairName;
	}
	public void setSupplairName(String supplairName) {
		this.supplairName = supplairName;
	}*/
	/*public int getSupplairMobile() {
		return supplairMobile;
	}
	public void setSupplairMobile(int supplairMobile) {
		this.supplairMobile = supplairMobile;
	}
	private int supplairMobile;
	*/
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	private Long agent_id;
	
	
	
	
	
	public Long getAgent_id() {
		return agent_id;
	}
	public void setAgent_id(Long agent_id) {
		this.agent_id = agent_id;
	}
	public float getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(float itemquantity) {
		this.itemquantity = itemquantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAgent_no() {
		return agent_no;
	}
	public void setAgent_no(String agent_no) {
		this.agent_no = agent_no;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getSellingDate() {
		return sellingDate;
	}
	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}
	
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getSellingodNo() {
		return sellingodNo;
	}
	public void setSellingodNo(String sellingodNo) {
		this.sellingodNo = sellingodNo;
	}
	

}
