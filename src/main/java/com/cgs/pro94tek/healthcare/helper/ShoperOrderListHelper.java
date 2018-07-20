package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.ShoperOrderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.ShoperOrderListModal;

public class ShoperOrderListHelper {
	
	
	public ShoperOrderList createShoperOrderList(ShoperOrderListModal  shoperModal) throws PMSException, ParseException ,NullPointerException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		ShoperOrderList shoperOrdaer = new ShoperOrderList();
		shoperOrdaer.setAgents_id(shoperModal.getAgents_id());
		shoperOrdaer.setAgent_name(shoperModal.getAgent_name());
		shoperOrdaer.setAgent_no(shoperModal.getAgent_no());
		shoperOrdaer.setArea(shoperModal.getArea());
		shoperOrdaer.setItemname(shoperModal.getItemname());
		shoperOrdaer.setItemprice(shoperModal.getItemprice());
		shoperOrdaer.setItemquantity(shoperModal.getItemquantity());
		shoperOrdaer.setSellingDate(shoperModal.getSellingDate());
		shoperOrdaer.setSellingodNo(shoperModal.getSellingodNo());
		shoperOrdaer.setShperAddress(shoperModal.getShperAddress());
		shoperOrdaer.setShperName(shoperModal.getShperName());
		shoperOrdaer.setCustomerName(shoperModal.getCustomerName());
		shoperOrdaer.setCustomeraddress(shoperModal.getCustomeraddress());
		shoperOrdaer.setMobileNumber(shoperModal.getMobileNumber());
		
		return shoperOrdaer;
	}
		
	}


