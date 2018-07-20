package com.cgs.pro94tek.healthcare.helper;

import java.text.ParseException;

import com.cgs.pro94tek.healthcare.bean.CgsDiscounts;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountsModal;

public class CgsDiscountsHelper {
	
	
	public CgsDiscounts  createCgsDiscount(CgsDiscountsModal   cgsDiscountModal)throws PMSException, ParseException
	{
		
		CgsDiscounts discountObje=new CgsDiscounts();
		discountObje.setCardtype(cgsDiscountModal.getCardtype());
		discountObje.setCgsdiscount(cgsDiscountModal.getCgsdiscount());
		return discountObje;
		
	}

}
