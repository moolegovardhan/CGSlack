package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;



@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="landconstruction", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class Construction  implements Serializable {
	
	 
	
		
		
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column (name = "ID", unique = true, nullable = false)
		private Long id;
		@Column(name="ownerName", length=50)
		private String ownerName;
		@Column(name="userid", length=50)
		private String userid;
		@Column(name="modalhouse", length=50)
		private String modalhouse;
		@Column(name="bedroom", length=50)
		private String bedroom;
		@Column(name="elevent", length=50)
		private String elevent;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getModalhouse() {
			return modalhouse;
		}
		public void setModalhouse(String modalhouse) {
			this.modalhouse = modalhouse;
		}
		public String getBedroom() {
			return bedroom;
		}
		public void setBedroom(String bedroom) {
			this.bedroom = bedroom;
		}
		public String getElevent() {
			return elevent;
		}
		public void setElevent(String elevent) {
			this.elevent = elevent;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		

}
