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
@Table(name="referal", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") }) 
public class HealthReferal {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)	
		private Long	id ;
	@Column(name="referalname", length=100)
		private String	   referalname ;
	@Column(name="referaltype", length=100)
		private String	   referaltype ;
	@Column(name="address", length=100)
		private String	   address ;
	@Column(name="city", length=100)
		private String	   city ;
	@Column(name="district", length=100)
		private String	   district ;
	@Column(name="mandal", length=100)
		private String	   mandal;
	@Column(name="zipcode", length=100)
		private String	   zipcode ;
	@Column(name="zipcode", length=100)
		private String	   officeid;
	@Column(name="status", length=100)
		private String	   status ;
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
		private Date	   createddate ;
	@Column(name="createdby", length=100)
		private String	   createdby;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReferalname() {
		return referalname;
	}
	public void setReferalname(String referalname) {
		this.referalname = referalname;
	}
	public String getReferaltype() {
		return referaltype;
	}
	public void setReferaltype(String referaltype) {
		this.referaltype = referaltype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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

}
