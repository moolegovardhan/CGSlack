package com.cgs.pro94tek.healthcare.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cgs.pro94tek.healthcare.bean.CgsHomeService;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsHomeServicesHelper;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.modal.CgsHomeServiceModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.healthcare.service.ICgsHomeServicesDataRetrivalServices;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class CgsHomeServicesController {

	@Autowired
	ICgsHomeServicesDataRetrivalServices  cgsHomeService;
	
	@Autowired
	CgsHomeServicesHelper cgsHomeServicesHelper;
	
	private static final Logger logger = LoggerFactory.getLogger(CgsHomeServicesController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	/*@RequestMapping(value = InventoryURIConstant.CREATE_CGSHOMESERVICE_DETAILS, method = RequestMethod.POST)
	 public String singleFileUpload(@RequestParam("file") MultipartFile file,
             RedirectAttributes redirectAttributes ,@RequestBody List<CgsHomeServiceModal>  cgsHomeModal) {
		if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

		try
		{
			  byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);

	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return "helo";
	
	
	
	}*/
	 
	@RequestMapping(value = InventoryURIConstant.CREATE_CGSHOMESERVICE_DETAILS, method = RequestMethod.POST)
	 public @ResponseBody InventoryRequestResponse singleFileUpload( @RequestParam("floarPlane") CommonsMultipartFile[] floarPlane,
			 @RequestParam("area_sqft") String area_sqft,@RequestParam("rate_psf") String rate_psf) {	
		try
		{
			System.out.println("file.getOriginalFilename() : "+floarPlane+" "+area_sqft);
			CgsHomeService cgsHomeEntity = cgsHomeServicesHelper.createCgsHomeService(floarPlane, null, area_sqft, rate_psf);
			cgsHomeService.createCgsHomeServicesRecords(cgsHomeEntity);
			return response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		}catch(Exception e)
		{
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Customer Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}	
	
		return response;
	}
	
	/*<------------------------------------------------------Downlaod Files From DataBase--------------------------------------->*/
	
	@RequestMapping(value = InventoryURIConstant.GET_CGSHOMESERVICE_DOWNLOAD_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse downlaodFileHomeService(@PathVariable("fileId") String fileId){

		logger.info("house modal. : "+fileId);
		
		CgsHomeServiceModal cgsHomeServiceModal = new CgsHomeServiceModal();

		try {
			cgsHomeServiceModal = cgsHomeService.getFileById(fileId);
			response = commonUtils.createResponseData(cgsHomeServiceModal.getFileName(), ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", cgsHomeServiceModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData(cgsHomeServiceModal.getFileName(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	

}
