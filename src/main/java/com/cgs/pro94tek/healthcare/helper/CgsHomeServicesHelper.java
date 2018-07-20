package com.cgs.pro94tek.healthcare.helper;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.cgs.pro94tek.healthcare.bean.CgsHomeService;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CgsHomeServiceModal;
import com.cgs.pro94tek.healthcare.modal.SchoolModal;
import com.cgs.pro94tek.utils.InventoryRequestResponse;

@Component
public class CgsHomeServicesHelper {
	
	public CgsHomeService  createCgsHomeService(CommonsMultipartFile[] fileName,String housetype,String area_sqft,String rate_psf)throws PMSException, ParseException{
	
		CgsHomeService cgsHomeService = new CgsHomeService();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		cgsHomeService.setHousetype(housetype);
		cgsHomeService.setArea_sqft(area_sqft != null ? Float.parseFloat(area_sqft) : null);
		cgsHomeService.setRate_psf(rate_psf != null ? Float.parseFloat(rate_psf) : null);
		
		if(fileName != null && fileName.length > 0){
			for (CommonsMultipartFile aFile : fileName){				
				cgsHomeService.setFloarPlane(aFile.getBytes());		
			}
		}	
		
			return cgsHomeService;
	}
	
	public CgsHomeServiceModal fileDownlaodById(CgsHomeService homeServiceEntity){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		CgsHomeServiceModal serviceModal = new CgsHomeServiceModal();
		serviceModal.setId(homeServiceEntity.getId());
		serviceModal.setFileName(homeServiceEntity.getFileName());
		serviceModal.setFloarPlane(homeServiceEntity.getFloarPlane());
		return serviceModal;
	}
}
