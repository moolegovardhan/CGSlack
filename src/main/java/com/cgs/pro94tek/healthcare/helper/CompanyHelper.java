package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.Company;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CompanyModal;

public class CompanyHelper {
	
	public List<CompanyModal> createcompanyModal(List<Company> company){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		
		List<CompanyModal> companyModals = new ArrayList<CompanyModal>();
		for(Company companyobj : company){
			CompanyModal companymodal1 = new CompanyModal();
			companymodal1.setCompanyName(companyobj.getCompanyName());
			companymodal1.setDateOfIncorporation(df.format(companyobj.getDateOfIncorporation()));
			companymodal1.setLogo(companyobj.getLogo());
			companymodal1.setMobileNo(companyobj.getMobileNo());
			companymodal1.setLandlineNo(companyobj.getLandlineNo());
			companymodal1.setEmail(companyobj.getEmail());
			companymodal1.setCreatedDate(df.format(companyobj.getCreatedDate()));
			companymodal1.setCreatedBy(companyobj.getCreatedBy());
			companymodal1.setOfficeId(companyobj.getOfficeId());
			companymodal1.setStatus(companyobj.getStatus());
			companymodal1.setIsDealer(companyobj.getIsDealer());
			companymodal1.setIsRetailer(companyobj.getIsRetailer());
			companymodal1.setSetupdate(df.format(companyobj.getSetupdate()));
			companymodal1.setId(companyobj.getId());
			companyModals.add(companymodal1);
		}
		


		return companyModals;
	}


	public Company createCompany(CompanyModal companyModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Company company = new Company();
		company.setCompanyName(companyModal.getCompanyName());
		/*company.setSignatureInNameOf(companyModal.getSignatureInNameOf());
		company.setDateOfIncorporation(new Date());
		company.setLogo(companyModal.getLogo());
		company.setMobileNo(companyModal.getMobileNo());
		company.setLandlineNo(companyModal.getLandlineNo());
		company.setEmail(companyModal.getEmail());
		company.setCreatedDate(new Date());
		company.setCreatedBy(companyModal.getCreatedBy());
		company.setOfficeId(companyModal.getOfficeId());
		company.setStatus(companyModal.getStatus());
		company.setIsDealer(companyModal.getIsDealer());
		company.setIsRetailer(companyModal.getIsRetailer());
		company.setSetupdate(new Date());*/
		company.setSignatureInNameOf(companyModal.getSignatureInNameOf());
		company.setEmail(companyModal.getEmail());
		company.setComapnyState2(companyModal.getComapnyState2());
		company.setCompany2PinNo(companyModal.getCompany2PinNo());
		company.setCompanyAddress1(companyModal.getCompanyAddress1());
		company.setCompanyAddress2(companyModal.getCompanyAddress2());
		company.setCompanyCity(companyModal.getCompanyCity());
		company.setCompanyCity2(companyModal.getCompanyCity2());
		company.setCompanyDistrict(companyModal.getCompanyDistrict());
		company.setCompanyDistrict2(companyModal.getCompanyDistrict2());
		company.setCompanyState1(companyModal.getCompanyState1());
		company.setId(companyModal.getId());
		company.setCompanyPinNo(companyModal.getCompanyPinNo());
		company.setIsDealer(companyModal.getIsDealer());
		company.setIsRetailer(companyModal.getIsRetailer());
		company.setOfficeId(companyModal.getOfficeId());
		company.setSetupdate(new Date());
		company.setCreatedDate(new Date());
		company.setMobileNo(companyModal.getMobileNo());
		company.setLandlineNo(companyModal.getLandlineNo());
		company.setMailAddress(companyModal.getMailAddress());
		company.setMailAddress2(companyModal.getMailAddress2());
		company.setCreatedBy(companyModal.getCreatedBy());
		
		return company;
	}


}
