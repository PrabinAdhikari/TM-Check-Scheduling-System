/**
 * 
 */
package com.mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Prabin
 *
 */
@Controller
public class AppointmentController {
	@RequestMapping (value={"/student"})
	public String getStudent(){
		
		return "Student";
	}
	@RequestMapping (value={"/student"})
	public String getAddTmRecord(){
		
		return "AddTMrecord";
	}
}
