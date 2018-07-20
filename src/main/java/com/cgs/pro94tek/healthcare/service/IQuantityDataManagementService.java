package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.QuatationData;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.CategoryModal;
import com.cgs.pro94tek.healthcare.modal.QuatationModal;


@Component
public interface IQuantityDataManagementService {
	
	public QuatationModal fetchQuatationByPId(String purchageId)throws PMSException;
	public void createOrUpdateQuatation(QuatationData quatationEntity) throws PMSException;
	public List<QuatationModal> fetchAllQuatation(QuatationData quatationEntity)throws PMSException;
	public void createMultipleQuatation(List<QuatationData> quatationEntity) throws PMSException;
}
