package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="referalrates", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") }) 
public class ReferalRates implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id; 
	@Column(name="referencetype", length=100)
	private String   referencetype ;
	@Column(name="referedto", length=100)
	private String   referedto ;
	@Column(name="testid", length=100)
	private String   testid ;
	@Column(name="paymenttype", length=100)
	private  String  paymenttype;
	@Column(name="amountpercent", length=100)
	private  String   amountpercent;
	@Column(name="status", length=100)
	private  String   status;
	@Temporal(TemporalType.DATE)
	@Column(name="effectivedate")
	private  Date  effectivedate ;
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	private  Date   createddate ;
	@Column(name="createdby", length=100)
	private  String   createdby ;

	
	@Column(name="referalid", length=100)
	private int    referalid ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getReferalid()
	{
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
	
}
