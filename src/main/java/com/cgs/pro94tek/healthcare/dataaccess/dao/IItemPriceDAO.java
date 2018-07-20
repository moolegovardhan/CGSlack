package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.bean.School;


public interface IItemPriceDAO 
{
	
	public ItemPrice getItemPriceById(String itemPriceId)throws DataAccessException;
	
}
