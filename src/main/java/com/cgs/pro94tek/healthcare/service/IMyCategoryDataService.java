package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;

@Component
public interface IMyCategoryDataService {
	
	 public List<CategoryModal>  fetchCategoryByName(String categoryName)throws PMSException;
	 public boolean deleteCategoryByName(String categoryId)throws PMSException;
	public void createOrUpdateCategoryByname(Category  categoryEntity)throws PMSException;
	public List<CategoryModal> fetchAllCategory(Category categoryEntity)throws PMSException;
		
}
