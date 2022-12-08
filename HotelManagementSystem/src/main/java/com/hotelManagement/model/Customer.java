package com.hotelManagement.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String aadharNo;
	private String name;
	private String email;
	private long mobNo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="room_roomNo")
	private Room room;
}
