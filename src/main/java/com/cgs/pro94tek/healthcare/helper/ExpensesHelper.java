package com.cgs.pro94tek.healthcare.helper;

import java.text.ParseException;
import com.cgs.pro94tek.healthcare.bean.Expenses;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.ExpensesModal;

public class ExpensesHelper {
	
	
	/**
	 * This method will convert Expenses Object to ExpensesModal object
	 * @param school
	 * @return
	 */
	public ExpensesModal createschoolModal(Expenses expenses){
		/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); */
		ExpensesModal expensesModal = new ExpensesModal();
		expensesModal.setExpensesname(expenses.getExpensesname());
		

		return expensesModal;
	}
	
	
	public Expenses createExpense(ExpensesModal expensesModal) throws PMSException, ParseException{
		/*DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); */
		Expenses expense = new Expenses();
		expense.setExpensesname(expensesModal.getExpensesname());
		expense.setExpensestype(expensesModal.getExpensestype());
		expense.setAmount(expensesModal.getAmount());
		expense.setId(expensesModal.getId());
		
		return expense;
	}

}
