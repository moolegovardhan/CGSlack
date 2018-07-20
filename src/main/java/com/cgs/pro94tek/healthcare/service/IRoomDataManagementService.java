package com.cgs.pro94tek.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.RoomModal;

@Component
public interface IRoomDataManagementService {
	
	public List<RoomModal> fetchRoomById(String roomId) throws PMSException;

	public RoomModal fetchRoomDetails(String roomId) throws PMSException;

	public Room fetchRoomByName(String roomName) throws PMSException;

	public void createOrUpdateRoom(Room roomEntity) throws PMSException;

	public boolean deleteRoomById(String roomId) throws PMSException;

}
