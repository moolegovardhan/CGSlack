package com.cgs.pro94tek.healthcare.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.CgsStockMaster;
import com.cgs.pro94tek.healthcare.dataaccess.manager.AgentQuationOrderContext;
import com.cgs.pro94tek.healthcare.dataaccess.manager.CgsStcokMasterContext;
import com.cgs.pro94tek.healthcare.helper.CgsStockMasterHelper;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.CgsStockMasterModal;
import com.cgs.pro94tek.healthcare.service.ICgsStockMasterDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class CgssStockMasterController {
	
	
	@Autowired
	ICgsStockMasterDataRetrivalService cgsMasterService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(CgssStockMasterController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.CREATE_CGS_STOCK_MASTER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createCgsStockerMaster(@RequestBody CgsStcokMasterContext masterContext) {
		try {
			System.out.println("Master   : "+masterContext.getTotalAmount());
			System.out.println("purchageOrderContext   : "+masterContext.getMasterData());
			CgsStockMasterHelper  cgsHelper=new CgsStockMasterHelper();
			
			List<CgsStockMasterModal> masterData = masterContext.getMasterData();
			System.out.println("printing list objects -------  ");
			for(CgsStockMasterModal mastData : masterData){
				System.out.println("data1 : "+mastData.getSelId());
			}
			List<CgsStockMaster> cgsMaster = cgsHelper.createNestedCgsStockMaster(masterData, masterContext.getTotalAmount());
			
			cgsMasterService.createNestCgsStock(cgsMaster); 
			
			response = commonUtils.createResponseData("Done",ResponseMessages.GENERALL_INSERT_SUCCESS,ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(),
			ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL,"0", "--");
		}
		return response;
	}
	

}
