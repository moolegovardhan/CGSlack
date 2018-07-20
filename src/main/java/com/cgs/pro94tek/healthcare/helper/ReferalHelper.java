package com.cgs.pro94tek.healthcare.helper;

import java.text.ParseException;

import com.cgs.pro94tek.healthcare.bean.HealthReferal;

import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.HealthReferalModal;


public class ReferalHelper {
	
	public HealthReferalModal  createReferalModal(HealthReferal referal){
		/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); */
		HealthReferalModal referalModal = new HealthReferalModal();
		referalModal.setAddress(referal.getAddress());
		referalModal.setId(referal.getId());
		referalModal.setCreatedby(referal.getCreatedby());
		referalModal.setOfficeid(referal.getOfficeid());
		referalModal.setReferalname(referal.getReferalname());
		referalModal.setReferaltype(referal.getReferaltype());
		
		return referalModal;
	}

	public HealthReferal  createReferal(HealthReferalModal referalModal) throws PMSException, ParseException{
		/*DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); */
		HealthReferal referal = new HealthReferal();
		referal.setAddress(referalModal.getAddress());
		referal.setAddress(referalModal.getAddress());
		referal.setId(referalModal.getId());
		referal.setCreatedby(referalModal.getCreatedby());
		referal.setOfficeid(referalModal.getOfficeid());
		referal.setReferalname(referalModal.getReferalname());
		referal.setReferaltype(referalModal.getReferaltype());
		
		
		return referal;
		
}
}
