package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;






import com.cgs.pro94tek.healthcare.bean.ShoperOrderList;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.SellingOrderListModal;
import com.cgs.pro94tek.healthcare.modal.ShoperOrderListModal;

@Component
public interface IShoperOrderListDataManageService {
	
	public void createOrUpdateShoperOrder(String  sellingodNo)throws PMSException;
	public List<ShoperOrderListModal>  fetchAlSellingOrder(ShoperOrderList shoperOrderEntity)throws PMSException;
	public SellingOrderListModal  getSellingorderbyId(String agentId)throws PMSException;

}
