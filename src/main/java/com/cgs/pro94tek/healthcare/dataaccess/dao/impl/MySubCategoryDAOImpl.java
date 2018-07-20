package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.SchoolDetails;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMyCategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMySubCategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("mysubcategoryDAO")
public class MySubCategoryDAOImpl    extends CustomHibernateDaoSupport  implements IMySubCategoryDAO {

	 @SuppressWarnings ("unchecked")
	 @Transactional
	 public List<SubCategory> fetchSubCategoryByName(String byname)
			throws DataAccessException {
		 List<SubCategory> subCategory=new ArrayList<SubCategory>();
		   String sqlquery="from SubCategory where id = :byname";
		   Query query = getSession().createQuery(sqlquery);
		   /*query.setParameter("status","y");*/
			query.setParameter("byname",Long.parseLong(byname));
			List<SubCategory> subCategorys = query.list();
			if (PmsUtil.isCollectionNotEmpty(subCategorys)) {
				return subCategorys;
			}else{
				return subCategory;
			}

	}

	 @SuppressWarnings ("unchecked")
	 @Transactional

	public void createOrUpdateSubCategoryByname(SubCategory subCategoryEntity)
			throws DataAccessException {
		 System.out.println("data inserted.......:"+subCategoryEntity);
			// TODO Auto-generated method stub
			getSession().saveOrUpdate(subCategoryEntity);
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public boolean deleteSubCategoryByName(String subCategoryId)
			throws DataAccessException {
		 	System.out.println("dao delete........"+subCategoryId);
			// TODO Auto-generated method stub
			String sqlquery="Update SubCategory set status = :status "+" where id = :subCategoryId";
			Query query=getSession().createQuery(sqlquery);
			query.setParameter("subCategoryId",Long.parseLong(subCategoryId));
			query.setParameter("status", "n");
			query.executeUpdate();
			
		return true;
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<SubCategory> fetchAllSubCategory(SubCategory subCategoryEntity)
			throws DataAccessException {
		 List<SubCategory> subcategory=new ArrayList<SubCategory>();
			String sqlquery  = "from SubCategory where status = :status "+" order by id desc ";
			System.out.println("get data by subcategory id............:"+sqlquery);
			Query query = getSession().createQuery(sqlquery);
			query.setParameter("status", "y");
		
			/*query.setParameter("itemId", Long.parseLong(itemId));*/
			List<SubCategory> subcategorys = query.list();
			if (PmsUtil.isCollectionNotEmpty(subcategorys)) {
				return subcategorys;
			}else{
				return subcategory;
		
			}
		 
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public SubCategory fetchById(Long id) throws DataAccessException {
		System.out.println("hellow dao'/\'/\'/\'/\'");
		SubCategory subcat = null;
		String queryById  = "from SubCategory where id = :id";
		System.out.println("jjjj...........:");
		Query query = getSession().createQuery(queryById);
		System.out.println("helper dao");
		query.setParameter("id", id);
		List<SubCategory> subcats = query.list();
		if (PmsUtil.isCollectionNotEmpty(subcats)) {
			subcat = subcats.get(0);
		}
		return subcat;

	}

	@Override
	public SubCategory createOrUpdateSub(SubCategory subCategoryEntity)
			throws DataAccessException {
		if(subCategoryEntity != null){
			getSession().saveOrUpdate(subCategoryEntity);
		}	
	
		return subCategoryEntity;
	}
	
	
}
