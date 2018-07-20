package com.cgs.pro94tek.healthcare.bean;

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

import org.codehaus.jackson.map.annotate.JsonSerialize;



@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="quotation", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class QuatationData {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column (name = "ID", unique = true, nullable = false)
		private Long id;
		@Column(name="purchaseorderid", length=100)
		private  String purchaseorderid;
		@Column(name="medicinename", length=100)
		private  String	 medicinename;
		@Column(name="suppliername", length=100)
		private  String	 suppliername;
		@Column(name="status", length=100)
		private  String	 status;
		@Column(name="quantity", length=100)
		private  String	 quantity;
		@Column(name="unitprice", length=100)
		private  String	 unitprice;
		@Column(name="totalamount", length=100)
		private  double	 totalamount;
		@Temporal(TemporalType.DATE)
		@Column(name="podeliverydate")
		private  Date	 podeliverydate;
		@Temporal(TemporalType.DATE)
		@Column(name="quotationdeliverydate")
		private  Date	quotationdeliverydate;
		@Column(name="cost", length=100)
		private  String		 cost;
		@Temporal(TemporalType.DATE)
		@Column(name="createddate")
		private  Date	createddate;
		@Column(name="createdby", length=100)
		private  String		 createdby;
		@Column(name="officeid", length=100)
		private  String		officeid;
		@Column(name="quotationnumber", length=100)
		private String 	 quotationnumber;
		
		
		
		
		
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getQuotationnumber() {
			return quotationnumber;
		}
		public void setQuotationnumber(String quotationnumber) {
			this.quotationnumber = quotationnumber;
		}
		public String getPurchaseorderid() {
			return purchaseorderid;
		}
		public void setPurchaseorderid(String purchaseorderid) {
			this.purchaseorderid = purchaseorderid;
		}
		public String getMedicinename() {
			return medicinename;
		}
		public void setMedicinename(String medicinename) {
			this.medicinename = medicinename;
		}
		public String getSuppliername() {
			return suppliername;
		}
		public void setSuppliername(String suppliername) {
			this.suppliername = suppliername;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getUnitprice() {
			return unitprice;
		}
		public void setUnitprice(String unitprice) {
			this.unitprice = unitprice;
		}
		public double getTotalamount() {
			return totalamount;
		}
		public void setTotalamount(double totalamount) {
			this.totalamount = totalamount;
		}
		public Date getPodeliverydate() {
			return podeliverydate;
		}
		public void setPodeliverydate(Date podeliverydate) {
			this.podeliverydate = podeliverydate;
		}
		public Date getQuotationdeliverydate() {
			return quotationdeliverydate;
		}
		public void setQuotationdeliverydate(Date quotationdeliverydate) {
			this.quotationdeliverydate = quotationdeliverydate;
		}
		public String getCost() {
			return cost;
		}
		public void setCost(String cost) {
			this.cost = cost;
		}
		public Date getCreateddate() {
			return createddate;
		}
		public void setCreateddate(Date createddate) {
			this.createddate = createddate;
		}
		public String getCreatedby() {
			return createdby;
		}
		public void setCreatedby(String createdby) {
			this.createdby = createdby;
		}
		public String getOfficeid() {
			return officeid;
		}
		public void setOfficeid(String officeid) {
			this.officeid = officeid;
		}
		
			
}
