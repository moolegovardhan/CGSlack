package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "system_discount_area", uniqueConstraints = { @UniqueConstraint(columnNames = "area_id") })
public class CgsDiscountArea {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "area_id", unique = true, nullable = false)
			private Long	area_id;
			@Column(name = "areaName")
			private String 		areaName;
			@Column(name = "areaAddress")
			private String 		areaAddress;
			@Temporal(TemporalType.DATE)
			@Column(name = "createdDate")
			private Date  createdDate;
			@Column(name = "status")
			private String status;
			@Column(name = "createdBy")
			private String 	createdBy;
				@OneToOne
			 @JoinColumn(name="sysdsc_id")
			
			private CgsDiscountCategory  discoutnCategory;
			public Long getArea_id() {
				return area_id;
			}
			public void setArea_id(Long area_id) {
				this.area_id = area_id;
			}
			public String getAreaName() {
				return areaName;
			}
			public void setAreaName(String areaName) {
				this.areaName = areaName;
			}
			public String getAreaAddress() {
				return areaAddress;
			}
			public void setAreaAddress(String areaAddress) {
				this.areaAddress = areaAddress;
			}
			public Date getCreatedDate() {
				return createdDate;
			}
			public void setCreatedDate(Date createdDate) {
				this.createdDate = createdDate;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String getCreatedBy() {
				return createdBy;
			}
			public void setCreatedBy(String createdBy) {
				this.createdBy = createdBy;
			}
			public CgsDiscountCategory getDiscoutnCategory() {
				return discoutnCategory;
			}
			public void setDiscoutnCategory(CgsDiscountCategory discoutnCategory) {
				this.discoutnCategory = discoutnCategory;
			}

}
