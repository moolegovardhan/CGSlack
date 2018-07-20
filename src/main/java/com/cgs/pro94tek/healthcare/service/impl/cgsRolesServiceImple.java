package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsRoles;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsRolesDao;
import com.cgs.pro94tek.healthcare.helper.CgsRolesHelper;
import com.cgs.pro94tek.healthcare.modal.CgsRolesModal;
import com.cgs.pro94tek.healthcare.service.ICgsRolesService;
@Service("cgsRolesService")
public class cgsRolesServiceImple  implements ICgsRolesService   {

	@Autowired
	ICgsRolesDao  cgsRoleDao;
	@Override
	public List<CgsRolesModal> getCgsRolers() throws DataAccessException 
		{	
		// TODO Auto-generated method stub
		List<CgsRoles> cgsRolesObj=cgsRoleDao.getcgsRoles();
		CgsRolesHelper CgsRolesHrlper=new CgsRolesHelper();
		return CgsRolesHrlper.createCgsRoleModal(cgsRolesObj);
		
		}
	@Override
	public CgsRolesModal getCgsRoleById(String roleId)
			throws DataAccessException {
		System.out.println("service Imple.......:");
		CgsRoles cgsRolesObj=cgsRoleDao.getCgsRolesById(Integer.parseInt(roleId));
		System.out.println(cgsRolesObj);
		CgsRolesHelper CgsRolesHrlper=new CgsRolesHelper();
		return CgsRolesHrlper.createCgsRoleListModel(cgsRolesObj);
	}

}
