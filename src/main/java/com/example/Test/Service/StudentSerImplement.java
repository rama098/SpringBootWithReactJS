package com.example.Test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Entities.Student;
import com.example.Test.Repository.StudentRepo;

@Service
public class StudentSerImplement implements StudentService{
	
	@Autowired
	StudentRepo stsRepo;

	@Override
	public String AddStudent(Student std) {
		stsRepo.save(std);
		return "std";
	}

}
