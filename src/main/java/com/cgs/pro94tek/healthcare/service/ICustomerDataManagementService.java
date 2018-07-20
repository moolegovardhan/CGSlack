package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CustomerModal;

@Component
public interface ICustomerDataManagementService {
	

	public List<CustomerModal> fetchCustomerById(String customerId) throws PMSException;
	public CustomerModal fetchCustomerDetails(String customerId) throws PMSException;
	public Customer fetchCustomerByName(String customerName) throws PMSException;
	public Customer createOrUpdateCustomer(Customer customerEntity) throws PMSException;
	public boolean deleteCustomerById(String customerId) throws PMSException;
	public void createMultipleCustomer(List<Customer>  custObj)throws PMSException;
	public User generateCustomerCredentials(Customer customerEntity) throws PMSException;

}
