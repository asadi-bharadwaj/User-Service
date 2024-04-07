package com.dailycode.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycode.userservice.VO.ResponseTemplateVO;
import com.dailycode.userservice.entity.Users;
import com.dailycode.userservice.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userServie;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user) {
		log.info("inside saveUser method of userController class");
		return userServie.saveUser(user);
	}
	
	
	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId ) {
		log.info("inside getUserWithDepartment method of userController class");
		return userServie.getUserWithDepartment(userId);
	}
}
