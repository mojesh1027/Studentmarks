package com.mojesh.service;

import java.util.List;

import com.mojesh.model.Student;

public interface StudentService {
	public Student saveStd(Student std);
	public void deleteStd(Integer sid);
	public Student getOneStd(Integer sid);
	public List<Student> getAllStd();
	public Student updateStd(Student student,Integer sid);
}
