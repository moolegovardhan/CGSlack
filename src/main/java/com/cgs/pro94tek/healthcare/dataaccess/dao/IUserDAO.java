package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Patientvoucher;
import com.cgs.pro94tek.healthcare.bean.SchoolDetails;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
@Component
public interface IUserDAO {
	
	public User authenticateUser(String userId,String password) throws PMSException;
	public String insertUserToken(long userid,String username,String profession,String officeid) throws PMSException;
	public User fetchUserInformation(String userid) throws PMSException;
	public List<Patientvoucher> fetchPatientVoucherDetails(Integer userid) throws PMSException;
	public User createOrUpdateUser(User userEntity)throws DataAccessException;
	public int checkUserId(String customerId) throws DataAccessException;
}
