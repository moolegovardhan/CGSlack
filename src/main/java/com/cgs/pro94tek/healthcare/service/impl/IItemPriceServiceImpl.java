package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemPriceDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.impl.ItemDAOImpl;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ItemPriceHelper;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.modal.ItemPriceModal;
import com.cgs.pro94tek.healthcare.service.IItemPriceServices;

@Service("itemPriceServiceImpl")
public class IItemPriceServiceImpl  implements IItemPriceServices {
	
	
	@Autowired
	private IItemPriceDAO itemPriceDAO;
	@Override
	public ItemPriceModal getItemPriceById(String itemPriceId)
			throws PMSException {
		ItemPrice  itemPrice=itemPriceDAO.getItemPriceById(itemPriceId);
		ItemPriceHelper itemPriceHelper=new ItemPriceHelper();
		
		// TODO Auto-generated method stub
		return itemPriceHelper.createirempriceModal(itemPrice);
	}
	

	
}
		

