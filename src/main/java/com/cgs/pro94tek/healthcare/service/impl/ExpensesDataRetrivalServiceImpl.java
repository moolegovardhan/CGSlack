package com.cgs.pro94tek.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IExpensesDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ExpensesHelper;
import com.cgs.pro94tek.healthcare.modal.ExpensesModal;
import com.cgs.pro94tek.healthcare.service.IExpensesDataRetrivalService;

@Service("expensesDataRetrivalService")
public class ExpensesDataRetrivalServiceImpl implements IExpensesDataRetrivalService {
	
	@Autowired
	private IExpensesDAO expensesDAO;	
	
	
	@Override
	public ExpensesModal fetchExpensesById(String expensesId) throws PMSException {
		Expenses expense = expensesDAO.fetchExpensesById(expensesId);
		ExpensesHelper expensesHelper = new ExpensesHelper();
		return expensesHelper.createschoolModal(expense);
	}


	@Override
	public boolean deleteExpensesById(String expensesId)throws PMSException {
		// TODO Auto-generated method stub
		return expensesDAO.deleteExpensesById(expensesId);
		
	}
	
	@Override
	public void createOrUpdateExpenses(Expenses expense) throws PMSException{
		expensesDAO.createOrUpdateExpense(expense);

	}


}
