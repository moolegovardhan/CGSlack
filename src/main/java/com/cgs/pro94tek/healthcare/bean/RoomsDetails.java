package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "rooms_details", uniqueConstraints = { @UniqueConstraint (columnNames = {"roomid","roomdetailsid"})})
public class RoomsDetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "roomdetailsid", unique = true, nullable = false)
	private Long roomdetailsid;
	
	@Column (name = "roomid", unique = true, nullable = false)
	private Long roomid;
	
	@Column(name="room_name", length=100)
	private String roomname;
	
	@Column (name = "occupancy", nullable = false)
	private String occupancy;
	
	@Column (name = "createdDate", nullable = false)
	private Date createdDate;
	
	@Column (name = "createdBy", nullable = false)
	private String createdBy;
	
	@Column (name = "status", nullable = false)
	private String status;
	
	/*@Column(name = "officeid", length=10)
	private String officeid;*/

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Room room;
	
	@OneToOne
	@JoinColumn(name="roomdetailsid")
	private RoomCharges roomcharges;
	
	public Long getRoomdetailsid() {
		return roomdetailsid;
	}


	public void setRoomdetailsid(Long roomdetailsid) {
		this.roomdetailsid = roomdetailsid;
	}


	public Long getRoomid() {
		return roomid;
	}
	
	
	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

/*	public String getOfficeid() {
		return officeid;
	}

	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}*/

	public RoomCharges getRoomcharges() {
		return roomcharges;
	}

	public void setRoomcharges(RoomCharges roomcharges) {
		this.roomcharges = roomcharges;
	}


	public Room getRoom() {
		return room;
	}


	public void setRoom(Room room) {
		this.room = room;
	}
}
