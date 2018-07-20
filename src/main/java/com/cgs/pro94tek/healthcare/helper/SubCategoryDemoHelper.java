package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.bean.SubcategoryDemo;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;
import com.cgs.pro94tek.healthcare.modal.SubcategorydemoModal;

public class SubCategoryDemoHelper {

	
	public List<SubcategorydemoModal> createCategorydemoModal(List<SubcategoryDemo> subcategory){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<SubcategorydemoModal> subcatgoryModals = new ArrayList<SubcategorydemoModal>();
		for(SubcategoryDemo subcategoryobj : subcategory)
		{
			SubcategorydemoModal subcategoryModal1 = new SubcategorydemoModal();
			subcategoryModal1.setId(subcategoryobj.getId());
			subcategoryModal1.setCreatedBy(subcategoryobj.getCreatedBy());
			subcategoryModal1.setCreatedDate(subcategoryobj.getCreatedDate());
			/*subcategoryModal1.setDescription(subcategoryobj.getDescription());*/
			subcategoryModal1.setOfficeid(subcategoryobj.getOfficeid());
			subcategoryModal1.setSubCategoryName(subcategoryobj.getSubCategoryName());
			subcategoryModal1.setStatus(subcategoryobj.getStatus());
			subcategoryModal1.setCateId(subcategoryobj.getCateId());
			subcatgoryModals.add(subcategoryModal1);
			}
		


		return subcatgoryModals;
	}
}
