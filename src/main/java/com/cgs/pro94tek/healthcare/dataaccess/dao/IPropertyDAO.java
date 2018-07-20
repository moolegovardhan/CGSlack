package com.cgs.pro94tek.healthcare.dataaccess.dao;



import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.LandProperty;

public interface IPropertyDAO {
	
	
	public LandProperty fetchLandPropertyById(String propertyid)throws DataAccessException;
	public boolean deletelandPrortyById(String propertyid)throws DataAccessException;
	public void createOrUpdateLandProperty(LandProperty landPropertyEntity) throws DataAccessException;

}
