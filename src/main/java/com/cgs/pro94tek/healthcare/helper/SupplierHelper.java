package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;

public class SupplierHelper {
	public List<SupplierModal> createsupplierModal(List<Supplier> supplier){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		
		List<SupplierModal> supplierModals = new ArrayList<SupplierModal>();
		for(Supplier supplierobj : supplier){
			SupplierModal suppliermodal1 = new SupplierModal();
			suppliermodal1.setSuppliername((supplierobj.getSuppliername()));
			suppliermodal1.setContactpersonName(supplierobj.getContactpersonName());
			suppliermodal1.setEmail(supplierobj.getEmail());
			suppliermodal1.setSupMobileNo(supplierobj.getSupMobileNo());
			suppliermodal1.setLandlineNo(supplierobj.getLandlineNo());
			suppliermodal1.setStatus(supplierobj.getStatus());
			suppliermodal1.setTln(supplierobj.getTln());
			/*suppliermodal1.setDlnumber(supplierobj.getDlnumber());*/
			suppliermodal1.setCreatedDate(df.format(supplierobj.getCreatedDate()));
			suppliermodal1.setCreatedBy(supplierobj.getCreatedBy());
			suppliermodal1.setOfficeId(supplierobj.getOfficeId());
			suppliermodal1.setId(supplierobj.getId());
			supplierModals.add(suppliermodal1);
		}
		


		return supplierModals;
	}


	public Supplier createSupplier(SupplierModal supplierModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Supplier supplier = new Supplier();
		supplier.setSuppliername(supplierModal.getSuppliername());
		supplier.setContactpersonName(supplierModal.getContactpersonName());
		supplier.setEmail(supplierModal.getEmail());
		supplier.setSupMobileNo(supplierModal.getSupMobileNo());
		supplier.setLandlineNo(supplierModal.getLandlineNo());
		supplier.setStatus(supplierModal.getStatus());
		supplier.setCreatedDate(new Date());
		supplier.setCreatedBy(supplierModal.getCreatedBy());
		supplier.setOfficeId(supplierModal.getOfficeId());
		supplier.setStatus(supplierModal.getStatus());
		supplier.setId(supplierModal.getId());
		
		return supplier;
	}


}

