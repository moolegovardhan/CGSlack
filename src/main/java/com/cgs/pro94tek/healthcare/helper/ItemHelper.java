package com.cgs.pro94tek.healthcare.helper;


import java.text.DateFormat;
import java.text.ParseException;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICategoryDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IMySubCategoryDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemModal;



@Service("itemHelper")
public class ItemHelper  {
	
	@Autowired
	IMySubCategoryDAO subCategoryDAO;
	
	@Autowired
	ICategoryDAO categoryDAO;
	
	public List<ItemModal> fetchALLItemModal(List<Item> item)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ItemModal> itemModals = new ArrayList<ItemModal>();
		for(Item itemObject : item)
		{
			ItemModal itemModal1 = new ItemModal();
		
			itemModal1.setId(itemObject.getId());
			itemModal1.setItemname(itemObject.getItemname());
			itemModal1.setCategoryid(itemObject.getCategory().getId());
			itemModal1.setCatName(itemObject.getCategory().getCategoryName());
			itemModal1.setSubcateName(itemObject.getSubcategory().getSubCategoryName());
			itemModal1.setCreatedby(itemObject.getCreatedby());
			itemModal1.setCreateddate(itemObject.getCreateddate());
			itemModal1.setItemdescription(itemObject.getItemdescription());
			itemModal1.setItemtype(itemObject.getItemtype());
			itemModal1.setItemprice(itemObject.getItemprice());
			itemModal1.setItemquantity(itemObject.getItemquantity());
		/*	itemModal1.setItemquantity(itemObject.getItemquantity());
			itemModal1.setItemthreshold(itemObject.getItemthreshold());
			itemModal1.setItemtype(itemObject.getItemtype());
			itemModal1.setOfficeid(itemObject.getOfficeid());*/
			itemModal1.setPhoto(itemObject.getPhoto());
			itemModal1.setStatus(itemObject.getStatus());
			/*itemModal1.setSubcategoryid(itemObject.getSubcategoryid());*/
			itemModal1.setThumbnail(itemObject.getThumbnail());
			itemModal1.setItemprice(itemObject.getItemprice());
			/*itemModal1.set(itemObject.getCategory().getCategoryName());*/
			itemModals.add(itemModal1);
		}
		return itemModals;
		}	
	
	public ItemModal createitemModal(Item item)throws NullPointerException
	{
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		ItemModal itemModal = new ItemModal();
		itemModal.setId(item.getId());
		itemModal.setItemname(item.getItemname());
		//itemModal.setCategoryid(item.getCategoryid());
		/*itemModal.setSubcategoryid(item.getSubcategoryid());*/
		itemModal.setItemdescription(item.getItemdescription());
		itemModal.setItemtype(item.getItemtype());
		itemModal.setStatus(item.getStatus());
		Long subid=itemModal.getSubcategoryid();
		//item.setCreateddate(df.format(itemModal.getCreateddate()));
		try{
		SubCategory subCategory=subCategoryDAO.fetchById(subid);
		item.setSubcategory(subCategory);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Long catid=itemModal.getCategoryid();
		try{
			Category catObje=categoryDAO.getCategoryById(catid.toString());
			item.setCategory(catObje);
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		return itemModal;
	}

	public Item createItem(ItemModal  itemModal) throws PMSException, ParseException ,NullPointerException{
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("item catgoryHelper................:"+itemModal.getCategoryid()+"____________"+itemModal.getSubcategoryid());
		Item item = new Item();
		item.setId(itemModal.getId());
		item.setItemname(itemModal.getItemname());
		item.setItemdescription(itemModal.getItemdescription());
		item.setItemtype(itemModal.getItemtype());
		item.setItemprice(itemModal.getItemprice());
		item.setCreateddate(itemModal.getCreateddate());
		item.setCreatedby(itemModal.getCreatedby());
		item.setOfficeId(itemModal.getOfficeid());
		item.setStatus("y");
		item.setItemquantity(itemModal.getItemquantity());
		Long catid=itemModal.getCategoryid();
		try{
			System.out.println("category catid....:"+categoryDAO);
			System.out.println("subcategorydao....:"+subCategoryDAO);
			Category catObje=categoryDAO.getCategoryById(catid.toString());
			System.out.println("category....:"+catObje.getCategoryName());
			item.setCategory(catObje);
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		
		
		Long subid=itemModal.getSubcategoryid();
		
		try{
			System.out.println(subid);
		SubCategory subCategory=subCategoryDAO.fetchById(subid);
		System.out.println("sub.....:"+subCategory.getCategory().getId());
		item.setSubcategory(subCategory);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return item;
	}
	
	
}
