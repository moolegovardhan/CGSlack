package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;










import com.cgs.pro94tek.healthcare.bean.Category;
import com.cgs.pro94tek.healthcare.bean.Item;
import com.cgs.pro94tek.healthcare.bean.PurchageOrder;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IItemDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.utils.PmsUtil;


@Repository("itemDAO")
public class ItemDAOImpl  extends CustomHibernateDaoSupport implements IItemDAO {

	@SuppressWarnings("unchecked")
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
		return item;

}

	@Transactional
	@SuppressWarnings("unchecked")
	public boolean deleteItemById(String itemId) throws DataAccessException {
		System.out.println("delete itemId...........:"+itemId);
		String sqlquery="Update Item set status = :status "+" where officeid = :itemId";
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("itemId",itemId);
		query.setParameter("status", "n");
		query.executeUpdate();
		System.out.println("dao ....:"+query);
		
		// TODO Auto-generated method stub
		return true;
		
		
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public void createOrUpdateItem(Item item) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("createorupdate Item ............:"+item.getSubcategory());
		getSession().saveOrUpdate(item);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Item> fetchAllItems(Item itemEntity) throws DataAccessException {
		List<Item> item=new ArrayList<Item>();
		   String sqlquery="from Item where status = :status ";
		   Query query = getSession().createQuery(sqlquery);
			//query.setParameter("categoryName", (categoryName));
		   query.setParameter("status", "y");
			List<Item> items = query.list();
			if (PmsUtil.isCollectionNotEmpty(items)) {
				return items;
			}else{
				return item;
			}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Item> fetchAllItemsByname(String itemName) throws PMSException
	{
		List<Item> item=new ArrayList<Item>();
	
		/*Criteria cr = getSession().createCriteria(Item.class);
		cr*/
		String sqlquery="from Item p where p.itemname like :itemName ";
		System.out.println("item dao implementation...........:"+sqlquery);
		Query query=getSession().createQuery(sqlquery);
		query.setParameter("itemName",itemName+"%");
		System.out.println("query  Dao...........:");
		List<Item> items = query.list();
		if (PmsUtil.isCollectionNotEmpty(items))
		{
			return items;
		}else{
			return item;
		}
		
	}
	
	
}	
	
