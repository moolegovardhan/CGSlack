package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="rooms", uniqueConstraints = { @UniqueConstraint (columnNames = { "officeid","roomid"}) }) 
public class Room {
	
	private Long roomid;
	
	//@OneToOne
	//@JoinColumn(name="roomtype")
	//@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    //@JoinColumn(name="roomtype", referencedColumnName="id")
	//private RoomType roomtype;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "room", cascade = CascadeType.ALL)
	private RoomsDetails roomsdetails;
	
	private String roomname;
	private String officeid;
	private String totalrooms;
	private String roomcost;
	private String status;
	private Date createdDate;
	private String createdBy;
	private String discount;
	private String finalprice;
	private String charges;
	private String totaloccupied;
	private RoomType roomtype;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "roomid", unique = true, nullable = false)
	public Long getRoomid() {
		return roomid;
	}

	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}
	
	
	@OneToOne
	@JoinColumn(name="roomid")
	public RoomsDetails getRoomsdetails() {
		return roomsdetails;
	}

	public void setRoomsdetails(RoomsDetails roomsdetails) {
		this.roomsdetails = roomsdetails;
	}
	

	
	@Column(name="roomname", length=100)
	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	
	
	@Column(name = "officeid", length=10)
	public String getOfficeid() {
		return officeid;
	}
	
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	
	
	@Column(name = "totalrooms", length=10)
	public String getTotalrooms() {
		return totalrooms;
	}

	public void setTotalrooms(String totalrooms) {
		this.totalrooms = totalrooms;
	}
	
	
	@Column(name = "roomcost", length=10)
	public String getRoomcost() {
		return roomcost;
	}

	public void setRoomcost(String roomcost) {
		this.roomcost = roomcost;
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
	
	
	@Column (name = "discount", nullable = false)
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
		
	
	@Column (name = "finalprice", nullable = false)
	public String getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(String finalprice) {
		this.finalprice = finalprice;
	}
	
	
	@Column (name = "charges", nullable = false)
	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}
	
	
	@Column(name = "totaloccupied",length=10, nullable = true)
	public String getTotaloccupied() {
		return totaloccupied;
	}

	public void setTotaloccupied(String totaloccupied) {
		this.totaloccupied = totaloccupied;
	}
	
	@OneToOne
	@JoinColumn(name="roomtype")
	public RoomType getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}
	

	
	

}
