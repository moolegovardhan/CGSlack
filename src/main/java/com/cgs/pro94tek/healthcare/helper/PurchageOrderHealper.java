package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;
/*import com.cgs.pro94tek.utils.PurchageOrderContext;*/

@Component
public class PurchageOrderHealper {
	
	
	
	
	public List<PurchageOrderModal> createALLpurchageModal(List<PurchageOrder> purchageOrder){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<PurchageOrderModal> purchageorderyModals = new ArrayList<PurchageOrderModal>();
		for(PurchageOrder porederobj : purchageOrder)
		{
			PurchageOrderModal purchageOrderModal1 = new PurchageOrderModal();
			
			purchageOrderModal1.setItemName(porederobj.getItemName());
			purchageOrderModal1.setCreatedBy(porederobj.getCreatedBy());
			purchageOrderModal1.setDeleveryDate(porederobj.getDeleveryDate());
			purchageOrderModal1.setId(porederobj.getId());
			purchageOrderModal1.setItemId(porederobj.getItemId());
			purchageOrderModal1.setPurchaseorderId(porederobj.getPurchaseorderId());
			purchageOrderModal1.setOfficeId(porederobj.getOfficeId());
			purchageOrderModal1.setQuantity(porederobj.getQuantity());
			purchageOrderModal1.setItemType(porederobj.getItemType());
			purchageOrderModal1.setItemPrice(porederobj.getItemPrice());
			purchageOrderModal1.setCreatedDate(porederobj.getCreatedDate());
			purchageorderyModals.add(purchageOrderModal1);
			
		}
		return purchageorderyModals;
		}
	
	public PurchageOrderModal createpurchageOrderModalDetails(PurchageOrder purchageOrder)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		PurchageOrderModal purchageOrderModal = new PurchageOrderModal();
		System.out.println("helper pur1..........:"+purchageOrderModal);
		purchageOrderModal.setId(purchageOrder.getId());
		purchageOrderModal.setItemName(purchageOrder.getItemName());
		purchageOrderModal.setCreatedBy(purchageOrder.getCreatedBy());
	
		return purchageOrderModal;
	}
	
	public PurchageOrder createpurchageOrderDetails(PurchageOrderModal purchageOrderModal)
	{	
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		PurchageOrder purchageOrder=new PurchageOrder();
		System.out.println("hellow  purchageorder..........:"+purchageOrder);
		purchageOrder.setItemName(purchageOrderModal.getItemName());
		purchageOrder.setCreatedBy(purchageOrderModal.getCreatedBy());
		purchageOrder.setItemType(purchageOrderModal.getItemType());
		purchageOrder.setOfficeId(purchageOrderModal.getOfficeId());
		purchageOrder.setSupplierName(purchageOrderModal.getSupplierName());
		purchageOrder.setId(purchageOrderModal.getId());
		purchageOrder.setItemId(purchageOrderModal.getItemId());
		purchageOrder.setPurchaseorderId(purchageOrderModal.getPurchaseorderId());
		purchageOrder.setOfficeId(purchageOrderModal.getOfficeId());
		purchageOrder.setQuantity(purchageOrderModal.getQuantity());
		purchageOrder.setCreatedDate(purchageOrderModal.getCreatedDate());
		return purchageOrder;
		
	}

	public List<PurchageOrder> inserMultiplepurchageOrderList(List<PurchageOrderModal> pOModal, String officeId,String supplierName){
		System.out.println("modalhelper<>2222222222222222");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<PurchageOrder> purchageorderys = new ArrayList<PurchageOrder>();
		for(PurchageOrderModal poredermodalobj : pOModal)
		{
			PurchageOrder purchageOrder1 = new PurchageOrder();
			System.out.println("enter the data into the elements......:");
			purchageOrder1.setItemName(poredermodalobj.getItemName());
			purchageOrder1.setCreatedBy(poredermodalobj.getCreatedBy());
			purchageOrder1.setDeleveryDate(poredermodalobj.getDeleveryDate());
			purchageOrder1.setSupplierName(supplierName);
			purchageOrder1.setId(poredermodalobj.getId());
			purchageOrder1.setItemId(poredermodalobj.getItemId());
			purchageOrder1.setPurchaseorderId(poredermodalobj.getPurchaseorderId());
			purchageOrder1.setOfficeId(officeId);
			purchageOrder1.setQuantity(poredermodalobj.getQuantity());
			purchageOrder1.setItemType(poredermodalobj.getItemType());
			purchageOrder1.setCreatedDate(poredermodalobj.getCreatedDate());
			purchageorderys.add(purchageOrder1);
			System.out.println("purchageoredr.................:"+purchageorderys);
			
		}
		System.out.println("purchageoredr6666.................:"+purchageorderys);
		return purchageorderys;
			
	}
}
