package com.mum.edu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uid;
	
	private String address;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "SessionID")
//	private List<Appointment> sessionList;
	
	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

//	public List<Appointment> getSessionList() {
//		return sessionList;
//	}
//
//	public void setSessionList(List<Appointment> sessionList) {
//		this.sessionList = sessionList;
//	}

//	
	
	public Location(){
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
