package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;





import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.ItemPrice;
import com.cgs.pro94tek.healthcare.bean.School;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemPriceDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

import java.util.List;

import javax.transaction.Transactional;

@Repository("itemPriceDAOImpl")
public class ItemPriceDAOImpl   extends CustomHibernateDaoSupport implements  IItemPriceDAO 
{
	@SuppressWarnings("unchecked")
	@Transactional
	public ItemPrice getItemPriceById(String itemPriceId)
			throws DataAccessException
	{
		ItemPrice itemPrice=null;
		String sqlquery="from ItemPrice where id = :itemPriceId";
		System.out.println("dao implementation value...........:"+itemPriceId);
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("itemPriceId",Long.parseLong(itemPriceId));
		List<ItemPrice> itermpric=query.list();
		if (PmsUtil.isCollectionNotEmpty(itermpric)) 
		{
			itemPrice = itermpric.get(0);
		}
		return itemPrice;
	}
	/*@SuppressWarnings("unchecked")
	@Transactional
	public Item fetchItemById(String itemId) throws DataAccessException {
		Item item = null;
		String queryItemById  = "from Item where id = :itemId";
		System.out.println("get data by itemId id............:"+queryItemById);
		Query query = getSession().createQuery(queryItemById);
		query.setParameter("itemId", Long.parseLong(itemId));
		List<Item> items = query.list();
		if (PmsUtil.isCollectionNotEmpty(items)) {
			item = items.get(0);
		}
		return item;*/
	}



