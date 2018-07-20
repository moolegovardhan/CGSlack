package com.cgs.pro94tek.utils;

import java.io.Serializable;

public class InvetoryArrayRequestResponse implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String status;
	private String responseMessage;
	private String recordCount;
	private String comments;
	private Object data; 
	private String agent_name;
	private String mobileNumber;
	private String customerName;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() 
	{
		return "ResponseMessage [status=" + status + ", responseMessage=" + responseMessage
				+ ", recordCount=" + recordCount + ", comments=" + comments+", agent_name="+ agent_name.toString()+",mobileNumber="+mobileNumber.toString()+",customerName="+customerName.toString()+",data =" + data.toString()+"]";
	}


}
