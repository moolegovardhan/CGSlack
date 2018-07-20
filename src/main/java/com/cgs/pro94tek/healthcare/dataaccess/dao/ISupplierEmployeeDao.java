package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.SupplierEmployee;

public interface ISupplierEmployeeDao {
	public SupplierEmployee createOrUpdateEmployee(SupplierEmployee employeeEntity)throws DataAccessException;
	public List<SupplierEmployee> getSupEmployeDetails(SupplierEmployee  supEmpEntity)throws DataAccessException;
	public boolean  deleteSupEmployeeById(Integer sempId)throws DataAccessException;
}
