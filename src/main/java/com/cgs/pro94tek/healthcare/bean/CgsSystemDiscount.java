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

@Entity
@Table(name = "systemdiscount", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })

public class CgsSystemDiscount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
		private Long id ;
	@Column(name = "discountname")
		private String 	discountname;
	@Column(name = "city")
		private String	city;
	@Column(name = "address")
	private String  address;
		
	
	@Column(name = "percent")
		private String	percent;
	@Column(name = "status")
		private	String status;
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
		private	Date startdate;
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
		private	Date 	enddate;
	@Temporal(TemporalType.DATE)
	@Column(name = "createddate")
		private	Date 	createddate;
	@Column(name = "createdby")
		private	String 	createdby;
	@Column(name = "mobile")
		private	String	mobile;
	
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDiscountname() {
			return discountname;
		}
		public void setDiscountname(String discountname) {
			this.discountname = discountname;
		}
		
		public String getPercent() {
			return percent;
		}
		public void setPercent(String percent) {
			this.percent = percent;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Date getStartdate() {
			return startdate;
		}
		public void setStartdate(Date startdate) {
			this.startdate = startdate;
		}
		public Date getEnddate() {
			return enddate;
		}
		public void setEnddate(Date enddate) {
			this.enddate = enddate;
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
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
			

}
