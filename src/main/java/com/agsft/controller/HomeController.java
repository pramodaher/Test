package com.agsft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agsft.dto.CustomeResponce;

import com.agsft.model.Student;
@RestController
public class HomeController {

	@GetMapping(path="/")
	public ResponseEntity<CustomeResponce> retriveRecored()
	{
		Student student=new Student();
		student.setId(10);
		student.setName("Pramod Aher");
		student.setEmail("pramodaher33@hotmail.com");
		
		
		CustomeResponce customeResponce=new CustomeResponce();
		customeResponce.setCode(200);
		customeResponce.setMessage("Recored sucessfully Retive");
		customeResponce.setBody(student);
		return ResponseEntity.ok().body(customeResponce);
		
	}
}
