package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.bean.RoomCharges;

public interface IRoomChargesDAO {
	
	public RoomCharges getRoomChargesByRoomName(String roomName) throws DataAccessException;
	public List<Room> fetchRoomChargesById(String roomdetailsId)throws DataAccessException;
	public void createOrUpdateRoomCharges(RoomCharges roomcharges)throws DataAccessException;
	public boolean deleteRoomChargesById(String roomchargesId) throws DataAccessException;


}
