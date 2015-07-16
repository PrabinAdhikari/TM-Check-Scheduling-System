
package com.mum.edu.dao;

import java.util.List;

import com.mum.edu.model.Appointment;
import com.mum.edu.model.DetailReport;
import com.mum.edu.model.Student;

/**
 * @author Prabin
 * @param <T>
 *
 */
public interface IAppointmentDao{
	
	public Student findAppointmentByStudentID(long StudentID);
	public Student findAppointmentByTeacherID(long TeacherId);
	public void updateAppointment(Appointment appointment);
	public void addAppointment(Appointment appointment);
	public void deleteAppointment(long appointmentID);
	public List<Appointment> getAllAppointment(long uid);
	public List<Appointment> getAllAppointment();
	public List<Appointment> getAllIndividualAppointment(long uid);
	public List<Appointment> getAllGroupAppointment(long uid);
	public List<DetailReport> getAllAppointmentByBatch(String batch);
	
}
