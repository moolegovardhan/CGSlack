package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;



import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemModal;



@Component
public interface IItemDataManagementService {

	public List<ItemModal>  fetchAllItems(Item itemEntity)throws PMSException;
	public ItemModal fetchItemById(String itemId) throws PMSException;
	public boolean deleteItemById(String itemId)throws PMSException;
	public void createOrUpdateItem(Item item)throws PMSException;
	public List<ItemModal> fetchAllItemsByname(String itemName)throws PMSException;
	
}
