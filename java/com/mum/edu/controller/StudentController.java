/**
 * 
 */
package com.mum.edu.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.edu.model.Appointment;
import com.mum.edu.model.Student;
import com.mum.edu.model.User;
import com.mum.edu.service.IAppointmentService;
import com.mum.edu.service.IStudentService;
import com.mum.edu.service.IUserService;

/**
 * @author Prabin
 *
 */
@Controller
public class StudentController {
	@Autowired
	private IStudentService studentService;
	@Autowired
	private IAppointmentService appointmentService;
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	// public String getStudent(Student student){
	public String getStudent(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("date", new Date());
		return "Student";
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute Student student) {

		studentService.addStudent(student);
		return "Welcome";
	}

	@RequestMapping(value = "/studentHome", method = RequestMethod.GET)
	public String getStudentInfo(Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		System.out.println("User " + username);
		User userObj = userService.findUserByUsername(username);
		System.out.println("User id in user table"+userObj.getUid());
		Student studentObj = studentService.findStudentByUserId(userObj.getUid());
		System.out.println("StudentID in student table: "+ studentObj.getStudentID());
		
		List <Appointment>appointmentList=appointmentService.getAllAppointment(studentObj.getUid());
		int count = 0;
		for (Appointment appointment : appointmentList) {
			count++;
			
		}
		System.out.println("Count"+count);
//		List<Appointment> appointobjectListGroup = appointmentService.getAllGroupAppointment(studentObj.getUid());
//		List<Appointment> appointobjectListindividual = appointmentService.getAllIndividualAppointment(studentObj.getUid());

//		int countGroup = 0, countIndividual = 0;
//		for (Appointment appointment : appointobjectListGroup) {
//			countGroup++;
//		}
//		for (Appointment appointment : appointobjectListGroup) {
//			countIndividual++;
//		}
//		model.addAttribute("countGroup", countGroup);
//		model.addAttribute("countIndividual", countIndividual);
//		System.out.println("Group" + countGroup);
//		System.out.println("Group" + countIndividual);

		return "StudentHome";
	}

	@RequestMapping(value = "/print", method = RequestMethod.GET)
	public String printReport() {

		return "PrintSuccess";

	}

}
