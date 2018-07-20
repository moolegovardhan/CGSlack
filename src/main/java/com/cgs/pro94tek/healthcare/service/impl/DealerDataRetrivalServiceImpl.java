package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Charge;
import com.cgs.pro94tek.healthcare.bean.Dealer;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.Supplier;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IDealerDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ChargeHelper;
import com.cgs.pro94tek.healthcare.helper.DealerHelper;
import com.cgs.pro94tek.healthcare.helper.PurchageOrderHealper;
import com.cgs.pro94tek.healthcare.helper.SupplierHelper;
import com.cgs.pro94tek.healthcare.modal.ChargeModal;
import com.cgs.pro94tek.healthcare.modal.DealerModal;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SupplierModal;
import com.cgs.pro94tek.healthcare.service.IDealerDataManagementService;



@Service("dealerService")
public class DealerDataRetrivalServiceImpl implements   IDealerDataManagementService {
	
	
	
	
		
		
		@Autowired
		private IDealerDAO dealerDAO;

					
		@Override
		public void createOrUpdateDealer(Dealer dealerEntity)
				throws PMSException {
			// TODO Auto-generated method stub
			dealerDAO.createOrUpdateDealer(dealerEntity);
		}

		@Override
		public boolean deleteDealerById(String dealerId) throws PMSException {
			// TODO Auto-generated method stub
			return dealerDAO.deleteDealerById(dealerId);
		}

		@Override
		public DealerModal fetchDealerById(String officeId)
				throws PMSException {
				System.out.println("fetcheing data...service.....:"+officeId);
				Dealer dealers = dealerDAO.fetchDealerById(officeId);
				DealerHelper dealerhelper = new DealerHelper();
				System.out.println("DealerHelper in service..........:"+dealerhelper);
				// convert tax object to company modal
				return dealerhelper.createDealerModal(dealers);
				
				
				
				
				
		}

		@Override
		public DealerModal fetchBealerByDealaerName(String dealerName)
				throws PMSException {
			System.out.println("fetcheing data...service.....:"+dealerName);
			Dealer dealer = dealerDAO.fetchBealerByDealaerName(dealerName);
			DealerHelper dealerhelper = new DealerHelper();
			System.out.println("DealerHelper in service..........:"+dealerhelper);
			// convert tax object to company modal
			// TODO Auto-generated method stub
			return dealerhelper.createDealerModal(dealer);
		}

		@Override
		public boolean deleteDealerByName(String dealerName)
				throws PMSException {
			
			System.out.println("enter the service implermentation.........:"+dealerName);
			// TODO Auto-generated method stub
			return dealerDAO.deleteDealerByName(dealerName);
		}

		@Override
		public List<DealerModal> fetchAllDealerModal(Dealer dealerEntity)
				throws PMSException {
			System.out.println("dao implementation................:");
			
			List<Dealer> dealer=dealerDAO.fetchAllDealerModal(dealerEntity);
			DealerHelper dealerHelper=new DealerHelper();
			return dealerHelper.getALLdealerModal(dealer);
		}
		}
	


