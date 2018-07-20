package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.SpecialOfferDetails;


public interface SpecialofferdetailsDAO {
	
	public SpecialOfferDetails getById(String speofferid)throws DataAccessException;
	/*public SpecialOfferDetails getBySpecialofferId(String splofferid)throws DataAccessException;
	public void createSpecialoffers(SpecialofferDetailsModal  offerentity)throws DataAccessException;
	public boolean deleteById(String  splofferid)throws DataAccessException;
	*/

}
