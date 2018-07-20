package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.CgsStockMaster;
import com.cgs.pro94tek.healthcare.modal.CgsStockMasterModal;



public class CgsStockMasterHelper {
	
	public List<CgsStockMaster> createNestedCgsStockMaster(List<CgsStockMasterModal> cgsStockMasterModal, Integer totalAmount)throws NullPointerException
		 	{
		 		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		 		System.out.println("helper.............:");
		 		List<CgsStockMaster> cgsStockMaster = new ArrayList<CgsStockMaster>();
		 		for(CgsStockMasterModal stockMasterModal : cgsStockMasterModal)
		 		{
		 			CgsStockMaster cgsStockMasterobj = new CgsStockMaster();
		 		
		 			cgsStockMasterobj.setId(stockMasterModal.getId());
		 			cgsStockMasterobj.setStockId("1");
		 			cgsStockMasterobj.setSelId(stockMasterModal.getSelId());
		 			cgsStockMasterobj.setSelPrice(stockMasterModal.getSelPrice());
		 			cgsStockMasterobj.setSelQuantity(stockMasterModal.getSelQuantity());
		 			cgsStockMasterobj.setTotalAmount(totalAmount);
		 			cgsStockMaster.add(cgsStockMasterobj);

		 		}return  cgsStockMaster;
	}
}
