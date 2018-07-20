package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.bean.Ward;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.RoomModal;
import com.cgs.pro94tek.healthcare.modal.WardModal;

public class RoomHelper {
	
	public List<RoomModal> createroomModal(List<Room> room){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		List<RoomModal> roomModals = new ArrayList<RoomModal>();
		for (Room roomobj : room) {
			RoomModal  roommodal1 = new RoomModal();
			roommodal1.setRoomname((roomobj.getRoomname()));
			roommodal1.setRoomtypes(roomobj.getRoomtype());
			roommodal1.setRoomcost(roomobj.getRoomcost());
			roommodal1.setOfficeid(roomobj.getOfficeid());
			roommodal1.setTotaloccupied(roomobj.getTotaloccupied());
			roommodal1.setTotalrooms(roomobj.getTotalrooms());
			roommodal1.setDiscount(roomobj.getDiscount());
			roommodal1.setCreatedDate(df.format(roomobj.getCreatedDate()));
			roommodal1.setCreatedBy(roomobj.getCreatedBy());
			roommodal1.setStatus(roomobj.getStatus());
			roommodal1.setFinalprice(roomobj.getFinalprice());
			roommodal1.setCharges(roomobj.getCharges());
			roommodal1.setRoomid(roomobj.getRoomid());
			roomModals.add(roommodal1);
		}
		


		return roomModals;
	}

	/**
	 * here this method will convert roomModal to room
	 * @param wardModal
	 * @return
	 * @throws PMSException
	 * @throws ParseException
	 */
	public Room createRoom(RoomModal roomModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Room room = new Room();
		room.setRoomname(roomModal.getRoomname());
		room.setRoomtype(roomModal.getRoomtypes());
		room.setOfficeid(roomModal.getOfficeid());
		room.setTotaloccupied(roomModal.getTotaloccupied());
		room.setDiscount(roomModal.getDiscount());
		room.setCreatedDate(new Date());
		room.setCreatedBy(roomModal.getCreatedBy());
		room.setStatus(roomModal.getStatus());
		room.setFinalprice(roomModal.getFinalprice());
		room.setCharges(roomModal.getCharges());
		room.setRoomid(roomModal.getRoomid());
		
		return room;
	}


}
