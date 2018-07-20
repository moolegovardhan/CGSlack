package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cgs_stock_master", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class CgsStockMaster implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
		private Long  id;
		@Column(name = "stockId")
		private	String stockId;
		@Column(name = "purchaId")
		private	String purchaId;
		@Column(name = "purchageQuantity")
		private	float purchageQuantity;
		@Column(name = "purchageprice")
		private	Integer purchagePrice;
		@Column(name = "selId")
		private	String selId;
		@Column(name = "selQuantity")
		private	float selQuantity;
		@Column(name = "selprice")
		private	Integer selPrice;
		@Column(name = "totalAmount")
		private	Integer totalAmount;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getStockId() {
			return stockId;
		}
		public void setStockId(String stockId) {
			this.stockId = stockId;
		}
		public String getPurchaId() {
			return purchaId;
		}
		public void setPurchaId(String purchaId) {
			this.purchaId = purchaId;
		}
		public float getPurchageQuantity() {
			return purchageQuantity;
		}
		public void setPurchageQuantity(float purchageQuantity) {
			this.purchageQuantity = purchageQuantity;
		}
		public Integer getPurchagePrice() {
			return purchagePrice;
		}
		public void setPurchagePrice(Integer purchagePrice) {
			this.purchagePrice = purchagePrice;
		}
		public String getSelId() {
			return selId;
		}
		public void setSelId(String selId) {
			this.selId = selId;
		}
		public float getSelQuantity() {
			return selQuantity;
		}
		public void setSelQuantity(float selQuantity) {
			this.selQuantity = selQuantity;
		}
		public Integer getSelPrice() {
			return selPrice;
		}
		public void setSelPrice(Integer selPrice) {
			this.selPrice = selPrice;
		}
		public Integer getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(Integer totalAmount) {
			this.totalAmount = totalAmount;
		}
		
		

}
