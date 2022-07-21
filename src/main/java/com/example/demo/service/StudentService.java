package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentService extends JpaRepository<Student,Integer>{

}
