package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Supplier;


public interface ISupplierDAO {
	

	public Supplier getSupplierByName(String supplierName) throws DataAccessException;
	public List<Supplier> fetchSupplierById(String supplierId)throws DataAccessException;
	//public Tax fetchTaxByID(String taxId)throws DataAccessException;
	public void createOrUpdateSupplier(Supplier supplier)throws DataAccessException;
	public boolean deleteSupplierById(String supplierId) throws DataAccessException;
	public List<Supplier>  fetchAllSupplier(Supplier supplierEntity)throws DataAccessException; 
}
