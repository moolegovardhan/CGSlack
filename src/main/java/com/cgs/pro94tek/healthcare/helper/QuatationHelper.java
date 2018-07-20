package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.QuatationData;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.modal.ItemPriceModal;
import com.cgs.pro94tek.healthcare.modal.QuatationModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;

public class QuatationHelper {
	
	
	
	
	
	

	public List<QuatationModal> createAllQuatation(List<QuatationData> quatation){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<QuatationModal> quatationModals = new ArrayList<QuatationModal>();
		for(QuatationData quatationObje : quatation)
		{
			QuatationModal quatationModalq = new QuatationModal();

			
			quatationModalq.setPurchaseorderid(quatationObje.getPurchaseorderid());
			//quatationModalq.setCost(quatationObje.getCost());
			quatationModalq.setCreatedby(quatationObje.getCreatedby());
			quatationModalq.setId(quatationObje.getId());
			quatationModalq.setMedicinename(quatationObje.getMedicinename());
			quatationModalq.setOfficeid(quatationObje.getOfficeid());
			//quatationModalq.setPodeliverydate(quatationObje.getPodeliverydate());
			quatationModalq.setQuantity(quatationObje.getQuantity());
			quatationModalq.setQuotationdeliverydate(quatationObje.getQuotationdeliverydate());
			quatationModalq.setQuotationnumber(quatationObje.getQuotationnumber());
			//quatationModalq.setStatus(quatationObje.getStatus());
			quatationModalq.setSuppliername(quatationObje.getSuppliername());
			quatationModalq.setTotalamount(quatationObje.getTotalamount());
			//quatationModalq.setUnitprice(quatationObje.getUnitprice());
			quatationModals.add(quatationModalq);
		}
		return quatationModals;
	}
	public QuatationData createQuatation(QuatationModal quatationModal )
	{
		QuatationData quatation=new QuatationData();
		
		quatation.setPurchaseorderid(quatationModal.getPurchaseorderid());
		quatation.setCost(quatationModal.getCost());
		quatation.setCreatedby(quatationModal.getCreatedby());
		quatation.setCreateddate(quatationModal.getCreateddate());
		quatation.setId(quatationModal.getId());
		quatation.setMedicinename(quatationModal.getMedicinename());
		quatation.setOfficeid(quatationModal.getOfficeid());
		quatation.setPodeliverydate(quatationModal.getPodeliverydate());
		quatation.setQuantity(quatationModal.getQuantity());
		quatation.setQuotationdeliverydate(quatationModal.getQuotationdeliverydate());
		quatation.setQuotationnumber(quatationModal.getQuotationnumber());
		quatation.setStatus(quatationModal.getStatus());
		quatation.setSuppliername(quatationModal.getSuppliername());
		quatation.setTotalamount(quatationModal.getTotalamount());
		quatation.setUnitprice(quatationModal.getUnitprice());
		return  quatation;
	}
	
	
	public QuatationModal createQuatation(QuatationData quatationData )
	{
		
		
		QuatationModal quatationModal=new QuatationModal();
		
		quatationModal.setPurchaseorderid(quatationData.getPurchaseorderid());
		//quatationModal.setCost(quatationData.getCost());
		quatationModal.setCreatedby(quatationData.getCreatedby());
		//quatationModal.setId(quatationData.getId());
		quatationModal.setMedicinename(quatationData.getMedicinename());
		quatationModal.setOfficeid(quatationData.getOfficeid());
		//quatationModal.setPodeliverydate(quatationData.getPodeliverydate());
		quatationModal.setQuantity(quatationData.getQuantity());
		quatationModal.setQuotationdeliverydate(quatationData.getQuotationdeliverydate());
		//quatationModal.setQuotationnumber(quatationData.getQuotationnumber());
		//quatationModal.setStatus(quatationData.getStatus());
		quatationModal.setSuppliername(quatationData.getSuppliername());
		quatationModal.setTotalamount(quatationData.getTotalamount());
		//quatationModal.setUnitprice(quatationData.getUnitprice());
		
	
		
		return  quatationModal;
	}

	public List<QuatationData> createAllQuatationDataList(List<QuatationModal> quatationModal){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<QuatationData> quatationDatas = new ArrayList<QuatationData>();
		for(QuatationModal quatationDataObj : quatationModal)
		{
			System.out.println("enter the value");
			QuatationData quatationData1 = new QuatationData();
			
			
			quatationData1.setPurchaseorderid(quatationDataObj.getPurchaseorderid());
			//quatationData1.setCost(quatationDataObj.getCost());
			quatationData1.setCreatedby(quatationDataObj.getCreatedby());
			quatationData1.setSuppliername(quatationDataObj.getSuppliername());
			//quatationData1.setId(quatationDataObj.getId());
			quatationData1.setMedicinename(quatationDataObj.getMedicinename());
			quatationData1.setOfficeid(quatationDataObj.getOfficeid());
			//quatationData1.setPodeliverydate(quatationDataObj.getPodeliverydate());
			quatationData1.setQuantity(quatationDataObj.getQuantity());
			quatationData1.setQuotationdeliverydate(quatationDataObj.getQuotationdeliverydate());
			quatationData1.setQuotationnumber(quatationDataObj.getQuotationnumber());
			//quatationData1.setStatus(quatationDataObj.getStatus());
			//quatationModal.set
			quatationData1.setTotalamount(quatationDataObj.getTotalamount());
			//quatationData1.setUnitprice(quatationDataObj.getUnitprice());
			quatationDatas.add(quatationData1);
		}		
		return quatationDatas;
	}
}
