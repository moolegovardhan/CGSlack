package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IServiceDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SellingOderHelper;
import com.cgs.pro94tek.healthcare.helper.ServiceHelper;
import com.cgs.pro94tek.healthcare.modal.ServiceModal;
import com.cgs.pro94tek.healthcare.service.IServiceDataManagmentService;

@Service("serviceDataManagementService")
public class ServicesDataRetrivalServiceImpl implements IServiceDataManagmentService{
	
	@Autowired
	private IServiceDAO servicedao;

	@Override
	public List<ServiceModal> fetchServiceById(String serviceId) throws PMSException {
		List<Services> service = servicedao.fetchServiceById(serviceId);
		ServiceHelper servicehelper = new ServiceHelper();
		return servicehelper.createserviceModal(service);
	}

	@Override
	public ServiceModal fetchServiceDetails(String taserviceIdxId) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services fetchServiceByName(String serviceName) throws PMSException {
		return servicedao.getServiceByName(serviceName);
	}

	@Override
	public void createOrUpdateService(Services serviceEntity) throws PMSException
	{
		servicedao.createOrUpdateService(serviceEntity);
		
	}

	@Override
	public boolean deleteServiceById(String serviceId) throws PMSException {
		
		 return servicedao.deleteServiceById(serviceId);
	}

	@Override
	public void createOrUpdateServiceMultipule(List<Services> serviceEntity)
			throws PMSException {
		System.out.println("system for service");
		// TODO Auto-generated method stub
		List<Services> serviceObjects = servicedao.createMultipleRecords(serviceEntity);
		if(serviceObjects != null && serviceObjects.size() > 0){
			String serviceOrderNO = "cgsserv"+serviceObjects.get(0).getId();
			for (Services serviceObjct : serviceObjects){
				serviceObjct.setServiceOrdre_no(serviceOrderNO);
				servicedao.createOrUpdateService(serviceObjct);
			}
		}
		
		
	}

	@Override
	public List<ServiceModal> fetchAllServices(Services serviceEntity)
			throws PMSException {
		System.out.println("dao implementation................:");
		List<Services> serviceObje=servicedao.fetchAllServices(serviceEntity);
		ServiceHelper servicehelper = new ServiceHelper();
		return servicehelper.createserviceModal(serviceObje);
		
		
	}

	@Override
	public void createServiceMultipuleFile(List<Services> serviceEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		servicedao.createServiceMultipuleFile(serviceEntity);
	}
		
}



