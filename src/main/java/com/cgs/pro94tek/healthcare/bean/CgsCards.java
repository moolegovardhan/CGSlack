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
@Table(name = "cgscards", uniqueConstraints = { @UniqueConstraint(columnNames = "crdId") })
public class CgsCards implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "crdId", unique = true, nullable = false)
	
	private Long card_id;
	@Column(name = "crdName")
	private  String  cardName;
	@Column(name = "dscpn")
	private String description;
	@Column(name = "crdstatus")
	private String status;
	@Column(name = "amount")
	private Float price;
	@Column(name = "grp")
	private String group;
	@Column(name = "crdType")
	private String cardtype;
	
	public Long getCard_id() {
		return card_id;
	}
	public void setCard_id(Long card_id) {
		this.card_id = card_id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	
	

}
