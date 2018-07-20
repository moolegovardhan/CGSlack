package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Category;


public interface IMyCategoryDAO {
	
		public List<Category>  fetchCategoryByName(String categoryName)throws DataAccessException;
	   public void createOrUpdateCategory(Category categoryEntity) throws DataAccessException;
	   public boolean deleteCategoryByName(String categoryId) throws DataAccessException;
	   public List<Category>  fetchAllCategory(Category categoryEntity)throws DataAccessException;
	   //public void deleteCompanyAddress (String companyaddress) throws DataAccessException;

}
