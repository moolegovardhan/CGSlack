package com.cgs.pro94tek.healthcare.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.bean.RoomType;
import com.cgs.pro94tek.healthcare.bean.Ward;
import com.cgs.pro94tek.healthcare.bean.WardType;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.RoomTypeModal;
import com.cgs.pro94tek.healthcare.modal.WardModal;
import com.cgs.pro94tek.healthcare.modal.WardTypeModal;

public class RoomTypeHelper {
	
	public List<RoomTypeModal> createwardTypeModal(List<RoomType> roomtype){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	
	
		List<RoomTypeModal> RoomTypeModals = new ArrayList<RoomTypeModal>();
		for (RoomType roomtypeobj : roomtype) {
			RoomTypeModal roomtypeModal1 = new RoomTypeModal();
			roomtypeModal1.setRoomtype(roomtypeobj.getRoomtype());
			roomtypeModal1.setCreatedBy((roomtypeobj.getCreatedBy()));
			roomtypeModal1.setCreatedDate(df.format(roomtypeobj.getCreatedDate()));
			roomtypeModal1.setStatus(roomtypeobj.getStatus());
			roomtypeModal1.setId(roomtypeobj.getId());
			RoomTypeModals.add(roomtypeModal1);
		}
		

		return RoomTypeModals;
	}

	public RoomType createRoomType(RoomTypeModal roomTypeModal) throws PMSException, ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		RoomType roomtype = new RoomType();
		roomtype.setRoomtype(roomtype.getRoomtype());
		roomtype.setCreatedDate(new Date());
		roomtype.setCreatedBy(roomTypeModal.getCreatedBy());
		roomtype.setStatus(roomTypeModal.getStatus());
		roomtype.setId(roomTypeModal.getId());
		
		return roomtype;
	}

}
