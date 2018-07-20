package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.WardType;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.WardTypeModal;

public class WardTypeHelper {
	
	public List<WardTypeModal> createwardModal(List<WardType> wardtype){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<WardTypeModal> WardtypeModals = new ArrayList<WardTypeModal>();
		for (WardType wardtypeobj : wardtype) {
			WardTypeModal wardtypModal1 = new WardTypeModal();
			wardtypModal1.setWardtype(wardtypeobj.getWardtype());
			wardtypModal1.setCreatedBy(wardtypeobj.getCreatedBy());
			wardtypModal1.setCreatedDate(df.format(wardtypeobj.getCreatedDate()));
			wardtypModal1.setStatus(wardtypeobj.getStatus());
			wardtypModal1.setOfficeid(wardtypeobj.getOfficeid());
			wardtypModal1.setId(wardtypeobj.getId());
			WardtypeModals.add(wardtypModal1);
		}
		


		return WardtypeModals;
	}

	
	public WardType createWardType(WardTypeModal wardtypeModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		WardType wardtype = new WardType();
		wardtype.setWardtype(wardtypeModal.getWardtype());
		wardtype.setOfficeid(wardtypeModal.getOfficeid());
		wardtype.setCreatedDate(new Date());
		wardtype.setCreatedBy(wardtypeModal.getCreatedBy());
		wardtype.setStatus(wardtypeModal.getStatus());
		wardtype.setId(wardtypeModal.getId());
		
		return wardtype;
	}

}
