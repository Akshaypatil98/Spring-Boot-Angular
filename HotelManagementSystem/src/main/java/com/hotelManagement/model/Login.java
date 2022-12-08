package com.hotelManagement.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name="login_TBL")
@Configuration
@ConfigurationProperties(prefix="test")
public class Login {
	
	private String email;
	private String password;
	private String rpassword;
	
	
}
