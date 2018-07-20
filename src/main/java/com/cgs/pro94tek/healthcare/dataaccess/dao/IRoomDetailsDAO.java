package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.bean.RoomsDetails;


public interface IRoomDetailsDAO {
	
	public RoomsDetails getRoomDetialsByName(String roomName) throws DataAccessException;
	public List<RoomsDetails> fetchRoomDetailsById(String roomId)throws DataAccessException;
	public void createOrUpdateRoomDetails(RoomsDetails roomdetails)throws DataAccessException;
	public boolean deleteRoomById(String roomId) throws DataAccessException;
	public void deleteRoomDetails(Room room)throws DataAccessException;

}
