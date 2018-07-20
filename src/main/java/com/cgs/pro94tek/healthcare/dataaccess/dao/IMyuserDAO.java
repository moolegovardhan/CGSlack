package com.cgs.pro94tek.healthcare.dataaccess.dao;

import com.cgs.pro94tek.healthcare.bean.MyUsers;

import com.cgs.pro94tek.healthcare.exeception.PMSException;

public interface IMyuserDAO {
	
	public MyUsers fetchUser(String username,String password) throws PMSException;


}
