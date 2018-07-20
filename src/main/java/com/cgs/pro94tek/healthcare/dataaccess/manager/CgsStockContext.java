package com.cgs.pro94tek.healthcare.dataaccess.manager;

import java.util.List;

import com.cgs.pro94tek.healthcare.modal.CgsStockModal;

public class CgsStockContext {
	
	private List<CgsStockModal>  cgsStockData;
	private String dealerName;
	private String customerName;
	private String customerAddress;
	private Long custMobileNO;
	private String roleId;
	
	public Long getCustMobileNO() {
		return custMobileNO;
	}
	public void setCustMobileNO(Long custMobileNO) {
		this.custMobileNO = custMobileNO;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	private Long totalAmount;
	
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	private Long dealerContectNo;
	
	public List<CgsStockModal> getCgsStockData() {
		return cgsStockData;
	}
	public void setCgsStockData(List<CgsStockModal> cgsStockData) {
		this.cgsStockData = cgsStockData;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public Long getDealerContectNo() {
		return dealerContectNo;
	}
	public void setDealerContectNo(Long dealerContectNo) {
		this.dealerContectNo = dealerContectNo;
	} 

}
