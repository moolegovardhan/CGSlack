package com.cgs.pro94tek.healthcare.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Expenses;

public interface IExpensesDAO {
	
	public Expenses fetchExpensesById(String expenseId)throws DataAccessException;
	public boolean deleteExpensesById(String expensesId)throws DataAccessException;
	public void createOrUpdateExpense(Expenses expense) throws DataAccessException;

}
