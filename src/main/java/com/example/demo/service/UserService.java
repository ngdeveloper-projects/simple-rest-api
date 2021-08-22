package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

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
//		if(userDto.getEmail()==null) {
//			throw new UpStacCommonException(e);
//		}
		
		User user = new User(userDto);
		user = userRepository.save(user);
		userDto = new UserDto(user);
		return userDto;
	}

	public UserDto update(UserDto userDto) {
		System.out.println("update method starts");
		User user = new User(userDto);
		user = userRepository.save(user);
		userDto = new UserDto(user);
		System.out.println("update method ends");
		return userDto;
	}
	
	public List<UserDto> findAllUsers() {
		System.out.println("findall starts");
		List<User> users = userRepository.findAll();
		List<UserDto> userDtoList = users.stream().map(UserDto::new).collect(Collectors.toList());
		return userDtoList;
	}
}
