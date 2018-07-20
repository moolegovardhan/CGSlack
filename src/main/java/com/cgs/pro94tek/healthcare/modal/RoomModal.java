package com.cgs.pro94tek.healthcare.modal;

import com.cgs.pro94tek.healthcare.bean.RoomType;

public class RoomModal {
	
	private Long roomid;
	private RoomType roomtypes;
	private String roomname;
	private String officeid;
	private String totalrooms;
	private String roomcost;
	private String status;
	private String createdDate;
	private String createdBy;
	private String discount;
	private String finalprice;
	private String charges;
	private String totaloccupied;
	
	public Long getRoomid() {
		return roomid;
	}
	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}
	
	public RoomType getRoomtypes() {
		return roomtypes;
	}
	public void setRoomtypes(RoomType roomtypes) {
		this.roomtypes = roomtypes;
	}
	
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public String getTotalrooms() {
		return totalrooms;
	}
	public void setTotalrooms(String totalrooms) {
		this.totalrooms = totalrooms;
	}
	public String getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(String roomcost) {
		this.roomcost = roomcost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	public String getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(String finalprice) {
		this.finalprice = finalprice;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getTotaloccupied() {
		return totaloccupied;
	}
	public void setTotaloccupied(String totaloccupied) {
		this.totaloccupied = totaloccupied;
	}
	
	
}
