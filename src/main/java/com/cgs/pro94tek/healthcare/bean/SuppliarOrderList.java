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
@Table(name = "supplairorderlist", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
public class SuppliarOrderList  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id", unique = true, nullable = false)
	private Long id;	
	private String idSupplairOrder;
	private String itemName;
	private String suppliarName;
	private String suppliarContactNo;
	private String sellingodNo;
	private Integer itemQuantity;
	private Integer itemPrice;
	private Integer totalAmount;
	private Long supMobileNo;
	
	public Long getId() {
		return id;
	}
	@Column(name="supMobileNo",length=50)
	public Long getSupMobileNo() {
		return supMobileNo;
	}
	public void setSupMobileNo(Long supMobileNo) {
		this.supMobileNo = supMobileNo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column (name = "idSupplairOrder")
	public String getIdSupplairOrder() {
		return idSupplairOrder;
	}
	public void setIdSupplairOrder(String idSupplairOrder) {
		this.idSupplairOrder = idSupplairOrder;
	}
	@Column (name = "itemName",  nullable = false)
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Column (name = "suppliarName",  nullable = true)
	public String getSuppliarName() {
		return suppliarName;
	}
	public void setSuppliarName(String suppliarName) {
		this.suppliarName = suppliarName;
	}
	@Column (name = "suppliarContactNo",  nullable = false)
	public String getSuppliarContactNo() {
		return suppliarContactNo;
	}
	public void setSuppliarContactNo(String suppliarContactNo) {
		this.suppliarContactNo = suppliarContactNo;
	}
	@Column (name = "sellingodNo", unique = true, nullable = false)
	public String getSellingodNo() {
		return sellingodNo;
	}
	public void setSellingodNo(String sellingodNo) {
		this.sellingodNo = sellingodNo;
	}
	@Column (name = "itemquantity",  nullable = false)
	public Integer getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	@Column (name = "itemprice",  nullable = false)
	public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Column (name = "totalAmount", unique = true, nullable = true)
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
