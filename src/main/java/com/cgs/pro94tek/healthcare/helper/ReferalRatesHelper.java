package com.cgs.pro94tek.healthcare.helper;


import com.cgs.pro94tek.healthcare.bean.ReferalRates;

import com.cgs.pro94tek.healthcare.modal.ReferalRatesModal;

public class ReferalRatesHelper {
	
	
	public ReferalRatesModal createReferalRatesModal(ReferalRates referalRates){
		/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); */
		ReferalRatesModal referalRatesModal = new ReferalRatesModal();
		referalRatesModal.setId(referalRates.getId());
		

		return referalRatesModal;
	}
	
	public ReferalRates createReferalRatesModal(ReferalRatesModal referalRatesModal){
	
		
		ReferalRates  referalRates=new  ReferalRates();
		referalRates.setId(referalRatesModal.getId());
		return  referalRates;
	}
	}


