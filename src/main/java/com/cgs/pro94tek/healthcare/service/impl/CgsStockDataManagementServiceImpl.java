package com.cgs.pro94tek.healthcare.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.CgsStock;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsStockDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.CgsStockHelper;
import com.cgs.pro94tek.healthcare.modal.CgsStockModal;
import com.cgs.pro94tek.healthcare.service.ICgsStockDataManagementServices;
import com.cgs.pro94tek.utils.SMSUtil;

@Service("cgsStockService")
public class CgsStockDataManagementServiceImpl implements ICgsStockDataManagementServices{
	@Autowired
	ICgsStockDAO cgsDAO;
	@Override
	public void createCgsStcok(CgsStock cgsStockEntity)
			throws PMSException {
		// TODO Auto-generated method stub
	CgsStock cgsStock=cgsDAO.createCgsStock(cgsStockEntity);
		if(cgsStock != null)
		{CgsStock object = cgsDAO.createCgsStock(cgsStockEntity);
			System.out.println("id of selling *****  "+object.getId());
			String cgsStore = "CGSITEM"+object.getId();
				object.setCgsStockId(cgsStore);
				cgsDAO.createCgsStock(object);
//				
			
		}
	}
	@Override
	public void createCgsStockNested(List<CgsStock> cgsStockEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		
			List<CgsStock> cgsSotckObject = cgsDAO.createCgsStock(cgsStockEntity);
			if(cgsSotckObject != null && cgsSotckObject.size() > 0){
				Long id = cgsSotckObject.get(0) != null ? cgsSotckObject.get(0).getId() : 555; 
				String cgsStockOrderNo = "CGSPUR"+id;
				for (Object object : cgsSotckObject){
					CgsStock cgsStockObj = (CgsStock)object;			
					cgsStockObj.setCgsStockId(cgsStockOrderNo);
					System.out.println("stock service hari............:"+cgsStockOrderNo);
					CgsStock cstock=new CgsStock();
					SMSUtil smsUtil= new SMSUtil();
					HashMap<String, String> params = new HashMap<String, String>();
					 params.put("user", "CGSGROUPTRANS");
					 params.put("pass", "123456");
					 params.put("sender", "CGSHCM");
					 params.put("phone",cgsStockObj.getDealerContectNo()+"");
					 params.put("text","Thanking u for Shopping.."+ "order number is  "+cgsStockOrderNo);
					 params.put("priority", "ndnd");
					 params.put("stype", "normal");
					 
					String resp = smsUtil.performPostCall("http://trans.smsfresh.co/api/sendmsg.php", params);
					System.out.println("sms sent ..:"+resp);
					
					cgsDAO.createCgsStock(cgsStockObj);
				}
		
	}
	}
	@Override
	public List<CgsStockModal> fetchAllCgsStock() throws PMSException {
		// TODO Auto-generated method stub
		List<String> cgsstockOrders=cgsDAO.fetchAllCgsStock();
		CgsStockHelper cgsStockhelper=new CgsStockHelper();
		return cgsStockhelper.createALLCgsStockModalGroup(cgsstockOrders);
	}
	@Override
	public List<CgsStockModal> fetchAllCgsStockByorderNO(String orderNO)
			throws PMSException {
		System.out.println("enter the value serviceimp.....:");
		List<CgsStock> cgsStockObj=cgsDAO.fetchAllCgsStockByorderNO(orderNO);
		CgsStockHelper cgsStockhelper=new CgsStockHelper();
		return cgsStockhelper.getALLStockModalByOrder(cgsStockObj);
			
	}
	@Override
	public boolean deleteCgsstockById(Long orderNO) throws PMSException {
		// TODO Auto-generated method stub
		return cgsDAO.deleteCgsStockById(orderNO);
	}
	@Override
	public boolean updateCgsStock(CgsStockModal cgsStockModal,String id){
		try{CgsStockHelper cgsStockhelper=new CgsStockHelper();
		 CgsStock cgsStock = cgsDAO.getCgsStockId(Long.parseLong(id));
		 //System.out.println("agentObj ph : "+agentObj.getMobileNumber());
		 CgsStock cgsStockEntity = cgsStockhelper.updateCgsStockEntity(cgsStockModal, cgsStock);
		 System.out.println("agentEntity ph : "+cgsStock.getDealerName());
		 cgsDAO.createOrUpdatecreateCgsStock(cgsStockEntity);
		 return true;
		}catch(Exception e){
			 return false;			
		}
		
	}
	/*@Override
	public boolean updateAmount(CgsStockModal cgsStockModal, Long id) {
		try{
			CgsStockHelper cgsStockhelper=new CgsStockHelper();
		 CgsStock cgsStock = cgsDAO.getCgsStockId(id);
		 //System.out.println("agentObj ph : "+agentObj.getMobileNumber());
		 CgsStock cgsStockEntity = cgsStockhelper.updateCgsStockAmount(cgsStockModal, cgsStock);
		 System.out.println("agentEntity ph : "+cgsStock.getDealerName());
		 cgsDAO.createOrUpdatecreateCgsStock(cgsStockEntity);
		 return true;
		}catch(Exception e){
			 return false;			
		}
		
	}*/
	@Override
	public CgsStock updatePurchageAmount(Long id,Long totalAmount) {
		
		return cgsDAO.createOrUpdatePurchageAamount(id, totalAmount);
	}
	@Override
	public boolean updateSellingAmount(CgsStockModal cgsStockModal, String id)throws PMSException {
		try{System.out.println("service.................:"+id);
			CgsStock hc=new CgsStock();
			CgsStockHelper cgsStockhelper=new CgsStockHelper();
		 CgsStock cgsStock = cgsDAO.getCgsStockStoreId(id);
		 System.out.println("cgsStock ph : "+cgsStock.getId());
		 CgsStock cgsStockEntity = cgsStockhelper.updateCgsSellingOrdaer(cgsStockModal, cgsStock);
		 System.out.println("cgsStock ph .....: "+cgsStock.getTotalAmount());
		 cgsDAO.createOrUpdatecreateCgsStock(cgsStockEntity);
		 System.out.println("serviec End..."+cgsStockEntity);
		 return true;
		}catch(Exception e){
			e.printStackTrace();	
	}
		return false;
}
	@Override
	public boolean updatePurchageAmount(CgsStockModal cgsStockModal, String id)
			throws PMSException {
		try{System.out.println("service.................:"+id);
		CgsStock hc=new CgsStock();
		CgsStockHelper cgsStockhelper=new CgsStockHelper();
	 CgsStock cgsStock = cgsDAO.getCgsStockStoreId(id);
	 System.out.println("cgsStock ph : "+cgsStock.getId());
	 CgsStock cgsStockEntity = cgsStockhelper.updateCgsPurchage(cgsStockModal, cgsStock);
	 System.out.println("cgsStock ph .....: "+cgsStock.getTotalAmount());
	 cgsDAO.createOrUpdatecreateCgsStock(cgsStockEntity);
	 System.out.println("serviec End..."+cgsStockEntity);
	 return true;
	}catch(Exception e){
		e.printStackTrace();	
}return false;
	}
	@Override
	public List<CgsStockModal> fetchAllCgsStockTracking(String orderNO)
			throws PMSException {
		List<CgsStock> cgsStockObj=cgsDAO.getStockStatusTracking(orderNO);
		CgsStockHelper cgsStockhelper=new CgsStockHelper();
		return cgsStockhelper.getALLStockModalByOrder(cgsStockObj);
		
	}}
	
	

