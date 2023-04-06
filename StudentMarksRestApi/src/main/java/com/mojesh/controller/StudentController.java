package com.mojesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mojesh.model.Student;
import com.mojesh.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student std)
	{
		Student s1=service.saveStd(std);
		return s1;
	}
	@DeleteMapping("/delete/{sid}")
	public void deleteStd(@PathVariable Integer sid) {
		service.deleteStd(sid);	
	}
	@GetMapping("/get/{sid}")
	public Student getOne(@PathVariable Integer sid) {
		Student s2=service.getOneStd(sid);
		return s2;
	}
	@GetMapping("/getAll")
	public List<Student> getAll(){
		List<Student> list=service.getAllStd();
		return list;
	}
	@PutMapping("/edit/{sid}")
	public Student update(@RequestBody Student st,@PathVariable Integer sid) {
		Student s3=service.updateStd(st,sid);
		return s3;
	}
}
