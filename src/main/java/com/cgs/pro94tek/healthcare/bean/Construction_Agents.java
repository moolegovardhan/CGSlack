package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "constructin_agents", uniqueConstraints = { @UniqueConstraint(columnNames = "agents_id") })
public class Construction_Agents implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String email;
	private String password;
	private String city;
	private String phone;
	private String altphone;
	private String areaswant;
	private String favorites;
	private String photo;
	private String card;
	private String name;
	private String officeid;
	private String status;
/*	private int quantity;
	private float totalAmount;*/
	private Set<SellingOderList> sellingObject;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "agent")
	public Set<SellingOderList> getSellingObject() {
		return sellingObject;
	}
	public void setSellingObject(Set<SellingOderList> sellingObject) {
		this.sellingObject = sellingObject;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "agents_id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	

	@Column(name = "status", length = 100)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "officeid", length = 100)
	public String getOfficeid() {
		return officeid;
	}

	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "city", length = 100)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "phone", length = 100)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "altphone", length = 100)
	public String getAltphone() {
		return altphone;
	}

	public void setAltphone(String altphone) {
		this.altphone = altphone;
	}

	@Column(name = "areaswant", length = 100)
	public String getAreaswant() {
		return areaswant;
	}

	public void setAreaswant(String areaswant) {
		this.areaswant = areaswant;
	}

	@Column(name = "favorites", length = 100)
	public String getFavorites() {
		return favorites;
	}

	public void setFavorites(String favorites) {
		this.favorites = favorites;
	}

	@Column(name = "photo", length = 100)
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "card", length = 100)
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
