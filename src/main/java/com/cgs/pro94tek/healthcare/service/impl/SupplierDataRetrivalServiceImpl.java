package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Charge;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplierDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ChargeHelper;
import com.cgs.pro94tek.healthcare.helper.SupplierHelper;
import com.cgs.pro94tek.healthcare.modal.ChargeModal;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;
import com.cgs.pro94tek.healthcare.service.ISupplierDataManagementService;

@Service("supplierDataManagementService")
public class SupplierDataRetrivalServiceImpl implements ISupplierDataManagementService {

	@Autowired
	private	ISupplierDAO supplierdao;

	@Override
	public List<SupplierModal> fetchSupplierById(String supplierId) throws PMSException {
		List<Supplier> supplier = supplierdao.fetchSupplierById(supplierId);
		SupplierHelper supplierhelper = new SupplierHelper();
		// convert tax object to company modal
		return supplierhelper.createsupplierModal(supplier);
		
	}

	@Override
	public SupplierModal fetchSupplierDetails(String supplierId) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier fetchSupplierByName(String supplierName) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrUpdateSupplier(Supplier supplierEntity) throws PMSException {
		supplierdao.createOrUpdateSupplier(supplierEntity);
		
	}

	@Override
	public boolean deleteSupplierById(String supplierId) throws PMSException {
		return supplierdao.deleteSupplierById(supplierId);
	}

	@Override
	public List<SupplierModal> fetchAllSupplier(Supplier supplierEntity)
			throws PMSException {
		List<Supplier> suppliarObject=supplierdao.fetchAllSupplier(supplierEntity);
		SupplierHelper supplierHelper=new SupplierHelper();
		return supplierHelper.createsupplierModal(suppliarObject);
	}
}
