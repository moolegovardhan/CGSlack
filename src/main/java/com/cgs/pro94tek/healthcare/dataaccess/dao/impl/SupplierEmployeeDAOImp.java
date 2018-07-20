package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.SupplierEmployee;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplierEmployeeDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("supplierEmployeeDAOIml")
public class SupplierEmployeeDAOImp extends CustomHibernateDaoSupport implements ISupplierEmployeeDao{

	@SuppressWarnings ("unchecked")
	 @Transactional
	public SupplierEmployee createOrUpdateEmployee(SupplierEmployee employeeEntity) throws DataAccessException {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(employeeEntity);
		return employeeEntity;
	}

	 @Transactional
	public List<SupplierEmployee> getSupEmployeDetails(SupplierEmployee supEmpEntity) throws DataAccessException {
		 List<SupplierEmployee>  supEmp=new ArrayList<SupplierEmployee>();
		String sqlQuery="from SupplierEmployee  where status = :status";
		// TODO Auto-generated method stub
		Query query=getSession().createQuery(sqlQuery);
		query.setParameter("status", "y");
		List<SupplierEmployee> suplieEmploye=query.list();
		if (PmsUtil.isCollectionNotEmpty(suplieEmploye)) {
			return suplieEmploye;
		}else{
			return supEmp;
	
		}
	}
	 @SuppressWarnings("unchecked")
	 @Transactional
	public boolean deleteSupEmployeeById(Integer sempId)
			throws DataAccessException {
		System.out.println("enter the dao in employee status.....:");
		String sqlQuery="Update SupplierEmployee set status = :status "+" where sempId = :sempId ";
		Query query=getSession().createQuery(sqlQuery);
		query.setParameter("status", "r");
		query.setParameter("sempId",sempId);
		query.executeUpdate();
		// TODO Auto-generated method stub
		return true;
		
	}

	
	

}
