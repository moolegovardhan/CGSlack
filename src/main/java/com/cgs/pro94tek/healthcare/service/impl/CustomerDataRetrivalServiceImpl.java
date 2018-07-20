package com.cgs.pro94tek.healthcare.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICustomerDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IUserDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CustomerHelper;
import com.cgs.pro94tek.healthcare.modal.CustomerModal;
import com.cgs.pro94tek.healthcare.service.ICustomerDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;

@Service("customerDataRetrivalServiceImpl")
public class CustomerDataRetrivalServiceImpl implements ICustomerDataManagementService{

	@Autowired
	ICustomerDAO customerDAO;
	
	@Autowired 
	IUserDAO userDAO;
	
	
	public List<CustomerModal> fetchCustomerById(String customerId) throws PMSException {
		List<Customer> ward = customerDAO.fetchCustomerById(customerId);
		CustomerHelper customerhelper = new CustomerHelper();
		return customerhelper.createcustomerModal(ward);
	}
	@Override
	public CustomerModal fetchCustomerDetails(String customerId) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}
	public Customer fetchCustomerByName(String customerName) throws PMSException {
		
		return customerDAO.getCustomerByName(customerName);
	}
	@Override
	public Customer createOrUpdateCustomer(Customer customerEntity) throws PMSException {
		Customer custObj=customerDAO.createOrUpdateCustomer(customerEntity);
		System.out.println("serviceImple..................:"+custObj);
		return custObj;
	}
	
	@Override
	public User generateCustomerCredentials(Customer customerEntity) throws PMSException {
		
		String userId = customerEntity.getFirstName()+"CGSCUST@cgs";
		int userCount = userDAO.checkUserId(userId);
		int count = 0;
		while(userCount != 0){
			count++;
			userId = customerEntity.getFirstName()+""+count+"CGSCUST@cgs.com";
			userCount = userDAO.checkUserId(userId);
		}
		customerEntity.setEmail(userId);
		Customer obje=	customerDAO.createOrUpdateCustomer(customerEntity);
	System.out.println("regeno.....:"+obje.getCustomerId());
	String custRegNo = "CUST"+obje.getCustomerId();
	obje.setCust_regNo(custRegNo);
	customerDAO.createOrUpdateCustomer(obje);
		User user=new User();
		String password = customerEntity.getLastName()+customerEntity.getCustomerId();
		String encryptPassword = CommonUtils.encryptPassword(password);
		user.setUserName(userId);
		user.setPassword(encryptPassword);
		userDAO.createOrUpdateUser(user);
		System.out.println("User object saved");
		return user;
	}


	@Override
	public boolean deleteCustomerById(String customerId) throws PMSException {
		return customerDAO.deleteCustomerById(customerId);
	}
	@Override
	public void createMultipleCustomer(List<Customer> custObj)
			throws PMSException {
		List<Customer> custoObje = customerDAO.createCustomer(custObj);
		if(custoObje != null && custoObje.size() > 0){
			for (Object object : custoObje)
			{				
				Customer custoObje1 = (Customer)object;
				String agentOrderNo = "CGUCUT"+custoObje1.getCustomerId();
				custoObje1.setCust_regNo(agentOrderNo);
				customerDAO.createOrUpdateCustomer(custoObje1);
			}
		}
		
	}
	
	
}
