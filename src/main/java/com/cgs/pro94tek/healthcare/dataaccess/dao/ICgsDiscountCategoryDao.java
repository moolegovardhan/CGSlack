package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;


public interface ICgsDiscountCategoryDao {
	
	public void  createDiscountCategory(CgsDiscountCategory   discCategory) throws DataAccessException;
	public List<CgsDiscountCategoryModal>  getDiscountCat(CgsDiscountCategory discCategory)throws DataAccessException;
	public CgsDiscountCategory getDiscountCategoryById(Long categoryId) throws DataAccessException;
}
