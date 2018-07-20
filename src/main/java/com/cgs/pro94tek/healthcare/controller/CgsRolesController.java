package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;





import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsRolesDao;
import com.cgs.pro94tek.healthcare.modal.CgsRolesModal;
import com.cgs.pro94tek.healthcare.service.ICgsRolesService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;


@Controller
public class CgsRolesController {
	
	@Autowired
	ICgsRolesService  cgsRolesService;
	
	@Autowired
	ICgsRolesDao cgsRolesDao;
	
	
	private static final Logger logger = LoggerFactory.getLogger(CgsRolesController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	
	@RequestMapping(value = InventoryURIConstant.GET_CGSROLES_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchcgsRole(){
		System.out.println("enter the conteroller of item");
		System.out.println("cgsRolesDao 55 "+cgsRolesDao);
		logger.info("Item detaials ItemId . : ");
		List<CgsRolesModal>  cgsRoleModal= new ArrayList<CgsRolesModal>();
		

		try {
			cgsRoleModal = cgsRolesService.getCgsRolers();
			System.out.println("try in item...........:"+cgsRoleModal);
			response = commonUtils.createResponseData("cgsRoles", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cgsRoleModal);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("cgsRoles", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
		@RequestMapping(value = InventoryURIConstant.GET_CGSROLES_DETAILS_BYID, method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody InventoryRequestResponse fetchByRoleid(@PathVariable("roleId") String roleId)
		{	System.out.println("cotroller roleId................:"+roleId);
			CgsRolesModal  cgsRoleModal= new CgsRolesModal();
			
				try
			{
					cgsRoleModal = cgsRolesService.getCgsRoleById(roleId);
					response = commonUtils.createResponseData("cgsRoles", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cgsRoleModal);

				
			}catch(Exception e)
			{
				e.printStackTrace();
				response = commonUtils.createResponseData("cgsRoles", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
			}
				return response;
			
			
			}

			
			
			
		
	

}
