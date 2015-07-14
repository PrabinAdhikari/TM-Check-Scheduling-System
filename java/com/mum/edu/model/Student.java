package com.mum.edu.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	private String batchName;

	public Student() {

	}
	// private Date entryDate;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getEntryDate() {
		return batchName;
	}

	public void setEntryDate(String entryDate) {
		this.batchName = entryDate;
	}

}
