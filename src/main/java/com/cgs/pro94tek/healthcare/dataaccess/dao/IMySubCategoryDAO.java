package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;


import com.cgs.pro94tek.healthcare.bean.SubCategory;


public interface IMySubCategoryDAO {

	
	public List<SubCategory> fetchSubCategoryByName(String byname)
			throws DataAccessException;

	public void createOrUpdateSubCategoryByname(SubCategory subCategoryEntity)
			throws DataAccessException;

	public boolean deleteSubCategoryByName(String subCategoryId)
			throws DataAccessException;

	public List<SubCategory> fetchAllSubCategory(SubCategory subCategoryEntity)
			throws DataAccessException;
	public SubCategory fetchById(Long id)throws DataAccessException;
	public SubCategory createOrUpdateSub(SubCategory subCategoryEntity) throws DataAccessException; 
}
