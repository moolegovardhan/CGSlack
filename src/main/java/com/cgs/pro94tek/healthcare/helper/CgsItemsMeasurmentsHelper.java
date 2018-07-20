package com.cgs.pro94tek.healthcare.helper;

import java.util.ArrayList;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.CgsItemMeasurments;
import com.cgs.pro94tek.healthcare.modal.CgsItemMeasurmentsModal;

public class CgsItemsMeasurmentsHelper {
	
	public CgsItemMeasurments  createCgsTems(CgsItemMeasurmentsModal itemMezur)
	{
		
		CgsItemMeasurments itemObje=new CgsItemMeasurments();
		
		itemObje.setId(itemMezur.getId());
		itemObje.setItemMeaserMents(itemMezur.getItemMeaserMents());
		itemObje.setMeasurmentNo(itemMezur.getMeasurmentNo());
		
		return itemObje;
		
		
		
	}
	
	public List<CgsItemMeasurmentsModal>  cgsItemModal(List<CgsItemMeasurments> itemobj){
		
		List<CgsItemMeasurmentsModal> itemModel=new ArrayList<CgsItemMeasurmentsModal>();
		
		for(CgsItemMeasurments itemObjects :itemobj)
		{
			
			CgsItemMeasurmentsModal itemModal=new  CgsItemMeasurmentsModal();
			itemModal.setId(itemObjects.getId());
			itemModal.setItemMeaserMents(itemObjects.getItemMeaserMents());
			itemModal.setMeasurmentNo(itemObjects.getMeasurmentNo());
			itemModel.add(itemModal);
		}
		
		
		return itemModel;
		
	}

}
