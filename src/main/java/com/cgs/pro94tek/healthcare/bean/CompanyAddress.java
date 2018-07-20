package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table (name = "companyaddress", uniqueConstraints = { @UniqueConstraint (columnNames = {"addressid"})})
public class CompanyAddress {
	
	@Id
	@GeneratedValue
	@SequenceGenerator (sequenceName = "addressid", name = "ID_seq")
	@Column (name = "addressid", unique = true, nullable = false)
	private Long addressid;

	@Column(name="mailingaddress", length=100)
	private String mailingaddress;	

	@Column(name="billingaddress", length=250)
	private String billingaddress;

	@Column(name="corporateaddress", length=250)
	private String corporateaddress;
	
	@Column (name = "status", nullable = true)
	private String status;
	
	@Column (name = "createdDate", nullable = false)
	private Date createdDate;
	
	@Column (name = "createdBy", nullable = false)
	private String createdBy;
	
	//@JoinColumn
	//@OneToOne(optional=false,cascade=CascadeType.ALL, mappedBy="companyaddress")
    //@OneToOne
	//@OneToOne(fetch = FetchType.LAZY)
	
	
	private Company company;
  
	public Long getAddressid() {
		return addressid;
	}
		
	
	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}
	
	
	public String getMailingaddress() {
		return mailingaddress;
	}

	public void setMailingaddress(String mailingaddress) {
		this.mailingaddress = mailingaddress;
	}

	public String getBillingaddress() {
		return billingaddress;
	}

	public void setBillingaddress(String billingaddress) {
		this.billingaddress = billingaddress;
	}

	public String getCorporateaddress() {
		return corporateaddress;
	}

	public void setCorporateaddress(String corporateaddress) {
		this.corporateaddress = corporateaddress;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


	
}
