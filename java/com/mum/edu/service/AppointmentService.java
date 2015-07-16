package com.mum.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.dao.IAppointmentDao;
import com.mum.edu.model.Appointment;
import com.mum.edu.model.DetailReport;

@Service 
@Transactional (propagation=Propagation.REQUIRES_NEW)
public class AppointmentService implements IAppointmentService {
	@Autowired
	private IAppointmentDao appointmentDao;
	
	public AppointmentService() {
		super();
	}

	public IAppointmentDao getAppointmentDao() {
		return appointmentDao;
	}

	public void setStudentDao(IAppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}

	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentDao.addAppointment(appointment);

	}

	 public List<Appointment> getAllStudent() {
	 // TODO Auto-generated method stub
		 return appointmentDao.getAllAppointment();
	 }

	
	public void addStudent(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}


	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentDao.getAllAppointment();
	}


	public Appointment findAppointmentByAppointmentname(String appointmentname) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Appointment> getAllAppointment(long uid) {
		// TODO Auto-generated method stub
		 return appointmentDao.getAllAppointment(uid);
	}

	public List<Appointment> getAllIndividualAppointment(long uid) {
		
	    return (List<Appointment>)  appointmentDao.getAllIndividualAppointment(uid);
	}
	
	
	public List<Appointment> getAllGroupAppointment(long uid) {
		
		return (List<Appointment>)  appointmentDao.getAllGroupAppointment(uid);
	}

	public  List<DetailReport> getAllAppointmentByBatch(String batch) {
		// TODO Auto-generated method stub
		System.out.println("batch "+batch);
		return (List<DetailReport>)  appointmentDao.getAllAppointmentByBatch(batch);
	}
	


	

}
