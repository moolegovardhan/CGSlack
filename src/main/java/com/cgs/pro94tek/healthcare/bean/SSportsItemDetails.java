package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

public class SSportsItemDetails {
	
	
	private String gameName;
	private String sportsItemName;
	private String currentItemList;
	private String wantedItemList;
	private Date dayofservice;
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getSportsItemName() {
		return sportsItemName;
	}
	public void setSportsItemName(String sportsItemName) {
		this.sportsItemName = sportsItemName;
	}
	public String getCurrentItemList() {
		return currentItemList;
	}
	public void setCurrentItemList(String currentItemList) {
		this.currentItemList = currentItemList;
	}
	public String getWantedItemList() {
		return wantedItemList;
	}
	public void setWantedItemList(String wantedItemList) {
		this.wantedItemList = wantedItemList;
	}
	public Date getDayofservice() {
		return dayofservice;
	}
	public void setDayofservice(Date dayofservice) {
		this.dayofservice = dayofservice;
	}

}
