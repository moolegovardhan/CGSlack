package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;

@Component
public class AgentQuationHelper 
{
	
	public List<AgentQuationModal> createALLAgentsModal(List<AgentsQuatations> agentsQuatation)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<AgentQuationModal> agentQuationModals = new ArrayList<AgentQuationModal>();
		for(AgentsQuatations agentQuationObject : agentsQuatation)
		{
			AgentQuationModal agentsModal = new AgentQuationModal();
		
			agentsModal.setId(agentQuationObject.getId());
			agentsModal.setItemprice(agentQuationObject.getItemprice());
			agentsModal.setCustomerName(agentQuationObject.getCustomerName());
			agentsModal.setMobileNumber(agentQuationObject.getMobileNumber());
			agentsModal.setAgent_name(agentQuationObject.getAgent_name());
			agentsModal.setCustomerName(agentQuationObject.getCustomerName());
			agentsModal.setItemname(agentQuationObject.getItemname());
			agentsModal.setTotalAmount(agentQuationObject.getTotalAmount());
			agentsModal.setSellingodNo(agentQuationObject.getSellingodNo());
			agentsModal.setItemquantity(agentQuationObject.getItemquantity());
			agentsModal.setStatus(agentQuationObject.getStatus());
			agentQuationModals.add(agentsModal);
		}return agentQuationModals;
	}
	
	public List<AgentsQuatations> createALLAgentQuatation(List<AgentQuationModal> agentsModalQuatation)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<AgentsQuatations> agentQuations = new ArrayList<AgentsQuatations>();
		for(AgentQuationModal agentQuationModalObject : agentsModalQuatation)
		{
			AgentsQuatations agentsQuatation1 = new AgentsQuatations();
		
			agentsQuatation1.setId(agentQuationModalObject.getId());
			agentsQuatation1.setItemprice(agentQuationModalObject.getItemprice());
			agentsQuatation1.setCustomerName(agentQuationModalObject.getCustomerName());
			agentsQuatation1.setMobileNumber(agentQuationModalObject.getMobileNumber());
			agentsQuatation1.setItemname(agentQuationModalObject.getItemname());
			agentsQuatation1.setSellingodNo(agentQuationModalObject.getSellingodNo());
			agentsQuatation1.setSellingDate(agentQuationModalObject.getSellingDate());
			agentsQuatation1.setTotalAmount(agentQuationModalObject.getTotalAmount());
			agentsQuatation1.setAgent_name(agentQuationModalObject.getAgent_name());
			agentsQuatation1.setItemquantity(agentQuationModalObject.getItemquantity());
			agentQuations.add(agentsQuatation1);
		}return agentQuations;
	}
	
	public AgentsQuatations createAgentQuatationEntity(AgentQuationModal  agentModal)
	
	{	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		AgentsQuatations agentQut=new AgentsQuatations();
		
		agentQut.setAgent_name(agentModal.getAgent_name());
		//agentQut.setCustomerAddress(agentModal.getCustomerAddress());
		agentQut.setCustomerName(agentModal.getCustomerName());
		agentQut.setItemprice(agentModal.getItemprice());
		agentQut.setSellingodNo(agentModal.getSellingodNo());
		agentQut.setItemname(agentModal.getItemname());
		agentQut.setItemquantity(agentModal.getItemquantity());
		agentQut.setMobileNumber(agentModal.getMobileNumber());
		agentQut.setTotalAmount(agentModal.getTotalAmount());
		agentQut.setAgent_id(agentModal.getAgent_id());
		return  agentQut;
	}
	
     public AgentsQuatations createAgentQuatationEntity(AgentQuationModal  agentModal,AgentsQuatations agentEntity){

		if(agentModal.getAgent_name() != null){
			agentEntity.setAgent_name(agentModal.getAgent_name());
		}
		if(agentModal.getItemname() != null){
			agentEntity.setItemname(agentModal.getItemname());		
		}
		if(agentModal.getItemquantity() != 0){
			agentEntity.setItemquantity(agentModal.getItemquantity());
		}
		if(agentModal.getTotalAmount() !=0){
			agentEntity.setCustomerName(agentModal.getCustomerName());
		}
		if(agentModal.getMobileNumber() != 0){
			agentEntity.setMobileNumber(agentModal.getMobileNumber());
		}
		if(agentModal.getItemprice() != 0){
			agentEntity.setItemprice(agentModal.getItemprice());
		}
		if(agentModal.getTotalAmount() != 0)
		{
			agentEntity.setTotalAmount(agentModal.getTotalAmount());
		}
		return  agentEntity;
	}
     public List<AgentsQuatations> createNestedAgentQuatation(List<AgentQuationModal> agentsModalQuatation, String customerName, Long mobileNumber, String agent_name,float totalAmount, Date sellingDate, Long agentid,String customerAddress
 	)throws NullPointerException{
 		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
 		System.out.println("helper.............:");
 		List<AgentsQuatations> agentQuations = new ArrayList<AgentsQuatations>();
 		for(AgentQuationModal agentQuationModalObject : agentsModalQuatation)
 		{
 			AgentsQuatations agentsQuatation1 = new AgentsQuatations();
 		
 			agentsQuatation1.setId(agentQuationModalObject.getId());
 			agentsQuatation1.setCustomerName(customerName);
 			agentsQuatation1.setMobileNumber(mobileNumber);
 			agentsQuatation1.setItemname(agentQuationModalObject.getItemname());
 			agentsQuatation1.setSellingodNo("1");
 			agentsQuatation1.setSellingDate(sellingDate);
 			agentsQuatation1.setTotalAmount(totalAmount);
 			agentsQuatation1.setAgent_name(agent_name);
 			agentsQuatation1.setItemquantity(agentQuationModalObject.getItemquantity());
 			agentsQuatation1.setItemprice(agentQuationModalObject.getItemprice());
 			agentsQuatation1.setAgent_id(agentid);
 			agentsQuatation1.setCustomerAddress(customerAddress);
 			agentQuations.add(agentsQuatation1);
 		}return agentQuations;
 	}
     public List<AgentQuationModal> createALLAgentQuatationNO1Modal(List<String> sellingOrderNos)throws NullPointerException{

 		List<AgentQuationModal> agentModals = new ArrayList<AgentQuationModal>();
 		if(sellingOrderNos.size() > 0){
 			for(String sellingOrderNo : sellingOrderNos)
 			{
 				AgentQuationModal agentModal = new AgentQuationModal();
 				agentModal.setSellingodNo(sellingOrderNo);
 				/*sListModal.setId(id);*/
 				agentModals.add(agentModal);
 			}
 		}	
 		return agentModals;
 	}
}
