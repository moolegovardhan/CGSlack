package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "cgslac_employeepersonaldetails", uniqueConstraints = { @UniqueConstraint(columnNames = "emp_id") })
public class CgsEmployeePersonalInfo {
	
	private Long id;
	private String emp_no;
	private String designation;
	private String departmentNo;
	private String current_Address;
	private String contect_address;
	private String panNo;
	private String ranking;
	private String Experiance_Deatails;
	private String parmenant_Address;
	private Date  joind_date;
	private Date date_of_birth;
	private String adharcardNO;
	private String educatioin_details;
	private String bank_details;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "emp_no", nullable = false)
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name = "departmentNo", nullable = false)
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	@Column(name = "current_Address", nullable = false)
	public String getCurrent_Address() {
		return current_Address;
	}
	public void setCurrent_Address(String current_Address) {
		this.current_Address = current_Address;
	}
	@Column(name = "contect_address", nullable = false)
	public String getContect_address() {
		return contect_address;
	}
	public void setContect_address(String contect_address) {
		this.contect_address = contect_address;
	}
	@Column(name = "panNo", nullable = false)
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	@Column(name = "ranking", nullable = false)
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	@Column(name = "Experiance_Deatails", nullable = false)
	public String getExperiance_Deatails() {
		return Experiance_Deatails;
	}
	public void setExperiance_Deatails(String experiance_Deatails) {
		Experiance_Deatails = experiance_Deatails;
	}
	@Column(name = "parmenant_Address", nullable = false)
	public String getParmenant_Address() {
		return parmenant_Address;
	}
	public void setParmenant_Address(String parmenant_Address) {
		this.parmenant_Address = parmenant_Address;
	}
	@Column(name = "joind_date", nullable = false)
	public Date getJoind_date() {
		return joind_date;
	}
	public void setJoind_date(Date joind_date) {
		this.joind_date = joind_date;
	}
	@Column(name = "date_of_birth", nullable = false)
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	@Column(name = "adharcardNO", nullable = false)
	public String getAdharcardNO() {
		return adharcardNO;
	}
	public void setAdharcardNO(String adharcardNO) {
		this.adharcardNO = adharcardNO;
	}
	@Column(name = "educatioin_details", nullable = false)
	public String getEducatioin_details() {
		return educatioin_details;
	}
	public void setEducatioin_details(String educatioin_details) {
		this.educatioin_details = educatioin_details;
	}
	@Column(name = "bank_details", nullable = false)
	public String getBank_details() {
		return bank_details;
	}
	public void setBank_details(String bank_details) {
		this.bank_details = bank_details;
	}
	

}
