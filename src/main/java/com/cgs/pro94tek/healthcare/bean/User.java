package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;

import javax.persistence.*;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.Parameter;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="myusers", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	
		
		private Long id;
		private CgsRoles rolec;
		private String userName;
		private String password;
		private String adress;
		private String officeid;
		private String profession;
		private long phoneNumber;
		

		@Column(name = "phoneNumber")
		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID", unique = true, nullable = false)
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		@Column(name = "username")
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Column(name = "password")
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		@Column(name = "adress")
		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}
		@Column(name = "officeid")
		public String getOfficeid() {
			return officeid;
		}

		public void setOfficeid(String officeid) {
			this.officeid = officeid;
		}


		@Column(name = "profession")
		public String getProfession() {
			return profession;
		}

		public void setProfession(String profession) {
			this.profession = profession;
		}

		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "roleId")
		public CgsRoles getRolec() {
			return rolec;
		}

		public void setRolec(CgsRoles rolec) {
			this.rolec = rolec;
		}



}