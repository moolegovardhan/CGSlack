package com.cgs.pro94tek.healthcare.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.PatientVoucherModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;
import com.cgs.pro94tek.utils.InventoryRequestResponse;

@Component
public interface IUserDataManagementService {
	
	public UserModal authenticateUser(String userid,String password) throws PMSException;
	
	public User fetchUserInformation(String userid) throws PMSException;
	
	public List<PatientVoucherModal> fetchPatientVoucherDetails(Integer userid) throws PMSException;
	
	public User createOrUpdateUser(User userEntity)throws PMSException;
	
	
	
}
