package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="supplier", uniqueConstraints = { @UniqueConstraint (columnNames = {"ID","officeId"}) }) 
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;

	@Column(name="supplierName", length=100)
	private String suppliername;

	@Column(name="contactPersonName", length=100)
	private String contactpersonName;
	
	@Column(name="email", length=20)
	private String email; 
	
	@Column(name="landlineNo", length=20)
	private String landlineNo;
	
	@Column(name="mobileNo", length=20)
	private String supMobileNo;
	
	public String getSupMobileNo() {
		return supMobileNo;
	}

	public void setSupMobileNo(String supMobileNo) {
		this.supMobileNo = supMobileNo;
	}

	@Column(name="status", length=20)
	private String status;
	
	@Column(name="TIN", length=50)
	private String tln;
	
	@Column(name="dLNumber", length=100)
	private String dlnumber;
	
	@Column(name="createdBy", length=20)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="createdDate")
	private Date createdDate;
	
	@Column(name="officeId", length=20)
	private String officeId;
	
	
	/*private SupplierAddress supplierAddress;*/
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getContactpersonName() {
		return contactpersonName;
	}

	public void setContactpersonName(String contactpersonName) {
		this.contactpersonName = contactpersonName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLandlineNo() {
		return landlineNo;
	}

	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTln() {
		return tln;
	}

	public void setTln(String tln) {
		this.tln = tln;
	}

	public String getDlnumber() {
		return dlnumber;
	}

	public void setDlnumber(String dlnumber) {
		this.dlnumber = dlnumber;
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

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="supplierAddress")
	//@OneToMany(mappedBy="supplierAddress",targetEntity=SupplierAddress.class,fetch=FetchType.EAGER,
	//cascade=CascadeType.ALL)
	public SupplierAddress getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(SupplierAddress supplierAddress) {
		this.supplierAddress = supplierAddress;
	}*/

	
	

}
