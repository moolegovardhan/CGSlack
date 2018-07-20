package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.DealerAdressModal;

public class DealerAdressHelper {
	
	
	
	public DealerAdressModal  createDealerAdressModal(DealerAdress  dealeradress)throws NullPointerException
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		DealerAdressModal  DealerAdress=new DealerAdressModal();
		
		DealerAdress.setAddressid(dealeradress.getAddressid());
		DealerAdress.setBillingAddress(dealeradress.getBillingAddress());
		
		return DealerAdress;
		
		
		
	}
	
	public DealerAdress  createDealerAdress(DealerAdressModal modaladress) throws PMSException, ParseException ,NullPointerException
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		DealerAdress   dealer=new DealerAdress();
		
		dealer.setAddressid(modaladress.getAddressid());
		dealer.setBillingAddress(modaladress.getBillingAddress());
		
		
		return dealer;
	}

}
