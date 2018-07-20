package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import com.cgs.pro94tek.healthcare.bean.ServiceInfo;
import com.cgs.pro94tek.healthcare.modal.ServiceInfoModal;

public class ServiceInfoHelper {
	
	
	public List<ServiceInfoModal> createALLServiceInfoModal(List<ServiceInfo> serviceInfoEntity)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ServiceInfoModal> serviceModals = new ArrayList<ServiceInfoModal>();
		for(ServiceInfo serviceInfoObj : serviceInfoEntity)
		{
			ServiceInfoModal serviceModal1 = new ServiceInfoModal();
		
			serviceModal1.setService_no(serviceInfoObj.getService_no());
			serviceModal1.setLength(serviceInfoObj.getLength());
			serviceModal1.setService_id(serviceInfoObj.getService_id());
			serviceModal1.setServiceName(serviceInfoObj.getServiceName());
			serviceModal1.setServiceType(serviceInfoObj.getServiceType());
			serviceModal1.setCost(serviceInfoObj.getCost());
			/*serviceModal1.setDiaya(serviceInfoObj.getDiaya());*/
			serviceModal1.setCompanyName(serviceInfoObj.getCompanyName());
			serviceModals.add(serviceModal1);
		}
		return serviceModals;
	}

	public List<ServiceInfo> createAllServiceInfoService(List<ServiceInfoModal> seviceInfoModal)throws NullPointerException{
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("helper enter datat.......:");
		List<ServiceInfo> serviceInfos=new ArrayList<ServiceInfo>();
		for(ServiceInfoModal sInfoModalobject : seviceInfoModal)
		{	
			ServiceInfo serviceInfo1=new ServiceInfo();
			serviceInfo1.setCost(sInfoModalobject.getCost());
			/*serviceInfo1.setDiaya(sInfoModalobject.getDiaya());*/
			serviceInfo1.setLength(sInfoModalobject.getLength());
			serviceInfo1.setService_id(sInfoModalobject.getService_id());
			serviceInfo1.setServiceName(sInfoModalobject.getServiceName());
			serviceInfo1.setService_no(sInfoModalobject.getService_no());
			serviceInfo1.setCompanyName(sInfoModalobject.getCompanyName());
			serviceInfos.add(serviceInfo1);
			
		}
		return serviceInfos;
	}
	public List<ServiceInfoModal> getMulServiceInfo(List<ServiceInfo> serviceInfoEnity){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ServiceInfoModal> serviceInfoModal = new ArrayList<ServiceInfoModal>();
		for(ServiceInfo serviceobj : serviceInfoEnity)
		{
			ServiceInfoModal serviceInforMd = new ServiceInfoModal();
			serviceInforMd.setServiceName(serviceobj.getServiceName());
			serviceInforMd.setCompanyName(serviceobj.getCompanyName());
			//serviceInforMd.setCreatedDate(df.format(categoryobj.getCreatedDate()));
			serviceInforMd.setCost(serviceobj.getCost());
			serviceInforMd.setServiceType(serviceobj.getServiceType());
			serviceInforMd.setDescription(serviceobj.getDescription());
			serviceInforMd.setService_id(serviceobj.getService_id());
			serviceInfoModal.add(serviceInforMd);
			}
		return serviceInfoModal;
	}			
}