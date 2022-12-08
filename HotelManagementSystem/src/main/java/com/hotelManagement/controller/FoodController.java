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

import com.hotelManagement.Service.FoodService;

import com.hotelManagement.model.Food;

@RestController
public class FoodController {
	@Autowired
	FoodService foodService;

	@PostMapping("/addFood")
	public Food addFood(@RequestBody Food food) {
		return foodService.saveFood(food);
	}

	@GetMapping("/foodList")
	public List<Food> findAllFoodList() {
		return foodService.getFoods();
	}

	@GetMapping("/foodId/{id}")
	public Food findFoodById(@PathVariable Long id) {
		return foodService.getFoodById(id);
	}

	@PutMapping("/updateFood")
	public Food updateFood(@RequestBody Food food) {
		return foodService.updateFood(food);
	}

	@DeleteMapping("/removeFood/{id}")
	public void removeFood(@PathVariable Long id) {
		foodService.deleteFoodById(id);
	}

}
