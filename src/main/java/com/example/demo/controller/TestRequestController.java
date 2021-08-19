package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestRequestDto;
//import com.example.demo.service.TestRequestService;

@RestController
@RequestMapping("/v1/test")
public class TestRequestController {

	//@Autowired
	// TestRequestService testRequestService;

	@PostMapping("/")
	public TestRequestDto saveTestRequest(@RequestBody TestRequestDto testRequestDto) {
		//return testRequestService.save(testRequestDto);
		return null;
	}

}
