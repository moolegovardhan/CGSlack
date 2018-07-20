package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.CgsRoles;
import com.cgs.pro94tek.healthcare.modal.CgsRolesModal;

public class CgsRolesHelper {
	public CgsRoles  createCgsRoleList(CgsRolesModal  roleModal)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
		CgsRoles cgsrole=new CgsRoles();
		cgsrole.setRoleId(roleModal.getRoleId());
		cgsrole.setRoleName(roleModal.getRoleName());
		cgsrole.setStatus(roleModal.getStatus());
		return cgsrole; 
		
	
	
	}
	public List<CgsRolesModal>  createCgsRoleModal(List<CgsRoles>  roleEntity)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 List<CgsRolesModal>  cgsRoleModals=new ArrayList<CgsRolesModal>();
		 for(CgsRoles cgsRoleObje :roleEntity)
		 {
		CgsRolesModal cgsroleModal=new CgsRolesModal();
		cgsroleModal.setRoleId(cgsRoleObje.getRoleId());
		cgsroleModal.setRoleName(cgsRoleObje.getRoleName());
		cgsroleModal.setStatus(cgsRoleObje.getStatus());
		cgsRoleModals.add(cgsroleModal);
		
		
		 }
		return cgsRoleModals;
	
	}
	public CgsRolesModal  createCgsRoleListModel(CgsRoles  cgsRoles)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
		CgsRolesModal cgsRolesModal=new CgsRolesModal();
		cgsRolesModal.setRoleId(cgsRoles.getRoleId());
		cgsRolesModal.setRoleName(cgsRoles.getRoleName());
		cgsRolesModal.setStatus(cgsRoles.getStatus());
		return cgsRolesModal; 
		
	
	
	}
}
