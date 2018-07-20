package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ItemPriceModal {
	
	
	private Long id ;
private  String  itemid ;
	
	private String    itemprice ;
	private Date   effectivedate ;
	private String   salesprice ;
	private String    status;
	private Date   createddate ;
	private String  createdby;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getItemprice() {
		return itemprice;
	}

	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}

	public Date getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}

	public String getSalesprice() {
		return salesprice;
	}

	public void setSalesprice(String salesprice) {
		this.salesprice = salesprice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
