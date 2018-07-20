package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IOnlineShoppingDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.OnlineShopingPurchageHelper;
import com.cgs.pro94tek.healthcare.modal.OnlinePurchageModal;
import com.cgs.pro94tek.healthcare.service.IOnlineShopingDataManagementServices;


@Service("onlinePurchage")
public class OnlinShopingDataRetrivalServicesImpl implements IOnlineShopingDataManagementServices {
	@Autowired
	IOnlineShoppingDAO onlineShopingDAO;
	@Override
	public void onlineserCreatePost(OnlinePurchage onlinePurchageEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		onlineShopingDAO.createOnlinePurchge(onlinePurchageEntity);
	}

	@Override
	public List<OnlinePurchageModal> fetchAlOnlinePurchageMulitpule(
			OnlinePurchage onlinePEntity) throws PMSException {
		System.out.println("dao implementation................:");
		List<OnlinePurchage> onlinePurchage=onlineShopingDAO.getAllOnlinePurchage(onlinePEntity);
		OnlineShopingPurchageHelper onlineHelper=new OnlineShopingPurchageHelper();
		return onlineHelper.fetchALLOnlinePurchageModal(onlinePurchage);
	}

	@Override
	public OnlinePurchageModal getOnlinePurchage(String orderNO)
			throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void postMultipleRecordsOnlinep(List<OnlinePurchage> purchageEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		List<OnlinePurchage> onlinePurObj = onlineShopingDAO.createMultipuleOrUpdateRecords(purchageEntity);
		if(onlinePurObj != null && onlinePurObj.size()>0)
			{
			Long id = onlinePurObj.get(0) != null ? onlinePurObj.get(0).getId() : 777;
			String onlineprNo ="cgspur"+id;
				for(Object object : onlinePurObj)
				{	OnlinePurchage onpurchageObject= (OnlinePurchage)object;
				onpurchageObject.setOrderNO(onlineprNo);
					onlineShopingDAO.createOnlinePurchge(onpurchageObject);
				}
			}
	}

	@Override
	public List<OnlinePurchageModal> fetchOnlinePurchageByOrderNO(String orderNO)
			throws PMSException {
		System.out.println("dao implementation................:");
		List<OnlinePurchage> onlinePurchage=onlineShopingDAO.getAllOnlinePurchageByOrderNo(orderNO);
		OnlineShopingPurchageHelper onlineHelper=new OnlineShopingPurchageHelper();
		// TODO Auto-generated method stub
		return onlineHelper.fetchALLOnlinePurchageModal(onlinePurchage);
	}
	
/*	List<SellingOderList> sellingObjects = sellingOrdreDao.createMultipleRecords(sellOrder);
	if(sellingObjects != null && sellingObjects.size() > 0){
		String sellingOrderNo = "cgssel"+sellingObjects.get(0).getId();
		for (SellingOderList sellingObj : sellingObjects){
			sellingObj.setSellingOderNumber(sellingOrderNo);
			sellingOrdreDao.createOrUpdateSelleingOrder(sellingObj);
		}
	}
	*/
	/*public void createNestedRecords(List<AgentsQuatations> agentEntity)
			throws PMSException {
		List<AgentsQuatations> agentquatationObject = agentQdao.createOrUpdateAgent(agentEntity);
		if(agentquatationObject != null && agentquatationObject.size() > 0)
		{
			Long id = agentquatationObject.get(0) != null ? agentquatationObject.get(0).getId() : 555; 
			String agentOrderNo = "cgssel"+id;
			for (Object object : agentquatationObject){
				AgentsQuatations agnetQuatatioObj = (AgentsQuatations)object;			
				agnetQuatatioObj.setSellingodNo(agentOrderNo);
				agentQdao.createOrUpdateAgent(agnetQuatatioObj);
			}*/


	

	

}
