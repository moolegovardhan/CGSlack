package com.cgs.pro94tek.healthcare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cgs_agentregistation", uniqueConstraints = { @UniqueConstraint(columnNames = "agentId") })
public class AgentRegistation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "agentId", unique = true, nullable = false)
	private Long agentId;
	@Column(name ="agentName" )
	private String agentName;
	@Column(name ="agentLastName" )
	private String agentLastName;
	@Column(name ="address" )
	private String address;
	@Column(name ="email" )
	private String email;
	@Column(name ="RoleNo" )
	private String RoleNo;
	@Column(name ="description" )
	private String description;
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

}
