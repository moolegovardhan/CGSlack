package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.MyUsers;

import com.cgs.pro94tek.healthcare.dataaccess.dao.IMyuserDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;
@Repository("myuserDAO")
public class MyUserDAOImpl extends CustomHibernateDaoSupport implements IMyuserDAO {

	@SuppressWarnings("unchecked")
	@Transactional
	public MyUsers fetchUser(String username, String password)
			throws PMSException {
		MyUsers user = null;
		String queryUserByUserNameandPassword= "from MyUsers where username = :username and password = :password";
	    Query query = getSession().createQuery(queryUserByUserNameandPassword);
	    query.setParameter("username", username);
	    query.setParameter("password", password);
	      List<MyUsers> userList = query.list();
	      if (PmsUtil.isCollectionNotEmpty(userList)) {
	         user = userList.get(0);
	      }  
		return user;
		
	}

}
