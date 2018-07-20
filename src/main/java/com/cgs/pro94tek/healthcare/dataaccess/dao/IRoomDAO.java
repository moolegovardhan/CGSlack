package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.cgs.pro94tek.healthcare.bean.Room;

public interface IRoomDAO {
	
	public Room getRoomByName(String roomName) throws DataAccessException;
	public List<Room> fetchRoomById(String roomId)throws DataAccessException;
	public void createOrUpdateRoom(Room room)throws DataAccessException;
	public boolean deleteRoomById(String roomId) throws DataAccessException;
	public void deleteRoom(Room room)throws DataAccessException;

}
