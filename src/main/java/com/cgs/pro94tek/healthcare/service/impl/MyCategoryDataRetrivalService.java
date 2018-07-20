package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMyCategoryDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CategoryHelper;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.service.IMyCategoryDataService;



@Service("imyCategoryDataService")
public class MyCategoryDataRetrivalService  implements IMyCategoryDataService{

	
	@Autowired
	IMyCategoryDAO categorydao;
	
	@Override
	public List<CategoryModal> fetchCategoryByName(String categoryName)
			throws PMSException {
		System.out.println("dao implementation................:");
		List<Category> category=categorydao.fetchCategoryByName(categoryName);
		CategoryHelper cathelper=new CategoryHelper();
		
		return cathelper.createCategoryModal(category);
	}

	public boolean deleteCategoryByName(String categoryName)
			throws PMSException {
		System.out.println("delete service...........:"+categoryName);
		// TODO Auto-generated method stub
		return categorydao.deleteCategoryByName(categoryName);
	}

	@Override
	public void createOrUpdateCategoryByname(Category categoryEntity)
			throws PMSException {
		System.out.println("create Category.class.........."+categoryEntity);
		// TODO Auto-generated method stub
		categorydao.createOrUpdateCategory(categoryEntity);
	}

	@Override
	public List<CategoryModal> fetchAllCategory(Category categoryEntity)
			throws PMSException {
		
		List<Category>  category=categorydao.fetchAllCategory(categoryEntity);
		CategoryHelper  cathelper=new CategoryHelper();
		// TODO Auto-generated method stub
		return cathelper.createCategoryModal(category);
	}

	

}
