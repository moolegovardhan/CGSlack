package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.SupplierAddress;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplierAddressDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("supplierAddressDAO")
public class SupplierAddressDAOImpl extends CustomHibernateDaoSupport implements ISupplierAddressDAO{
	
	@SuppressWarnings("unchecked")
	@Transactional
	public SupplierAddress getSupplierAddressByName(String supplierAddressName) throws DataAccessException {
		SupplierAddress supplieraddress = null;
	      String subSupplierAddressequery = "from SupplierAddress where supplieraddress= :supplieraddress";
	      Query query = getSession().getNamedQuery(subSupplierAddressequery);
	      query.setString("supplieraddress", supplierAddressName);
	     
		List<SupplierAddress> supplierAddresses = query.list();
	      if (PmsUtil.isCollectionNotEmpty(supplierAddresses)) {
	    	  supplieraddress = supplierAddresses.get(0);
	      }
	      return supplieraddress;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<SupplierAddress> getSupplierAddressBySupplierId(String supplierId) throws DataAccessException {
		 List<SupplierAddress> supplieraddress = new ArrayList<SupplierAddress>();
			String querySupplierAddressById  = "from SupplierAddress where officeid = :supplieraddressId";
			Query query = getSession().createQuery(querySupplierAddressById);
			query.setParameter("supplieraddressId", Long.parseLong(supplierId));
			List<SupplierAddress> supplieraddresses = query.list();
			if (PmsUtil.isCollectionNotEmpty(supplieraddresses)) {
				return supplieraddresses;
			}else{
				return supplieraddress;
			}
	}

	@Transactional
	public void createOrUpdateSupplierAddress(SupplierAddress supplieraddress) throws DataAccessException {
		getSession().saveOrUpdate(supplieraddress);	
	}

		@Transactional
	public boolean deleteSupplierAddressById(String supplierId) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

		@Transactional
	public void deleteSupplierAddress(String supplieraddress) throws DataAccessException {
		getSession().delete(supplieraddress);
		
	}

}
