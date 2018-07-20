package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table (name = "wardtype", uniqueConstraints = { @UniqueConstraint (columnNames = "wardtype")})
public class WardType{

	private Long     id;
	private String   wardtype;
	private String   status;
	private String officeid;
	private String   createdBy;
	private Date     createdDate;
	//private Ward ward;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "ID_seq")
	@SequenceGenerator (sequenceName = "ward_id_seq", name = "ID_seq")
	@Column (name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getWardtype() {
		return wardtype;
	}
	@OneToOne(optional=false,cascade=CascadeType.ALL, mappedBy="wardtype")
	public void setWardtype(String wardtype) {
		this.wardtype = wardtype;
	}

	@Column (name = "status", nullable = true)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	@Column(name = "officeid", length=10)
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	
	@Column (name = "createdBy", nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column (name = "createdDate", nullable = false)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	



}
