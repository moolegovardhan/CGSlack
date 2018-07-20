package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.bean.Room;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.RoomHelper;
import com.cgs.pro94tek.healthcare.modal.RoomModal;
import com.cgs.pro94tek.healthcare.service.IRoomDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class RoomController {
	
	@Autowired
	IRoomDataManagementService iroomDataManagementService;
	
	private static final Logger logger = LoggerFactory.getLogger(RoomController.class);
	CommonUtils commonUtils = new CommonUtils();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();

	@RequestMapping(value = InventoryURIConstant.GET_ROOM_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchRoomDetailsById(@PathVariable("roomId") String roomId){

		logger.info("Room details roomId . : "+roomId);
		List<RoomModal> roomModal = new ArrayList<RoomModal>();

		try {
			roomModal = iroomDataManagementService.fetchRoomById(roomId);
			response = commonUtils.createResponseData("Room Details Fetch ", ResponseMessages.GENERALL_FETCH_SUCCESS, ResponseMessages.SUCCESS, "1", roomModal);

		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());

			e.printStackTrace();
			response = commonUtils.createResponseData("Room Details Fetch ", ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "1", e.getMessage());
		}

		return response;
	}
	
	
	/**
	 * this method will either create or update room object
	 * @param room
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.CREATE_ROOM_DETAILS, method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody InventoryRequestResponse createRoom(@RequestBody RoomModal room) {
		
		try {
			System.out.println("Room Name............."+room.getRoomname());
			RoomHelper rHelper = new RoomHelper();
			Room roomEntity = rHelper.createRoom(room);
			iroomDataManagementService.createOrUpdateRoom(roomEntity);
			response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_INSERT_SUCCESS, ResponseMessages.SUCCESS, "1", "--");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", "--");
		} 
		return response;
	}
	
	
	/**
	 * this method is for delete operation
	 * @param roomId
	 * @return
	 */
	@RequestMapping(value = InventoryURIConstant.DELETE_ROOM_DETAILS, method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody InventoryRequestResponse deleteroom(@PathVariable("roomId") String roomId){
		try {
			// call service method by passing the wardId - > iWardDataManagementService

			Room roomDetails = new Room();
			boolean result = iroomDataManagementService.deleteRoomById(roomId);

			if(result){
				response = commonUtils.createResponseData("Done", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "1", roomDetails);
			}else{

				Room roomZero = new Room();
				response = commonUtils.createResponseData("Zero records found", ResponseMessages.GENERALL_DELETE_SUCCESS, ResponseMessages.SUCCESS, "0", roomZero);

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			response = commonUtils.createResponseData(e.getMessage(), ResponseMessages.GENERALL_EXCEPTION, ResponseMessages.FAIL, "0", e);
		} 
		return response;

	}

}
