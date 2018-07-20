package com.cgs.pro94tek.healthcare.service;

import java.util.List;




import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;

public interface IMySubCategoryDataManagerService {
	
	public boolean deleteSubCategoryByName(String subCategoryId)throws PMSException;
	public List<SubCategoryModal>  fetchSubCategoryByName(String byname)throws PMSException;
	public void createOrUpdateSubCategoryByname(SubCategory  subCategoryEntity)throws PMSException;
	public List<SubCategoryModal> fetchAllSubCategory(SubCategory subCategoryEntity)throws PMSException;
	public boolean updateSubcategory(SubCategoryModal subcategoryModal,String id)throws PMSException;
	 
	
	
	
	
	
	

}
