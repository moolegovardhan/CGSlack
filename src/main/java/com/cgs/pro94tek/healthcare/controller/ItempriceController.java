package com.cgs.pro94tek.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ItemPriceModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.healthcare.service.IItemPriceServices;
import com.cgs.pro94tek.healthcare.service.ISchoolDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;



@Controller
public class ItempriceController {
	
	

		@Autowired 
		IItemPriceServices      itemPriceServices  ;

		private static final Logger logger = LoggerFactory.getLogger(ItempriceController.class);
		CommonUtils commonUtils = new CommonUtils();
		InventoryRequestResponse response = new InventoryRequestResponse();
		InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
		


		@RequestMapping(value = InventoryURIConstant.GET_ITEMPRICE_DETAILS, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchItemPriceById(@PathVariable("itemPriceId") String itemPriceId){

			logger.info("itemPrice detaials itemPriceId . : "+itemPriceId);
			
			ItemPriceModal itemPriceModal = new ItemPriceModal();
			ItemPrice  itemPrice=new ItemPrice();

			try {
				itemPriceModal = itemPriceServices.getItemPriceById(itemPriceId);
				response = commonUtils.createResponseData(itemPriceModal.getSalesprice(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", itemPriceModal);

			} catch (PMSException e) {
				// TODO Auto-generated catch block
				logger.error(" In message Error"+e.getMessage());
				logger.error(" In cause Error"+e.getCause());

				e.printStackTrace();
				response = commonUtils.createResponseData(itemPriceModal.getSalesprice(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}

			return response;
		}
		}
