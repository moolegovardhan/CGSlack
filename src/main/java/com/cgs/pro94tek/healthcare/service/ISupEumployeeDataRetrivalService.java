package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;




import com.cgs.pro94tek.healthcare.bean.SupplierEmployee;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SupplierEmployeeModal;

@Component
public interface ISupEumployeeDataRetrivalService {

	public List<SupplierEmployeeModal> getSupEmployeDetails(SupplierEmployee  supEmployee)throws PMSException;
	public User generateEmployeeCredentials(SupplierEmployee employeeEntity) throws PMSException;
	public SupplierEmployee createOrUpdateSupplierEmployee(SupplierEmployee sEmployeeEntity) throws PMSException;
	public boolean deleteshopEmployeeById(Integer sempId)throws PMSException;
}
