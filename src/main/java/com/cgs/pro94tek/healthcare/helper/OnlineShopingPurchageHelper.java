package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;







import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;
import com.cgs.pro94tek.healthcare.modal.OnlinePurchageModal;
@Component

public class OnlineShopingPurchageHelper {
	

	public List<OnlinePurchageModal> fetchALLOnlinePurchageModal(List<OnlinePurchage> onlinePurchageEnitity)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<OnlinePurchageModal> onlinePurchage = new ArrayList<OnlinePurchageModal>();
		for(OnlinePurchage onlinePurchageEnt : onlinePurchageEnitity)
		{
			OnlinePurchageModal onlinePurchage1 = new OnlinePurchageModal();
		
			onlinePurchage1.setId(onlinePurchageEnt.getId());
			onlinePurchage1.setCustomerName(onlinePurchageEnt.getCustomerName());
			onlinePurchage1.setCustomerAddress(onlinePurchageEnt.getCustomerAddress());
			onlinePurchage1.setPhoneNumber(onlinePurchageEnt.getPhoneNumber());
			onlinePurchage1.setItemname(onlinePurchageEnt.getItemName());
			onlinePurchage1.setItemprice(onlinePurchageEnt.getItemPrice());
			onlinePurchage1.setQuantity(onlinePurchageEnt.getItemquantity());
			onlinePurchage1.setOrderDate(onlinePurchageEnt.getOrderDate());
			onlinePurchage1.setTotalAmout(onlinePurchageEnt.getTotalAmout());
			onlinePurchage1.setOrderNO(onlinePurchageEnt.getOrderNO());
			onlinePurchage.add(onlinePurchage1);
			
		}
		
		return onlinePurchage;
		}
	
	public List<OnlinePurchage> createALLOnlinePurchage(List<OnlinePurchageModal> onlinePurchageModal)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<OnlinePurchage> onlinePurchageObj = new ArrayList<OnlinePurchage>();
		for(OnlinePurchageModal onlinePurchageModalobj : onlinePurchageModal)
		{
			OnlinePurchage onlinePurchage = new OnlinePurchage();
		
//			onlinePurchage.setId(onlinePurchageModalobj.getId());
			onlinePurchage.setCustomerName(onlinePurchageModalobj.getCustomerName());
			/*onlinePurchage.setCustomerAddress(onlinePurchageModalobj.getCustomerAddress());
			onlinePurchage.setItemName(onlinePurchageModalobj.getItemname());
			onlinePurchage.setItemPrice(onlinePurchageModalobj.getItemprice());
			onlinePurchage.setItemquantity(onlinePurchageModalobj.getQuantity());
			onlinePurchage.setOrderDate(onlinePurchageModalobj.getOrderDate());*/
			onlinePurchage.setOrderNO("1");
			/*onlinePurchage.setPaymentType(onlinePurchageModalobj.getPaymentType());
			onlinePurchage.setStatus(onlinePurchageModalobj.getStatus());
			onlinePurchage.setDeleverydDate(onlinePurchageModalobj.getDeleverydDate());*/
			onlinePurchageObj.add(onlinePurchage);
			
		}
		
		return onlinePurchageObj;
		}
	public OnlinePurchage createOnlineSellingOrder(OnlinePurchageModal  onlinePurchageModal)
	{	
		OnlinePurchage onlinePurchageEntity=new OnlinePurchage();
		try{
		/*onlinePurchageEntity.setId(onlinePurchageModal.getId());*/
		onlinePurchageEntity.setCustomerAddress(onlinePurchageModal.getCustomerAddress());
		onlinePurchageEntity.setCustomerName(onlinePurchageModal.getCustomerName());
		onlinePurchageEntity.setItemPrice(onlinePurchageModal.getItemprice());
		onlinePurchageEntity.setOrderDate(onlinePurchageModal.getOrderDate());
		onlinePurchageEntity.setDeleverydDate(onlinePurchageModal.getDeleverydDate());
		onlinePurchageEntity.setItemName(onlinePurchageModal.getItemname());
		onlinePurchageEntity.setItemquantity(onlinePurchageModal.getQuantity());
		onlinePurchageEntity.setOrderNO("1");
		onlinePurchageEntity.setPaymentType(onlinePurchageModal.getPaymentType());
		/*onlinePurchageEntity.setItemquantity(onlinePurchageModal.getItemquantity());
		onlinePurchageEntity.setOrderDate(onlinePurchageModal.getOrderDate());
		onlinePurchageEntity.setItemName(onlinePurchageModal.getItemName());
		onlinePurchageEntity.setPaymentType(onlinePurchageModal.getPaymentType());
		onlinePurchageEntity.setPhoneNumber(onlinePurchageModal.getPhoneNumber());*/
	/*	onlinePurchageEntity.setOrderNO("1");*/
		onlinePurchageEntity.setCustomerAddress(onlinePurchageModal.getCustomerAddress());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return onlinePurchageEntity;
	
	
	}
	public List<OnlinePurchage> createALLOnlinePurchageContext(List<OnlinePurchageModal> onlinePurchageModal,String customerName,Integer phoneNumber,  String customerAddress,Date  orderDate, float totalAmout,String status,String paymentType)throws NullPointerException{
		
			
				
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 							
		
		System.out.println("helper.............:");
		List<OnlinePurchage> onlinePurchageObj = new ArrayList<OnlinePurchage>();
		for(OnlinePurchageModal onlinePurchageModalobj : onlinePurchageModal)
		{
			OnlinePurchage onlinePurchage = new OnlinePurchage();
			/*onlinePurchage.setDeleverydDate(onlinePurchageModalobj.getDeleverydDate());*/
			onlinePurchage.setCustomerName(customerName);
			onlinePurchage.setCustomerAddress(customerAddress);
			onlinePurchage.setOrderDate(orderDate);
			onlinePurchage.setId(onlinePurchageModalobj.getId());
			onlinePurchage.setItemName(onlinePurchageModalobj.getItemname());
			onlinePurchage.setItemPrice(onlinePurchageModalobj.getItemprice());
			onlinePurchage.setItemquantity(onlinePurchageModalobj.getQuantity());
			onlinePurchage.setOrderNO("1");
			onlinePurchage.setPaymentType(paymentType);
			onlinePurchage.setPhoneNumber(phoneNumber);
			onlinePurchage.setTotalAmout(totalAmout);
			onlinePurchage.setStatus(status);
			onlinePurchageObj.add(onlinePurchage);
		}
		return onlinePurchageObj;
	}
	
}
