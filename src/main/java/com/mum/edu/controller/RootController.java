package com.mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	@RequestMapping (value="/")
	public String getRootView(){
		System.out.println("Returning welcome page from /");
		return "Welcome";
	}
	
	@RequestMapping (value="/Login")
	public String logIn(){
		System.out.println("test");
		return "LogIn";
	}
	
	@RequestMapping (value="/welcome")
	public String welcome(){
		System.out.println("test");
		return "Welcome";
	}
	
}
