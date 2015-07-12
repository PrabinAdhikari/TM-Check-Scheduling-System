package com.mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.edu.model.Student;

@Controller
public class RootController {
	
	@RequestMapping (value={"/"})
	public String getRootView(){
		System.out.println("Returning welcome page from /");
		return "LogIn";
	}
		
	@RequestMapping (value="/welcome")
	public String welcome(Student student){
		System.out.println("test");
		return "Welcome";
	}
	
	
}
