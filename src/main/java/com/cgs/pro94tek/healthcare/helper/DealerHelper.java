package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.Dealer;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.modal.DealerModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;

public class DealerHelper {
	
	public DealerModal  createDealerModal(Dealer dealer)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		
		
			DealerModal dealer1=new DealerModal();
			dealer1.setId(dealer.getId());
			dealer1.setContactPersonName(dealer.getContactPersonName());
			dealer1.setCreatedby(dealer.getCreatedby());
			dealer1.setCreateddate(dealer.getCreateddate());
			dealer1.setDealerAddress(dealer.getDealerAddress());
			dealer1.setDealerName(dealer.getDealerName());
			dealer1.setEmail(dealer.getEmail());
			dealer1.setMobileNo(dealer.getMobileNo());
			dealer1.setOfficeid(dealer.getOfficeid());
			dealer1.setRegNumber(dealer.getRegNumber());
			dealer1.setStatus(dealer.getStatus());
			dealer1.setTin(dealer.getTin());
			dealer1.setLandLineNo(dealer.getLandLineNo());
			dealer1.setBuildingAddress(dealer.getBuildingAddress());
			
			
		
		return dealer1;
		
	}
	
	public Dealer createDealer(DealerModal dmodal)
	{
		
		
		Dealer dealer=new Dealer();
		
		dealer.setId(dmodal.getId());
		dealer.setCreatedby(dmodal.getCreatedby());
		dealer.setCreateddate(dmodal.getCreateddate());
		dealer.setDealerAddress(dmodal.getDealerAddress());
		dealer.setDealerName(dmodal.getDealerName());
		dealer.setEmail(dmodal.getEmail());
		dealer.setMobileNo(dmodal.getMobileNo());
		dealer.setOfficeid(dmodal.getOfficeid());
		dealer.setRegNumber(dmodal.getRegNumber());
		dealer.setStatus(dmodal.getStatus());
		dealer.setTin(dmodal.getTin());
		dealer.setContactPersonName(dmodal.getContactPersonName());
		dealer.setLandLineNo(dmodal.getLandLineNo());
		dealer.setBuildingAddress(dmodal.getBuildingAddress());
		
		
		return dealer;
		
	}
	public List<DealerModal> getALLdealerModal(List<Dealer> dealerval){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<DealerModal> dealerModal = new ArrayList<DealerModal>();
		for(Dealer dealerobj : dealerval)
		{
			DealerModal DealerModal1 = new DealerModal();

			DealerModal1.setId(dealerobj.getId());
			DealerModal1.setContactPersonName(dealerobj.getContactPersonName());
			DealerModal1.setCreatedby(dealerobj.getCreatedby());
			DealerModal1.setCreateddate(dealerobj.getCreateddate());
			DealerModal1.setDealerAddress(dealerobj.getDealerAddress());
			DealerModal1.setDealerName(dealerobj.getDealerName());
			DealerModal1.setEmail(dealerobj.getEmail());
			DealerModal1.setMobileNo(dealerobj.getMobileNo());
			DealerModal1.setOfficeid(dealerobj.getOfficeid());
			DealerModal1.setRegNumber(dealerobj.getRegNumber());
			DealerModal1.setStatus(dealerobj.getStatus());
			DealerModal1.setTin(dealerobj.getTin());
			DealerModal1.setLandLineNo(dealerobj.getLandLineNo());
			DealerModal1.setBuildingAddress(dealerobj.getBuildingAddress());
			dealerModal.add(DealerModal1);
			
		}
		
			return dealerModal;
	}
	
	public List<Dealer> MultipuleInsertDealer(List<DealerModal> dealervalModal){
		System.out.println("MultipuleInsertDealer<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<Dealer> Dealers = new ArrayList<Dealer>();
		for(DealerModal dealervalModalobje : dealervalModal)
		{
			Dealer dealer1 = new Dealer();

			dealer1.setId(dealervalModalobje.getId());
			dealer1.setContactPersonName(dealervalModalobje.getContactPersonName());
			dealer1.setCreatedby(dealervalModalobje.getCreatedby());
			dealer1.setCreateddate(new Date());
			dealer1.setDealerAddress(dealervalModalobje.getDealerAddress());
			dealer1.setDealerName(dealervalModalobje.getDealerName());
			dealer1.setEmail(dealervalModalobje.getEmail());
			dealer1.setMobileNo(dealervalModalobje.getMobileNo());
			dealer1.setOfficeid(dealervalModalobje.getOfficeid());
			dealer1.setRegNumber(dealervalModalobje.getRegNumber());
			dealer1.setStatus(dealervalModalobje.getStatus());
			dealer1.setTin(dealervalModalobje.getTin());
			dealer1.setLandLineNo(dealervalModalobje.getLandLineNo());
			dealer1.setBuildingAddress(dealervalModalobje.getBuildingAddress());
			Dealers.add(dealer1);
			
		}
		
			return Dealers;
	}

}
