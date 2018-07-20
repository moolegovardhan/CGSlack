package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="specialoffers", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })

public class SpecialOffer {
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id ;
	@Column(name="offername", length=100)
	private String   offername;
	@Column(name="offerfromdate", length=100)
	private Date   offerfromdate;
	@Column(name="offertodate", length=100)
	private  Date offertodate ;
	@Column(name="officeid", length=100)
	private   int officeid ;
	@Column(name="status", length=100)
	private String   status ;
	@Column(name="offerprice", length=100)
	private double  offerprice ;
	@Column(name="createddate", length=100)
	private  Date    createddate;
	@Column(name="createdby", length=100)
	private  String   createdby;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOffername() {
		return offername;
	}
	public void setOffername(String offername) {
		this.offername = offername;
	}
	public Date getOfferfromdate() {
		return offerfromdate;
	}
	public void setOfferfromdate(Date offerfromdate) {
		this.offerfromdate = offerfromdate;
	}
	public Date getOffertodate() {
		return offertodate;
	}
	public void setOffertodate(Date offertodate) {
		this.offertodate = offertodate;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getOfferprice() {
		return offerprice;
	}
	public void setOfferprice(double offerprice) {
		this.offerprice = offerprice;
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
