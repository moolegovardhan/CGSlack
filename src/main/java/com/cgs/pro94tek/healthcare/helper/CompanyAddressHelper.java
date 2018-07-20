package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.CompanyAddress;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CompanyAddressModal;

public class CompanyAddressHelper {
	
	public List<CompanyAddressModal> createsupplierModal(List<CompanyAddress> companyaddress){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<CompanyAddressModal> CompanyAddressModals = new ArrayList<CompanyAddressModal>();
		for (CompanyAddress companyaddressobj : companyaddress) {
			CompanyAddressModal companyaddressmodal1 = new CompanyAddressModal();
			companyaddressmodal1.setMailingaddress(companyaddressobj.getMailingaddress());
			companyaddressmodal1.setBillingaddress(companyaddressobj.getBillingaddress());
			companyaddressmodal1.setCorporateaddress(companyaddressobj.getCorporateaddress());
			companyaddressmodal1.setCreatedBy(companyaddressobj.getCreatedBy());
			companyaddressmodal1.setCreatedDate(df.format(companyaddressobj.getCreatedDate()));
			companyaddressmodal1.setAddressid(companyaddressobj.getAddressid());
			CompanyAddressModals.add(companyaddressmodal1);
		}
		


		return CompanyAddressModals;
	}

	
	public CompanyAddress createCompanyAddress(CompanyAddressModal companyaddressModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		CompanyAddress companyaddress = new CompanyAddress();
		companyaddress.setMailingaddress(companyaddressModal.getMailingaddress());
		companyaddress.setCorporateaddress(companyaddressModal.getCorporateaddress());
		companyaddress.setBillingaddress(companyaddressModal.getBillingaddress());
		companyaddress.setCreatedBy(companyaddressModal.getCreatedBy());
		companyaddress.setCreatedDate(new Date());
		companyaddress.setAddressid(companyaddressModal.getAddressid());
		
		return companyaddress;
	}
	
	
	
	
}
