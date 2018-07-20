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
@Table(name="shopersinfo", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class ShoperInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;
	private String shoperId;
	
	private String shoperName;
	private String shoperContact;
	private String branchName;				
	private String 	areaName;
	private String  shperAdress;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		@Column (name = "shoperId", nullable = false)
		public String getShoperId() {
			return shoperId;
		}
		public void setShoperId(String shoperId) {
			this.shoperId = shoperId;
		}
		
		@Column (name = "shopName")
		public String getShoperName() {
			return shoperName;
		}
		public void setShoperName(String shoperName) {
			this.shoperName = shoperName;
		}
		@Column (name = "shoperContact", nullable = false)
		public String getShoperContact() {
			return shoperContact;
		}
		public void setShoperContact(String shoperContact) {
			this.shoperContact = shoperContact;
		}
		@Column (name = "branchName", nullable = false)
		public String getBranchName() {
			return branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		@Column (name = "areaName", nullable = false)
		public String getAreaName() {
			return areaName;
		}
		public void setAreaName(String areaName) { 
			this.areaName = areaName;
		}
		@Column (name = "shperAdress", nullable = false)
		public String getShperAdress() {
			return shperAdress;
		}
		public void setShperAdress(String shperAdress) {
			this.shperAdress = shperAdress;
		}			
	
	
}
