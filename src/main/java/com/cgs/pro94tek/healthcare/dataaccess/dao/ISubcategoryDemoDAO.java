package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;


import com.cgs.pro94tek.healthcare.bean.SubcategoryDemo;

public interface ISubcategoryDemoDAO {
	
	public List<SubcategoryDemo>  fetchSubCategoryByName(String byname)throws DataAccessException;

}
