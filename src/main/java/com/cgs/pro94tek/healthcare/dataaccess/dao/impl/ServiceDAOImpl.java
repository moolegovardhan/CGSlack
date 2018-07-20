package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.xml.bind.ParseConversionEvent;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IServiceDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("serviceDAO")
public class ServiceDAOImpl extends CustomHibernateDaoSupport implements IServiceDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public Services getServiceByName(String serviceName) throws DataAccessException {
		Services service = null;
		String queryServiceByName = "from Services where serviceName = :serviceName";
		Query query = getSession().createQuery(queryServiceByName);
		query.setParameter("serviceName", serviceName);
		List<Services> services = query.list();
		if (PmsUtil.isCollectionNotEmpty(services)) {
			service = services.get(0);
		}
		return service;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Services> fetchServiceById(String serviceId) throws DataAccessException {
		 List<Services> service = new ArrayList<Services>();
			String queryeserviceById  = "from Services where id = :serviceId";
			Query query = getSession().createQuery(queryeserviceById);
			query.setParameter("serviceId",Long.parseLong(serviceId));
			List<Services> services = query.list();
			if (PmsUtil.isCollectionNotEmpty(services)) {
				return services;
			}else{
				return service;
			}
	}

	@Override
	@Transactional
	public void createOrUpdateService(Services service) throws DataAccessException {
	getSession().saveOrUpdate(service);
		
	}

	@Override
	@Transactional
	public boolean deleteServiceById(String serviceId) throws DataAccessException {
		String queryserviceId = " Update Services set status = :status "+" where id = :serviceId";
		Query query = getSession().createQuery(queryserviceId);
		query.setParameter("serviceId", Long.parseLong(serviceId));
		query.setParameter("status", "n");
		query.executeUpdate();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Services> createMultipleRecords(List<Services> serviceOrder)
			throws DataAccessException {
		if(serviceOrder != null && serviceOrder.size() > 0){
			for(Services obj : serviceOrder){
				getSession().saveOrUpdate(obj);
			}
		}	
		return serviceOrder;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Services> fetchAllServices(Services servicesEnity)
			throws DataAccessException {
		System.out.println("service of data..........daoimpl");
			List<Services> service = new ArrayList<Services>();
			String queryeservice  = "from  Services where status = :status";
			Query query = getSession().createQuery(queryeservice);
			query.setParameter("status", "y");
			List<Services> services = query.list();
			if (PmsUtil.isCollectionNotEmpty(services)) {
				return services;
			}else{
				return service;
			}
	}

	@Override
	public List<Services> createServiceMultipuleFile(
			List<Services> serviceEntity) throws PMSException {
		getSession().save(serviceEntity);
		return serviceEntity;
	}
	

}
