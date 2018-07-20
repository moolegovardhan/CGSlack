package com.cgs.pro94tek.healthcare.modal;

public class ExpensesModal {
	
	private Long id;
	private String expensestype;
	private String expensesname; 
	private String amount ;
	private String spentdateto;
	private String spentdatefrom;
	private String comments;
	private String createddate;
	private String createdby;
	
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
	public String getSpentdateto() {
		return spentdateto;
	}
	public void setSpentdateto(String spentdateto) {
		this.spentdateto = spentdateto;
	}
	public String getSpentdatefrom() {
		return spentdatefrom;
	}
	public void setSpentdatefrom(String spentdatefrom) {
		this.spentdatefrom = spentdatefrom;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


}
