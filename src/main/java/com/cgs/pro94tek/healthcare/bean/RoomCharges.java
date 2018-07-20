package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "room_charges", uniqueConstraints = { @UniqueConstraint (columnNames = {"id", "roomdetailsid"})})
public class RoomCharges {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", unique = true, nullable = false)
	
	private Long id;
	
	@Column(name = "roomdetailsid", length=10, unique=true, nullable=false)
	private Long roomdetailsid;
	
	@Column(name = "chargeid", length=10)
	private Long chargeid;
		
	@Column (name = "status", nullable = false,  length=10)
	private String status;
	
	@Column (name = "effectiveDate")
	private Date effectivedate;
	
	@Column (name = "createdDate", insertable= true, updatable=false)
	private Date createdDate;
	
	@Column (name = "createdBy", nullable = false)
	private String createdBy;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoomdetailsid() {
		return roomdetailsid;
	}
	public void setRoomdetailsid(Long roomdetailsid) {
		this.roomdetailsid = roomdetailsid;
	}
	public Long getChargeid() {
		return chargeid;
	}
	public void setChargeid(Long chargeid) {
		this.chargeid = chargeid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
