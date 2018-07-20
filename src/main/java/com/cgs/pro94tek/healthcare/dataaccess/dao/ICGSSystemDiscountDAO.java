package com.cgs.pro94tek.healthcare.dataaccess.dao;


import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CgsSystemDiscount;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;

public interface ICGSSystemDiscountDAO {
	public void createSystemDiscount(CgsSystemDiscount  systemDiscountEntity)throws DataAccessException;
	public List<CgsSystemDiscountModal> getAllDiscount(CgsSystemDiscount systemDiscountEntity)throws DataAccessException;
}
