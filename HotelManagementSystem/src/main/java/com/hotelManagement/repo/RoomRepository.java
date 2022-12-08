package com.hotelManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelManagement.model.Room;
import com.hotelManagement.model.RoomType;
@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{
	Room findByRoomNo(int roomNo);
	Room findByRoomType(RoomType roomType);
	Room findByRoomPrice(int price);

}
