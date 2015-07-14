package com.mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mum.edu.model.Student;

@Controller
public class LoginController {
	
	@RequestMapping (value={"/","/login"})
	public String logInPageView(){
		return "LogIn";
	}
	@RequestMapping (value="/welcome")
	public String welcome(Student student){
		System.out.println("test");
		return "Welcome";
	}
	
	
}
