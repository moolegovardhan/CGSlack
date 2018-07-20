package com.cgs.pro94tek.healthcare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cgshomesevices", uniqueConstraints = { @UniqueConstraint(columnNames = "hserviceId") })

public class CgsHomeService {
	
	private Long id;
	private String hserviceId;
	private String housetype;
	private float area_sqft;
	private float rate_psf;
	private double price;
	private byte[] floarPlane;
	private String fileName;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "hserviceId")
	public String getHserviceId() {
		return hserviceId;
	}
	public void setHserviceId(String hserviceId) {
		this.hserviceId = hserviceId;
	}
	@Column(name = "type")
	public String getHousetype() {
		return housetype;
	}
	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}
	@Column(name = "area_sqft")
	public float getArea_sqft() {
		return area_sqft;
	}
	public void setArea_sqft(float area_sqft) {
		this.area_sqft = area_sqft;
	}
	@Column(name = "rate_psf")
	public float getRate_psf() {
		return rate_psf;
	}
	public void setRate_psf(float rate_psf) {
		this.rate_psf = rate_psf;
	}@Column(name = "price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name = "floarPlane")
	public byte[] getFloarPlane() {
		return floarPlane;
	}
	public void setFloarPlane(byte[] floarPlane) {
		this.floarPlane = floarPlane;
	}@Column(name = "fileName")
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	

}
