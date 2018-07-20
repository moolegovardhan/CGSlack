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
@Entity
@Table(name = "supplier_employee", uniqueConstraints = { @UniqueConstraint(columnNames = "sempId") })
public class SupplierEmployee implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sempId",unique = true, nullable = false)
	private  Integer sempId;
	@Column(name = "empRegNo")
	private String empRegNo;
	@Column(name = "firstName" )
	private	String firstName;
	@Column(name = "lastName" )
	private	String lastName;
	@Column(name = "phoneNumber" )
	private	Long phoneNumber;
	@Column(name = "email" )
	private	String email;
	@Column(name = "address" )
	private	String address;
	@Temporal(TemporalType.DATE)
	@Column(name = "createdDate" )
	private	Date createdDate;
	@Column(name = "createdBy" )
	private	String createdBy;
	@Column(name = "status" )
	private String status;
	@Column(name = "gender" )
	private String gender;
	@Column(name = "roleId" )
	private Integer roleId;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getSempId() {
		return sempId;
	}
	public void setSempId(Integer sempId) {
		this.sempId = sempId;
	}
	public String getEmpRegNo() {
		return empRegNo;
	}
	public void setEmpRegNo(String empRegNo) {
		this.empRegNo = empRegNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	

}
