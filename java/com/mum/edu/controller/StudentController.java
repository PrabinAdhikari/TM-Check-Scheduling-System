/**
 * 
 */
package com.mum.edu.controller;

import java.util.Date;
import java.util.Iterator;
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
import com.mum.edu.model.DetailReport;
import com.mum.edu.model.Student;
import com.mum.edu.model.User;
import com.mum.edu.service.IAppointmentService;
import com.mum.edu.service.IStudentService;
import com.mum.edu.service.IUserService;

/**
 * @author Prabin
 * @param <T>
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
	public String displayAppointmentList(Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		System.out.println("User " + username);
		User userObj = userService.findUserByUsername(username);
		System.out.println("User id in user table" + userObj.getUid());
		Student studentObj = studentService.findStudentByUserId(userObj.getUid());
		System.out.println("StudentID in student table: " + studentObj.getStudentID());

		List<Appointment> appointmentList = appointmentService.getAllAppointment(studentObj.getUid());
		int countGroup = 0, countIndividual = 0;
		Date appDate = new Date();
		for (Appointment appointment : appointmentList) {
			String type = appointment.getSession().getType().toString();
			System.out.println(appointment.getSession().getType().toString());
			String status = appointment.getStatus();
			if (status.equalsIgnoreCase("reserved")) {
				appDate = appointment.getAppointmentDate();
			} else {
				if (type.equalsIgnoreCase("group"))
					countGroup++;
				else
					countIndividual++;
			}

		}

		System.out.println("Count1" + countGroup);
		System.out.println("count2=" + countIndividual);

		model.addAttribute("countGroup", countGroup);
		model.addAttribute("countIndividual", countIndividual);
		model.addAttribute("appointmentDate", appDate);

		return "StudentHome";
	}

	@RequestMapping(value = "/appointmentList", method = RequestMethod.GET)
	public String getStudentInfo(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		System.out.println("User " + username);
		User userObj = userService.findUserByUsername(username);
		System.out.println("User id in user table" + userObj.getUid());
		Student studentObj = studentService.findStudentByUserId(userObj.getUid());
		System.out.println("StudentID in student table: " + studentObj.getStudentID());
		List<Appointment> appointmentList = appointmentService.getAllAppointment(studentObj.getUid());
		model.addAttribute("appointmentList", appointmentList);
		return "AppointmentList";
	}

	@RequestMapping(value = "/detailReport", method = RequestMethod.GET)
	public String detailReport(Model model) {
		String batch = "feb2015";
		List<DetailReport> detailreport = appointmentService.getAllAppointmentByBatch(batch);
//		if (appointmentList != null)
//			System.out.println(appointmentList.get(0).getName() + appointmentList.get(0).getCnt()
//					+ appointmentList.get(0).getStudentID());
//		else
//			System.out.println("empty");
		
		// HashMap<String, StudentTMCountPair> detailmap = new HashMap<String,
		// StudentTMCountPair>();
		// for (Appointment appointment : appointmentList) {
		// StudentTMCountPair pairs = new StudentTMCountPair();
		// String studentID = appointment.getStudent().getStudentID();
		// String studentName = appointment.getStudent().getUser().getName();
		// if (detailmap.containsKey(studentID)){// && !(pairs.equals(null))) {
		// pairs.setTmCount(pairs.getTmCount() + 1);
		// pairs.setName(studentName);
		// detailmap.put(studentID, pairs);
		// }
		// else {
		// pairs = new StudentTMCountPair();
		// pairs.setName(studentName);
		// pairs.setTmCount(1);
		// detailmap.put(studentID, pairs);
		// }
		// System.out.println(studentID);
		// System.out.println("Name"+studentName);
		// }
		model.addAttribute("detailreport", detailreport);

		return "DetailReport";
	}

}
