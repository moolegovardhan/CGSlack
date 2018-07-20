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
@Table (name = "roomtype", uniqueConstraints = { @UniqueConstraint (columnNames = "roomtype")})
public class RoomType {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "ID_seq")
	@SequenceGenerator (sequenceName = "room_id_seq", name = "ID_seq")
	@Column (name = "id", unique = true, nullable = false)
	private String id;

	private String roomtype;

	private String status;
	
	private Date createdDate;

	private String createdBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@OneToOne(optional=false,cascade=CascadeType.ALL, mappedBy="roomtype", targetEntity=Room.class)
	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	
	
	@Column (name = "status", nullable = false)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Column (name = "createdDate", nullable = false)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	@Column (name = "createdBy", nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	

}
