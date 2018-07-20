package com.cgs.pro94tek.healthcare.dataaccess.manager;



import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;

public class SellingOrderConstant {
	
	
	private String customerName;
	private  Long mobileNumber;
/*	private String agent_name;*/
	private int totalAmount;
	private	String custaddress;
	private Date sellingDate;
	/*private int agent_no;*/
	/*private Long agentid;*/
	private List<SellingOrderListModal> data;
	public List<SellingOrderListModal> getData() {
		return data;
	}
	public void setData(List<SellingOrderListModal> data) {
		this.data = data;
	}
	public Date getSellingDate() {
		return sellingDate;
	}
	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}
	/*public int getAgent_no() {
		return agent_no;
	}
	public void setAgent_no(int agent_no) {
		this.agent_no = agent_no;
	}
	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	*/
	
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
	/*public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}*/
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	

	
	
	


}
