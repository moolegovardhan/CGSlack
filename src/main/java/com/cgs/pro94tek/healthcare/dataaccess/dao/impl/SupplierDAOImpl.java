package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplierDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("supplierDAO")
public class SupplierDAOImpl extends CustomHibernateDaoSupport implements ISupplierDAO{

	@Transactional
	public Supplier getSupplierByName(String supplierName) throws DataAccessException {
		Supplier supplier = null;
		String querySupplierByName = "from Supplier where supplierName = :supplierName";
		Query query = getSession().createQuery(querySupplierByName);
		query.setParameter("supplierName", supplierName);
		@SuppressWarnings("unchecked")
		List<Supplier> suppliers = query.list();
		if (PmsUtil.isCollectionNotEmpty(suppliers)) {
			supplier = suppliers.get(0);
		}
		return supplier;
	}

	@Transactional
	public List<Supplier> fetchSupplierById(String supplierId) throws DataAccessException {
		 List<Supplier> supplier = new ArrayList<Supplier>();
		 String querySupplierById  = "from Supplier where officeid = :supplierId";
			Query query = getSession().createQuery(querySupplierById);
			query.setParameter("supplierId",(supplierId));
			System.out.println(query);
			@SuppressWarnings("unchecked")
			List<Supplier> suppliers = query.list();
			if (PmsUtil.isCollectionNotEmpty(suppliers)) {
				return suppliers;
			}else{
				return supplier;
			}
	}

	@Transactional
	public void createOrUpdateSupplier(Supplier supplier) throws DataAccessException {
		getSession().saveOrUpdate(supplier);
		
	}

	@Transactional
	public boolean deleteSupplierById(String supplierId) throws DataAccessException {
		String querySupplierId = " Delete from Supplier where id = supplierId";
		Query query = getSession().createQuery(querySupplierId);
		query.setParameter("supplierId", Long.parseLong(supplierId));
		query.executeUpdate();
		return true;	
	}

	
	
		 @SuppressWarnings ("unchecked")
		 @Transactional
		 public List<Supplier> fetchAllSupplier(Supplier supplierEntity)
					throws DataAccessException { 
			 List<Supplier> suppliar=new ArrayList<Supplier>();
				 String sqlQuary  = "from Supplier ";
					Query query = getSession().createQuery(sqlQuary);
					//query.setParameter("agnetName",(agnetName));
					System.out.println(query);
					@SuppressWarnings("unchecked")
					List<Supplier> suppliers = query.list();
					if (PmsUtil.isCollectionNotEmpty(suppliers)) {
						return suppliers;
					}else{
						return suppliar;
					}
			

		}

}
