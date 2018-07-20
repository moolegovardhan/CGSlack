package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Expenses;

import com.cgs.pro94tek.healthcare.dataaccess.dao.IExpensesDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("expensesDAO")
public class ExpensesDAOImpl extends CustomHibernateDaoSupport implements IExpensesDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public Expenses fetchExpensesById(String expenseId) throws DataAccessException {
		Expenses expense = null;
		String queryExpensesById  = "from Expenses where id = :expensesId";
		System.out.println("get data by expenses id............:"+queryExpensesById);
		Query query = getSession().createQuery(queryExpensesById);
		query.setParameter("expensesId", Long.parseLong(expenseId));
		List<Expenses> expenses = query.list();
		if (PmsUtil.isCollectionNotEmpty(expenses)) {
			expense = expenses.get(0);
		}
		return expense;
	}

	@Transactional
	public boolean deleteExpensesById(String expensesId)
			throws DataAccessException {
		System.out.println("delete schooId...........:"+expensesId);
		String queryExcep = " Delete from Expenses where id = :expensesId";
		Query query = getSession().createQuery(queryExcep);
		query.setParameter("expensesId", Long.parseLong(expensesId));
		query.executeUpdate();
		
		// TODO Auto-generated method stub
		return true;
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void createOrUpdateExpense(Expenses expense) throws DataAccessException {
		System.out.println("createorupdate expense ............:"+expense);
		getSession().saveOrUpdate(expense);
	}

	
	
}
