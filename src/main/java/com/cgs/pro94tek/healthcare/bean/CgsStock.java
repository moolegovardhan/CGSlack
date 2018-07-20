package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cgs_stock", uniqueConstraints = { @UniqueConstraint(columnNames = "cgsStockId") })
public class CgsStock {
	
	private Long id;
	private Long custMobileNO;
	private String roleId;
	private String cgsStockId;
	private String itemName;
	private int itemQuantity;
	private float itemprice;
	private String itemModalNO;
	private String customerName;
	

	private String customerAddress;
	private String itemCompanyName;
//	private Date orderdate;
	private byte[] images;
	private String status;
	@Column (name = "status" )
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private float orderQuantity;
	private String dealerName;
	private Long dealerContectNo;
	private Long totalAmount;
	private String sellingorderNo;
	private Date orderDate;
	private Date recivedDate;
	private float dbtcashBill;
	private float wantedStock;
	private float outofStock;
	private String agenceName;
	private Long agencyContactNo;
	private String purchageOrderNO;
	private float purchageOrderQuantity;
	private float crdtBill;
	private String adminStatus;
	private Long purchageTotal;
	private Long selprice;
	
	private float selQuantity;
	
	@Column (name = "purchageTotal" )	
	public Long getPurchageTotal() {
		return purchageTotal;
	}
	public void setPurchageTotal(Long purchageTotal) {
		this.purchageTotal = purchageTotal;
	}
	@Column (name = "orderQuantity" )
	public float getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(float orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	@Column (name = "dealerName" )
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	@Column (name = "dealerContectNo" )
	public Long getDealerContectNo() {
		return dealerContectNo;
	}
	public void setDealerContectNo(Long dealerContectNo) {
		this.dealerContectNo = dealerContectNo;
	}
	@Column (name = "totalAmount" )
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Column (name = "sellingorderNo" )
	public String getSellingorderNo() {
		return sellingorderNo;
	}
	public void setSellingorderNo(String sellingorderNo) {
		this.sellingorderNo = sellingorderNo;
	}
	@Column (name = "orderDate" )
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Column (name = "recivedDate" )
	public Date getRecivedDate() {
		return recivedDate;
	}
	public void setRecivedDate(Date recivedDate) {
		this.recivedDate = recivedDate;
	}
	@Column (name = "dbtcashBill" )
	public float getDbtcashBill() {
		return dbtcashBill;
	}
	public void setDbtcashBill(float dbtcashBill) {
		this.dbtcashBill = dbtcashBill;
	}
	@Column (name = "wantedStock" )
	public float getWantedStock() {
		return wantedStock;
	}
	public void setWantedStock(float wantedStock) {
		this.wantedStock = wantedStock;
	}
	@Column (name = "outofStock" )
	public float getOutofStock() {
		return outofStock;
	}
	public void setOutofStock(float outofStock) {
		this.outofStock = outofStock;
	}
	@Column (name = "agenceName" )
	public String getAgenceName() {
		return agenceName;
	}
	public void setAgenceName(String agenceName) {
		this.agenceName = agenceName;
	}
	@Column (name = "agencyContactNo" )
	public Long getAgencyContactNo() {
		return agencyContactNo;
	}
	public void setAgencyContactNo(Long agencyContactNo) {
		this.agencyContactNo = agencyContactNo;
	}
	@Column (name = "purchageOrderNO" )
	public String getPurchageOrderNO() {
		return purchageOrderNO;
	}
	public void setPurchageOrderNO(String purchageOrderNO) {
		this.purchageOrderNO = purchageOrderNO;
	}
	@Column (name = "purchageOrderQuantity" )
	public float getPurchageOrderQuantity() {
		return purchageOrderQuantity;
	}
	public void setPurchageOrderQuantity(float purchageOrderQuantity) {
		this.purchageOrderQuantity = purchageOrderQuantity;
	}
	
	public float getCrdtBill() {
		return crdtBill;
	}
	public void setCrdtBill(float crdtBill) {
		this.crdtBill = crdtBill;
	}
	@Column (name = "adminStatus" )
	public String getAdminStatus() {
		return adminStatus;
	}
	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column (name = "cgsStockId" )
	public String getCgsStockId() {
		return cgsStockId;
	}
	
	public void setCgsStockId(String cgsStockId) {
		this.cgsStockId = cgsStockId;
	}
	@Column (name = "itemName" )
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Column (name = "itemQuantity")
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	@Column (name = "itemprice")
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	@Column (name = "itemModalNO" )
	public String getItemModalNO() {
		return itemModalNO;
	}
	public void setItemModalNO(String itemModalNO) {
		this.itemModalNO = itemModalNO;
	}
	@Column (name = "itemCompanyName")
	public String getItemCompanyName() {
		return itemCompanyName;
	}
	public void setItemCompanyName(String itemCompanyName) {
		this.itemCompanyName = itemCompanyName;
	}
	@Column (name = "images")
	public byte[] getImages() {
		return images;
	}
	public void setImages(byte[] images) {
		this.images = images;
	}@Column (name = "selprice")
	public Long getSelprice() {
		return selprice;
	}
	public void setSelprice(Long selprice) {
		this.selprice = selprice;
	}@Column (name = "selQuantity")
	public float getSelQuantity() {
		return selQuantity;
	}
	public void setSelQuantity(float selQuantity) {
		this.selQuantity = selQuantity;
	}
	@Column (name = "customerName" )
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column (name = "customerAddress" )
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/*@Column (name = "orderdate")
	public Date getOrderdate() {
		return orderdate;
	}
	
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}*/
	
	
	@Column(name="custMobileNO")
	public Long getCustMobileNO() {
		return custMobileNO;
	}
	public void setCustMobileNO(Long custMobileNO) {
		this.custMobileNO = custMobileNO;
	}
	@Column(name="rolId")
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
