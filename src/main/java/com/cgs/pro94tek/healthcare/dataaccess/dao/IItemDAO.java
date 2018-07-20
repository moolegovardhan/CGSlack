package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;






import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemModal;

public interface IItemDAO 
{	public List<Item>  fetchAllItems(Item itemEntity)throws DataAccessException; 
	public Item fetchItemById(String itemId)throws DataAccessException;
	public boolean deleteItemById(String itemId)throws DataAccessException;
	public void createOrUpdateItem(Item item) throws DataAccessException;
	public List<Item>  fetchAllItemsByname(String itemName)throws PMSException;
	

}
