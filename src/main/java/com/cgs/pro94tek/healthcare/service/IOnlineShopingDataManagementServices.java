package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.OnlinePurchage;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.OnlinePurchageModal;


@Component
public interface IOnlineShopingDataManagementServices {
	public void onlineserCreatePost(OnlinePurchage  onlinePurchageEntity)throws PMSException;
	public List<OnlinePurchageModal>  fetchAlOnlinePurchageMulitpule(OnlinePurchage onlinePEntity)throws PMSException;
	public OnlinePurchageModal  getOnlinePurchage(String orderNO)throws PMSException;
	public void postMultipleRecordsOnlinep(List<OnlinePurchage> purchageEntity)throws PMSException;
	public List<OnlinePurchageModal>  fetchOnlinePurchageByOrderNO(String  orderNO)throws PMSException;
}
