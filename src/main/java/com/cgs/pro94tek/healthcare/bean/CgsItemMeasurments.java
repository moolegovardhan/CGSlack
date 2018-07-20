package com.cgs.pro94tek.healthcare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "cgs_item_measurements", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class CgsItemMeasurments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	@Column(name = "measurementtype")
	
	private String itemMeaserMents;
	@Column(name = "measuerNo" )
	private String measurmentNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemMeaserMents() {
		return itemMeaserMents;
	}
	public void setItemMeaserMents(String itemMeaserMents) {
		this.itemMeaserMents = itemMeaserMents;
	}
	public String getMeasurmentNo() {
		return measurmentNo;
	}
	public void setMeasurmentNo(String measurmentNo) {
		this.measurmentNo = measurmentNo;
	}
	 


}
