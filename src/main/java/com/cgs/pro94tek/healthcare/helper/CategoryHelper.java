package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Company;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.CompanyModal;

public class CategoryHelper {
	
	public List<CategoryModal> createCategoryModal(List<Category> category){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<CategoryModal> catgoryModals = new ArrayList<CategoryModal>();
		for(Category categoryobj : category)
		{
			CategoryModal categoryModal1 = new CategoryModal();
			categoryModal1.setCategoryName(categoryobj.getCategoryName());
			categoryModal1.setCreatedBy(categoryobj.getCreatedBy());
			categoryModal1.setCreatedDate(df.format(categoryobj.getCreatedDate()));
			categoryModal1.setDescription(categoryobj.getDescription());
			categoryModal1.setId(categoryobj.getId());
			/*categoryModal1.setSubCategories(categoryobj.getSubCategories());*/
			categoryModal1.setStatus(categoryobj.getStatus());
			catgoryModals.add(categoryModal1);
			}
		


		return catgoryModals;
	}

	
	public CategoryModal createCategoryModal(Category category){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("helpermodal.........:");
		CategoryModal categoryModal = new CategoryModal();
		categoryModal.setCategoryName(category.getCategoryName());
		categoryModal.setCreatedBy(category.getCreatedBy());
		categoryModal.setCreatedDate(df.format(category.getCreatedDate()));
		categoryModal.setDescription(category.getDescription());
		categoryModal.setId(category.getId());
		categoryModal.setStatus(category.getStatus());
		
		
		return categoryModal;
	}

	public Category createCategoryEntity(CategoryModal categoryModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Category category = new Category();
		category.setCategoryName(categoryModal.getCategoryName());
		category.setCreatedBy(categoryModal.getCreatedBy());
		
		category.setCreatedDate(new Date());
		category.setDescription(categoryModal.getDescription());
		category.setStatus(categoryModal.getStatus());
		category.setId(categoryModal.getId());
		//category.setId(categoryModal.getId());
		
		return category;
	}
}
