package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cgs.pro94tek.healthcare.bean.SubcategoryDemo;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISubcategoryDemoDAO;
import com.cgs.pro94tek.healthcare.helper.SubCategoryDemoHelper;
import com.cgs.pro94tek.healthcare.modal.SubcategorydemoModal;
import com.cgs.pro94tek.healthcare.service.ISubcategoryDemoDataService;

@Service("subcategoryDemoDataService")
public class SubcategorydemoDataRetrivalServiceImpl  implements ISubcategoryDemoDataService {
	
	@Autowired
	private ISubcategoryDemoDAO  subcateDao;
	
	@Override
	public List<SubcategorydemoModal> fetchSubCatedemoAllByName(String catId){
	System.out.println("dao implementation................:");
	List<SubcategoryDemo> subcategory=subcateDao.fetchSubCategoryByName(catId);
	SubCategoryDemoHelper subcathelper=new SubCategoryDemoHelper();
	return subcathelper.createCategorydemoModal(subcategory);
	}
	
	

}
