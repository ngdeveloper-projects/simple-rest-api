package com.example.demo.dto;

import com.example.demo.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
	private Long id;
	private String userName;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String password;
	private String role;
	private String status;
	private Integer pincode;
	
	public UserDto() {
		
	}
	
	
	
	public UserDto(Long id, String userName, String email, String password) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	public UserDto(User user) {
		this.setId(user.getId());
		this.setUserName(user.getUserName());
		this.setFirstName(user.getFirstName());
		this.setLastName(user.getLastName());
		this.setEmail(user.getEmail());
		this.setMobile(user.getMobile());
		this.setPassword(user.getPassword());
		this.setPincode(user.getPincode());
		this.setRole(user.getRole());
		this.setStatus(user.getStatus());
	}
	
	

	public UserDto(Long id, String userName, String firstName, String lastName, String mobile, String email,
			String password, String role, String status, Integer pincode) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = role;
		this.status = status;
		this.pincode = pincode;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

}