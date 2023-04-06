package com.mojesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mojesh.model.Student;
import com.mojesh.repo.StudentRepo;
@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public Student saveStd(Student std) {
		double tol=0.0,per=0.0;
		String grade=null;
		tol=std.getSub1()+std.getSub2()+std.getSub3();
		per=tol/3;
		if(per>=70&&per<=100)
		{
			grade="A";
		}
		else if(per>=60&&per<70)
		{
			grade="B";
		}
		else if(per>=50&&per<60)
		{
			grade="C";
		}
		else {
			grade="Fail";
		}
		std.setTotal(tol);
		std.setPercentage(per);
		std.setGrade(grade);
		return repo.save(std);
	}
	@Override
	public void deleteStd(Integer sid) {
			repo.deleteById(sid);
	}

	@Override
	public Student getOneStd(Integer sid) {
		Student st1=repo.findById(sid).get();
		return st1;
	}

	@Override
	public List<Student> getAllStd() {
		List<Student> st2=repo.findAll();
		return st2;
		
	}

	@Override
	public Student updateStd(Student student,Integer sid) {
		Student st3=repo.findById(sid).get();
		st3.setFullname(student.getFullname());
		st3.setSub1(student.getSub1());
		st3.setSub2(student.getSub2());
		st3.setSub3(student.getSub3());
		return st3;
	}

}
