package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.loader.custom.Return;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMyCategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;
import com.mysql.jdbc.log.Log;


@Repository("mycategoryDAO")
public class MyCategoryDAOImpl extends CustomHibernateDaoSupport  implements IMyCategoryDAO{

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<Category> fetchCategoryByName(String categoryName)
			throws DataAccessException {
		 List<Category> category=new ArrayList<Category>();
		   String sqlquery="from Category where categoryName = :categoryName";
		   Query query = getSession().createQuery(sqlquery);
			query.setParameter("categoryName", (categoryName));
			List<Category> categorys = query.list();
			if (PmsUtil.isCollectionNotEmpty(categorys)) {
				return categorys;
			}else{
				return category;
			}
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public boolean deleteCategoryByName(String categoryId)
			throws DataAccessException {
		 System.out.println("dao delete........"+categoryId);
		// TODO Auto-generated method stub
		String sqlquery="Update Category set status = :status "+" where id = :categoryId";
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("categoryId",Long.parseLong(categoryId));
		query.setParameter("status", "n");
		query.executeUpdate();
		
		return true;
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public void createOrUpdateCategory(Category categoryEntity)
			throws DataAccessException {
		 System.out.println("data inserted.......:"+categoryEntity);
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(categoryEntity);
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<Category> fetchAllCategory(Category categoryEntity)
			throws DataAccessException {
		 List<Category> category=new ArrayList<Category>();
		String sqlquery  = "from Category  ";
		System.out.println("get data by itemId id............:"+sqlquery);
		Query query = getSession().createQuery(sqlquery);
		//query.setParameter("status", "y");
		//query.setParameter("itemId", Long.parseLong(itemId));
		List<Category> categorys = query.list();
		if (PmsUtil.isCollectionNotEmpty(categorys)) {
			return categorys;
		}else{
			return category;
	
		}
	 
}
}		 
  

