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

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="cgscustomer", uniqueConstraints = { @UniqueConstraint (columnNames = {"customerId"}) }) 
public class Customer {
	
	//private String	custName;
			private Date	actionDate;
			private String	cust_regNo;
			private String	custAddress ;
			private String officeId;
			private Long	custContactNo ;
			private String 	status ;
			private String firstName;
			private String lastName;
			private String gender;
			private Long customerId;
			private String cardType;
			private String customerType;
			
		@Column(name="cardType")
		public String getCardType() {
			return cardType;
		}
		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
		@Column(name="cstomerType")
		public String getCustomerType() {
			return customerType;
		}
		public void setCustomerType(String customerType) {
			this.customerType = customerType;
		}
		
		
		@Column(name="gender")
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		private String email;
		@Column(name="email")
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Column(name="firstName")
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		@Column(name="lastName")
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		



		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "actionDate", length = 10)
		public Date getActionDate() {
			return actionDate;
		}
		public void setActionDate(Date actionDate) {
			this.actionDate = actionDate;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column (name = "customerId", unique = true, nullable = false)
		public Long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}
		@Column(name="cust_regNo")
		public String getCust_regNo()
		{
			return cust_regNo;
		}
		public void setCust_regNo(String cust_regNo) {
			this.cust_regNo = cust_regNo;
		}
	
		@Column(name="custAddress")
		public String getCustAddress() {
			return custAddress;
		}
		public void setCustAddress(String custAddress) {
			this.custAddress = custAddress;
		}
		@Column(name="custContactNo")
		public Long getCustContactNo() {
			return custContactNo;
		}
		public void setCustContactNo(Long custContactNo) {
			this.custContactNo = custContactNo;
		}
		@Column(name="status")
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) 
		{
			this.status = status;
		}
		@Column(name="officeId")
		public String getOfficeId() {
			return officeId;
		}
		public void setOfficeId(String officeId) {
			this.officeId = officeId;
		}
		
	

	
}
