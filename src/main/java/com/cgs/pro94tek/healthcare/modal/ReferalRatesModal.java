package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class ReferalRatesModal {
	
	
	
	
	private Long id; 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getReferalid() {
		return referalid;
	}
	public void setReferalid(int referalid) {
		this.referalid = referalid;
	}
	public String getReferencetype() {
		return referencetype;
	}
	public void setReferencetype(String referencetype) {
		this.referencetype = referencetype;
	}
	public String getReferedto() {
		return referedto;
	}
	public void setReferedto(String referedto) {
		this.referedto = referedto;
	}
	public String getTestid() {
		return testid;
	}
	public void setTestid(String testid) {
		this.testid = testid;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getAmountpercent() {
		return amountpercent;
	}
	public void setAmountpercent(String amountpercent) {
		this.amountpercent = amountpercent;
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
	private int    referalid ;
	private String   referencetype ;
	private String   referedto ;
	private String   testid ;
	private  String  paymenttype;
	private  String   amountpercent;
	private  String   status;
	private  Date  effectivedate ;
	private  Date   createddate ;
	private  String   createdby ;


}
