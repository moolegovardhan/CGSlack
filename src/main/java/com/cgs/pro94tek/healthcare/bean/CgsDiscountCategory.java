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
@Table(name = "systemdiscount_category", uniqueConstraints = { @UniqueConstraint(columnNames = "sysdsc_id") })
public class CgsDiscountCategory   implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "sysdsc_id", unique = true, nullable = false)
		private Long sysdsc_id;
		
		@Column(name = "discription")
		private String discription;
		
		@Column(name = "catId")
		private String 	catId;
		@Column(name = "categoryName")
		private String	categoryName;
		@Temporal(TemporalType.DATE)
		@Column(name = "cratedDate")
		private Date	cratedDate;
		@Column(name = "createdBy")
		private String	createdBy;
		
		
		
		public String getDiscription() {
			return discription;
		}
		public void setDiscription(String discription) {
			this.discription = discription;
		}
	
		public Long getSysdsc_id() {
			return sysdsc_id;
		}
		public void setSysdsc_id(Long sysdsc_id) {
			this.sysdsc_id = sysdsc_id;
		}
		public String getCatId() {
			return catId;
		}
		public void setCatId(String catId) {
			this.catId = catId;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public Date getCratedDate() {
			return cratedDate;
		}
		public void setCratedDate(Date cratedDate) {
			this.cratedDate = cratedDate;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
			

}
