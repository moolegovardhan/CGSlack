package com.cgs.pro94tek.healthcare.service;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ExpensesModal;

@Component
public interface IExpensesDataRetrivalService {
	
	public ExpensesModal fetchExpensesById(String expensesId) throws PMSException;
	public boolean deleteExpensesById(String expensesId)throws PMSException;
	public void createOrUpdateExpenses(Expenses expense)throws PMSException;
}
