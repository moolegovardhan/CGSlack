package com.cgs.pro94tek.healthcare.dataaccess.manager;



import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;

public class AgentQuationOrderContext {
	
	
	private List<AgentQuationModal>  data;
	private String customerName;
	private Long mobileNumber;
	
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private String agent_name;
	private float totalAmount;
	private Integer itemquantity;
	private Date sellingDate;
	private Long agentid;
	private String customerAddress;
	
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public List<AgentQuationModal> getData() {
		return data;
	}
	public void setData(List<AgentQuationModal> data) {
		this.data = data;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(Integer itemquantity) {
		this.itemquantity = itemquantity;
	}
	public Date getSellingDate() {
		return sellingDate;
	}
	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}
	public Long getAgentid() {
		return agentid;
	}
	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	

}
