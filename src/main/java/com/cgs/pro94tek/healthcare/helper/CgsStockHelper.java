package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;





import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.AgentsQuatations;
import com.cgs.pro94tek.healthcare.bean.CgsStock;
import com.cgs.pro94tek.healthcare.modal.AgentQuationModal;
import com.cgs.pro94tek.healthcare.modal.CgsStockModal;

@Component
public class CgsStockHelper {
	
	public List<CgsStockModal> createALLCgsStockModal(List<CgsStock> cgsStockEntity)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<CgsStockModal> cgsStockModalObj = new ArrayList<CgsStockModal>();
		for(CgsStock cgsStockObj : cgsStockEntity)
		{
			CgsStockModal cgsStockModal = new CgsStockModal();
		
			cgsStockModal.setId(cgsStockObj.getId());
			cgsStockModal.setItemName(cgsStockObj.getItemName());
			cgsStockModal.setItemCompanyName(cgsStockObj.getItemCompanyName());
			cgsStockModal.setItemModalNO(cgsStockObj.getItemModalNO());
			cgsStockModal.setTotalAmount(cgsStockObj.getTotalAmount());
			cgsStockModal.setItemprice(cgsStockObj.getItemprice());
			cgsStockModal.setCgsStockId("1");
			cgsStockModalObj.add(cgsStockModal);
		}return cgsStockModalObj;
		}
	
	public CgsStock createALLCgsStock(CgsStockModal cgsStockModalEntity)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		
			CgsStock cgsStock = new CgsStock();
			cgsStock.setId(cgsStockModalEntity.getId());
			cgsStock.setItemName(cgsStockModalEntity.getItemName());
			cgsStock.setItemCompanyName(cgsStockModalEntity.getItemCompanyName());
			cgsStock.setItemModalNO(cgsStockModalEntity.getItemModalNO());
			cgsStock.setItemprice(cgsStockModalEntity.getItemPrice());
			cgsStock.setItemQuantity(cgsStockModalEntity.getItemQuantity());
		
			cgsStock.setCgsStockId("1");
			
		return cgsStock;
		}
	public List<CgsStock> createCgsStockNested(List<CgsStockModal> cgsStockModal,String dealerName,Long dealerContectNo,Long totalAmount,String customerName,String customerAddress ,String rolId,Long custMobileNO)throws NullPointerException{
		List<CgsStock> cgsStockObj = new ArrayList<CgsStock>();
 		for(CgsStockModal cgsStockModalS : cgsStockModal)
 		{
 			CgsStock cgsStock1 = new CgsStock();
 		
 			cgsStock1.setId(cgsStockModalS.getId());
 			cgsStock1.setItemName(cgsStockModalS.getItemName());
 			cgsStock1.setItemprice(cgsStockModalS.getItemPrice());
 			cgsStock1.setItemQuantity(cgsStockModalS.getItemQuantity());
 			cgsStock1.setDealerName(dealerName);
 			cgsStock1.setTotalAmount(totalAmount);
 			cgsStock1.setDealerContectNo(dealerContectNo);
 			cgsStock1.setCustomerName(customerName);
 			cgsStock1.setCustomerAddress(customerAddress);
 			cgsStock1.setRoleId(rolId);
 			cgsStock1.setCustMobileNO(custMobileNO);
 			cgsStock1.setCgsStockId("1");
 			cgsStock1.setStatus("y");
 			cgsStockObj.add(cgsStock1);
		
 		}
		
		
		
		return cgsStockObj;
		
		
	
	}
	public List<CgsStockModal> createALLCgsStockModalGroup(List<String> cgsStockOrderNOs)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<CgsStockModal> cgsStockModalObj = new ArrayList<CgsStockModal>();
		if(cgsStockOrderNOs.size() > 0){
 			for(String cgsStockOrderNo : cgsStockOrderNOs)
		{
			CgsStockModal cgsStockModal = new CgsStockModal();
		
			
			cgsStockModal.setCgsStockId(cgsStockOrderNo);
			cgsStockModalObj.add(cgsStockModal);
	
		
		}
	}return cgsStockModalObj;
	}
	
	/*-------------------------<get oreder by orderNO>----------------------------------*/
	public List<CgsStockModal> getALLStockModalByOrder(List<CgsStock> cgsStockEnt)throws NullPointerException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<CgsStockModal> cgsStockModals = new ArrayList<CgsStockModal>();
		for(CgsStock CgsStockObject : cgsStockEnt)
		{
			CgsStockModal cgsStockModal = new CgsStockModal();
		
			cgsStockModal.setId(CgsStockObject.getId());
			cgsStockModal.setTotalAmount(CgsStockObject.getTotalAmount());
			cgsStockModal.setItemprice(CgsStockObject.getItemprice());
			cgsStockModal.setDealerName(CgsStockObject.getDealerName());
			cgsStockModal.setItemQuantity(CgsStockObject.getItemQuantity());
			cgsStockModal.setCgsStockId(CgsStockObject.getCgsStockId());
			cgsStockModal.setDealerName(CgsStockObject.getDealerName());
			cgsStockModal.setItemName(CgsStockObject.getItemName());
			cgsStockModal.setStatus(CgsStockObject.getStatus());
			
			
			cgsStockModals.add(cgsStockModal);
			}return cgsStockModals;
		}
	
	
	public CgsStock updateCgsStockEntity(CgsStockModal  cgsStockModal,CgsStock cgsStockEntity){

		
		
		if(cgsStockModal.getItemName() != null){
			cgsStockEntity.setItemName(cgsStockModal.getItemName());		
		}
		if(cgsStockModal.getDealerName()!= null){
			cgsStockEntity.setDealerName(cgsStockModal.getDealerName());		
		}
		if(cgsStockModal.getItemQuantity()!= 0){
			cgsStockEntity.setItemQuantity(cgsStockModal.getItemQuantity());		
		}
		return cgsStockEntity;
	
}
public CgsStock updateCgsStockAmount(CgsStockModal  cgsStockModal,CgsStock cgsStockEntity){

		
		
		if(cgsStockModal.getPurchagetotal() != 0){
			cgsStockEntity.setPurchageTotal(cgsStockModal.getPurchagetotal());		
		}
		
		return cgsStockEntity;
	
}
public CgsStock updateCgsSellingOrdaer(CgsStockModal  cgsStockModal,CgsStock cgsStockEntity)
{

	System.out.println("helper..........:");
	
	if(cgsStockModal.getSelprice() != null){
		cgsStockEntity.setSelprice(cgsStockModal.getSelprice()+cgsStockModal.getTotalAmount());	
		
		System.out.println("helper"+cgsStockEntity.getSelprice());
	}
	if(cgsStockModal.getTotalAmount() != 0)
	{ 
		cgsStockEntity.setTotalAmount(cgsStockEntity.getTotalAmount()+cgsStockModal.getTotalAmount());	
		System.out.println("helper...........");
		
	}
	return cgsStockEntity;
	

}
public CgsStock  updateCgsPurchage(CgsStockModal  cgsStockModal,CgsStock cgsStockEntity)
{
	if(cgsStockModal.getTotalAmount() != 0  )
	{	Integer n=Integer.parseInt( cgsStockModal.getCgsStockId()) ;
		for(int i = 0; n<=0 ;i++)
		{
		cgsStockEntity.setTotalAmount(cgsStockModal.getTotalAmount()+cgsStockModal.getTotalAmount());	
		System.out.println("helper...........");
		}
	}
	return cgsStockEntity;
	

}
}