package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsRoles;
import com.cgs.pro94tek.healthcare.bean.SupplierEmployee;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsRolesDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplierEmployeeDao;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IUserDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SupplierEmployeeHelper;
import com.cgs.pro94tek.healthcare.modal.SupplierEmployeeModal;
import com.cgs.pro94tek.healthcare.service.ISupEumployeeDataRetrivalService;
import com.cgs.pro94tek.utils.CommonUtils;

@Service("supplierEmployeeDataServiceImpl")
public class SupplierEmployeeDataRetrivalServiceImp   implements ISupEumployeeDataRetrivalService{

	
	@Autowired 
	IUserDAO userDAO;
	@Autowired 
	ISupplierEmployeeDao   supDAO;
	@Autowired 
	ICgsRolesDao   cgsRoleDao;
	
	@Override
	public User generateEmployeeCredentials(SupplierEmployee employeeEntity)
			throws PMSException {
		
		/*public User generateCustomerCredentials(Customer employeeEntity) throws PMSException {*/
			
			String userId = employeeEntity.getFirstName()+"SHPEMP@cgs";
			System.out.println("my user name....."+userId);
			int userCount = userDAO.checkUserId(userId);
			int count = 0;
			while(userCount != 0){
				count++;
				userId = employeeEntity.getFirstName()+""+count+"SHPEMP@cgs";
				userCount = userDAO.checkUserId(userId);
				System.out.println("my user name.ty...."+userId);
			}
			employeeEntity.setEmail(userId);
			SupplierEmployee obje=	supDAO.createOrUpdateEmployee(employeeEntity);
			System.out.println("employeee no...............:"+obje);
		System.out.println("regeno.....:"+obje.getSempId());
		String empRegNo = "SUPEMP"+obje.getSempId();
		obje.setEmpRegNo(empRegNo);
		supDAO.createOrUpdateEmployee(obje);
			User user=new User();
			String password = employeeEntity.getLastName()+employeeEntity.getSempId();
			System.out.println("password is....:"+password);
			String encryptPassword = CommonUtils.encryptPassword(password);
			String dr=CommonUtils.decryptPassword(encryptPassword);
			System.out.println("decrypt password .......:"+dr);
			user.setUserName(userId);
			user.setPassword(encryptPassword);
			Integer roleNO=employeeEntity.getRoleId();
			System.out.println("roleId.................:"+roleNO);
			CgsRoles roleObj=cgsRoleDao.getCgsRolesById(roleNO);
			user.setRolec(roleObj);
			userDAO.createOrUpdateUser(user);
			System.out.println("User object sabved");
			return user;
		}
	public SupplierEmployee createOrUpdateSupplierEmployee(SupplierEmployee sEmployeeEntity) throws PMSException {
		SupplierEmployee sEmployeeObj=supDAO.createOrUpdateEmployee(sEmployeeEntity);
		System.out.println("serviceImple..................:"+sEmployeeObj);
		return sEmployeeObj;
	}
	
	@Override
	public List<SupplierEmployeeModal> getSupEmployeDetails(SupplierEmployee supEmployee) throws PMSException {
		List<SupplierEmployee> supempObje=supDAO.getSupEmployeDetails(supEmployee);
		SupplierEmployeeHelper  supempHelper=new SupplierEmployeeHelper();
		// TODO Auto-generated method stub
		return supempHelper.getSupplierEmployeeDeatils(supempObje);
	}
	@Override
	public boolean deleteshopEmployeeById(Integer sempId) throws PMSException {
		System.out.println("employee details.....:");
		
		// TODO Auto-generated method stub
		return supDAO.deleteSupEmployeeById(sempId);
	}

}
