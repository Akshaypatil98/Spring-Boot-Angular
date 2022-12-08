package com.hotelManagement.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.model.Login;
//import com.hotelManagement.repo.LoginRepo;

@RestController
@CrossOrigin(origins="*")
public class LoginController {
//	@Autowired
//	private LoginRepo repo;
	@Autowired
	private Login login;
	
	
	@GetMapping("/loginAdmin/{password}")
	public void registerLogin(@PathVariable String password) {
		System.out.println(password);
		if(password.equals(login.getPassword())) {
			System.out.println("WelCome to login page");
		}
		else {
			System.out.println("creadentials not valid");
		}
//		return ResponseEntity.ok(repo.save(login));
		
	}

}
