package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TestRequest;

public interface TestRequestRepository extends JpaRepository<TestRequest, Long> {

}
