package com.example.demo.dto;

import java.time.LocalDateTime;

import com.example.demo.entity.TestRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestRequestDto {
	private Long id;
	private String name;
	private String description;
	private String lastName;
	private Long userId;
	private String status;
	private LocalDateTime createdDt;
	private LocalDateTime updatedDt;

	public TestRequestDto() {

	}

	public TestRequestDto(TestRequest testRequest) {
		this.setId(testRequest.getId());
		this.setName(testRequest.getName());
		this.setDescription(testRequest.getDescription());
		this.setUserId(testRequest.getUserId());
		this.setStatus(testRequest.getStatus());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(LocalDateTime createdDt) {
		this.createdDt = createdDt;
	}

	public LocalDateTime getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(LocalDateTime updatedDt) {
		this.updatedDt = updatedDt;
	}

}