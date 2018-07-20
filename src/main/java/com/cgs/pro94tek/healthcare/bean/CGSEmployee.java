package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CGSEmployee", uniqueConstraints = { @UniqueConstraint(columnNames = "empid") })
public class CGSEmployee {
	
		private Long empid;
		private	String empno;
		private	String	departmentNo;
		private	float	salary;
		private	int	rank;
		private	Date	lastdate;
		private String	designation;
		public Long getEmpid() {
			return empid;
		}
		public void setEmpid(Long empid) {
			this.empid = empid;
		}
		public String getEmpno() {
			return empno;
		}
		public void setEmpno(String empno) {
			this.empno = empno;
		}
		public String getDepartmentNo() {
			return departmentNo;
		}
		public void setDepartmentNo(String departmentNo) {
			this.departmentNo = departmentNo;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public Date getLastdate() {
			return lastdate;
		}
		public void setLastdate(Date lastdate) {
			this.lastdate = lastdate;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
}
