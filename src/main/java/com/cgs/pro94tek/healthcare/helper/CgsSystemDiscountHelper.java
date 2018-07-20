package com.cgs.pro94tek.healthcare.helper;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;

@Component
public class CgsSystemDiscountHelper {
	
	public CgsSystemDiscount  createSystemDiscunt(CgsSystemDiscountModal  systemDiscountModal)
	{	
		CgsSystemDiscount  dicountObj=new CgsSystemDiscount();
		dicountObj.setCreatedby(systemDiscountModal.getCreatedby());
		dicountObj.setAddress(systemDiscountModal.getAddress());
		dicountObj.setCity(systemDiscountModal.getCity());
		dicountObj.setCreatedby(systemDiscountModal.getCreatedby());
		dicountObj.setDiscountname(systemDiscountModal.getDiscountname());
		dicountObj.setCreateddate(systemDiscountModal.getCreateddate());
		dicountObj.setEnddate(systemDiscountModal.getEnddate());
		dicountObj.setPercent(systemDiscountModal.getPercent());
		dicountObj.setStatus("y");
		return dicountObj;
		
	}

}
