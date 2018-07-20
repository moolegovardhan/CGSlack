package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.cgs.pro94tek.healthcare.bean.RoomType;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IRoomTypeDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("roomTypeDAO")
public class RoomTypeDAOImpl extends CustomHibernateDaoSupport implements IRoomTypeDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public RoomType getRoomTypeByName(String roomTypeName) throws DataAccessException {
		 RoomType roomtype = null;
	      String subRoomTypequery = "from RoomType where roomtype= :roomtype";
	      Query query = getSession().getNamedQuery(subRoomTypequery);
	      query.setString("roomtype", roomTypeName);
	      List<RoomType> roomtypes = query.list();
	      if (PmsUtil.isCollectionNotEmpty(roomtypes)) {
	    	  roomtype = roomtypes.get(0);
	      }
	      return roomtype;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<RoomType> getRoomTypeByRoomId(String roomId) throws DataAccessException {
		 List<RoomType> roomtype = new ArrayList<RoomType>();
			String queryRoomtypeById  = "from Tax where officeid = :roomtypeId";
			Query query = getSession().createQuery(queryRoomtypeById);
			query.setParameter("roomtypeId", (roomId));
			List<RoomType> roomtypes = query.list();
			if (PmsUtil.isCollectionNotEmpty(roomtypes)) {
				return roomtypes;
			}else{
				return roomtype;
			}
	}

	@Transactional
	public void createOrUpdateRoomType(RoomType roomtype) throws DataAccessException {
		getSession().saveOrUpdate(roomtype);
		
	}

	@Transactional
	public boolean deleteRoomById(String roomId) throws DataAccessException {
		String queryRoomById = " Delete from RoomType where id = :roomId";
		Query query = getSession().createQuery(queryRoomById);
		query.setParameter("roomId", Long.parseLong(roomId));
		query.executeUpdate();
		return true;
	}

	@Transactional
	public void deleteRoomType(String roomtype) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

		

}
