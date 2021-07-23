package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	UserService userService;

	@MockBean
	private UserRepository userRepository;

	@BeforeEach
	public void setMockOutput() {
		when(userRepository.save(Mockito.any(User.class))).thenReturn(getMockedResponse());
	}

	@Test
	public void testSave() {
		UserDto userDto = new UserDto();
		userDto.setFirstName("Naveen");
		UserDto response = userService.save(userDto);
		assertTrue(response.getId() != null && response.getId() == 101L);
	}

	private User getMockedResponse() {
		User user = new User();
		user.setId(101L);
		return user;
	}
}
