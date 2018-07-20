package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IRoomDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.RoomHelper;
import com.cgs.pro94tek.healthcare.modal.RoomModal;
import com.cgs.pro94tek.healthcare.service.IRoomDataManagementService;

@Service("roomDataManagementService")
public class RoomDataRetrivalServiceImpl implements IRoomDataManagementService{

	@Autowired
	private	IRoomDAO roomdao;
	
	
	public List<RoomModal> fetchRoomById(String roomId) throws PMSException {
		List<Room> room = roomdao.fetchRoomById(roomId);
		RoomHelper roomhelper = new RoomHelper();
		return roomhelper.createroomModal(room);
	}

	@Override
	public RoomModal fetchRoomDetails(String roomId) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room fetchRoomByName(String roomName) throws PMSException {
		
		return roomdao.getRoomByName(roomName);
	}

	@Override
	public void createOrUpdateRoom(Room roomEntity) throws PMSException {
		 roomdao.createOrUpdateRoom(roomEntity);
		
	}

	@Override
	public boolean deleteRoomById(String roomId) throws PMSException {
		return roomdao.deleteRoomById(roomId);
	}

}
