package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.modal.CgsRolesModal;

@Component
public interface ICgsRolesService {
	public List<CgsRolesModal>  getCgsRolers()throws DataAccessException;
	public CgsRolesModal getCgsRoleById(String roleId)throws DataAccessException;

}
