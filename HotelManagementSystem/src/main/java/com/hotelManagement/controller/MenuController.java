package com.hotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.Service.MenuService;
import com.hotelManagement.model.Menu;



@RestController
public class MenuController {
	@Autowired
	MenuService menuService;
	
	@PostMapping("/addMenu")
	public Menu addMenu(@RequestBody Menu menu) {
		return menuService.SaveMenu(menu);
		
	}
	@GetMapping("/menus")
 public List<Menu> findAllMenus(){
	return menuService.getAllMenu();
	 
 }
	@GetMapping("/menuName/{id}")
  public Menu findMenuByName(@PathVariable String id) {
	return menuService.getMenuByName(id);
	  
  }
	@DeleteMapping("/removeMenu/{id}")
	public void deleteMenu(@PathVariable String id) {
		menuService.deleteMenuByName(id);
	}
	
}
