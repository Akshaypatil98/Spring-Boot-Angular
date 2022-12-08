package com.hotelManagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="room")
public class Room {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomNo;
	private RoomType roomType;
	private Availability availability;
	private double roomPrice;
	

}
