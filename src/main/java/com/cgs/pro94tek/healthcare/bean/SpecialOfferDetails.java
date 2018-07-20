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
@Table(name="Specialofferdetails", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })


public class SpecialOfferDetails {
	
	
	
	private Long id ;
	private int   offeronid ;
	private String   status;
	private Date   createddate;
	private String   createdby;
	private String   splofferid ;
	
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="splofferid", length=20)
	public String getSplofferid() {
		return splofferid;
	}
	public void setSplofferid(String splofferid) {
		this.splofferid = splofferid;
	}
	@Column(name="offeronid", length=20)
	public int getOfferonid() {
		return offeronid;
	}
	public void setOfferonid(int offeronid) {
		this.offeronid = offeronid;
	}
	@Column(name="status", length=20)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	@Column(name="createdby", length=50)
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
	
	
	
	
	
	
	 

}
