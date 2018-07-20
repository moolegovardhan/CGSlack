package com.cgs.pro94tek.healthcare.helper;

import java.text.ParseException;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;

@Component
public class CgsDiscountCategoryHelper {
	
	
	public CgsDiscountCategory   createDiscoutnCategory(CgsDiscountCategoryModal cgscateModal)throws PMSException, ParseException
	{
		CgsDiscountCategory categoaryObje=new CgsDiscountCategory();
		categoaryObje.setCategoryName(cgscateModal.getCategoryName());
		categoaryObje.setCratedDate(cgscateModal.getCratedDate());
		categoaryObje.setCreatedBy(cgscateModal.getCreatedBy());
		categoaryObje.setSysdsc_id(cgscateModal.getSysdsc_id());
		categoaryObje.setDiscription(cgscateModal.getDiscription());
		return categoaryObje;
		
	}

}
