package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.RoomType;

public interface IRoomTypeDAO {

	public RoomType getRoomTypeByName (String roomTypeName) throws DataAccessException;

	   public List<RoomType> getRoomTypeByRoomId (String roomId) throws DataAccessException;
	   public void createOrUpdateRoomType (RoomType roomtype) throws DataAccessException;
	   public boolean deleteRoomById(String roomId) throws DataAccessException;
	   
	   public void deleteRoomType (String roomtype) throws DataAccessException;
}
