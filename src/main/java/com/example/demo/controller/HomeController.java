package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class HomeController {
	
	@GetMapping("/get")
	public String message() {
		return "Om Sai Ram";
	}
}
