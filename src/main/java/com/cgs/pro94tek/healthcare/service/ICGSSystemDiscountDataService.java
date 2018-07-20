package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;

public interface ICGSSystemDiscountDataService {
	
	public void createSystsemDiscount(CgsSystemDiscount  discountObj)throws DataAccessException;
	public List<CgsSystemDiscountModal>  getAlldiscoutn(CgsSystemDiscount  discountEntity)throws DataAccessException;
}
