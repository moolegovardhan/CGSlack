package com.cgs.pro94tek.healthcare.service.impl;


import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.cgs.pro94tek.healthcare.bean.SellingOderList;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ISellingOrderListDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.SellingOderHelper;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.service.ISellingDataManagementService;

@Service("SellingOrder")
public class SellingOrderDataRetrivalServieceImpl implements ISellingDataManagementService{

	@Autowired
	private ISellingOrderListDAO  sellingOrdreDao;
	
	@Override
	public void createOrUpdateSellingService(SellingOderList sellingOderList)
			throws PMSException {
		// TODO Auto-generated method stub
		/*SellingOderList object = sellingOrdreDao.createOrUpdateSelleingOrder(sellingOderList);
		System.out.println("id of selling *****  "+object.getId());
		String sellingOrderNo = "cgssel"+object.getId();
			object.setSellingOderNumber(sellingOrderNo);*/
		sellingOrdreDao.createOrUpdateSelleingOrder(sellingOderList);
		
		
	}

	@Override
	public List<SellingOrderListModal> fetchAlSellingOrder(SellingOderList SellingOderEnity) throws PMSException {
		System.out.println("dao implementation................:");
		List<SellingOderList> sellingOrder=sellingOrdreDao.fetchAlSellingOrder(SellingOderEnity);
		SellingOderHelper sellhelper=new SellingOderHelper();
		return sellhelper.createALLSellingOrderModal(sellingOrder);
		
	}

	@Override
	public SellingOrderListModal getSellingorderbyId(String agentId)
			throws PMSException {
		// TODO Auto-generated method stub
		SellingOderList sellorder=sellingOrdreDao.getSellingorderbyId(agentId);
		SellingOderHelper seHelper=new SellingOderHelper();
		return seHelper.fetchSellingList(sellorder);
	}

	@Override
	public void createMultipleRecords(List<SellingOderList> sellOrder)
			throws PMSException {
		List<SellingOderList> sellingObjects = sellingOrdreDao.createMultipleRecords(sellOrder);
		if(sellingObjects != null && sellingObjects.size() > 0){
			String sellingOrderNo = "cgssel"+sellingObjects.get(0).getId();
			for (SellingOderList sellingObj : sellingObjects){
				sellingObj.setSellingOderNumber(sellingOrderNo);
				sellingOrdreDao.createOrUpdateSelleingOrder(sellingObj);
			}
		}
		
	}

	@Override
	public List<SellingOrderListModal> fetchAlSellingOrderByNo(
			String sellingOrderNo) throws PMSException {
		// TODO Auto-generated method stub
		List<SellingOderList> sellingOrderObj=sellingOrdreDao.getSellingOrderByNumber(sellingOrderNo);
		SellingOderHelper selHelper=new SellingOderHelper();
		return selHelper.createALLSellingOrderModal(sellingOrderObj);
	}
	
	@Override
	public List<SellingOrderListModal> fetchAllSellingOrders() throws PMSException {	
		List<String> sellingOderNumbers=sellingOrdreDao.fetchAllSellingOrders();
		SellingOderHelper sellhelper=new SellingOderHelper();
		return sellhelper.createALLSellingOrderNoModal(sellingOderNumbers);
	}

	
}
