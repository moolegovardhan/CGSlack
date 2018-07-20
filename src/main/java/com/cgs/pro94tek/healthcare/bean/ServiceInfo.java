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
@Table(name = "ServiceInfo", uniqueConstraints = { @UniqueConstraint(columnNames = "service_id") })
public class ServiceInfo implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String serviceName;
	private String service_id;
	private String length;
	private Integer cost;
	private String diaya;
	private String serviceType;
	private String service_no;
	private String companyName;
	private String description;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="diaya")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="service_companyname")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Column(name="service_no")
	public String getService_no() {
		return service_no;
	}
	public void setService_no(String service_no) {
		this.service_no = service_no;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id", unique = true, nullable = false)		
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	@Column(name="serviceName")
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
	@Column(name="legth",length=50)
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	@Column(name="serviceCost",length=50)
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	
	@Column(name="serviceType",length=50)
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
}
