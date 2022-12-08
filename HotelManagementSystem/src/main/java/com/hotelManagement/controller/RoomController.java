package com.hotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.hotelManagement.Service.RoomService;
import com.hotelManagement.model.Room;

@RestController
public class RoomController {
	@Autowired
	RoomService roomService;
	
	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) {
		return roomService.saveRoom(room);
	}
	
	@GetMapping("/rooms")
	public List<Room> findAllRooms() {
		return roomService.getRooms();
	}
	
	@GetMapping("/roomNo/{id}")
	public Room findRoomByNo(@PathVariable int id) {
		return roomService.getRoomByNo(id);
	}
	
	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room) {
		return roomService.updateRoom(room);
	}
	
	@DeleteMapping("/deleteRoom/{id}")
	public void deleteRoom(@PathVariable int id) {
		roomService.deleteRoomByNo(id);
		
		
	}

}
