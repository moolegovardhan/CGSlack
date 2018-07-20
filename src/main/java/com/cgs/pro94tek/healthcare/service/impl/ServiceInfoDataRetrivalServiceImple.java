package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.omg.CORBA.ServiceInformationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.ServiceInfo;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IServiceInfoDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ServiceInfoHelper;
import com.cgs.pro94tek.healthcare.modal.ServiceInfoModal;
import com.cgs.pro94tek.healthcare.service.IServiceInfoDataRetrivalService;



@Service("serviceINfo")
public class ServiceInfoDataRetrivalServiceImple  implements IServiceInfoDataRetrivalService{
@Autowired
  IServiceInfoDAO  serviceDAO;
	@Override
	public List<ServiceInfoModal> fetchAllServiceInfo(ServiceInfo serviceInfoEntity) throws PMSException {
		// TODO Auto-generated method stub
		List<ServiceInfo> serviceInfo= serviceDAO.fetchAllService(serviceInfoEntity);
		ServiceInfoHelper serviceHelper=new ServiceInfoHelper();
		return serviceHelper.createALLServiceInfoModal(serviceInfo);
	}

	@Override
	public List<ServiceInfoModal> fetchAllSercviceByName(String serviceName)
			throws PMSException {
		// TODO Auto-generated method stub
		List<ServiceInfo> serviceInfo= serviceDAO.fetchAllServiceByName(serviceName);
		ServiceInfoHelper serviceHelper=new ServiceInfoHelper();
		
		return serviceHelper.createALLServiceInfoModal(serviceInfo);
	}

	@Override
	public void updateServiceInfo(ServiceInfo serviceINfoEntiy)
			throws PMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ServiceInfoModal> fetchAllServiceInfoMul(
			ServiceInfo serviceInfoobj) throws PMSException {
		System.out.println("service  for fetching all records..........:"+serviceInfoobj);
		List<ServiceInfo>  serviceInfo=serviceDAO.fetchMulCategory(serviceInfoobj);
		ServiceInfoHelper  serviceInfoHelper=new ServiceInfoHelper();
		// TODO Auto-generated method stub
		return serviceInfoHelper.getMulServiceInfo(serviceInfo);
	}

	@Override
	public List<ServiceInfoModal> fetchAllSercviceByComanyName(
			String serviceName) throws PMSException {
		List<ServiceInfo> serviceInfo= serviceDAO.fetchAllServiceByCompanyName(serviceName);
		ServiceInfoHelper serviceHelper=new ServiceInfoHelper();
		
		return serviceHelper.createALLServiceInfoModal(serviceInfo);
	}
	

}
