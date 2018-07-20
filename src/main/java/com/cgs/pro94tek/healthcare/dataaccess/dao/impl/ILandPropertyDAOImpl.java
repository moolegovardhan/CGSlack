package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.LandProperty;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IPropertyDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;



@Repository("ipropetyDAO")
public class ILandPropertyDAOImpl extends CustomHibernateDaoSupport implements IPropertyDAO  {

	@SuppressWarnings("unchecked")
	@Transactional
	public LandProperty fetchLandPropertyById(String propertyid)
			throws DataAccessException {
		LandProperty propety = null;
		String querysql  = "from LandProperty where id = :propertyid";
		System.out.println("get data by propertyid id............:"+querysql);
		Query query = getSession().createQuery(querysql);
		query.setParameter("propertyid", Long.parseLong(propertyid));
		List<LandProperty> propetys = query.list();
		if (PmsUtil.isCollectionNotEmpty(propetys)) {
			propety = propetys.get(0);
		}
		return propety;

}
	
	@Transactional
	public boolean deletelandPrortyById(String propertyid)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("delete landpropety...........:"+propertyid);
		String querysql = " Delete from LandProperty where id = :propertyid";
		//Query query = getSession().delete(querySchoolId);
		Query query = getSession().createQuery(querysql);
		query.setParameter("propertyid", Long.parseLong(propertyid));
		query.executeUpdate();
		/*List<School> schoolIds = query.list();
		if (PmsUtil.isCollectionNotEmpty(schoolIds)) {
			school = schoolIds.get(0);
		}*/
	
		
		return true;
	}


	@Transactional
	public void createOrUpdateLandProperty(LandProperty landPropertyEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(landPropertyEntity);
	}

	


	





	

	

}
