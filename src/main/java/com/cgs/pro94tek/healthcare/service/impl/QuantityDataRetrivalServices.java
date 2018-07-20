package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.QuatationData;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IQuantityDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CategoryHelper;
import com.cgs.pro94tek.healthcare.helper.QuatationHelper;
import com.cgs.pro94tek.healthcare.modal.QuatationModal;
import com.cgs.pro94tek.healthcare.service.IQuantityDataManagementService;





@Service("auantityDataRetrivalServices")
public class QuantityDataRetrivalServices  implements IQuantityDataManagementService {
	
	@Autowired
	private IQuantityDAO quantityDAO;
	
	@Override
	public QuatationModal fetchQuatationByPId(String purchageId)
			throws PMSException {
		QuatationData quatationData=quantityDAO.fetchQuatationByPId(purchageId);
		QuatationHelper qHelper=new QuatationHelper();
		
		return qHelper.createQuatation(quatationData);
	}

	@Override
	public void createOrUpdateQuatation(QuatationData quatationEntity)
			throws PMSException {
		
		// TODO Auto-generated method stub
		
		quantityDAO.createOrUpdateQuatation(quatationEntity);

		
	}

	@Override
	public List<QuatationModal> fetchAllQuatation(QuatationData quatationEntity)
			throws PMSException {
		System.out.println("service  for fetching all records..........:"+quatationEntity);
		List<QuatationData>  quatation=quantityDAO.fetchAllQuatation(quatationEntity);
		QuatationHelper qHelper=new QuatationHelper();
		// TODO Auto-generated method stub
		return qHelper.createAllQuatation(quatation);
	}

	@Override
	public void createMultipleQuatation(List<QuatationData> quatationEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		quantityDAO.createMultipleQuatation(quatationEntity);
	}

}
