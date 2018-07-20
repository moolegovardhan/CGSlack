package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.persistence.Temporal;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgs.pro94tek.healthcare.bean.CgsHomeService;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsHomeServiceDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("cgsHomeServiceDAO")
public class CgsHomeSeviceDAOImple  extends CustomHibernateDaoSupport implements ICgsHomeServiceDao{


@Override
public List<CgsHomeService> createOrUpdateCgsHome(
		List<CgsHomeService> cgsHomeEntity) throws DataAccessException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<CgsHomeService> fetchAllCgsHomeByname(String hsModalName)
		throws PMSException {
	// TODO Auto-generated method stub
	return null;
}

@SuppressWarnings ("unchecked")
@Transactional
public void createCGSHome(CgsHomeService homeEnitity)
		throws DataAccessException {
	getSession().saveOrUpdate(homeEnitity);
}

@Transactional
public CgsHomeService fetchByfileNO(String fileId) throws DataAccessException {
	// TODO Auto-generated method stub
	CgsHomeService homeservice=new CgsHomeService();
	String querySchoolById  = "from CgsHomeService where id = :fileId";
	System.out.println("get data by school id............:"+querySchoolById);
	Query query = getSession().createQuery(querySchoolById);
	query.setParameter("fileId", Long.parseLong(fileId));
	List<CgsHomeService> homeServices = query.list();
	if (PmsUtil.isCollectionNotEmpty(homeServices))
	{
		homeservice = homeServices.get(0);
	}
	return homeservice;
}
}
