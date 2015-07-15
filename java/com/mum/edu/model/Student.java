package com.mum.edu.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uid;
	private String studentID;
	private String batchName;

	public Student() {
	}
	// private Date entryDate;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "asfsafsdf")
//	private List<Appointment> appointmentList=new ArrayList<Appointment>();
	
	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

//	public List<Appointment> getAppointment() {
//		return appointmentList;
//	}
//
//	public void setAppointment(List<Appointment> appointment) {
//		this.appointmentList = appointment;
//	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getUid() {
		return uid;
	}

	public void setSetUid(long uid) {
		this.uid = uid;
	}

	public String getEntryDate() {
		return batchName;
	}

	public void setEntryDate(String entryDate) {
		this.batchName = entryDate;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

}
