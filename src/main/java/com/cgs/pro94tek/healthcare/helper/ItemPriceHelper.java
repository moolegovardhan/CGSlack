package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.ItemPrice;

import com.cgs.pro94tek.healthcare.modal.ItemPriceModal;


public class ItemPriceHelper {
	public ItemPriceModal createirempriceModal(ItemPrice itemPrice){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		ItemPriceModal itemPriceModal = new ItemPriceModal();
		itemPriceModal.setId(itemPrice.getId());
		itemPriceModal.setEffectivedate(itemPrice.getEffectivedate());
		itemPriceModal.setItemprice(itemPrice.getItemprice());
		
		return  itemPriceModal;
}
	public ItemPrice createItemprice(ItemPriceModal itemPriceModal )
	
	{
		ItemPrice  itemPrice =new ItemPrice();
		
		itemPrice.setId(itemPriceModal.getId());
		itemPrice.setItemprice(itemPriceModal.getItemprice());
		itemPrice.setEffectivedate(itemPriceModal.getEffectivedate());
		
	return  itemPrice;
	}
	
}
