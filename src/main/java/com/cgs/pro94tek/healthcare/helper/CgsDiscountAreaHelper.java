package com.cgs.pro94tek.healthcare.helper;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountArea;
import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountCategoryDao;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountAreaModal;

@Component
public class CgsDiscountAreaHelper {
	
	@Autowired
	ICgsDiscountCategoryDao  dicountCategoryDAO;
	public CgsDiscountArea  createDiscountArea(CgsDiscountAreaModal  discountModal)throws PMSException, ParseException
	{
		CgsDiscountArea dicountArea= new CgsDiscountArea();
		dicountArea.setAreaAddress(discountModal.getAreaAddress());
		dicountArea.setAreaName(discountModal.getAreaName());
		dicountArea.setCreatedBy(discountModal.getCreatedBy());
		dicountArea.setStatus("y");
		dicountArea.setCreatedDate(discountModal.getCreatedDate());
		Long sysid=discountModal.getCateId();
		try{
		CgsDiscountCategory  discountcateObje=dicountCategoryDAO.getDiscountCategoryById(sysid);
		dicountArea.setDiscoutnCategory(discountcateObje);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return dicountArea;
		
	}
}
