/**
 * 
 */
package com.mum.edu.service;

import java.util.List;

import com.mum.edu.model.Appointment;
import com.mum.edu.model.DetailReport;

/**
 * @author Prabin
 * @param <T>
 *
 */

public interface IAppointmentService {
	public void addStudent(Appointment appointment);
	public List<Appointment> getAllAppointment();
	public Appointment findAppointmentByAppointmentname(String appointmentname);
	public List<Appointment> getAllAppointment(long uid);
	public List<Appointment> getAllIndividualAppointment(long uid);
	public List<Appointment> getAllGroupAppointment(long uid);
	public List<DetailReport> getAllAppointmentByBatch(String batch);
}
