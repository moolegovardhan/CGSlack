package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IRoomDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;
@Repository("roomDAO")
public class RoomDAOImpl extends CustomHibernateDaoSupport implements IRoomDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public Room getRoomByName(String roomName) throws DataAccessException {
		Room room = null;
		String queryRoomByName = "from Room where roomName = :roomName";
		Query query = getSession().createQuery(queryRoomByName);
		query.setParameter("roomName", roomName);
		List<Room> rooms = query.list();
		if (PmsUtil.isCollectionNotEmpty(rooms)) {
			room = rooms.get(0);
		}
		return room;
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Room> fetchRoomById(String roomId) throws DataAccessException {
		List<Room> room = new ArrayList<Room>();
		String queryRoomById  = "from Room where officeid = :roomId";
		Query query = getSession().createQuery(queryRoomById);
		query.setParameter("roomId",(roomId));
		List<Room> rooms = query.list();
		if (PmsUtil.isCollectionNotEmpty(rooms)) {
			return rooms;
		}else{
			return room;
		}
	}

	@Transactional
	public void createOrUpdateRoom(Room room) throws DataAccessException {
		getSession().saveOrUpdate(room);

	}

	@Override
	public boolean deleteRoomById(String roomId) throws DataAccessException {
		String queryRoomId = " Delete from Room where id = roomId";
		Query query = getSession().createQuery(queryRoomId);
		query.setParameter("roomId", Long.parseLong(roomId));
		query.executeUpdate();
		return true;
	}

	@Override
	public void deleteRoom(Room room) throws DataAccessException {
		// TODO Auto-generated method stub

	}

}
