package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.SupplierAddress;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SupplierAddressModal;

public class SupplierAddressHelper {
	
	public List<SupplierAddressModal> createsupplerModal(List<SupplierAddress> supplieraddress){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<SupplierAddressModal> SupplierAddressModals = new ArrayList<SupplierAddressModal>();
		for (SupplierAddress supplieraddressobj : supplieraddress) {
			SupplierAddressModal supplieraddressmodal1 = new SupplierAddressModal();
			supplieraddressmodal1.setMailingaddress(supplieraddressobj.getMailingaddress());
			supplieraddressmodal1.setBillingaddress(supplieraddressobj.getBillingaddress());
			supplieraddressmodal1.setDealereaddress(supplieraddressobj.getDealereaddress());
			supplieraddressmodal1.setStatus(supplieraddressobj.getStatus());
			supplieraddressmodal1.setCreatedDate(df.format(supplieraddressobj.getCreatedDate()));
			supplieraddressmodal1.setCreatedBy(supplieraddressobj.getCreatedBy());
			supplieraddressmodal1.setAddressid(supplieraddressobj.getAddressid());
			SupplierAddressModals.add(supplieraddressmodal1);
		}
		


		return SupplierAddressModals;
	}

	
	public SupplierAddress createSupplierAddress(SupplierAddressModal supplieraddressModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		SupplierAddress supplieraddress = new SupplierAddress();
		supplieraddress.setMailingaddress(supplieraddressModal.getMailingaddress());
		supplieraddress.setBillingaddress((supplieraddressModal.getBillingaddress()));
		supplieraddress.setDealereaddress(supplieraddressModal.getDealereaddress());
		supplieraddress.setStatus(supplieraddressModal.getStatus());
		supplieraddress.setCreatedBy(supplieraddressModal.getCreatedBy());
		supplieraddress.setCreatedDate(new Date());
		supplieraddress.setAddressid(supplieraddressModal.getAddressid());
		
		return supplieraddress;
	}
	
	
	

}
