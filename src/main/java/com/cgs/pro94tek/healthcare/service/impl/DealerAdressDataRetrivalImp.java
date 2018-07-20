package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.DealerAdress;
import com.cgs.pro94tek.healthcare.bean.Land;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IDealerAdressDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ILanDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.DealerAdressHelper;
import com.cgs.pro94tek.healthcare.helper.LandHelper;
import com.cgs.pro94tek.healthcare.modal.DealerAdressModal;
import com.cgs.pro94tek.healthcare.modal.LandModal;
import com.cgs.pro94tek.healthcare.service.IDealerAdressDataManagerService;
import com.cgs.pro94tek.healthcare.service.LandDataRetrivalService;


@Service("DealerAdmin")
public class DealerAdressDataRetrivalImp implements IDealerAdressDataManagerService {

	@Autowired
	private IDealerAdressDAO  dealerAdressDAO;
	
	@Override
	public DealerAdressModal fetchDealerAdressById(String adressId)
			throws PMSException {
		DealerAdress  dadress=dealerAdressDAO.fetchDealerAdressById(adressId);
		DealerAdressHelper   dhelper=new DealerAdressHelper();
		// TODO Auto-generated method stub
		return dhelper.createDealerAdressModal(dadress);
	}

	@Override
	public boolean deleteDealerAdressById(String adressId) throws PMSException {
		// TODO Auto-generated method stub
		return dealerAdressDAO.deleteDealerAdressById(adressId);
	}

	@Override
	public void createOrUpdateDealerAdress(DealerAdress adressEntity)
			throws PMSException {
		// TODO Auto-generated method stub
		dealerAdressDAO.createOrUpdateDealerAdress(adressEntity);
	}
	
	
	
	

	
	

}
