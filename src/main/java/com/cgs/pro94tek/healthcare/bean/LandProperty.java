package com.cgs.pro94tek.healthcare.bean;

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
@Table(name="land_property", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class LandProperty {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long	id;
	@Column(name="allrdential", length=100)
	private String 	allrdential;
	@Column(name="allCommercial", length=100)
	private String  allCommercial;
	@Column(name="agricultural", length=100)
	private String 	agricultural;
	@Column(name="industrees", length=100)
	private String	industrees;
	@Column(name="disptusitestatus", length=100)
	private String	disptusitestatus;
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAllrdential() {
		return allrdential;
	}
	public void setAllrdential(String allrdential) {
		this.allrdential = allrdential;
	}
	public String getAllCommercial() {
		return allCommercial;
	}
	public void setAllCommercial(String allCommercial) {
		this.allCommercial = allCommercial;
	}
	public String getAgricultural() {
		return agricultural;
	}
	public void setAgricultural(String agricultural) {
		this.agricultural = agricultural;
	}
	public String getIndustrees() {
		return industrees;
	}
	public void setIndustrees(String industrees) {
		this.industrees = industrees;
	}
	public String getDisptusitestatus() {
		return disptusitestatus;
	}
	public void setDisptusitestatus(String disptusitestatus) {
		this.disptusitestatus = disptusitestatus;
	}
	

}
