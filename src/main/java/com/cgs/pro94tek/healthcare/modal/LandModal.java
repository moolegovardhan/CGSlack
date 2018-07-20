package com.cgs.pro94tek.healthcare.modal;

public class LandModal {
	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBuy() {
		return buy;
	}
	public void setBuy(String buy) {
		this.buy = buy;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}
	public String getLease() {
		return lease;
	}
	public void setLease(String lease) {
		this.lease = lease;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String buy;
	private String sell;
	private String lease;
	private String rent;
	private String  property;
	private String location;
	

}
