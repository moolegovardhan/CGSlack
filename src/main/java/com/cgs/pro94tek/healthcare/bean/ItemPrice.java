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

import org.codehaus.jackson.map.annotate.JsonSerialize;


@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="itemprice", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") }) 
public class ItemPrice  implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id ;
	@Column(name="itemid", length=50)
	private  String  itemid ;
	@Column(name="itemprice", length=50)
	private String    itemprice ;
	@Temporal(TemporalType.DATE)
	@Column(name="effectivedate")
	private Date   effectivedate ;
	@Column(name="salesprice", length=50)
	private String   salesprice ;
	@Column(name="status", length=50)
	private String    status;
	@Temporal(TemporalType.DATE)
	@Column(name="createddate")
	private Date   createddate ;
	@Column(name="createdby", length=50)
	private String  createdby;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemprice() {
		return itemprice;
	}
	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public String getSalesprice() {
		return salesprice;
	}
	public void setSalesprice(String salesprice) {
		this.salesprice = salesprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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


}
