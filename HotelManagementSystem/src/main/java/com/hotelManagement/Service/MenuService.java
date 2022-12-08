package com.hotelManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelManagement.model.Menu;
import com.hotelManagement.repo.MenuRepository;



@Service
public class MenuService {
	@Autowired
	MenuRepository menuRepository;
	
	public Menu SaveMenu(Menu menu) {
		return menuRepository.save(menu);
		
	}
	 public Menu getMenuByName(String id) {
		return menuRepository.findByMenuName(id);
		 
	 }
	 public List<Menu> getAllMenu(){
		return menuRepository.findAll();
		 
		 
	 }
	 public void deleteMenuByName(String id) {
		 menuRepository.deleteById(id);
	 }

}
