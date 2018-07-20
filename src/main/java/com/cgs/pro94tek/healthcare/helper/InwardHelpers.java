package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.InwardModal;


public class InwardHelpers {
	public InwardModal createinwardModal(Inward inward)throws NullPointerException
	{
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	System.out.println("inward helper........."+inward);
	InwardModal inwardModal = new InwardModal();
	System.out.println("inward helper........."+inwardModal);
	inwardModal.setId(inward.getId());
	inwardModal.setPurchaseorderid(inward.getPurchaseorderid());
	System.out.println("helper........:"+inwardModal);
		return inwardModal;
	}

	
	public Inward createInward(InwardModal  inwardModal) throws PMSException, ParseException ,NullPointerException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		System.out.println("inward...........createinward............:");
		Inward inward = new Inward();
		inward.setId(inwardModal.getId());
		inward.setCreatedBy(inwardModal.getCreatedBy());
		inward.setInvoiceqty(inwardModal.getInvoiceqty());
		inward.setPurchaseorderid(inwardModal.getPurchaseorderid());
		
		return inward;
	}

}
