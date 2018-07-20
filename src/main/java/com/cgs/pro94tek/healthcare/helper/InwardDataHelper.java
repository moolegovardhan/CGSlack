package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.InwardData;
import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.modal.InwardDataModal;
import com.cgs.pro94tek.healthcare.modal.ItemPriceModal;

public class InwardDataHelper {
	
	public InwardDataModal createinwardDataModal(InwardData inwardData)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		InwardDataModal inDataModal = new InwardDataModal();
		inDataModal.setPurchaseorderid(inwardData.getPurchaseorderid());
		return inDataModal;
	}
public InwardData createinwardData(InwardDataModal inDataModal )
	
	{
	InwardData  inwardData =new InwardData();
		
	inwardData.setPurchaseorderid(inDataModal.getPurchaseorderid());
		
	return inwardData;
}
}