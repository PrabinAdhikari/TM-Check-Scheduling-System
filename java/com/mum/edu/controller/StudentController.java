/**
 * 
 */
package com.mum.edu.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mum.edu.model.Student;
import com.mum.edu.service.IStudentService;

/**
 * @author Prabin
 *
 */
@Controller
public class StudentController {
	@Autowired
    private IStudentService studentService;
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
//	public String getStudent(Student student){
	public String getStudent(Model model){
		model.addAttribute("student", new Student());
		model.addAttribute("date", new Date());
        return "Student";
    }
   
	@RequestMapping(value="/student", method=RequestMethod.POST)
    public String addStudent(@ModelAttribute Student student){
		System.out.println(student.getName());
		studentService.addStudent(student);
        return "Welcome";
    }
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String getstudentFromDB(Model model){
		model.addAttribute("studentList", studentService.getAllStudent());
		
//		 List<Student> studentList=studentService.getAllStudent();
		 
//		 for(Student st:studentList){
//			 System.out.println(st.getName());
//		 }
		 
        return "Display";
    }
	
	@RequestMapping(value="/print",method=RequestMethod.GET)
	public String printReport(){
	
		return"PrintSuccess";
		
	}
	

}
