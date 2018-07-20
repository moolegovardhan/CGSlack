package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISubCategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.impl.CategoryDAOImpl;
import com.cgs.pro94tek.healthcare.dataaccess.dao.impl.SubCategoryDAOImpl;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;

@Service("subCategoryHelper")
public class SubCategoryHelper {
	
	@Autowired
	ICategoryDAO iCategoryDAO;
	
	public List<SubCategoryModal> createCategoryModal(List<SubCategory> subcategory){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<SubCategoryModal> subcatgoryModals = new ArrayList<SubCategoryModal>();
		for(SubCategory subcategoryobj : subcategory)
		{
			SubCategoryModal subcategoryModal1 = new SubCategoryModal();

			subcategoryModal1.setCreatedBy(subcategoryobj.getCreatedBy());
			subcategoryModal1.setId(subcategoryobj.getId());
			System.out.println("myhe.......:"+subcategoryobj.getCategory());
			
			subcategoryModal1.setCategoryId(subcategoryobj.getCategory().getId());
			subcategoryModal1.setCreatedDate(subcategoryobj.getCreatedDate());
			subcategoryModal1.setDescription(subcategoryobj.getDescription());
			subcategoryModal1.setOfficeid(subcategoryobj.getOfficeid());
			subcategoryModal1.setSubCategoryName(subcategoryobj.getSubCategoryName());
			subcategoryModal1.setStatus(subcategoryobj.getStatus());
			subcategoryModal1.setCategoryName(subcategoryobj.getCategory().getCategoryName());
			subcatgoryModals.add(subcategoryModal1);
			}
		


		return subcatgoryModals;
	}

	
	public SubCategoryModal createSubCategoryModal(SubCategory subCategory){
		
		System.out.println("enter modal helper.....:");
		SubCategoryModal subCategoryModal = new SubCategoryModal();
		
		subCategoryModal.setCreatedBy(subCategory.getCreatedBy());
		subCategoryModal.setCreatedDate(subCategory.getCreatedDate());
		subCategoryModal.setSubCategoryName(subCategory.getSubCategoryName());
		subCategoryModal.setDescription(subCategory.getDescription());
		subCategoryModal.setOfficeid(subCategory.getOfficeid());
		
		return subCategoryModal;
	}

	public SubCategory createSubCategoryEntity(SubCategoryModal subCategoryModal){

		SubCategory subCategory = new SubCategory();	
		subCategory.setCreatedBy(subCategoryModal.getCreatedBy());
		subCategory.setSubCategoryName(subCategoryModal.getSubCategoryName());
		subCategory.setOfficeid(subCategoryModal.getOfficeid());
		subCategory.setCreatedDate(subCategoryModal.getCreatedDate());
		subCategory.setDescription(subCategoryModal.getDescription());
		subCategory.setStatus(subCategoryModal.getStatus());
		Long ctegoryId = subCategoryModal.getCategoryId();
		try{
			System.out.println("catgory.................:"+iCategoryDAO);
		Category  categoryObj = iCategoryDAO.getCategoryById(ctegoryId.toString());
		subCategory.setCategory(categoryObj);
		}catch(Exception e){
			e.printStackTrace();
		}
		return subCategory;
	}
	public SubCategory updateSubcategory(SubCategoryModal subCategoryModal){

		SubCategory subCategory = new SubCategory();	
		if(subCategoryModal.getSubCategoryName() != null){
			subCategory.setSubCategoryName(subCategoryModal.getSubCategoryName());
		}
		if(subCategoryModal.getDescription() != null){
			subCategory.setDescription(subCategoryModal.getDescription());
		}
		/*if(subCategoryModal.getCategory().getId() !=null)	{
			subCategory.setId(subCategoryModal.getCategory().getId());
			
		}*/
		return subCategory;
		
}
}
