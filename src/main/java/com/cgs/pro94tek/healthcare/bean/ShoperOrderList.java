package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="ShoperOrder", uniqueConstraints = { @UniqueConstraint (columnNames = "id") })
public class ShoperOrderList implements Serializable{

	
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			private Long	id_shoperOrder;
			private Long	agents_id;
			private String	sellingodNo;
			private String	customerName;
			private int	mobileNumber;
			private String	customeraddress;
			private String	agent_no;
			private Integer	itemquantity;
			private Date	sellingDate;
			private Float	totalAmount;
			private String	agent_name;
			private String	itemname;
			private float	itemprice;
			private String	shperName;
			private String	shperAddress;
			private String	area;
			

			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column (name = "ID", unique = true, nullable = false)
			public Long getId_shoperOrder() {
				return id_shoperOrder;
			}
			public void setId_shoperOrder(Long id_shoperOrder) {
				this.id_shoperOrder = id_shoperOrder;
			}
			@Column (name = "agents_id" )
			public Long getAgents_id() {
				return agents_id;
			}
			public void setAgents_id(Long agents_id) {
				this.agents_id = agents_id;
			}
			@Column (name = "sellingodNo" )
			public String getSellingodNo() {
				return sellingodNo;
			}
			public void setSellingodNo(String sellingodNo) {
				this.sellingodNo = sellingodNo;
			}
			@Column (name = "customerName" )
			public String getCustomerName() {
				return customerName;
			}
			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}
			@Column (name = "mobileNumber" )
			public int getMobileNumber() {
				return mobileNumber;
			}
			public void setMobileNumber(int mobileNumber) {
				this.mobileNumber = mobileNumber;
			}
			@Column (name = "customeraddress" )
			public String getCustomeraddress() {
				return customeraddress;
			}
			public void setCustomeraddress(String customeraddress) {
				this.customeraddress = customeraddress;
			}
			@Column (name = "agent_no" )
			public String getAgent_no() {
				return agent_no;
			}
			public void setAgent_no(String agent_no) {
				this.agent_no = agent_no;
			}
			@Column (name = "itemquantity" )
			public Integer getItemquantity() {
				return itemquantity;
			}
			public void setItemquantity(Integer itemquantity) {
				this.itemquantity = itemquantity;
			}
			@Column (name = "sellingDate" )
			public Date getSellingDate() {
				return sellingDate;
			}
			public void setSellingDate(Date sellingDate) {
				this.sellingDate = sellingDate;
			}
			@Column (name = "totalAmount" )
			public Float getTotalAmount() {
				return totalAmount;
			}
			public void setTotalAmount(Float totalAmount) {
				this.totalAmount = totalAmount;
			}
			@Column (name = "agent_name" )
			public String getAgent_name() {
				return agent_name;
			}
			public void setAgent_name(String agent_name) {
				this.agent_name = agent_name;
			}
			@Column (name = "itemname" )
			public String getItemname() {
				return itemname;
			}
			public void setItemname(String itemname) {
				this.itemname = itemname;
			}
			@Column (name = "itemprice" )
			public float getItemprice() {
				return itemprice;
			}
			public void setItemprice(float itemprice) {
				this.itemprice = itemprice;
			}
			@Column (name = "shperName" )
			public String getShperName() {
				return shperName;
			}
			public void setShperName(String shperName) {
				this.shperName = shperName;
			}
			@Column (name = "shperAddress" )
			public String getShperAddress() {
				return shperAddress;
			}
			public void setShperAddress(String shperAddress) {
				this.shperAddress = shperAddress;
			}
			@Column (name = "area" )
			public String getArea() {
				return area;
			}
			public void setArea(String area) {
				this.area = area;
			}
			

}
