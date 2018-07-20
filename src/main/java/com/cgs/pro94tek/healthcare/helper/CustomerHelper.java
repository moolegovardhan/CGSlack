package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Customer;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CustomerModal;

@Component
public class CustomerHelper {

	 
		public List<CustomerModal> createcustomerModal(List<Customer> customer){
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
			List<CustomerModal> CustomerModals = new ArrayList<CustomerModal>();
			for (Customer customerobj : customer) {
				CustomerModal customerModal1 = new CustomerModal();
				customerModal1.setCust_regNo(customerobj.getCust_regNo());
				customerModal1.setCustAddress(customerobj.getCustAddress());
				customerModal1.setCustContactNo(customerobj.getCustContactNo());
				//customerModal1.setCustName(customerobj.getCustName());
				customerModal1.setStatus("y");
				CustomerModals.add(customerModal1);
			}
			

			return CustomerModals;
		}

		
		public Customer createCustomer(CustomerModal customerModal) throws PMSException, ParseException{
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
			Customer customer = new Customer();
		
			customer.setFirstName(customerModal.getFirstName());
			customer.setLastName(customerModal.getLastName());
			customer.setGender(customerModal.getGender());
			customer.setCustContactNo(customerModal.getCustContactNo());
			customer.setCustAddress(customerModal.getCustAddress());
			customer.setCustomerType(customerModal.getCustomerType());
			customer.setCardType(customerModal.getCardType());
			customer.setOfficeId(customerModal.getOfficeId());
			customer.setStatus("y");
			// created date
			
			return customer;
		}

		public List<Customer> createcustomerModalmul(List<CustomerModal> customerModal)throws PMSException, ParseException{
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
			List<Customer> customEntity = new ArrayList<Customer>();
			for (CustomerModal customeModals : customerModal) {
				Customer customerobj=new Customer();
				/*customerobj.setCustAddress(customeModals.getCustAddress());*/
				customerobj.setCust_regNo("1");
				/*customerobj.setCustContactNo(customeModals.getCustContactNo());*/
				//customerobj.setCustName(customeModals.getCustName());
//				customerobj.setStatus("y");
				customEntity.add(customerobj);
			}
			return customEntity;
			}

}
