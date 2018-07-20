package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;



import com.cgs.pro94tek.healthcare.bean.ServiceInfo;


public interface IServiceInfoDAO {
	public List<ServiceInfo>  fetchAllService(ServiceInfo serviceInfoEnity)throws DataAccessException; 
	public List<ServiceInfo>  fetchAllServiceByName(String  serviceName)throws DataAccessException;
	public boolean deleteAgnetById(String agentId)throws DataAccessException;
	public List<ServiceInfo> createOrServiceInfo(List<ServiceInfo> serviceInfoEnity)throws DataAccessException; 
	public List<ServiceInfo> fetchMulCategory(ServiceInfo serviceInfoEnitity)throws DataAccessException;
	public List<ServiceInfo>  fetchAllServiceByCompanyName(String  serviceName)throws DataAccessException;

}
