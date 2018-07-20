package com.cgs.pro94tek.healthcare.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsRoles;
import com.cgs.pro94tek.healthcare.bean.Patientvoucher;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsRolesDao;
import com.cgs.pro94tek.healthcare.modal.PatientVoucherModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;

@Service("userHelper")
public class UserHelper {
	
	@Autowired
	ICgsRolesDao cgsRolesDao;
	
	
	public UserModal createUserModal(User myuser){
		System.out.println(cgsRolesDao);
		UserModal myusermodal=new UserModal();

		myusermodal.setAdress(myuser.getAdress());
		myusermodal.setOfficeid(myuser.getOfficeid());
		myusermodal.setPassword(myuser.getPassword());
		myusermodal.setUsername(myuser.getUserName());
		myusermodal.setPhoneNumber(myuser.getPhoneNumber());
		myusermodal.setFirstName(myuser.getUserName());
		myusermodal.setRoleId(myuser.getRolec().getRoleId());
	return myusermodal;
	}
	
	public PatientVoucherModal createPatientVoucherModal(Patientvoucher patientVoucher){
		PatientVoucherModal patientVoucherModal = new PatientVoucherModal();
		
		if(patientVoucher.getCardtype() != null)
			patientVoucherModal.setCardtype(patientVoucher.getCardtype());
		if(patientVoucher.getCreatedate() != null)
			patientVoucherModal.setCreatedate(patientVoucher.getCreatedate());
		if(patientVoucher.getCreatedby() != null)
			patientVoucherModal.setCreatedby(patientVoucher.getCreatedby());
		if(patientVoucher.getExpirydate() != null)
			patientVoucherModal.setExpirydate(patientVoucher.getExpirydate());
		if(patientVoucher.getId() != null)
			patientVoucherModal.setId(String.valueOf(patientVoucher.getId()));
		if(patientVoucher.getInsttype() != null)
			patientVoucherModal.setInsttype(patientVoucher.getInsttype());
		if(patientVoucher.getPatientid() != null)
			patientVoucherModal.setPatientid(patientVoucher.getPatientid());
		if(patientVoucher.getPercent() != null)
			patientVoucherModal.setPercent(patientVoucher.getPercent());
		if(patientVoucher.getStatus() != null)
			patientVoucherModal.setStatus(patientVoucher.getStatus());
		if(patientVoucher.getVouchercount() != null)
			patientVoucherModal.setVouchercount(patientVoucher.getVouchercount());
		if(patientVoucher.getVouchername() != null)
			patientVoucherModal.setVouchername(patientVoucher.getVouchername());
		
		return patientVoucherModal;
	}
	public User createUser(UserModal userModal){
		User user=new User();
		/*user.setAdress(userModal.getAdress());
		user.setOfficeid(userModal.getOfficeid());*/
		user.setPhoneNumber(userModal.getPhoneNumber());
		
		/*user.setPassword(userModal.getPassword());
		user.setUsername(userModal.getUsername());
		user.setProfession(userModal.getProfession());
		Integer roleId=userModal.getRoleId();*/
		System.out.println("dao  44 : "+cgsRolesDao);
		
		/*try{
			CgsRoles roleObje=cgsRolesDao.getCgsRolesById(roleId);
			System.out.println("cgsrolee");
			user.setRolec(roleObje);
			System.out.println("user......"+user);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
	return user;
	}
	public User createUserAdmin(UserModal userModal){
		User user=new User();
		user.setPassword(userModal.getPassword());
		user.setUserName(userModal.getUsername());
		user.setAdress(userModal.getAdress());
		user.setPhoneNumber(userModal.getPhoneNumber());
		//user.setRolec(userModal.getRoleId());
		user.setOfficeid(userModal.getOfficeid());
		Integer roleId=userModal.getRoleId();
		try
		{
			
		CgsRoles roleObje=cgsRolesDao.getCgsRolesById(roleId);
		System.out.println("cgsrolee");
		user.setRolec(roleObje);
		System.out.println("user......"+user);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
//		user.setRolec (userModal.getRoleId());
		
		return user;
	}

}
