package com.mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	@RequestMapping (value={"/","/login"})
	public String getRootView(){
		System.out.println("Returning welcome page from /");
		return "LogIn";
	}
	
	@RequestMapping (value="/welcome")
	public String welcome(){
		System.out.println("test");
		return "Welcome";
	}
	
	@RequestMapping (value="/check")
	public String check(){
		System.out.println("check");
		return "Welcome";
	}
	
}
