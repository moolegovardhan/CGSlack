package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.cgs.pro94tek.healthcare.bean.Construction;
import com.cgs.pro94tek.healthcare.modal.ConstructionModal;

public class ConstructionHelper {

	
public 	ConstructionModal createConstructionModal(Construction constentit){
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	ConstructionModal  constModal=new ConstructionModal();
	constModal.setId(constentit.getId());
	constModal.setBedroom(constentit.getBedroom());
	constModal.setModalhouse(constentit.getModalhouse());
	constModal.setElevent(constentit.getElevent());
	constModal.setUserid(constentit.getUserid());
	constModal.setOwnerName(constentit.getOwnerName());
	return constModal;
}

public Construction createcreateConstruction(ConstructionModal  constModal)
{
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Construction constra=new Construction();
	constra.setId(constModal.getId());
	constra.setBedroom(constModal.getBedroom());
	constra.setModalhouse(constModal.getModalhouse());
	constra.setElevent(constModal.getElevent());
	constra.setUserid(constModal.getUserid());
	constra.setOwnerName(constModal.getOwnerName());
	return constra;
}
}
