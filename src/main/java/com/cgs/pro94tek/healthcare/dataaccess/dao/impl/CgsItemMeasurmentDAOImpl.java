package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CgsItemMeasurments;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsItemMeasurmentsDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.CgsItemMeasurmentsModal;
import com.cgs.pro94tek.utils.PmsUtil;
@Repository("itemMeasurmentDAO")
public class CgsItemMeasurmentDAOImpl extends CustomHibernateDaoSupport implements ICgsItemMeasurmentsDAO {

	@SuppressWarnings ("unchecked")
	 @Transactional
	public List<CgsItemMeasurments> fetchAllMesurments(
			CgsItemMeasurments cgsItems) throws DataAccessException {
		List<CgsItemMeasurments>  itemList=new ArrayList<CgsItemMeasurments>();
		String sqlQuery=" from CgsItemMeasurments  order by id";
		Query query = getSession().createQuery(sqlQuery);
		List<CgsItemMeasurments> itemLists=query.list();
		if (PmsUtil.isCollectionNotEmpty(itemLists)) {
			return itemLists;
		}else{
			return itemList;
	
		}
		// TODO Auto-generated method stub
		
	}
	

}
