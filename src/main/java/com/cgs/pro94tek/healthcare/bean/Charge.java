package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="extracharges", uniqueConstraints = { @UniqueConstraint (columnNames = {"ID","officeid"}) })
public class Charge {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;
	private String chargename;
	private String chargebleamount;
	private String discount;
	private String status;
	private String createdBy;
	private Date createdDate;
	private String officeid;
	private String chargetype;
	//private Set<ChargeType> ChargeTypes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="chargename", length=100)
	public String getChargename() {
		return chargename;
	}

	public void setChargename(String chargename) {
		this.chargename = chargename;
	}
	@Column(name="status", length=20)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name="createdBy", length=20)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Column(name="officeid", length=20)	
	public String getOfficeid() {
		return officeid;
	}

	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	
	@Column(name="chargetype", length=100)
	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}
	
	@Column(name="chargebleamount", length=50)
	public String getChargebleamount() {
		return chargebleamount;
	}

	public void setChargableamount(String chargebleamount) {
		this.chargebleamount = chargebleamount;
	}
	
	@Column(name="discount")
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	
	
	/* @OneToMany (fetch = FetchType.LAZY, mappedBy = "charge_map")
	public Set<ChargeType> getChargeTypes() {
		return ChargeTypes;
	}

	public void setChargeTypes(Set<ChargeType> chargeTypes) {
		ChargeTypes = chargeTypes;
	}
	*/
	

	
	
}
