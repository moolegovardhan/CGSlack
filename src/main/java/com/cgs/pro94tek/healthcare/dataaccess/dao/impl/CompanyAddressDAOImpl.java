package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CompanyAddress;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICompanyAddressDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("companyAddressDAO")
public class CompanyAddressDAOImpl extends CustomHibernateDaoSupport implements ICompanyAddressDAO{

	 @SuppressWarnings("unchecked")
	@Transactional
	public CompanyAddress getCompanyAddressByName(String companyAddressName) throws DataAccessException {
		CompanyAddress companyaddress = null;
	      String subCompanyAddressequery = "from CompanyAddress where companyaddress= :companyaddress";
	      Query query = getSession().getNamedQuery(subCompanyAddressequery);
	      query.setString("companyaddress", companyAddressName);
	      List<CompanyAddress> companyAddresses = query.list();
	      if (PmsUtil.isCollectionNotEmpty(companyAddresses)) {
	    	  companyaddress = companyAddresses.get(0);
	      }
	      return companyaddress;
	}
	 @SuppressWarnings("unchecked")
	@Transactional
	public List<CompanyAddress> getCompanyAddressByCompanyId(String companyId) throws DataAccessException {
		List<CompanyAddress> companyaddress = new ArrayList<CompanyAddress>();
		String queryCompanyAddressById  = "from CompanyAddress where officeid = :companyaddressId";
		Query query = getSession().createQuery(queryCompanyAddressById);
		query.setParameter("companyaddressId", Long.parseLong(companyId));
		List<CompanyAddress> companyaddresses = query.list();
		if (PmsUtil.isCollectionNotEmpty(companyaddresses)) {
			return companyaddresses;
		}else{
			return companyaddress;
		}
	}

	@Transactional
	public void createOrUpdateCompanyAddress(CompanyAddress companyaddress) throws DataAccessException {
		getSession().saveOrUpdate(companyaddress);
		
	}

	@Transactional
	public boolean deleteCompanyAddressById(String companyId) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public void deleteCompanyAddress(String companyaddress) throws DataAccessException {
		getSession().delete(companyaddress);
		
	}

}
