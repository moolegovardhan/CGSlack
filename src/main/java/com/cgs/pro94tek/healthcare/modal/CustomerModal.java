package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Columns;

public class CustomerModal {
	
	private Long customerId;
	private String	cust_regNo;
	private String	custName;
	private String officeId;
	private String	custAddress ;
	private Long	custContactNo ;
	private String 	status ;
	private Date	actionDate;
	private String firstName;
	private String lastName;
	private String eamil;
	private String gender;
	private String cardType;
	
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	private String customerType;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCust_regNo() {
		return cust_regNo;
	}
	public void setCust_regNo(String cust_regNo) {
		this.cust_regNo = cust_regNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Long getCustContactNo() {
		return custContactNo;
	}
	public void setCustContactNo(Long custContactNo)
	{
		this.custContactNo = custContactNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}


	
}
