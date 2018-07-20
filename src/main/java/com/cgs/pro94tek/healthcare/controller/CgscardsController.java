package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.bean.CgsStock;
import com.cgs.pro94tek.healthcare.bean.Inward;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsLacsCardHelper;
import com.cgs.pro94tek.healthcare.helper.CgsStockHelper;
import com.cgs.pro94tek.healthcare.helper.InwardHelpers;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;
import com.cgs.pro94tek.healthcare.modal.CgsStockModal;
import com.cgs.pro94tek.healthcare.service.ICgsLacsCardsDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;
@Controller
public class CgscardsController {
	
	@Autowired
	ICgsLacsCardsDataRetrivalService icgsCardsService;

	private static final Logger logger = LoggerFactory.getLogger(CgscardsController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	@RequestMapping(value = InventoryURIConstant.CREATE_CARDS_ORDER, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createCgsCards(@RequestBody CgsLacs_CardsModal cardModal) {
		System.out.println("Inward controller...........:");
		try {
			System.out.println("Inward Name............."+cardModal.getCardName());
			System.out.println("welcome card");
			CgsLacsCardHelper   cgsCardHelper=new CgsLacsCardHelper();
			System.out.println("controller inward Helper...........:"+cgsCardHelper);
			CgsCards cgsCards=cgsCardHelper.createCards(cardModal);
			icgsCardsService.createCgsLacsCards(cgsCards);
			
			//iSpecialOffersService.createOrUpdateSpecialOfferById(specialOffer);   
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	@RequestMapping(value = InventoryURIConstant.GET_ALL_CGSCARDS_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchAllCgsCards(CgsLacs_CardsModal  cgsCardsModal){
		System.out.println("hellcard controller ");
		logger.info("selling details by sellingEntity . : ");
		List<CgsCards> cardObject = new ArrayList<CgsCards>();
		System.out.println("item recrds details all.......:");
		try {
			cardObject = icgsCardsService.getCgslaksCard(cgsCardsModal);
			response = commonUtils.createResponseData("item detailsfetch", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cardObject);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}

}
