package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.SupplierEmployee;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.SupplierEmployeeModal;
@Component
public class SupplierEmployeeHelper {

	public SupplierEmployee createSupplierEmployee(SupplierEmployeeModal sEmployeeModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		SupplierEmployee sEmployee = new SupplierEmployee();
		sEmployee.setFirstName(sEmployeeModal.getFirstName());
		sEmployee.setLastName(sEmployeeModal.getLastName());
		sEmployee.setPhoneNumber(sEmployeeModal.getPhoneNumber());
		sEmployee.setAddress(sEmployeeModal.getAddress());
		sEmployee.setGender(sEmployeeModal.getGender());
		sEmployee.setRoleId(sEmployeeModal.getRoleId());
		
		sEmployee.setStatus("y");
		
		
		return sEmployee;
	}
	
	public List<SupplierEmployeeModal> getSupplierEmployeeDeatils(List<SupplierEmployee> supEmpEntity) {
		
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	
 		System.out.println("helper.............:");
 		List<SupplierEmployeeModal> supEmplModal = new ArrayList<SupplierEmployeeModal>();
 		for(SupplierEmployee supplierobj : supEmpEntity)
 		{
 			SupplierEmployeeModal supEmpModal1 = new SupplierEmployeeModal();
 			supEmpModal1.setSempId(supplierobj.getSempId());
 			supEmpModal1.setLastName(supplierobj.getLastName());
 			supEmpModal1.setFirstName(supplierobj.getFirstName());
 			supEmpModal1.setGender(supplierobj.getGender());
 			supEmpModal1.setPhoneNumber(supplierobj.getPhoneNumber());
 			supEmpModal1.setAddress(supplierobj.getAddress());
 			supEmpModal1.setEmail(supplierobj.getEmail());
 			supEmpModal1.setRoleId(supplierobj.getRoleId());
 			supEmplModal.add(supEmpModal1);
		}return supEmplModal;
		}
	}

