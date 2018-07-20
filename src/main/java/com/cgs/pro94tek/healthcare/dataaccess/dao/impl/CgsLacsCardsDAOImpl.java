package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.dataaccess.dao.ICgsLacsCardsDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("cgslacsCardDAO")
public class CgsLacsCardsDAOImpl extends CustomHibernateDaoSupport implements ICgsLacsCardsDAO{

	@Override
	public CgsCards getCards(CgsCards cardsEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	 @SuppressWarnings ("unchecked")
	@Transactional
	public List<CgsCards> getCgslaksCard(CgsLacs_CardsModal cgslacksModal)
			throws DataAccessException {
		 List<CgsCards> cgsCard=new ArrayList<CgsCards>();
		String  sqlQuery="from CgsCards ";
		Query query=getSession().createQuery(sqlQuery);
		
		List<CgsCards>cgsCards= query.list();
		if (PmsUtil.isCollectionNotEmpty(cgsCards)) {
			return cgsCards;
		}else{
			return cgsCard;
	
		}
		
		
	}

	@Override
	public void updateCgsLacsCards(Long id) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteCgsLacsCardsId(Long Id) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public void createCgsLacsCards(CgsCards cgsCardsEntity)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("hellow dao.....................:");
		getSession().saveOrUpdate(cgsCardsEntity);
	}
	

}
