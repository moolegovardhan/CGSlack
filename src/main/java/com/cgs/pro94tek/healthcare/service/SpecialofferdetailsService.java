package com.cgs.pro94tek.healthcare.service;


import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SpecialofferDetailsModal;

@Component
public interface SpecialofferdetailsService {
	
													
	public SpecialofferDetailsModal getById(String speofferid) throws PMSException;
	/*public SpecialofferDetailsModal getBySpecialofferId(String splofferid) throws PMSException;
	public void createSpecialoffers(SpecialofferDetailsModal  offerentity) throws PMSException;
	public boolean deleteById(String  splofferid) throws PMSException;
*/
}
