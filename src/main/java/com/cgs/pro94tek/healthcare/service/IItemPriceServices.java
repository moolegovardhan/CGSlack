package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemPriceModal;



@Component
public interface IItemPriceServices {
	
	
	public ItemPriceModal getItemPriceById(String itemPriceId) throws PMSException;
}
