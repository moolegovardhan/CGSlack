package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.SuppliarOrderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISupplairOrderListDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SupplairOrderListHelper;
import com.cgs.pro94tek.healthcare.helper.SupplierHelper;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.SupplairOrderListModal;
import com.cgs.pro94tek.healthcare.service.ISupplairOrderListService;



@Service("supplairOrder")
public class SupplairOrderListerDataManagementServiceImpl implements ISupplairOrderListService {
	
	@Autowired
	ISupplairOrderListDAO supplairDAOImple;

	@Override
	public void createMultipleRecords(List<SuppliarOrderList> supplairList)
			throws PMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupplairOrderListModal> fetchAllSupllairOrderList(
			SuppliarOrderList supplairListEntity) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrUpdateSupplair(SuppliarOrderList supplairList)
			throws PMSException {
		// TODO Auto-generated method stub
		System.out.println("service implementation........:");
		supplairDAOImple.createOrUpdateSupplairOrder(supplairList);
	}

	@Override
	public void createSupplairOfdata(List<SuppliarOrderList> supOrder)
			throws PMSException {
		List<SuppliarOrderList> supplairObj = supplairDAOImple.createMultipleSupplairOrders(supOrder);
		if(supplairObj != null && supplairObj.size() > 0){
			String supplairOferNO = "cgssup"+supplairObj.get(0).getId();
			for (SuppliarOrderList supObj : supplairObj){
				supObj.setIdSupplairOrder(supplairOferNO);;
				supplairDAOImple.createOrUpdateSupplairOrder(supObj);
			}// TODO Auto-generated method stub
		
	}
		
	
	}

	@Override
	public List<SupplairOrderListModal> fetchSupplierOrderRequest(
			String supplierName) throws PMSException {
		// TODO Auto-generated method stub
		List<SuppliarOrderList> supOrder=supplairDAOImple.fetchSuppliarOrderByName(supplierName);
		SupplairOrderListHelper  supHelper=new SupplairOrderListHelper();
		return supHelper.createALLSupplierModalName(supOrder);
	}

	@Override
	public boolean updateSupplierOrder(SupplairOrderListModal supModal,
			String supordeno) throws PMSException {
		try{
			SuppliarOrderList supOrderList = supplairDAOImple.getSupplierById(supordeno);
			// System.out.println("agentObj ph : "+agentObj.getMobileNumber());
			SupplairOrderListHelper  supHelper=new SupplairOrderListHelper();
			SuppliarOrderList supEntity = supHelper.updateSupplierList(supModal, supOrderList);
			 //System.out.println("agentEntity ph : "+agentEntity.getMobileNumber());
			supplairDAOImple.createOrUpdateSupplier(supEntity);
			 return true;
			}catch(Exception e){
				 return false;			
			}
		
	}
}
