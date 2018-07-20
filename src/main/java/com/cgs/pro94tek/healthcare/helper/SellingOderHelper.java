package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.cgs.pro94tek.healthcare.bean.Construction_Agents;
import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IAgentDAO;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;


@Service("sellingOderHelper")
public class SellingOderHelper {

	@Autowired
	IAgentDAO agentDAO;
	
	public List<SellingOrderListModal> createALLSellingOrderModal(List<SellingOderList> sellingOrder)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<SellingOrderListModal> sellingModals = new ArrayList<SellingOrderListModal>();
		for(SellingOderList sellingOrderObject : sellingOrder)
		{
			SellingOrderListModal sellingModal1 = new SellingOrderListModal();
		
			sellingModal1.setId(sellingOrderObject.getId());
			sellingModal1.setCustomerName(sellingOrderObject.getCustomerName());
			sellingModal1.setCustaddress(sellingOrderObject.getCustomerAddress());
			sellingModal1.setMobileNumber(sellingOrderObject.getMobileNumber());
			sellingModal1.setSellingDate(sellingOrderObject.getSellingDate());
			sellingModal1.setSellingOderNumber(sellingOrderObject.getSellingOderNumber());
			sellingModal1.setItemname(sellingOrderObject.getItemname());
			sellingModal1.setItemquantity(sellingOrderObject.getItemQuantity());
			sellingModal1.setAgent_no(sellingOrderObject.getAgent_no());
			sellingModal1.setTotalAmount(sellingOrderObject.getTotalAmount());
			sellingModal1.setAgent_name(sellingOrderObject.getAgent().getName());
			sellingModal1.setItemprice(sellingOrderObject.getItemprice());
			sellingModal1.setAgentid(sellingOrderObject.getAgent().getId());
			sellingModals.add(sellingModal1);
		}
		return sellingModals;
		}
	
	public SellingOderList createSellingList(SellingOrderListModal sellingModal)throws NullPointerException
		{	
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
			SellingOderList sellingOrder = new SellingOderList();
			sellingOrder.setCustomerAddress(sellingModal.getCustaddress());
			sellingOrder.setCustomerName(sellingModal.getCustomerName());
			sellingOrder.setAgent_name(sellingModal.getAgent_name());
			sellingOrder.setItemname(sellingModal.getItemname());
			sellingOrder.setTotalAmount(sellingModal.getTotalAmount());
			sellingOrder.setItemQuantity(sellingModal.getItemquantity());
			sellingOrder.setSellingOderNumber(sellingModal.getSellingOderNumber());
			sellingOrder.setMobileNumber(sellingModal.getMobileNumber());
			/*
			//sellingOrder.setSellingDate(sellingModal.getSellingDate());
			sellingOrder.setTotalAmount(sellingModal.getTotalAmount());
			
			sellingOrder.setAgent_no(sellingModal.getAgent_no());
			sellingOrder.setItemQuantity(sellingModal.getItemquantity());
			sellingOrder.setItemname(sellingModal.getItemname());
			sellingOrder.setSellingOderNumber(sellingModal.getSellingOderNumber());*/
			//sellingOrder.set(sellingModal.getItemname());
//			String name = sellingModal.getAgent_name();
//			try{
//			Construction_Agents  agentObj = agentDAO.fetchAgentId(name);
//			sellingOrder.setAgent(agentObj);
//				
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//					
			return sellingOrder;
		}
	
	public SellingOrderListModal fetchSellingList(SellingOderList selling)throws NullPointerException
	{	System.out.println("selling helper...............:2m");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		SellingOrderListModal sellingOrdermodal = new SellingOrderListModal();
		sellingOrdermodal.setCustaddress(selling.getCustomerAddress());
		sellingOrdermodal.setCustomerName(selling.getCustomerName());			
		sellingOrdermodal.setMobileNumber(selling.getMobileNumber());
		sellingOrdermodal.setAgent_no(selling.getAgent_no());
		sellingOrdermodal.setSellingDate(selling.getSellingDate());
		sellingOrdermodal.setTotalAmount(selling.getTotalAmount());
		sellingOrdermodal.setItemprice(selling.getItemprice());
		sellingOrdermodal.setAgent_name(selling.getAgent_name());
		sellingOrdermodal.setAgent_no(selling.getAgent_no());
		sellingOrdermodal.setItemquantity(selling.getItemQuantity());
		sellingOrdermodal.setItemname(selling.getItemname());
		sellingOrdermodal.setSellingOderNumber("1");
			
		return sellingOrdermodal;
	}
	
	public List<SellingOderList> createALLSellingOrderList(List<SellingOrderListModal> sellingOrderList,String custaddress , String customerName,Long mobileNumber,Date sellingDate ,float totalAmount
				 )throws NullPointerException                       																												
				 {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<SellingOderList> sellingLists = new ArrayList<SellingOderList>();
		for(SellingOrderListModal sellingOrderObject : sellingOrderList)
		{
			SellingOderList sellingList1 = new SellingOderList();
			/*sellingList1.setId(sellingOrderObject.getId());*/
			sellingList1.setCustomerAddress(custaddress);
			sellingList1.setCustomerName(customerName);
			sellingList1.setMobileNumber(mobileNumber);
			sellingList1.setItemprice(sellingOrderObject.getItemprice());
			sellingList1.setSellingDate(sellingDate);
		/*	System.out.println(agentid);*/
			sellingList1.setId(sellingOrderObject.getAgentid());
			sellingList1.setSellingOderNumber("1");
			sellingList1.setTotalAmount(totalAmount);
			sellingList1.setItemname(sellingOrderObject.getItemname());
			sellingList1.setItemQuantity(sellingOrderObject.getQuantity1());
			sellingList1.setAgent_name(sellingOrderObject.getAgent_name());
			
			String name = sellingOrderObject.getAgent_name();
			try{
			Construction_Agents  agentObj = agentDAO.fetchAgentId(name);
			sellingList1.setAgent(agentObj);
				
			}catch(Exception e){
				e.printStackTrace();
			}
					
			sellingLists.add(sellingList1);
		}
		return sellingLists;
	}
	
	public List<SellingOrderListModal> createALLSellingOrderNoModal(List<String> sellingOrderNos)throws NullPointerException{

		List<SellingOrderListModal> sellingModals = new ArrayList<SellingOrderListModal>();
		if(sellingOrderNos.size() > 0){
			for(String sellingOrderNo : sellingOrderNos)
			{
				SellingOrderListModal sListModal = new SellingOrderListModal();
				sListModal.setSellingOderNumber(sellingOrderNo);
				/*sListModal.setId(id);*/
				sellingModals.add(sListModal);
			}
		}	
		return sellingModals;
	}
	
	
	
	
}
