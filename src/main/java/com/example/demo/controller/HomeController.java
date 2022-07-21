package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class HomeController {
	
	private static final int ResponseEntity = 0;
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public ResponseEntity<Void> add(@RequestBody Student student) {
		service.save(student);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> get(@PathVariable int id) {
		return new ResponseEntity(service.findById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAll() {
		return new ResponseEntity(service.findAll(),HttpStatus.OK);
	}
}
