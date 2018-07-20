package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CgsDiscountArea;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountAreaModal;

public interface ICgsDiscountAreaDAO {
	public void createDiscountArea(CgsDiscountArea  areaEntity)throws DataAccessException;
	public List<CgsDiscountAreaModal> getDiscountModal(CgsDiscountArea   areaEntity)throws DataAccessException;
}
