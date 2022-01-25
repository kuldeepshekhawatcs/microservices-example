package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.domain.User;
import com.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	UserServiceImpl userService;
	
@GetMapping("/get-user")
private List<User> getUser() {
	return userService.getUsers();
	
}
}
