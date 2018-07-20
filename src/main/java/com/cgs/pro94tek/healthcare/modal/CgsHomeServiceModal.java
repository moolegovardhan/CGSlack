package com.cgs.pro94tek.healthcare.modal;

public class CgsHomeServiceModal {

	private Long id;
	private String hserviceId;
	private String housetype;
	private float area_sqft;
	private float rate_psf;
	private double price;
	private byte[] floarPlane;
	private String fileName;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHserviceId() {
		return hserviceId;
	}
	public void setHserviceId(String hserviceId) {
		this.hserviceId = hserviceId;
	}
	public String getHousetype() {
		return housetype;
	}
	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}
	public float getArea_sqft() {
		return area_sqft;
	}
	public void setArea_sqft(float area_sqft) {
		this.area_sqft = area_sqft;
	}
	public float getRate_psf() {
		return rate_psf;
	}
	public void setRate_psf(float rate_psf) {
		this.rate_psf = rate_psf;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public byte[] getFloarPlane() {
		return floarPlane;
	}
	public void setFloarPlane(byte[] floarPlane) {
		this.floarPlane = floarPlane;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
