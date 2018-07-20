package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ServiceModal;

public class ServiceHelper {
	/**
	 * This method will convert Service Object to ServiceModal object
	 * @param service
	 * @return
	 */
	public List<ServiceModal> createserviceModal(List<Services> service){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<ServiceModal> serviceModals = new ArrayList<ServiceModal>();
		for (Services serviceobj : service) {
			ServiceModal serviceModal1 = new ServiceModal();
			serviceModal1.setCustomerName(serviceobj.getCustomerName());
			serviceModal1.setCgsEmployeeId(serviceobj.getCgsEmployeeId());
			serviceModal1.setAddress(serviceobj.getAddress());
			serviceModal1.setId(serviceobj.getId());
			serviceModal1.setCost(serviceobj.getCost());
			serviceModal1.setTotalCost(serviceobj.getTotalCost());
			serviceModal1.setMobile(serviceobj.getMobile());
			serviceModal1.setRequestdate(serviceobj.getRequestdate());
			serviceModal1.setServiceName(serviceobj.getServiceName());
			serviceModal1.setQuantity(serviceobj.getQuantity());
			serviceModal1.setDescription(serviceobj.getDescription());
			serviceModal1.setServiceType(serviceobj.getServiceType());
			serviceModal1.setStatus(serviceobj.getStatus());
			serviceModal1.setCompanyName(serviceobj.getCompanyName());
			
			serviceModals.add(serviceModal1);
		}
		

		return serviceModals;
	}

	/**
	 * here this method will convert serviceModal to service
	 * @param service
	 * @return
	 * @throws PMSException
	 * @throws ParseException
	 */
	public Services createService(ServiceModal serviceModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Services service = new Services();
		service.setId(serviceModal.getId());
		service.setAddress(serviceModal.getAddress());
		service.setCgsEmployeeId(serviceModal.getCgsEmployeeId());
		service.setCustomerName(serviceModal.getCustomerName());
		service.setCost(serviceModal.getCost());
		service.setTotalCost(serviceModal.getTotalCost());
		service.setMobile(serviceModal.getMobile());
		service.setRequestdate(serviceModal.getRequestdate());
		service.setRequestserved(serviceModal.getRequestserved());
		service.setServiceName(serviceModal.getServiceName());
		service.setServiceOrdre_no(serviceModal.getServiceOrder_no());
		service.setDescription(serviceModal.getDescription());
		service.setServiceType(serviceModal.getServiceType());
		service.setCompanyName(serviceModal.getCompanyName());
		service.setQuantity(serviceModal.getQuantity());
		service.setStatus("y");
		return service;
	}
	
	public List<Services> createserviceMultiple(List<ServiceModal> serviceModal){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<Services> serviceEntity = new ArrayList<Services>();
		for (ServiceModal servicemodelobj : serviceModal) {
			Services serviceObject = new Services();
			serviceObject.setCustomerName(servicemodelobj.getCustomerName());
			serviceObject.setId(servicemodelobj.getId());
			serviceObject.setCgsEmployeeId(servicemodelobj.getCgsEmployeeId());
			serviceObject.setAddress(servicemodelobj.getAddress());
			serviceObject.setCost(servicemodelobj.getCost());
			serviceObject.setTotalCost(servicemodelobj.getTotalCost());
			serviceObject.setMobile(servicemodelobj.getMobile());
			serviceObject.setServiceOrdre_no("1");
			serviceObject.setRequestdate(servicemodelobj.getRequestdate());
			serviceObject.setServiceName(servicemodelobj.getServiceName());
			serviceObject.setCgsEmployeeId(servicemodelobj.getCgsEmployeeId());
			serviceObject.setRequestserved(servicemodelobj.getRequestserved());
			serviceEntity.add(serviceObject);
		}
		

		return serviceEntity;
	}
	public List<Services> createserviceMultipleFiles(CommonsMultipartFile[] fileUpload){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<Services> serviceEntity = new ArrayList<Services>();
		for (CommonsMultipartFile servicemodelobj : fileUpload) {
			Services serviceObject = new Services();
			serviceObject.setServiceImage(servicemodelobj.getBytes());
			serviceEntity.add(serviceObject);
		}
		return serviceEntity;
		}
}
