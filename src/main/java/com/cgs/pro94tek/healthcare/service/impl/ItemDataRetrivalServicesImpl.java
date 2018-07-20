package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemHelper;
import com.cgs.pro94tek.healthcare.helper.PurchageOrderHealper;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.service.IItemDataManagementService;



@Service("itemDataManagementService")
public class ItemDataRetrivalServicesImpl   implements  IItemDataManagementService{
	
	@Autowired
	IItemDAO  itemDAO;
	
	
	@Override
	public ItemModal fetchItemById(String itemId) throws PMSException {
		// TODO Auto-generated method stub
		Item item = itemDAO.fetchItemById(itemId);
		ItemHelper itemHelper = new ItemHelper();
		return itemHelper.createitemModal(item);
	}


	@Override
	public boolean deleteItemById(String itemId) throws PMSException {
		// TODO Auto-generated method stub
		return itemDAO.deleteItemById(itemId);
	}


	@Override
	public void createOrUpdateItem(Item item) throws PMSException {
		// TODO Auto-generated method stub
		System.out.println("hello services.......:"+item.getCategory());
		itemDAO.createOrUpdateItem(item);
	}


	@Override
	public List<ItemModal> fetchAllItems(Item itemEntity) throws PMSException {
		System.out.println("service  for fetching all records..........:"+itemEntity);
		List<Item>  item=itemDAO.fetchAllItems(itemEntity);
		ItemHelper  itemHelper=new ItemHelper();
		// TODO Auto-generated method stub
		return itemHelper.fetchALLItemModal(item);
	}


	@Override
	public List<ItemModal> fetchAllItemsByname(String itemName)
			throws PMSException {
		System.out.println("dao implementation................:");
		
		List<Item> item=itemDAO.fetchAllItemsByname(itemName);
		ItemHelper itemhelper=new ItemHelper();
		return itemhelper.fetchALLItemModal(item);
	
	}
	

}
