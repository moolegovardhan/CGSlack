package com.cgs.pro94tek.healthcare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;



@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="expenses", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") }) 
public class Expenses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name="expensestype", length=100)
	private String expensestype;
	
	@Column(name="expensesname", length=100)
	private String expensesname;
	
	@Column(name="amount", length=10)
	private String amount;
	
	@Temporal(TemporalType.DATE)
	@Column(name="spentdateto")
	private Date spentdateto;
	
	@Temporal(TemporalType.DATE)
	@Column(name="spentdatefrom")
	private Date spentdatefrom;
	
	@Column(name="comments", length=100)
	private String comments;
	
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	private Date createddate;
	
	@Column(name="createdby", length=20)
	private String  createdby;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExpensestype() {
		return expensestype;
	}
	public void setExpensestype(String expensestype) {
		this.expensestype = expensestype;
	}
	public String getExpensesname() {
		return expensesname;
	}
	public void setExpensesname(String expensesname) {
		this.expensesname = expensesname;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getSpentdateto() {
		return spentdateto;
	}
	public void setSpentdateto(Date spentdateto) {
		this.spentdateto = spentdateto;
	}
	public Date getSpentdatefrom() {
		return spentdatefrom;
	}
	public void setSpentdatefrom(Date spentdatefrom) {
		this.spentdatefrom = spentdatefrom;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
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
