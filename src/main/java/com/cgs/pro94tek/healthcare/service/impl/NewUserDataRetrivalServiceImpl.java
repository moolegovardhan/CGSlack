package com.cgs.pro94tek.healthcare.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Patientvoucher;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IUserDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.UserHelper;
import com.cgs.pro94tek.healthcare.modal.PatientVoucherModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;
import com.cgs.pro94tek.healthcare.service.IUserDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;







import com.cgs.pro94tek.healthcare.bean.NewUser;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.dataaccess.dao.INewUserDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.impl.NewUserDAOImpl;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.NewUserHelper;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.helper.UserHelper;
import com.cgs.pro94tek.healthcare.modal.NewUserModal;
import com.cgs.pro94tek.healthcare.service.INewUserDataManagerService;
import com.cgs.pro94tek.utils.CommonUtils;

@Service("newUserdataservice")
public class NewUserDataRetrivalServiceImpl implements INewUserDataManagerService  {

	@Autowired
	private INewUserDAO  inewUserDAO;
	
	@Override
	public NewUser fetchUserName(String username) throws PMSException {
		// TODO Auto-generated method stub
		
		return inewUserDAO.fetchUserName(username);
	}

	/*School school = schooldao.fetchSchoolById(schoolId);
	SchoolHelper schoolhelper = new SchoolHelper();
	return schoolhelper.createschoolModal(school);*/
	
	
	@Override
	public NewUserModal fetchUserNamePassword(String username, String password)
			throws PMSException {
		// TODO Auto-generated method stub
		NewUserModal  usermodal=new NewUserModal();
		NewUser  newuser=new NewUser();
		NewUserHelper  helth=new NewUserHelper();
		System.out.println("username.........."+username+ "\t"+  "password..........."+password);
		System.out.println("username.........."+username+  "\t"+  "password..........."+helth);
		
		return helth.createUserModal(newuser);/*inewUserDAO.fetchUserNamePassword(username, password); */   

				}
			
		
	
}
