package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.CgsRoles;

public interface ICgsRolesDao {
	public List<CgsRoles> getcgsRoles()throws DataAccessException;
	public CgsRoles getCgsRolesById(Integer roleId)throws DataAccessException;
}
