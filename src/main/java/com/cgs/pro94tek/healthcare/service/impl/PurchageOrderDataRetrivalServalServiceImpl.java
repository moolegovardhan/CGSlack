package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.bean.SubCategory;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IPurchageOrderDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.PurchageOrderHealper;
import com.cgs.pro94tek.healthcare.helper.SchoolHelper;
import com.cgs.pro94tek.healthcare.helper.SubCategoryHelper;
import com.cgs.pro94tek.healthcare.modal.PurchageOrderModal;
import com.cgs.pro94tek.healthcare.modal.SubCategoryModal;
import com.cgs.pro94tek.healthcare.service.IPurchageOrderManagementService;

@Service("purchageOrderManagementService")
public class PurchageOrderDataRetrivalServalServiceImpl implements
		IPurchageOrderManagementService {
	@Autowired
	private IPurchageOrderDAO purchageOrderDao;

	@Override
	public PurchageOrderModal fetchBymedicinename(String medicineName)
			throws PMSException {
		PurchageOrder porder = purchageOrderDao.fetchBymedicinename(medicineName);
		PurchageOrderHealper purchageOrderHealper = new PurchageOrderHealper();
		return purchageOrderHealper.createpurchageOrderModalDetails(porder);
	}

	@Override
	public void createOrUpdateMName(PurchageOrder purchageOrder)
			throws PMSException {
		// TODO Auto-generated method stub
		purchageOrderDao.createOrUpdateItem(purchageOrder);
	}

	@Override
	public boolean updateItemByPId(String itemId) throws PMSException {
		// TODO Auto-generated method stub
		return purchageOrderDao.updateItemByPId(itemId);
	}

	@Override
	public List<PurchageOrderModal> fetchAllMedicinName(String mName)
			throws PMSException {

		System.out.println("dao implementation................:");

		List<PurchageOrder> purchageOrder = purchageOrderDao
				.fetchAllMedicinName(mName);
		PurchageOrderHealper phelper = new PurchageOrderHealper();
		return phelper.createALLpurchageModal(purchageOrder);

	}

	@Override
	public List<PurchageOrderModal> fetchAllPurchageOrder(
			PurchageOrder purchageOrderEntity) throws PMSException {
		System.out.println("dao implementation................:");

		List<PurchageOrder> purchageOrder = purchageOrderDao
				.fetchAllpurcchageOrder(purchageOrderEntity);
		PurchageOrderHealper phelper = new PurchageOrderHealper();
		return phelper.createALLpurchageModal(purchageOrder);
	}

	@Override
	public void createMultipleRecords(List<PurchageOrder> purchageOrder)
			throws PMSException {
		// TODO Auto-generated method stub

		System.out.println("enter the data in serviece.......:" + purchageOrder);

		purchageOrderDao.createMultipleRecords(purchageOrder);
		}

}
