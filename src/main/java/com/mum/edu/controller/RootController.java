package com.mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	@RequestMapping ("/")
	public String getRootView(){
		return "index";
	}
	
	@RequestMapping ("/new")
	public String getNewFile(){
		return "NewFile";
	}
}
