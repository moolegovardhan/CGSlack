package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface IServiceDAO {
	
	public Services getServiceByName(String serviceName) throws DataAccessException;
	public List<Services> fetchServiceById(String serviceId)throws DataAccessException;
	public void createOrUpdateService(Services service)throws DataAccessException;
	public boolean deleteServiceById(String serviceId) throws DataAccessException;
	public List<Services> createMultipleRecords(List<Services> serviceOrder)throws DataAccessException;
	public List<Services> fetchAllServices(Services servicesEnity)throws DataAccessException;
	public List<Services> createServiceMultipuleFile(List<Services> serviceEntity) throws PMSException;
}
