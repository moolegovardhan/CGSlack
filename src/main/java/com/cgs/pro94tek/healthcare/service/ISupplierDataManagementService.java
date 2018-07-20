package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;

@Component
public interface ISupplierDataManagementService {

	public List<SupplierModal> fetchSupplierById(String supplierId) throws PMSException;

	public SupplierModal fetchSupplierDetails(String supplierId) throws PMSException;

	public Supplier fetchSupplierByName(String supplierName) throws PMSException;

	public void createOrUpdateSupplier(Supplier supplierEntity) throws PMSException;

	public boolean deleteSupplierById(String supplierId) throws PMSException;
	public List<SupplierModal>  fetchAllSupplier(Supplier supplierEntity)throws PMSException;
}
