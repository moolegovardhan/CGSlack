package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="company", uniqueConstraints = { @UniqueConstraint (columnNames = {"ID","officeId"}) }) 
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;

	@Column(name="companyName", length=100)
	private String companyName;

	@Column(name="signatureInNameOf", length=20)
	private String signatureInNameOf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dateOfIncorporation")
	private Date dateOfIncorporation ;

	@Column(name="logo", length=100)
	private String logo;
	
	@Column(name="mobileNo", length=20)
	private Long mobileNo;
	
	@Column(name="landlineNo", length=20)
	private Long landlineNo;
	
	public Long getLandlineNo() {
		return landlineNo;
	}

	@Column(name="email", length=20)
	private String email;

	@Column(name="createdBy", length=20)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="createdDate")
	private Date createdDate;

	@Column(name="isDealer")
	private String isDealer;

	@Column(name="isRetailer", length=20)
	private String isRetailer;
	
	@Temporal(TemporalType.DATE)
	@Column(name="setupdate")
	private Date setupdate;

	@Column(name="status", length=20)
	private String status;
	
	@Column(name="officeId", length=20)
	private String officeId;
	@Column(name="companyAddress1", length=20)		
	private String companyAddress1; 
	@Column(name="companyAddress2", length=20)
	private String companyAddress2; 
	@Column(name="companyState1", length=20)
	private String companyState1;
	@Column(name="companyDistrict", length=20)
	private String companyDistrict;
	@Column(name="companyCity", length=20)
	private String companyCity;
	@Column(name="companyPinNo", length=20)
	private String companyPinNo;
	@Column(name="companyEamilAddress", length=20)
	private String companyEamilAddress;
	@Column(name="comapnyState2", length=20)
	private String comapnyState2;
	@Column(name="companyDistrict2", length=20)
	private String companyDistrict2;
	@Column(name="companyCity2", length=20)
	private String companyCity2;
	@Column(name="company2PinNo", length=20)
	private String company2PinNo;
	@Column(name="mailAddress", length=20)
	private String mailAddress;
	@Column(name="mailAddress2", length=20)
	private String mailAddress2;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMailAddress2() {
		return mailAddress2;
	}

	public void setMailAddress2(String mailAddress2) {
		this.mailAddress2 = mailAddress2;
	}

	public String getCompanyAddress1() {
		return companyAddress1;
	}

	public void setCompanyAddress1(String companyAddress1) {
		this.companyAddress1 = companyAddress1;
	}

	public String getCompanyAddress2() {
		return companyAddress2;
	}

	public void setCompanyAddress2(String companyAddress2) {
		this.companyAddress2 = companyAddress2;
	}

	public String getCompanyState1() {
		return companyState1;
	}

	public void setCompanyState1(String companyState1) {
		this.companyState1 = companyState1;
	}

	public String getCompanyDistrict() {
		return companyDistrict;
	}

	public void setCompanyDistrict(String companyDistrict) {
		this.companyDistrict = companyDistrict;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyPinNo() {
		return companyPinNo;
	}

	public void setCompanyPinNo(String companyPinNo) {
		this.companyPinNo = companyPinNo;
	}

	public String getCompanyEamilAddress() {
		return companyEamilAddress;
	}

	public void setCompanyEamilAddress(String companyEamilAddress) {
		this.companyEamilAddress = companyEamilAddress;
	}

	public String getComapnyState2() {
		return comapnyState2;
	}

	public void setComapnyState2(String comapnyState2) {
		this.comapnyState2 = comapnyState2;
	}

	public String getCompanyDistrict2() {
		return companyDistrict2;
	}

	public void setCompanyDistrict2(String companyDistrict2) {
		this.companyDistrict2 = companyDistrict2;
	}

	public String getCompanyCity2() {
		return companyCity2;
	}

	public void setCompanyCity2(String companyCity2) {
		this.companyCity2 = companyCity2;
	}

	public String getCompany2PinNo() {
		return company2PinNo;
	}

	public void setCompany2PinNo(String company2PinNo) {
		this.company2PinNo = company2PinNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setLandlineNo(Long landlineNo) {
		this.landlineNo = landlineNo;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSignatureInNameOf() {
		return signatureInNameOf;
	}

	public void setSignatureInNameOf(String signatureInNameOf) {
		this.signatureInNameOf = signatureInNameOf;
	}


	public Date getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public void setDateOfIncorporation(Date dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsDealer() {
		return isDealer;
	}

	public void setIsDealer(String isDealer) {
		this.isDealer = isDealer;
	}

	public String getIsRetailer() {
		return isRetailer;
	}

	public void setIsRetailer(String isRetailer) {
		this.isRetailer = isRetailer;
	}

	public Date getSetupdate() {
		return setupdate;
	}

	public void setSetupdate(Date setupdate) {
		this.setupdate = setupdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}


	
	
	
}
