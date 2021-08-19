//package com.example.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.dto.TestRequestDto;
//import com.example.demo.entity.TestRequest;
//import com.example.demo.repository.TestRequestRepository;
//
//@Service
//public class TestRequestService {
//
//	@Autowired
//	private TestRequestRepository testRequestRepository;
//
//	public TestRequestDto save(TestRequestDto testRequestDto) {
//		TestRequest testRequest = new TestRequest(testRequestDto);
//		testRequest = testRequestRepository.save(testRequest);
//		testRequestDto = new TestRequestDto(testRequest);
//		return testRequestDto;
//	}
//}
