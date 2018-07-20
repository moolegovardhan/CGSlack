package com.cgs.pro94tek.healthcare.helper;



import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.SpecialOfferDetails;
import com.cgs.pro94tek.healthcare.modal.SpecialofferDetailsModal;

public class SpecialofferdetailsHelper {
	
	
	
	public SpecialofferDetailsModal createSpecialofferBYModal(SpecialOfferDetails  soffer)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		SpecialofferDetailsModal  offerdetails=new SpecialofferDetailsModal();
		
		offerdetails.setId(soffer.getId());
		
		
		return offerdetails;
	}
	
	
	public SpecialOfferDetails  createByEntity(SpecialofferDetailsModal   specialModal)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		SpecialOfferDetails     specialdetails=new SpecialOfferDetails();
		specialdetails.setId(specialModal.getId());
		/*specialdetails.setStatus(specialModal.getStatus());
		specialdetails.setSplofferid(specialModal.getSplofferid());
		specialdetails.setCreateddate(specialModal.getCreateddate());
		specialdetails.setCreatedby(specialModal.getCreatedby());
		specialdetails.setOfferonid(specialModal.getOfferonid());
		
		*/
		
		
		return specialdetails;
	}

}
