package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/search")
public class SearchController {

	@GetMapping("/popular")
	public List<String> getPopularSearchList() {
		List<String> popularSearchList = new ArrayList<>();
		popularSearchList.add("Mobile");
		popularSearchList.add("Laptop");
		popularSearchList.add("Shoes");
		popularSearchList.add("Headset");
		popularSearchList.add("Formal Shirts");
		return popularSearchList;
	}

}
