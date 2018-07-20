package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import com.cgs.pro94tek.healthcare.bean.ShoperPayments;
import com.cgs.pro94tek.healthcare.modal.ShoperPaymentModal;

@Component
public class ShoperPaymentsHelper {
	
	

	public List<ShoperPaymentModal> createAllShoperPaymentsModal(List<ShoperPayments> shoperPayments){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ShoperPaymentModal> shoperPaymentModals = new ArrayList<ShoperPaymentModal>();
		for(ShoperPayments shoperPaymentObj : shoperPayments)
		{
			ShoperPaymentModal shoperPaymentModaln = new ShoperPaymentModal();
			
			shoperPaymentModaln.setBillingStatus(shoperPaymentObj.getBillingStatus());
			shoperPaymentModaln.setCustomerAdress(shoperPaymentObj.getCustomerAdress());
			shoperPaymentModaln.setCustomerName(shoperPaymentObj.getCustomerName());
			shoperPaymentModaln.setId(shoperPaymentObj.getId());
			shoperPaymentModaln.setItemsName(shoperPaymentObj.getItemsName());
			shoperPaymentModaln.setOrderNo(shoperPaymentObj.getOrderNo());
			shoperPaymentModaln.setPaymentType(shoperPaymentObj.getPaymentType());
			shoperPaymentModaln.setQuantity(shoperPaymentObj.getQuantity());
			shoperPaymentModaln.setTotalAmount(shoperPaymentObj.getTotalAmount());
			shoperPaymentModals.add(shoperPaymentModaln);
			
		}
		return shoperPaymentModals;
	}
	

	public List<ShoperPayments> createAllShoperPayment(List<ShoperPaymentModal> shoperPaymentModal){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ShoperPayments> shoperPayments = new ArrayList<ShoperPayments>();
		for(ShoperPaymentModal shoperPaymentModalObj : shoperPaymentModal)
		{
			ShoperPayments shoperPaymentn = new ShoperPayments();
			
			shoperPaymentn.setBillingStatus(shoperPaymentModalObj.getBillingStatus());
			shoperPaymentn.setCustomerAdress(shoperPaymentModalObj.getCustomerName());
			shoperPaymentn.setCustomerName(shoperPaymentModalObj.getCustomerName());
			shoperPaymentn.setId(shoperPaymentModalObj.getId());
			shoperPaymentn.setItemsName(shoperPaymentModalObj.getItemsName());
			shoperPaymentn.setOrderNo(shoperPaymentModalObj.getOrderNo());
			shoperPaymentn.setPaymentType(shoperPaymentModalObj.getPaymentType());
			shoperPaymentn.setQuantity(shoperPaymentModalObj.getQuantity());
			shoperPaymentn.setTotalAmount(shoperPaymentModalObj.getTotalAmount());
			shoperPayments.add(shoperPaymentn);
	
}return shoperPayments;
	}
}
