package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.ServiceInfo;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IServiceInfoDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("serviceInfoDAO")
public class ServiceInfoDAOImpl extends CustomHibernateDaoSupport implements IServiceInfoDAO {

	
	 @Transactional
	public List<ServiceInfo> fetchAllService(ServiceInfo serviceInfoEnity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		 List<ServiceInfo> sercviceInfo=new ArrayList<ServiceInfo>();
		 String sqlQuary  = " From ServiceInfo order by service_id";
			Query query = getSession().createQuery(sqlQuary);
			System.out.println(query);
			@SuppressWarnings("unchecked")
			List<ServiceInfo> serviceInfos = query.list();
			if (PmsUtil.isCollectionNotEmpty(serviceInfos)) {
				return serviceInfos;
			}else{
				return sercviceInfo;
			}
		
	}

	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<ServiceInfo> fetchAllServiceByName(String serviceName)
			throws DataAccessException {
			
			 List<ServiceInfo> sercviceInfo=new ArrayList<ServiceInfo>();
			 String sqlQuary  = " from ServiceInfo where serviceName = :serviceName";
				Query query = getSession().createQuery(sqlQuary);
				query.setParameter("serviceName",(serviceName));
				System.out.println(query);
				@SuppressWarnings("unchecked")
				List<ServiceInfo> serviceInfos = query.list();
				if (PmsUtil.isCollectionNotEmpty(serviceInfos)) {
					return serviceInfos;
				}else{
					return sercviceInfo;
				}
				
	}

	@Override
	public boolean deleteAgnetById(String agentId) throws DataAccessException {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ServiceInfo> createOrServiceInfo(
			List<ServiceInfo> serviceInfoEnity) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}


	 @SuppressWarnings ("unchecked")
	 @Transactional
	public List<ServiceInfo> fetchMulCategory(ServiceInfo serviceInfoEnitity)
			throws DataAccessException {
		 List<ServiceInfo> serviceInfo=new ArrayList<ServiceInfo>();
			String sqlquery  = "from ServiceInfo  ";
			System.out.println("get data by itemId id............:"+sqlquery);
			Query query = getSession().createQuery(sqlquery);
			//query.setParameter("status", "y");
			//query.setParameter("itemId", Long.parseLong(itemId));
			List<ServiceInfo> serviceInfom = query.list();
			if (PmsUtil.isCollectionNotEmpty(serviceInfom)) {
				return serviceInfom;
			}else{
				return serviceInfo;
	}
	
	 }

	 @Transactional
	public List<ServiceInfo> fetchAllServiceByCompanyName(String serviceName)
			throws DataAccessException {
		 System.out.println("servoce data get ,a;ae..........:");
		 List<ServiceInfo> serviceInfo=new ArrayList<ServiceInfo>();
		 String querySql="from ServiceInfo where service_id = :serviceName";
		 Query query=getSession().createQuery(querySql);
		 query.setParameter("serviceName", (serviceName));
		 List<ServiceInfo> serviceInfom = query.list();
		  if (PmsUtil.isCollectionNotEmpty(serviceInfom)) {
				return serviceInfom;
			}else{
				return serviceInfo;
			}
	}
	

}
