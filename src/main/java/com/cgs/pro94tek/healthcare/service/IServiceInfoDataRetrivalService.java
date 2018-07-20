package com.cgs.pro94tek.healthcare.service;

import java.util.List;




import org.springframework.stereotype.Component;


import com.cgs.pro94tek.healthcare.bean.ServiceInfo;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ServiceInfoModal;

@Component
public interface IServiceInfoDataRetrivalService {
	
	
	public List<ServiceInfoModal>  fetchAllServiceInfo(ServiceInfo serviceInfoEntity)throws PMSException;
	public List<ServiceInfoModal>  fetchAllSercviceByName(String serviceName)throws PMSException;
	public void updateServiceInfo(ServiceInfo serviceINfoEntiy) throws PMSException;
	public List<ServiceInfoModal> fetchAllServiceInfoMul(ServiceInfo serviceInfoobj)throws PMSException;
	public List<ServiceInfoModal>  fetchAllSercviceByComanyName(String serviceName)throws PMSException;
	
}
