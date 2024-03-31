package com.example.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test.Entities.Student;
import com.example.Test.Service.StudentService;

@CrossOrigin("*")
@RestController
public class StudentController {

	@Autowired
	StudentService Stdser;
	
	@PostMapping("/form")
	public void form(@RequestBody Student formData)
	{
		//System.out.println(formData);
		//return "This is the response "+formData;
		
		String email=formData.getEmail();
		String userName=formData.getUsername();
		String pass=formData.getPassword();
		
		System.out.println(email);
		System.out.println(userName);
		System.out.println(pass);
		
		Stdser.AddStudent(formData);//here data sending to the Repository 
		
		
	}
}
