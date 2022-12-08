package com.hotelManagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
@Table(name = "food")
public class Food {
	@Id
	private long foodId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "menu_menuName")
	private Menu menu;
	private int quantity;

}
