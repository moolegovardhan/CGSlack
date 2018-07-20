package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CompanyAddress;


public interface ICompanyAddressDAO {
	
	public CompanyAddress getCompanyAddressByName (String companyAddressName) throws DataAccessException;

	   public List<CompanyAddress> getCompanyAddressByCompanyId (String companyId) throws DataAccessException;
	   public void createOrUpdateCompanyAddress (CompanyAddress companyaddress) throws DataAccessException;
	   public boolean deleteCompanyAddressById(String companyId) throws DataAccessException;
	   public void deleteCompanyAddress (String companyaddress) throws DataAccessException;
	

}
