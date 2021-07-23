package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/")
	public UserDto saveUser(@RequestBody UserDto userDto) {
		return userService.save(userDto);
	}

	@PutMapping("/")
	public UserDto updateUser(@RequestBody UserDto userDto) {
		return userService.update(userDto);
	}
}
