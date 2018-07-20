package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.ShoperInfo;
import com.cgs.pro94tek.healthcare.modal.ItemModal;
import com.cgs.pro94tek.healthcare.modal.ShoperInfoModal;


@Component
public class ShoperInfoHellper {
	
	

	public List<ShoperInfoModal> createAllShoperModal(List<ShoperInfo> shoperinfo){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ShoperInfoModal> shoperModals = new ArrayList<ShoperInfoModal>();
		for(ShoperInfo shoperobj : shoperinfo)
		{
			ShoperInfoModal shoperModaln = new ShoperInfoModal();

			
			shoperModaln.setShoperId(shoperobj.getShoperId());
			shoperModaln.setBranchName(shoperobj.getBranchName());
			shoperModaln.setShoperContact(shoperobj.getShoperContact());
			shoperModaln.setAreaName(shoperobj.getAreaName());
			shoperModaln.setShperAdress(shoperobj.getShperAdress());
			shoperModaln.setShoperName(shoperobj.getShoperName());
			shoperModaln.setId(shoperobj.getId());
			/*shoperModaln.setSpContact(shoperobj.getSpContact());*/
			shoperModals.add(shoperModaln);
		}return shoperModals;
	}
	
	public List<ShoperInfo> createAllShoperInfo(List<ShoperInfoModal> shoperinfoModal){
		System.out.println("modalhelper<>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("helper.............:");
		List<ShoperInfo> shoperInfos = new ArrayList<ShoperInfo>();
		for(ShoperInfoModal shoperModalobj : shoperinfoModal)
		{
			ShoperInfo shoperinfo = new ShoperInfo();
			
			shoperinfo.setAreaName(shoperModalobj.getAreaName());
			shoperinfo.setShoperContact(shoperModalobj.getShoperContact());
			shoperinfo.setBranchName(shoperModalobj.getBranchName());
			shoperinfo.setId(shoperModalobj.getId());
			shoperinfo.setShoperContact(shoperModalobj.getShoperContact());
			shoperinfo.setShoperId(shoperModalobj.getShoperId());
			shoperinfo.setShperAdress(shoperModalobj.getShperAdress());
			/*shoperinfo.setSpContact(shoperModalobj.getSpContact());*/
			shoperinfo.setShoperName(shoperModalobj.getShoperName());
			shoperInfos.add(shoperinfo);
		}return shoperInfos;
	}
	public ShoperInfoModal createShoperModal(ShoperInfo shperInfo)throws NullPointerException
	{
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	ShoperInfoModal shoperModal = new ShoperInfoModal();
	shoperModal.setId(shperInfo.getId());
	shoperModal.setAreaName(shperInfo.getAreaName());
		return shoperModal;
	}
	
	public ShoperInfo createShoperInfo(ShoperInfoModal shperInfoModal)throws NullPointerException
	{
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	ShoperInfo shoperInfol = new ShoperInfo();
	shoperInfol.setId(shperInfoModal.getId());
	shoperInfol.setShoperContact(shperInfoModal.getShoperContact());
	shoperInfol.setShoperId(shperInfoModal.getShoperId());
	shoperInfol.setShoperName(shperInfoModal.getShoperName());
	/*shoperInfol.setShoperId(shoperId);(shperInfoModal);*/
	shoperInfol.setShperAdress(shperInfoModal.getShperAdress());
	shoperInfol.setAreaName(shperInfoModal.getAreaName());
	
		return shoperInfol;
	}
	
}
