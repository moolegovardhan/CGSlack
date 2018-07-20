package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class SupplierEmployeeModal {
	 
			private  Integer sempId;
			private Integer roleId;
			public Integer getRoleId() {
				return roleId;
			}
			public void setRoleId(Integer roleId) {
				this.roleId = roleId;
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
			private String empRegNo;
			private	String firstName;
			private	String lastName;
			private String status;
			private String gender;
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
			private	Long phoneNumber;
			private	String email;
			private	String address;
			private	Date createdDate;
			private	String createdBy;

		

}
