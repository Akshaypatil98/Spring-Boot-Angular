package com.hotelManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelManagement.model.Food;
import com.hotelManagement.repo.FoodRepository;

@Service
public class FoodService {
	@Autowired
	FoodRepository foodRepository;
	
	public Food saveFood(Food food){
		return foodRepository.save(food);
		
	}
	
	public List<Food> saveAllFood(List<Food> food){
		return foodRepository.saveAll(food);
		
	}
	public List<Food> getFoods() {
		return foodRepository.findAll();
	}

	public Food getFoodById(Long id) {
		return foodRepository.findById(null).orElse(null);
	}

	public void deleteFoodById(Long id) {
		foodRepository.deleteById(id);
	}
	
	public Food updateFood(Food food) {
		Food existingFood = foodRepository.findById(food.getFoodId()).orElse(null);
		existingFood.setMenu(food.getMenu());
		existingFood.setQuantity(food.getQuantity());
		
		return foodRepository.save(existingFood);

	}
	

}
