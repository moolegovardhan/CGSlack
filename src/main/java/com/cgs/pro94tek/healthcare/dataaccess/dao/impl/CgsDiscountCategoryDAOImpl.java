package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.persister.entity.Queryable;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.CgsDiscountCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsDiscountCategoryDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.CgsDiscountCategoryModal;
import com.cgs.pro94tek.healthcare.modal.CgsSystemDiscountModal;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("cgsDiscoutnCategoryDAO")
public class CgsDiscountCategoryDAOImpl  extends CustomHibernateDaoSupport   implements  ICgsDiscountCategoryDao{

	@Transactional
	public void createDiscountCategory(CgsDiscountCategory discCategory)
			throws DataAccessException {
		System.out.println("dao imple.........:"+discCategory);
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(discCategory);
	}
	@SuppressWarnings ("unchecked")
	@Transactional
	public List<CgsDiscountCategoryModal> getDiscountCat(
			CgsDiscountCategory discCategory) throws DataAccessException {
		// TODO Auto-generated method stub
		List<CgsDiscountCategoryModal> discountCategory=new ArrayList<CgsDiscountCategoryModal>();
		String sqlQuery="from CgsDiscountCategory";
		Query query=getSession().createQuery(sqlQuery);
		List<CgsDiscountCategoryModal> discountCate=query.list();
		if (PmsUtil.isCollectionNotEmpty(discountCate))
		{
			return discountCate;
		} else {
			return discountCategory;

		}
		
	}
	@SuppressWarnings ("unchecked")
	@Transactional
	public CgsDiscountCategory getDiscountCategoryById(Long categoryId)
			throws DataAccessException {
		CgsDiscountCategory category = null;
		   try{ 
		   String queryCategoryById  = "select obj from CgsDiscountCategory obj where obj.sysdsc_id = :categoryId";
		      Query query = getSession().createQuery(queryCategoryById);
		      query.setParameter("categoryId", categoryId);
		      List<CgsDiscountCategory> categories = query.list();
		      if (PmsUtil.isCollectionNotEmpty(categories)) {
		         category = categories.get(0);
		      }
		   }catch(Exception e){
			   e.printStackTrace();
		   }
		      return category;
		}
	

	
}
