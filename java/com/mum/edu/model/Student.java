package com.mum.edu.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uid;
	private String name;
	private int age;
	public Student(){
	
}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
//	//private Date entryDate;
//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="userId")
//	private User user;
//	
//	public long getUid() {
//		return uid;
//	}
//
//	public void setUid(long uid) {
//		this.uid = uid;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//

//	
//	public Date getEntryDate() {
//		return entryDate;
//	}
//	public void setEntryDate(Date entryDate) {
//		this.entryDate = entryDate;
//	}
	
}
