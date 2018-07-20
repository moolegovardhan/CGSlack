package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.SubcategoryDemo;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISubcategoryDemoDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("mysubcategorydemoDAO")
public class SubcategoryDemoDAOImpl  extends CustomHibernateDaoSupport  implements ISubcategoryDemoDAO {

	@Transactional
	public List<SubcategoryDemo> fetchSubCategoryByName(String catId)
			throws DataAccessException {
		System.out.println("dfsdfg//////////////////------------"+catId);
		 List<SubcategoryDemo> subCategory=new ArrayList<SubcategoryDemo>();
		   String sqlquery="from SubcategoryDemo where cateId = :catId";
		   Query query = getSession().createQuery(sqlquery);
			query.setParameter("catId",Long.parseLong(catId));
			List<SubcategoryDemo> subCategorys = query.list();
			if (PmsUtil.isCollectionNotEmpty(subCategorys)) {
				return subCategorys;
			}else{
				return subCategory;
			}

	}
	
	
	

}
