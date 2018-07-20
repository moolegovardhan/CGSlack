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
	@Table(name="construction_dealer", uniqueConstraints = { @UniqueConstraint (columnNames = {"ID","officeid"}) })
	
public class Dealer {
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column (name = "ID", unique = true, nullable = false)

		private Long	id;
		@Column(name="dealerName", length=100)		
		private String	dealerName;
		@Column(name="contactPersonName", length=100)
		private String  	contactPersonName;
		@Column(name="dealerAddress")
		private String	dealerAddress;
		@Column(name="email", length=100)
		private String	email;
		@Column(name="mobileNo", length=100)
		private String 	mobileNo;
		@Column(name="status", length=100)
		private String	status;
		@Column(name="tin", length=100)
		private String	tin;
		@Column(name="regNumber", length=100)
		private String	regNumber;
		@Temporal(TemporalType.DATE)
		@Column(name="createddate")
		private Date	createddate;
		@Column(name="createdby", length=100)
		private String	createdby;
		@Column(name="officeid", length=100)
		private String	officeid;
		private String landLineNo;
		private String buildingAddress;
		
		
		
		
		public String getBuildingAddress() {
			return buildingAddress;
		}
		public void setBuildingAddress(String buildingAddress) {
			this.buildingAddress = buildingAddress;
		}
		public String getLandLineNo() {
			return landLineNo;
		}
		public void setLandLineNo(String landLineNo) {
			this.landLineNo = landLineNo;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDealerName() {
			return dealerName;
		}
		public void setDealerName(String dealerName) {
			this.dealerName = dealerName;
		}
		public String getContactPersonName() {
			return contactPersonName;
		}
		public void setContactPersonName(String contactPersonName) {
			this.contactPersonName = contactPersonName;
		}
		public String getDealerAddress() {
			return dealerAddress;
		}
		public void setDealerAddress(String dealerAddress) 
		{
			this.dealerAddress = dealerAddress;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTin() {
			return tin;
		}
		public void setTin(String tin) {
			this.tin = tin;
		}
		public String getRegNumber() {
			return regNumber;
		}
		public void setRegNumber(String regNumber) {
			this.regNumber = regNumber;
		}
		public Date getCreateddate() {
			return createddate;
		}
		public void setCreateddate(Date createddate) {
			this.createddate = createddate;
		}
		public String getCreatedby() {
			return createdby;
		}
		public void setCreatedby(String createdby) {
			this.createdby = createdby;
		}
		public String getOfficeid() {
			return officeid;
		}
		public void setOfficeid(String officeid) {
			this.officeid = officeid;
		}
	
}
