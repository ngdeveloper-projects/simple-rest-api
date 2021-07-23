package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.demo.dto.TestRequestDto;

@Entity
@Table(name = "test_request")
public class TestRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "status")
	private String status;

	@CreationTimestamp
	@Column(name = "created_dt")
	private LocalDateTime createdDt;

	@UpdateTimestamp
	@Column(name = "updated_dt")
	private LocalDateTime updatedDt;

	public TestRequest() {
	}

	public TestRequest(TestRequestDto testRequestDto) {
		this.setId(testRequestDto.getId());
		this.setName(testRequestDto.getName());
		this.setDescription(testRequestDto.getDescription());
		this.setUserId(testRequestDto.getUserId());
		this.setStatus(testRequestDto.getStatus());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
