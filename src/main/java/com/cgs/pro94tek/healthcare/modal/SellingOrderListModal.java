package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

import com.cgs.pro94tek.healthcare.bean.Construction_Agents;

public class SellingOrderListModal {
	private Long id;
	private String	sellingOderNumber ;
	private String	customerName ;
	private	Long mobileNumber ;
	private	String custaddress;
	private	Date sellingDate;
	private	float totalAmount;
	private	String itemname;
	private	String agent_no;
	private	int itemquantity;
	private	String agent_name;
	private Long agentid;
	private float	itemprice;
	private int quantity1;
	
	
	
	
	public int getQuantity1() {
		return quantity1;
	}
	public void setQuantity1(int quantity1) {
		this.quantity1 = quantity1;
	}
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	
	private Construction_Agents cagent;
	
	
	public Construction_Agents getCagent() {
		return cagent;
	}
	public void setCagent(Construction_Agents cagent) {
		this.cagent = cagent;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getAgent_no() {
		return agent_no;
	}
	public void setAgent_no(String agent_no) {
		this.agent_no = agent_no;
	}
	public int getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSellingOderNumber() {
		return sellingOderNumber;
	}
	public void setSellingOderNumber(String sellingOderNumber) {
		this.sellingOderNumber = sellingOderNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public Date getSellingDate() {
		return sellingDate;
	}
	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
		


}
