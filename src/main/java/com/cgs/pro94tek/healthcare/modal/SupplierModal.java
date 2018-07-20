package com.cgs.pro94tek.healthcare.modal;

public class SupplierModal {

	private Long id;
	private String suppliername;
	private String contactpersonName;
	private String email; 
	private String landlineNo;
	private String supMobileNo;
	
	public String getSupMobileNo() {
		return supMobileNo;
	}
	public void setSupMobileNo(String supMobileNo) {
		this.supMobileNo = supMobileNo;
	}
	private String status;
	private String tln;
	/*private String dlnumber;*/
	private String createdBy;
	private String createdDate;
	private String officeId;
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
	/*public String getDlnumber() {
		return dlnumber;
	}
	public void setDlnumber(String dlnumber) {
		this.dlnumber = dlnumber;
	}*/
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	
	
	
}
