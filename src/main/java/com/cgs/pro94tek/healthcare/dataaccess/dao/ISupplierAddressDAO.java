package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.SupplierAddress;

public interface ISupplierAddressDAO {
	
	   public SupplierAddress getSupplierAddressByName (String supplierAddressName) throws DataAccessException;
	   public List<SupplierAddress> getSupplierAddressBySupplierId (String supplierId) throws DataAccessException;
	   public void createOrUpdateSupplierAddress (SupplierAddress supplieraddress) throws DataAccessException;
	   public boolean deleteSupplierAddressById(String supplierId) throws DataAccessException;
	   public void deleteSupplierAddress (String supplieraddress) throws DataAccessException;

}
