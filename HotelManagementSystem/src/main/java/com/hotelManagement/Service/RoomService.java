package com.hotelManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelManagement.model.Room;
import com.hotelManagement.repo.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;

	public Room saveRoom(Room room) {
		return roomRepository.save(room);
	}

	public List<Room> getRooms() {
		return roomRepository.findAll();
	}

	public Room getRoomByNo(int id) {
		return roomRepository.findById(id).orElse(null);
	}

	public void deleteRoomByNo(int id) {
		roomRepository.deleteById(id);
	}

	public Room updateRoom(Room room) {
		Room existingRoom = roomRepository.findById(room.getRoomNo()).orElse(null);
		existingRoom.setRoomType(room.getRoomType());
		existingRoom.setAvailability(room.getAvailability());
		existingRoom.setRoomPrice(room.getRoomPrice());
		return roomRepository.save(existingRoom);
	}
}