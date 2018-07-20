package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;






import com.cgs.pro94tek.healthcare.bean.MyUsers;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.modal.MyuserModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;

public class MyuserHelper {
	
	
	public UserModal  createMyuserModal(User  myuser)throws NullPointerException
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		UserModal  myusermodal=new UserModal();
		
		myusermodal.setAdress(myuser.getAdress());
		myusermodal.setOfficeid(myuser.getOfficeid());
		myusermodal.setPassword(myuser.getPassword());
		myusermodal.setUsername(myuser.getUserName());
	
		return myusermodal;
		
		
		
	}

}
