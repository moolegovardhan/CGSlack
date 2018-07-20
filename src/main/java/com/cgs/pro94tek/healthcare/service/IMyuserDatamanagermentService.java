package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.MyuserModal;


@Component
public interface IMyuserDatamanagermentService {
	
	public MyuserModal authenticateUser(String username,String password) throws PMSException;
	
	public User fetchUserInformation(String userid) throws PMSException;
	
	
}
