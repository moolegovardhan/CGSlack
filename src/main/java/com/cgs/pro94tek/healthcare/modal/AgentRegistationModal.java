package com.cgs.pro94tek.healthcare.modal;

import javax.persistence.Column;

public class AgentRegistationModal {
	
	private Long agentId;
	
	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentLastName() {
		return agentLastName;
	}

	public void setAgentLastName(String agentLastName) {
		this.agentLastName = agentLastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoleNo() {
		return RoleNo;
	}

	public void setRoleNo(String roleNo) {
		RoleNo = roleNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String agentName;
	
	private String agentLastName;
	
	private String address;
	
	private String email;
	
	private String RoleNo;
	
	private String description;

}
