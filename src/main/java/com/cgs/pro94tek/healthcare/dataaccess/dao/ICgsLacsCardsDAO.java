package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.CgsCards;
import com.cgs.pro94tek.healthcare.modal.CgsLacs_CardsModal;

public interface ICgsLacsCardsDAO {

	public CgsCards getCards(CgsCards cardsEntity)throws  DataAccessException;
	public List<CgsCards> getCgslaksCard(CgsLacs_CardsModal  cgslacksModal)throws  DataAccessException;
	public void updateCgsLacsCards(Long id)throws  DataAccessException;
	public boolean deleteCgsLacsCardsId(Long Id)throws  DataAccessException;
	public void createCgsLacsCards(CgsCards cgsCardsEntity)throws  DataAccessException;
}
