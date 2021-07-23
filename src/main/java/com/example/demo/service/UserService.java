package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public UserDto save(UserDto userDto) {
		User user = new User(userDto);
		user = userRepository.save(user);
		userDto = new UserDto(user);
		return userDto;
	}

	public UserDto update(UserDto userDto) {
		User user = new User(userDto);
		// Optional<User> userOptional = userRepository.findById(userDto.getId());
		// if(userOptional.isPresent()) {
		user = userRepository.save(user);
		userDto = new UserDto(user);
		// }
		return userDto;
	}
}
