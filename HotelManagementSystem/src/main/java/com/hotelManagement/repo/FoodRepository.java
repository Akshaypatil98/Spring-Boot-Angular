package com.hotelManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelManagement.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
	

}
