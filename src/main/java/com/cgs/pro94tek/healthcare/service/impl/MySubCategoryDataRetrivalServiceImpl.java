package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMySubCategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISchoolDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CategoryHelper;
import com.cgs.pro94tek.healthcare.helper.SubCategoryHelper;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;
import com.cgs.pro94tek.healthcare.service.IMySubCategoryDataManagerService;
import com.cgs.pro94tek.healthcare.service.ISchoolDataRetrivalService;


@Service("mySubCategoryDataManagerService")
public class MySubCategoryDataRetrivalServiceImpl   implements IMySubCategoryDataManagerService
{
	

		@Autowired
		private IMySubCategoryDAO subcategorydao;

		@Override
		public List<SubCategoryModal> fetchSubCategoryByName(String byname) throws PMSException {
			System.out.println("dao implementation................:");
			List<SubCategory> subcategory=subcategorydao.fetchSubCategoryByName(byname);
			SubCategoryHelper subcathelper=new SubCategoryHelper();
			return subcathelper.createCategoryModal(subcategory);
		}

		@Override
		public boolean deleteSubCategoryByName(String subCategoryId)
				throws PMSException {
			// TODO Auto-generated method stub
			return subcategorydao.deleteSubCategoryByName(subCategoryId);
		}

		@Override
		public void createOrUpdateSubCategoryByname(SubCategory subCategoryEntity)
				throws PMSException {
				System.out.println("service implementationi.....----.:");
			// TODO Auto-generated method stub
			subcategorydao.createOrUpdateSubCategoryByname(subCategoryEntity);
		}

		@Override
		public List<SubCategoryModal> fetchAllSubCategory(SubCategory subCategoryEntity) throws PMSException {
			System.out.println("dao implementation................:");
			List<SubCategory> subcategory=subcategorydao.fetchAllSubCategory(subCategoryEntity);
			System.out.println("service imple......:"+subcategory);
			SubCategoryHelper subcathelper=new SubCategoryHelper();
			System.out.println("serviceimpl helper.....:"+subcathelper);
			return subcathelper.createCategoryModal(subcategory);
		}

		@Override
		public boolean updateSubcategory(SubCategoryModal subcategoryModal,String id) throws PMSException {
			try{System.out.println("details.......................:"+id);
				SubCategory subObject = subcategorydao.fetchById(Long.parseLong(id));
				System.out.println("heller service......:"+subObject.getDescription());
				SubCategoryHelper subcathelper=new SubCategoryHelper();
				 SubCategory subCat = subcathelper.updateSubcategory(subcategoryModal);
				 System.out.println("heloservice..............:"+subCat.getSubCategoryName());
				 subcategorydao.createOrUpdateSub(subCat);
				 return true;
				}catch(Exception e)
			{
					 return false;			
				}
				
		}

	

}
