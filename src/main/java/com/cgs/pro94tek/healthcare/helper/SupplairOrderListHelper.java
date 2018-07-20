package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.SuppliarOrderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.SupplairOrderListModal;

@Component
public class SupplairOrderListHelper {


	public SuppliarOrderList createSupplair(SupplairOrderListModal supplairModal)
			throws PMSException, ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		SuppliarOrderList supplairs = new SuppliarOrderList();
		/*
		 * supplairs.setCustomerName(supplairModal.getCustomerName());
		 * supplairs.setMobileNumber(supplairModal.getMobileNumber());
		 */
		/* supplairs.setAgentName(supplairModal.getAgentName()); */
		/* supplairs.setCustomerAddress(supplairModal.getCustomerAddress()); */
		supplairs.setItemName(supplairModal.getItemName());
		supplairs.setItemPrice(supplairModal.getItemPrice());
		supplairs.setItemQuantity(supplairModal.getItemQuantity());
		supplairs.setSellingodNo(supplairModal.getSellingodNo());
		supplairs.setSuppliarContactNo(supplairModal.getSuppliarContactNo());
		supplairs.setSuppliarName(supplairModal.getSuppliarName());
		supplairs.setTotalAmount(supplairModal.getTotalAmount());
		/* supplairs.setAgentNo(supplairModal.getAgentNo()); */
		supplairs.setIdSupplairOrder(supplairModal.getIdSupplairOrder());
		return supplairs;
	}

	public List<SuppliarOrderList> createALLSupplairOfdata(
			List<SupplairOrderListModal> supplairModal, String suppliarName,Long supMobileNo)
			throws NullPointerException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		List<SuppliarOrderList> supplairOrderLists = new ArrayList<SuppliarOrderList>();
		for (SupplairOrderListModal supplairOrderModal : supplairModal) {
			SuppliarOrderList supplirOrder1 = new SuppliarOrderList();
			supplirOrder1.setId(supplairOrderModal.getId());
			supplirOrder1.setIdSupplairOrder("1");
			supplirOrder1.setSupMobileNo(supMobileNo);
			supplirOrder1.setSellingodNo(supplairOrderModal.getSellingodNo());
			supplirOrder1.setItemName(supplairOrderModal.getItemName());
			supplirOrder1.setItemQuantity(supplairOrderModal.getItemQuantity());
			supplirOrder1.setSuppliarName(suppliarName);
			supplairOrderLists.add(supplirOrder1);

		}
		return supplairOrderLists;

	}
	
	public List<SupplairOrderListModal> createALLSupplierModalName(List<SuppliarOrderList> supplierOrder)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<SupplairOrderListModal> supplierModals = new ArrayList<SupplairOrderListModal>();
		for(SuppliarOrderList supplierOrders : supplierOrder)
		{
			SupplairOrderListModal supplierOrderModa1 = new SupplairOrderListModal();
		
			supplierOrderModa1.setId(supplierOrders.getId());
			supplierOrderModa1.setSuppliarContactNo(supplierOrders.getSuppliarContactNo());
			supplierOrderModa1.setIdSupplairOrder(supplierOrders.getIdSupplairOrder());
			supplierOrderModa1.setSellingodNo(supplierOrders.getSellingodNo());
			supplierOrderModa1.setItemName(supplierOrders.getItemName());
			supplierOrderModa1.setItemQuantity(supplierOrders.getItemQuantity());
			supplierModals.add(supplierOrderModa1);
			
		}return supplierModals;
	}
	public SuppliarOrderList updateSupplierList(SupplairOrderListModal supModal,SuppliarOrderList supEntity)throws NullPointerException{
		
		if(supModal.getItemName()!=null){
			supEntity.setItemName(supModal.getItemName());
		
		}
		if(supModal.getItemQuantity()!=null){
			supEntity.setItemQuantity(supModal.getItemQuantity());
		
		}
		return supEntity;
	}
	
	
}